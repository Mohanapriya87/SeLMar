/**
 * 
 */
package Week1;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Mona
 *
 */
public class LoginwithChrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//To launch chrome
		System.out.println("Initilaizing Chrome");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Softwares\\drivers\\chromedriver.exe");
		
		ChromeDriver driver=new  ChromeDriver();
		
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
