package p_01_Annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class C_02_Test_PriorityDescription {
	
	@Test(priority=1, description="This method is used to verify the page title.")
	public void verifyPageTitle() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String baseURL= "https://demo.guru99.com/test/login.html";

		driver.get(baseURL);

		driver.manage().window().maximize();
		
		String Title = driver.getTitle();
		
		System.out.println("Page Title is :"+Title);
		
		Thread.sleep(3000);
		
		driver.close();

	}
	
	@Test(priority=2, description="This method is used to print login message.")
	public void Login() {
		System.out.println("Login is successful");
	}
	
	@Test(priority=3, description="This method is used to print logout message.")
	public void Logout() {
		System.out.println("Logout is successful.");
	}

}
