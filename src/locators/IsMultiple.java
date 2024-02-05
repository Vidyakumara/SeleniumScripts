package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsMultiple {

}public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("file:///C:/Users/itadmin/AppData/Local/Microsoft/Windows/INetCache/IE/LL3Y0GW3/demo-1[1].html");
	driver.manage().window().maximize();
	WebElement multidropdown=driver.findElement(By.id("multiple_cars"));
	
