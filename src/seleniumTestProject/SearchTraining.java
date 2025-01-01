package seleniumTestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.s
 
 

public class SearchTraining {

	WebDriver driver;
	
	public void LaunchBrowser() {
		System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.simplilearn.com");
	}
	
	public void search() {
		driver.findElement(By.id("header_srch")).sendKeys("");
	}

	public static void main(String[] args) {
		

	}

}
