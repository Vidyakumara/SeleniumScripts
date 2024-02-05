package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Namelocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Mobile");
		Thread.sleep(2000);
		driver.findElement(By.name("NewsletterEmail")).sendKeys("vidya");
		Thread.sleep(2000);
		driver.close();
		
	}

}
