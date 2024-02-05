package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.getCurrentUrl();
		driver.get("https://demowebshop.tricentis.com");
		String giventitle="Demo Web Shop";
		System.out.println(driver.getTitle());
		//ctrl+shift+i
		//ctrl+f
		String currenttitle=driver.getTitle();
		if(giventitle.equals(currenttitle))
		{
			System.out.println("The given and current title is same");
			
		}
		else
			System.out.println("The given title and current title is not same");
		driver.close();
	}

}
