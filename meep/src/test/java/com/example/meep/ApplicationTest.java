package com.example.meep;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.logging.Logger;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.netflix.ribbon.RibbonAutoConfiguration;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.cloud.openfeign.ribbon.FeignRibbonClientAutoConfiguration;
import org.springframework.test.context.TestPropertySource;

import com.example.meep.client.MeepFeign;
import com.example.meep.model.Resource;
import com.example.meep.server.Processor;

@SpringBootTest
@TestPropertySource(locations="classpath:application-test.properties")
public class ApplicationTest {

	
	@Autowired
    MeepFeign meepFeign;
    
    @Autowired
    Processor processor;

    @DisplayName("Test Spring @Autowired Integration")
    @Test
    void testGet() {
        assertEquals("Hello JUnit 5", "Hello JUnit 5");
        assertNotNull(processor);
        try {
        	if(processor.getCountExecutions() > 2) {
        		processor.destroy();        		
        	}
		} catch (Exception e) {
			
		}
        
        
    }
    
}
