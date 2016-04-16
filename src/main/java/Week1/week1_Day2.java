package Week1;
import org.openqa.selenium.firefox.*;

public class week1_Day2 {

	public static void main(String[] args) {
		
		//To Open Browser
		FirefoxDriver driver=new FirefoxDriver();
		
		//Open URL
		driver.get("http://demo1.opentaps.org/");
		
		//Window maximize
		driver.manage().window().maximize();
		
		//PrintTitle
		System.out.println(driver.getTitle());
		
		//Login Action
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		//Print Title After login
		System.out.println(driver.getTitle());
		
		//Logout action
		driver.findElementByXPath("//*[@id='logout']/input").click();
		
		//Close Browser Window
		driver.close();

	}

}
