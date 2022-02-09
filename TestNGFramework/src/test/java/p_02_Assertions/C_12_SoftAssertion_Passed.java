package p_02_Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C_12_SoftAssertion_Passed {

	@Test
	public void verifyPageTitle() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String baseURL= "https://www.ebay.com/";

		driver.get(baseURL);

		driver.manage().window().maximize();

		SoftAssert softassertion = new SoftAssert();

		String actualTitle="Electronics, Cars, Fashion, Collectibles & More | eBay";

		String expectedTitle = driver.getTitle();

		softassertion.assertEquals(actualTitle, expectedTitle, "Opps..Title verification failed.");

		String actualText="Search";

		String expectedText = driver.findElement(By.xpath("//input[@id='gh-btn']")).getAttribute("value");

		softassertion.assertEquals(actualText, expectedText, "Opps..Text verification failed.");

		Thread.sleep(2000);

		driver.close();
		
		softassertion.assertAll();

	}

}
