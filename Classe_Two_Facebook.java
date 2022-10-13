package Homework_9thOct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Classe_Two_Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://Facebook.com");
		driver.manage().window().maximize();
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://Facebook.com");
		driver.manage().window().maximize();
		
		Thread.sleep(6000);
		
		driver.quit();
		driver1.quit();
		
		

	}

}
