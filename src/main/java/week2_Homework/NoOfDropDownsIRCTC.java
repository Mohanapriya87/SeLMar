package week2_Homework;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NoOfDropDownsIRCTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		
		int count=0;
		
		List<WebElement>Dropdowns=driver.findElementsByTagName("select");
		
		for (WebElement iterator : Dropdowns) {
			
			System.out.println(iterator.getAttribute("id"));
			
			count++;		
		}

		System.out.println("No of dropdown in irctc is:" +count);
		
		driver.close();
	}

}
