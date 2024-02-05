package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertPopup {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	Alert a=driver.switchTo().alert();
	a.sendKeys("Vidya");
	a.accept();
	String giventext = "Hello Vidya How are you today";
	String Currenttext = driver.findElement(By.id("demo1")).getText();
if(giventext.contains(Currenttext))
{
	System.out.println("You have successfully entered the data inside the popup");
	System.out.println(Currenttext);
driver.close();

}
else
{
	System.out.println("Data is unsuccessfull");
	driver.close();
}
}
}
