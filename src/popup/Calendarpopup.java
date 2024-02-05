package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendarpopup {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15) );
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	
	driver.get("https://www.agoda.com/");
WebElement nothanks = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='No thanks']")));
Thread.sleep(1000);
nothanks.click();

}
}
