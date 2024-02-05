package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecuteDWSHOMEpage {
	@Test
	public void reciever()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		DWSHOMEpage execute = new DWSHOMEpage(driver);
			//execute.searchField.sendKeys("vidya");
			//execute.searchbutton.click();
			execute.searchField("vidya");
			execute.searchButton();
			
	}

}
