set projectLocation=C:\HybrideFramwork\LearnTestng
cd %projectLocation%
set classpath=%projectLocation%\bin;E:\TestngJar\*
java org.testng.TestNG %projectLocation%\testRun.xml
