package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElements(By.cssSelector("input[type='radio']"));
		List<WebElement> communitypool=driver.findElements(By.cssSelector("input[type='radio']"));
		System.out.println(communitypool);
for (WebElement web : communitypool) {
	web.click();
	Thread.sleep(2000);
}
driver.close();

	}

}
