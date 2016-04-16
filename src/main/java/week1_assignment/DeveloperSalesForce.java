/**
 * 
 */
package week1_assignment;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.*;


/**
 * @author Mona
 *
 */
public class DeveloperSalesForce {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://developer.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("/html/body/div[3]/header/div/div/div/div[1]/div[1]/div[1]/a").click();
		driver.findElementById("first_name").sendKeys("Mohana");
		driver.findElementById("last_name").sendKeys("Priya");
		driver.findElementById("email").sendKeys("t.mohana.priya87@gmail.com");
		driver.findElementById("job_role").sendKeys("Developer");
		driver.findElementById("company").sendKeys("TCS");
		driver.findElementById("country").sendKeys("India");
		driver.findElementById("postal_code").sendKeys("600042");
		driver.findElementById("username").sendKeys("mpt1987@tcs.com");
		driver.findElementById("eula").click();
		driver.findElementByXPath("//*[@id='submit_btn']").click();	
	}

}
