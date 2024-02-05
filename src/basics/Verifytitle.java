package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifytitle {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.instagram.com/");
		driver.navigate().back();
		String Currenttitleamaz="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		driver.navigate().forward();
		String Currenttitleinsta="Login • Instagram";
		if(Currenttitleamaz.equals(Currenttitleamaz))
		{
			System.out.println("You are in amazon");
		}
		else
			System.out.println("you are in Instagram");
		
	}

}
