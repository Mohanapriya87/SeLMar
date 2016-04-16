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
public class IRCTCLogin {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		driver.findElementById("userRegistrationForm:userName").sendKeys("mpt1987");
		driver.findElementById("userRegistrationForm:password").sendKeys("mpt1987");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("mpt1987");
		driver.findElementById("userRegistrationForm:securityQ").sendKeys("What is your pet name?");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Selvi");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Mohana");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("T");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Priya");
		driver.findElementById("userRegistrationForm:gender:1").click();
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		driver.findElementById("userRegistrationForm:dobDay").sendKeys("08");
		driver.findElementById("userRegistrationForm:dobMonth").sendKeys("MAY");
		driver.findElementById("userRegistrationForm:dateOfBirth").sendKeys("1987");
		driver.findElementById("userRegistrationForm:occupation").sendKeys("Government");
		driver.findElementById("userRegistrationForm:uidno").sendKeys("UIBAX66666");
		driver.findElementById("userRegistrationForm:idno").sendKeys("APCWS7658K");
		driver.findElementById("userRegistrationForm:email").sendKeys("abc@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("8989896767");
		driver.findElementById("userRegistrationForm:nationalityId").sendKeys("India");
		driver.findElementById("userRegistrationForm:address").sendKeys("Vijayanagar");
		driver.findElementById("userRegistrationForm:street").sendKeys("First main road");
		driver.findElementById("userRegistrationForm:area").sendKeys("Velachery");
		driver.findElementById("userRegistrationForm:countries").sendKeys("India");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600042");
		driver.findElementByTagName("body").click();
		Thread.sleep(5000);
		driver.findElementById("userRegistrationForm:cityName").sendKeys("Chennai");
		driver.findElementByTagName("body").click();
		Thread.sleep(5000);
		driver.findElementById("userRegistrationForm:postofficeName").sendKeys("Velacheri S.O");
		driver.findElementById("userRegistrationForm:landline").sendKeys("0444714234");	
		driver.close();
	}

}
