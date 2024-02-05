 package robotclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Disablenotifications {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions c_options=new ChromeOptions();
	c_options.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(c_options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.easemytrip.com/");
	Thread.sleep(1000);
	 
} 
}
