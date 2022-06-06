package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Filpkart_Product {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "\\D:\\\\Selenium\\\\chromedriver.exe\\");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().deleteAllCookies();
		  driver.manage().window().maximize();
		  driver.get("https://www.flipkart.com/");
		// driver.navigate().refresh();
		  
		  Thread.sleep(5000);
		  
		  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("REDMI Note 10 Pro (Dark Night, 128 GB)(6 GB RAM)");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		 driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
		
		 driver.close();
		 
		 driver.get("www.amazon.in");
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("REDMI Note 10 Pro (Dark Night, 128 GB)(6 GB RAM)");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 
		 driver.findElement(By.xpath("(//span[@class='a-price-whole'])[4]")).getText();
		 
		 System.out.println("Both Price Are Same");
		 
		 
		 

	}

}
