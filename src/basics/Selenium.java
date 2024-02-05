package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.honda2wheelersindia.com/");
		String s="https://www.honda2wheelersindia.com/";
		System.out.println(driver.getCurrentUrl());
		String s1=driver.getCurrentUrl();
		if(s.equals(s1))
		{
			System.out.println("URL is same");
		}
		else
			System.out.println("URL is not same");
	}

}
