package p_01_Annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class C_05_BeforeClassAfterClass {

	@BeforeClass
	public void beforeClass() {

		System.out.println("Before class method.");
	}

	@AfterClass
	public void afterClass() {

		System.out.println("After class method.");
	}


	@Test
	public void verifyPageTitle() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String baseURL= "https://demo.guru99.com/test/login.html";

		driver.get(baseURL);

		driver.manage().window().maximize();

		String Title = driver.getTitle();

		System.out.println("Page Title is :"+Title);

		Thread.sleep(2000);

		driver.close();

	}

}
