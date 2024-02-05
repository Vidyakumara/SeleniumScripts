package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselectall {

public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("file:///C:/Users/itadmin/AppData/Local/Microsoft/Windows/INetCache/IE/LL3Y0GW3/demo-1[1].html");
	driver.manage().window().maximize();
	WebElement multidropdown=driver.findElement(By.id("multiple_cars"));
	
	Select s_ref=new Select(multidropdown);
	List<WebElement> web=s_ref.getOptions();
	for (WebElement a : web) {
a.click();
Thread.sleep(1000);
	}
	Thread.sleep(1000);
	a.des
	

	}
