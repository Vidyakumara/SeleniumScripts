package popup;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GuruAssignment {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
//Actions a=new Actions(driver);
//a.contextClick(rightclick).build().perform();
List<WebElement> menu = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span"));
for (WebElement web : menu) {
	System.out.println(web.getText());
	Actions a=new Actions(driver);
	a.moveToElement(rightclick).contextClick(rightclick).build().perform();
	web.click();
	Alert al=driver.switchTo().alert();
	System.out.println(al.getText());
	al.dismiss();
	
	
}
}
}
