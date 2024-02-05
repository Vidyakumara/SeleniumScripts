package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tvs {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tvsmotor.com ");
		System.out.println(driver.getCurrentUrl());
		String s="https://www.tvsmotor.com/";
		
		String s1=driver.getCurrentUrl();
		if(s.equals(s1))
		{
			System.out.println("URL is same");
		}
		else
			System.out.println("Url is not same ");
		
	}

}
