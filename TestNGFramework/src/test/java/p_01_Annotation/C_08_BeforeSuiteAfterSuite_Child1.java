package p_01_Annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class C_08_BeforeSuiteAfterSuite_Child1 extends C_07_BeforeSuiteAfterSuite_Parent{

	@Test(priority=1, description="This method is used to verify page title.")
	public void verifyTitle() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String baseURL= "https://www.ebay.com/";

		driver.get(baseURL);		

		driver.manage().window().maximize();
		
		String Title = driver.getTitle();

		System.out.println("Page Title is :"+Title);
		
		Thread.sleep(2000);
		
		driver.close();
	}
	
	@Test(priority=2, description="This method is used to print login message for ebay.")
	public void Login() {
		System.out.println("Login is successful for ebay.");
	}
	
	@Test(priority=3, description="This method is used to print logout message for ebay.")
	public void Logout() {
		System.out.println("Logout is successful for ebay.");
	}


}
