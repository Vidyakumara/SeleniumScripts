package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.ktmindia.com/");
		String Current_titlektm=driver.getTitle();
		System.out.println(Current_titlektm);
		driver.get("https://www.royalenfield.com");
		driver.navigate().back();
		String given_titlektm="KTM | READY TO RACE | EXPLOre the range in India – Models, Features, Price, Colors ";
		if(given_titlektm.contains(Current_titlektm))
		{
			System.out.println("You are in KTM webpage");
		}
		else
			System.out.println("You are in Royalenfield Webpage");
		//driver.navigate().forward();
		}

}
