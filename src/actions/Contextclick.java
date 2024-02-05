package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Contextclick {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
	Actions a = new Actions(driver);
	a.contextClick(rightclick).build().perform();
	WebElement delete = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Delete']")));
	delete.click();
	try {
		rightclick.click();
		System.out.println("Your script is unsuccessful");
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Your script is successfull");
	}
	
	}

}
