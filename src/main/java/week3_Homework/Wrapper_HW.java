/**
 * 
 */
package week3_Homework;

import java.util.Set;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Mona
 *
 */
public class Wrapper_HW {
	
	WebDriver driver;
	
	public void launchapp(String browser, String url)
	{
		
		try {
			if(browser.equalsIgnoreCase("firefox"))
			{
			driver = new FirefoxDriver();
			}
			if(browser.equalsIgnoreCase("chrome"))
				{
					System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Softwares\\drivers\\chromedriver.exe");
					
					 driver=new  ChromeDriver();
			}
			
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.out.println("unable to launch browser");
			//e.printStackTrace();
		}
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
	}
	
	public void SelectValueByIndex(String Id,int index){
		
		try {
			
			Select dropdown=new Select(driver.findElement(By.id(Id)));
			dropdown.selectByIndex(index);
			
			
		} catch (NoSuchElementException e) {
			System.out.println("Element with id" + Id + "or dropdown with index" + index + "not found");
		}
		
		catch (WebDriverException e) {
			System.out.println("Webdriver error");
		}
		
	}
	
	public void SwitchToPrimaryWindow(String parentWindowHandle){
		try {
			driver.switchTo().window(parentWindowHandle);
		} 
		catch (NoSuchWindowException e) {
			System.out.println("PrimaryWindow does not exist");		}	
	}
	
	public void SwitchToLastWindow(){
		try {
			
			Set<String> allWindows = driver.getWindowHandles();
			int i=1;	
			//String parentWindowHandle = driver.getWindowHandle();
			for (String eachWindow : allWindows) {		
				if(i==allWindows.size()){
					driver.switchTo().window(eachWindow);
					System.out.println("Last window handle is" +  eachWindow);
				}
				i++;
				}
			
		} catch (NoSuchWindowException e) {
			System.out.println("LastWindow does not exist");		
			}	
	}
	
	public void SwithToFrameByElement(String Tagname){
		
	try {
		driver.switchTo().frame(driver.findElement(By.tagName(Tagname)));
	} catch (NoSuchFrameException e) {
		System.out.println("Frame does not exist");
	}
		
	}
	
	public void SwithToFirstFrame(){
		
		try {
			driver.switchTo().frame(0);
			
		} catch (NoSuchFrameException e) {
			System.out.println("Frame does not exist");
		}
			
		}
	
public void AcceptAlert(){
		
		try {
			driver.switchTo().alert().accept();
			
		} catch (NoAlertPresentException e) {
			System.out.println("Alert does not exist");
		}
			
		}

public void DismissAlert(){
	
	try {
		driver.switchTo().alert().dismiss();
		
	} catch (NoAlertPresentException e) {
		System.out.println("Alert does not exist");
	}
		
	}

public boolean VerifyURL(String URL){
	
	String NewURL =driver.getCurrentUrl();
	
	if(NewURL.equalsIgnoreCase(URL)){
		return true;
	}else{
		return false;
	}
}

public boolean VerifyTitle(String Title){
	
	String NewTitle =driver.getTitle();
	
	if(NewTitle.equalsIgnoreCase(Title)){
		return true;
	}else{
		return false;
	}
}
public boolean VerifyText(String TagName,String Text){
	
	String NewText =driver.findElement(By.tagName(TagName)).getText();
	
	if(NewText.equalsIgnoreCase(Text)){
		return true;
	}else{
		return false;
	}
}

public void ClickByXpath(String xpathExpression){
	
	try {
		driver.findElement(By.xpath(xpathExpression)).click();
	} catch (NoSuchElementException e) {
		System.out.println("Element not found in Xpath" + xpathExpression);
	}
	
}
public void enterNameById(String id, String value)
{
	
	try {
		driver.findElement(By.id(id)).sendKeys(value);
	} catch (NoSuchElementException e) {
		System.out.println("Element not found by id" +id);
	}			
}

public void enterNameByName(String name, String value)
{
	
	try {
		driver.findElement(By.name(name)).sendKeys(value);
	} catch (NoSuchElementException e) {
		System.out.println("Element not found by name" +name);
	}			
}

public void enterNameByClassName(String Classname, String value)
{
	
	try {
		driver.findElement(By.className(Classname)).sendKeys(value);
	} catch (NoSuchElementException e) {
		System.out.println("Element not found by ClassName" + Classname);
	}			
}
public void enterNameByClassNameButton(String Classname)
{
	
	try {
		driver.findElement(By.className(Classname)).click();
	} catch (NoSuchElementException e) {
		System.out.println("Button Element not found" + Classname);
	}			
}
public void enterNameByLinkTextButton(String LinkText)
{
	
	try {
		driver.findElement(By.linkText(LinkText)).click();
	} catch (NoSuchElementException e) {
		System.out.println("Link Text Element not found" + LinkText);
	}			
}
}
