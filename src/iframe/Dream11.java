package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dream11 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	ChromeOptions coptions=new ChromeOptions();
	coptions.addArguments("--disable-notifications");
	//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	driver.get("https://www.dream11.com/");
	//driver.switchTo().frame(0);//
	//driver.switchTo().frame("send-sms-iframe");
	WebElement iframe = driver.findElement(By.className("send-sms-iframe"));
	driver.switchTo().frame(iframe);
	driver.findElement(By.id("regEmail")).sendKeys("9845632132");
	//driver.switchTo().parentFrame();
	driver.switchTo().defaultContent();
	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='hamburger']")));
	driver.findElement(By.xpath("//div[@id='hamburger']")).click();
}
}
