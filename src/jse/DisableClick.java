package jse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableClick {

public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html");
JavascriptExecutor js=(JavascriptExecutor) driver;
WebElement downloadlink = driver.findElement(By.linkText("jdk-11.0.21_windows-x64_bin.zip"));
Thread.sleep(1000);
js.executeScript("arguments[0].scrollIntoView(false);",downloadlink);
downloadlink.click();
Thread.sleep(1000);
WebElement disablebutton = driver.findElement(By.linkText("Download jdk-11.0.21_windows-x64_bin.zip"));
js.executeScript("arguments[0].click();",disablebutton);




}
}
