package Homework_9thOct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Classe_One_Gmail {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://Gmail.com");
		driver.manage().window().maximize();

		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://Gmail.com");
		driver1.manage().window().maximize();
		
		Thread.sleep(6000);
		
		driver.quit();
		driver1.quit();
		
		
	}

}
