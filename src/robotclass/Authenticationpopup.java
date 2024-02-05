package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticationpopup {
public static void main(String[] args) throws AWTException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("http://the-internet.herokuapp.com/basic_auth");
	Robot r=new Robot();
	
	r.keyPress(KeyEvent.VK_A);
	r.keyPress(KeyEvent.VK_D);
	r.keyPress(KeyEvent.VK_M);
	r.keyPress(KeyEvent.VK_I);
	r.keyPress(KeyEvent.VK_N);
	//r.keyRelease(KeyEvent.VK_A);
	//r.keyRelease(KeyEvent.VK_D);
	//r.keyRelease(KeyEvent.VK_M);
	//r.keyRelease(KeyEvent.VK_I);
	//r.keyRelease(KeyEvent.VK_N);
	
	r.keyPress(KeyEvent.VK_TAB);
	//r.keyRelease(KeyEvent.VK_TAB);
	
	r.keyPress(KeyEvent.VK_A);
	r.keyPress(KeyEvent.VK_D);
	r.keyPress(KeyEvent.VK_M);
	r.keyPress(KeyEvent.VK_I);
	r.keyPress(KeyEvent.VK_N);
	
	//r.keyRelease(KeyEvent.VK_A);
	//r.keyRelease(KeyEvent.VK_D);
	//r.keyRelease(KeyEvent.VK_M);
	//r.keyPress(KeyEvent.VK_I);
	//r.keyPress(KeyEvent.VK_N);
	
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	String giventext = "Congratulations! You must have the proper credentials";
	String currenttext = driver.findElement(By.xpath("/html/body/div[2]/child::div[1]/child::div/p")).getText();
	if(giventext.contains(currenttext)) {
		System.out.println("Your script is successful ");
		System.out.println("You are successfully signedin");
	}
	else
	{
		System.out.println("Your script is unsuccessful");
	System.out.println("You are not signedin successful");
	}
	
}
}
