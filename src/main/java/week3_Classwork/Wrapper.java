package week3_Classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wrapper {

	WebDriver driver;
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		public void launchapp(String browser, String url)
		{
			
			try {
				if(browser.equalsIgnoreCase("firefox"))
				{
				driver = new FirefoxDriver();
				}
			} catch (WebDriverException e) {
				// TODO Auto-generated catch block
				System.out.println("unable to launch browser");
				//e.printStackTrace();
			}
			
			driver.get(url);
			
		}
		public void enterNameById(String id, String value)
		{
			
			try {
				driver.findElement(By.id(id)).sendKeys(value);
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("Element not found");
			}			
		}
	}

