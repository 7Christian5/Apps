:: This script import a .crt file of MEEP to your keystore
:: -------------------------------------------------------

::@ECHO OFF

keytool -import -keystore "%JAVA_HOME%\jre\lib\security\cacerts\jre\lib\security\cacerts" -file certifMeep.cer -alias CER_Meep -storepass changeit
echo.
echo Certificate imported!
echo.

pause