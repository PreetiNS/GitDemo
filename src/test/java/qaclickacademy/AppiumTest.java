package qaclickacademy;

import org.testng.annotations.Test;

//Integrate TestNG with Maven and control execution from maven
//Info: https://maven.apache.org/surefire/maven-surefire-plugin/examples/testng.html 
//Using Suite XML Files:add the configuration file of TestNG .xml in pom.xml

public class AppiumTest {
	
	@Test
	public void nativeAppAndroid()
	{
		System.out.println("nativeAppAndroid");
	}
	@Test
	public void iOSapps()
	{
		System.out.println("iOSapps");
	}
	@Test
	public void iOSapps2()
	{
		System.out.println("iOSapps2");
	}

}
