package basics;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static void main(String[] args) {
		//String s = "https://www.amazon.in/";
		String s="https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=678711876615&hvpos=&hvnetw=g&hvrand=18000715888746975395&hvqmt=e&hvdev=c&";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		driver.get("https://www.amazon.in/");//current URL
		//driver.close();
		System.out.println(driver.getCurrentUrl());
		String s1=driver.getCurrentUrl();
		if(s.contains(s1))
		{
			System.out.println("URL is same");
		}
		else
			System.out.println("URL is not Same");
			
		}
	}


