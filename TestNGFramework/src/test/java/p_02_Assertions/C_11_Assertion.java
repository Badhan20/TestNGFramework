package p_02_Assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C_11_Assertion {
	
	@Test
	public void verifyPageTitle() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String baseURL= "https://www.ebay.com/";

		driver.get(baseURL);

		driver.manage().window().maximize();
		
		String actualTitle="Electronics, Cars, Fashion, Collectibles & More | eBay";
		
		String expectedTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle, "Opps..Title verification failed.");
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
