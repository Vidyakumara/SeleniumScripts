package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class AddToCartByChronologicalOrder {
	public WebDriver driver;
@BeforeClass
public void openthebrowser()
{
 driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration)
driver.get("https://demowebshop.tricentis.com/");
}

}
