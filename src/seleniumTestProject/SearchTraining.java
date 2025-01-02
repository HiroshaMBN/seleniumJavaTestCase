package seleniumTestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.s
 
 

public class SearchTraining {

	WebDriver driver;
	
	public void LaunchBrowser() {
		 System.setProperty("webdriver.gecko.driver","drivers/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://www.simplilearn.com");
	}
	
	public void search() throws InterruptedException {
		driver.findElement(By.id("header_srch")).sendKeys("Selenium");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='search_icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h5[text()='Introduction to Selenium']")).click();
		System.out.println("The page titile is: "+ driver.getTitle());
	}
	
	public void closeBrowser() {
		driver.quit(); 
	}

	public static void main(String[] args) throws InterruptedException {

		SearchTraining obj = new SearchTraining();
		obj.LaunchBrowser();
//		obj.search();
//		obj.closeBrowser();
		
	}

}
