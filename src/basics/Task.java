package basics;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		
		String s="https://demowebshop.tricentis.com/";
		String s1=driver.getCurrentUrl();
		if(s.equals(s1))
		{
			System.out.println("URL is same");
		}
		else
			System.out.println("URL is not same");
		driver.close();
	}

}
