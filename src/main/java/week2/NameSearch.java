/**
 * 
 */
package week2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Mona
 *
 */
public class NameSearch {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Softwares\\drivers\\chromedriver.exe");
		
		ChromeDriver driver=new  ChromeDriver();
		
		driver.get("https://www.google.co.in/");
				
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//*[@id='lst-ib']").sendKeys("Mohana Priya");
		
		driver.findElementByName("btnG").click();
		
		Thread.sleep(3000);
		
		int count=0;
		
		List<WebElement> quote =driver.findElementsByTagName("a");
		
		System.out.println(quote.size());
		
			for (WebElement iterator : quote) {
				
				if (iterator.getText().contains("Mohana Priya")||iterator.getText().contains("MohanaPriya")
						||iterator.getText().contains("mohanapriya")||iterator.getText().contains("mohana priya")){

					count++;
				}

			} 
		System.out.println("No of times Mohana priya occurs in google search page"  + count);
		
		driver.close();
		
	}

}
