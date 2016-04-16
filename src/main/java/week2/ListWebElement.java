/**
 * 
 */
package week2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

/**
 * @author Mona
 *
 */
public class ListWebElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Softwares\\drivers\\chromedriver.exe");
		
		ChromeDriver driver=new  ChromeDriver();
		
		driver.get("https://www.google.co.in/");
				
		driver.manage().window().maximize();
		
		List<WebElement> quote = driver.findElementsByTagName("a");
		
		System.out.println(quote.size());
		
		for (WebElement webElement : quote) {
			
			System.out.println(webElement.getText());
		}
		for (WebElement iterator : quote) {
			
			if(iterator.getText().contains("c") && iterator.getLocation().getX()>50 && iterator.getSize().getWidth()>20){
			
				System.out.println("the search content is" +iterator.getText());
				
				iterator.click();
				
				break;
				
			}
		}
		
		driver.quit();
		}
		
	}
