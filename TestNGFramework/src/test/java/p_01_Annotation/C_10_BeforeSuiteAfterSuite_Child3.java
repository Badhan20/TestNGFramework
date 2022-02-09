package p_01_Annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class C_10_BeforeSuiteAfterSuite_Child3 extends C_07_BeforeSuiteAfterSuite_Parent{

	@Test
	public void verifyTitle() throws InterruptedException {System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	String baseURL= "https://demo.guru99.com/test/login.html";

	driver.get(baseURL);

	driver.manage().window().maximize();
	
	String Title = driver.getTitle();
	
	System.out.println("Page Title is :"+Title);
	
	Thread.sleep(3000);
	
	driver.close();

	}
}
