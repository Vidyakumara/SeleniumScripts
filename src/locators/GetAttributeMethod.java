package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

private static Object id;

public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://demowebshop.tricentis.com/");
	Thread.sleep(1000);
	
	 WebElement searchfield = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
			 String attributevalue = searchfield.getAttribute("id");
	 System.out.println(attributevalue);
	 
	if(id.equals(attributevalue))
	 {
	 System.out.println("Our script is correct");
	 }
	 else
	 {
		 System.out.println("Check the script.........");
	 }
	 Thread.sleep(1000);
	 driver.close();
}
}
