package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAttribute {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
	driver.findElement(By.xpath("//input[@id='gender-female']")).click();
	}
	

}
