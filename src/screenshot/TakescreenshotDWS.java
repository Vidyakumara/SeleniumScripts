package screenshot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakescreenshotDWS {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.navigate().to("https://demowebshop.tricentis.com/");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File from = ts.getScreenshotAs(OutputType.FILE);
	File to = new File("C:\\Users\\itadmin\\OneDrive\\Desktop\seleniumscreenshot");
	
}
}
