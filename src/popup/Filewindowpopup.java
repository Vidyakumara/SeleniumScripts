package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Filewindowpopup {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.naukri.com/");
	driver.findElement(By.id("register_Layer")).click();
	Actions act = new Actions(driver);
	act.keyDown(Keys.PAGE_DOWN).build().perform();
	Thread.sleep(1000);
	act.keyDown(Keys.PAGE_DOWN).build().perform();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='resumeUpload']")).sendKeys("C:\\Users\\itadmin\\OneDrive\\Documents\\Book (1).xlsx");
	
	Thread.sleep(1000);
	
}
}
