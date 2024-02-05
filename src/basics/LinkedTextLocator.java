package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedTextLocator {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	String givenUrl="https://demowebshop.tricentis.com/";
	String givenLogintitle="Demo Web Shop. Login";
	String currenturl=driver.getCurrentUrl();
	String currentLogintitle=driver.getTitle();
	driver.findElement(By.linkText("Demo Web Shop. Login")).click();

	if(givenUrl.equals(currenturl)) 
	{
		System.out.println("successfully login");
	
	
	}
	
	if(givenLogintitle.contains(currentLogintitle))
	{
		System.out.println("You are in login page");
	}
	else
		System.out.println("You are not in login page");

	
	System.out.println("unsuccessful");

	driver.close();
	}
	
}
