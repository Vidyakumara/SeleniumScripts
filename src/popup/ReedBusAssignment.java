package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReedBusAssignment {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	ChromeOptions coptions=new ChromeOptions();
	coptions.addArguments("--disable-notifications");
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.redbus.in/");
	Actions act=new Actions(driver);
	driver.findElement(By.id("src")).sendKeys("Bangalore");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//text[text()='Bangalore']")));
	act.keyDown(Keys.ENTER).build().perform();
	driver.findElement(By.id("dest")).sendKeys("Chennai");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//text[text()='Chennai']")));
	act.keyDown(Keys.ENTER).build().perform();
	driver.findElement(By.cssSelector("div[class='labelCalendarContainer']"));
	driver.findElement(By.xpath("//span[text()='20']")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("search_button")).click();
	

	
}
}
