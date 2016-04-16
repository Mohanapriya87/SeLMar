/**
 * 
 */
package Week1;

import org.openqa.selenium.ie.*;

/**
 * @author Mona
 *
 */
public class loginOpenTapsusingIE {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Opening IE");
		
		System.setProperty("webdriver.ie.driver", "D:\\Selenium\\Softwares\\drivers\\IEDriverServer.exe");
		
		InternetExplorerDriver driver=new InternetExplorerDriver();
		
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
		//driver.findElementByXPath("//*[@id='logout']/input").click();
		driver.findElementByClassName("decorativeSubmit").click();
						
		//Close Browser Window
		driver.close();

	}

}
