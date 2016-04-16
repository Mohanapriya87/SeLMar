package week2_Homework;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Softwares\\drivers\\chromedriver.exe");
		
		ChromeDriver driver=new  ChromeDriver();
		
		driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
				
		driver.manage().window().maximize();
		
		int count=0;
			
		List<WebElement> iframes = driver.findElementsByTagName("iframe");
		
		for (WebElement iterator1 : iframes) {
		
		driver.switchTo().frame(iterator1);
		
		List<WebElement>frames=driver.findElementsByTagName("iframe");
		
		for (WebElement iterator2 : frames) {
			
			count=count+1;
		}
		
			count=count+1;
		
		driver.switchTo().defaultContent();
		
		}	
		System.out.println("No of frames:" +count);
		
		driver.close();
	}

}
