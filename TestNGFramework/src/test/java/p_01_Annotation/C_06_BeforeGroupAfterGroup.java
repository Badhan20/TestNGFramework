package p_01_Annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class C_06_BeforeGroupAfterGroup {

	WebDriver driver;

	@BeforeGroups(value="guru99")
	public void FirstUrlConfig() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		driver = new ChromeDriver();

		String baseURL= "https://www.guru99.com/";

		driver.get(baseURL);		

		driver.manage().window().maximize();
	}

	@BeforeGroups(value="ebay")
	public void SecondConfig() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		driver = new ChromeDriver();

		String baseURL= "https://www.ebay.com/";

		driver.get(baseURL);		

		driver.manage().window().maximize();

	}

	@Test (priority=1, groups="guru99")
	public void verifyPageTitle(){		

		String Title = driver.getTitle();

		System.out.println("Page Title is :"+Title);

	}

	@Test(priority=2, groups="guru99")

	public void verifyHeader() {

		String header = driver.findElement(By.cssSelector("div[class='g-content g-particle'] h3")).getAttribute("innerHTML");

		System.out.println("Header is: "+header);

		driver.findElement(By.cssSelector("a[title='Software Testing']")).click();

	}

	@Test (priority=1, groups="ebay")
	public void verifyPageTitleforEbay(){		

		String Title = driver.getTitle();

		System.out.println("Page Title is :"+Title);

	}
	
	@Test (priority=2, groups="ebay")
	public void verifySearchEbay() {

		String buttonValue = driver.findElement(By.xpath("//input[@id='gh-btn']")).getAttribute("value");;

		System.out.println("Button Name is: "+buttonValue);

		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

	}

	@AfterGroups(value="guru99")
	public void waitFor() throws InterruptedException {

		Thread.sleep(2000);
	}

	@AfterGroups(value={"guru99", "ebay"})
	public void closeBrowser() {

		driver.close();

		driver.quit();
	}


}
