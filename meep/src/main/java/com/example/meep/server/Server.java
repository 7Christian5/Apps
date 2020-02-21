package com.example.meep.server;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;

import com.example.meep.model.Resource;

public abstract class Server implements Runnable {

	public static final int DEFAULT_DELAY = 60; // seconds
	public static final int DEFAULT_SLEEP = 5; // seconds
	
	protected final Logger serverLogger = LogManager.getLogger(getClass());
	
	@Value("${spring.application.name}")
	private String name;
	
	@Value("${meep.client.delay}")
	private Integer delay;
	
	@Value("${meep.server.sleep:0}")
	private Integer sleep;
	
	private long countExecutions = 0;

	private boolean mustContinue = true;
	private Thread thread;

	@PostConstruct
	public void init() throws Exception {
		
        // start the thread of execution
        thread = new Thread(this, name);
        thread.start();
        if(delay == null) {
        	setDelay(DEFAULT_DELAY);
        }
	}

	@PreDestroy
	public void destroy() throws Exception {
		
		serverLogger.info(">> Stop requested");
		mustContinue = false;
		
		// wait for the execution thread to end
		thread.join();
		serverLogger.info(">> Stop");
	}

	public void run() {

		sleep(sleep);
		serverLogger.info(">> Start server");
		
		while (mustContinue) {
			
			serverLogger.debug("**** Continue...");
			sleep(sleep);
			
			// found the resources
 			List<Resource> resources = getMeepResources();
 			
 			if (!resources.isEmpty()) {
 				// Process the resources founded
 				serverLogger.info(">> Processing " + resources.size() + " results/s");
 				processMeepResources(resources);
 				
 			} else {
 				// nothing to do, sleep
 				serverLogger.info(">> Nothing to do");
 			}
 			
 			// sleep the configured delay
 			countExecutions++;
 			sleep(delay);
		}
		
		serverLogger.info(">> Stop server");
	}

	public abstract List<Resource> getMeepResources();
	
	public abstract void processMeepResources(List<Resource> newResourceList);
	

	/**
	 * @param seconds
	 */
	private void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000L);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
	

	/**
	 * @return the delay
	 */
	public Integer getDelay() {
		return delay;
	}

	/**
	 * @param delay the delay to set
	 */
	public void setDelay(int delay) {
		this.delay = delay;
	}

	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the countExecutions
	 */
	public long getCountExecutions() {
		return countExecutions;
	}

	/**
	 * @param countExecutions the countExecutions to set
	 */
	public void setCountExecutions(long countExecutions) {
		this.countExecutions = countExecutions;
	}
	
	

}
