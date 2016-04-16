package week2_Homework;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseIframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("/html/body/div[2]/p/button").click();
		driver.findElementByXPath("/html/body/div[1]/p[1]/button").click();
		
		driver.switchTo().frame("childIframe");
		
		driver.findElementByXPath("/html/body/div[3]/p/button").click();
		
		driver.findElementByXPath("/html/body/div[2]/p/button").click();
		
		driver.switchTo().defaultContent();
		
		driver.close();
			
		}
					
		}

	//}

