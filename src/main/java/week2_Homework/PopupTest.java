package week2_Homework;

import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class PopupTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://popuptest.com/");
		
		driver.manage().window().maximize();
		
		String parentWindowHandle = driver.getWindowHandle();
		
		//System.out.println("The parent window" +parentWindowHandle);
		
		driver.findElementByLinkText("Multi-PopUp Test #2").click();
		
		Thread.sleep(3000);
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("The number of windows are :"+allWindows.size());
		
		for (String eachWindow : allWindows) {
			driver.switchTo().window(eachWindow);
			if(eachWindow.equalsIgnoreCase(parentWindowHandle)==false){
			System.out.println("The window handle is "+driver.getWindowHandle());
			System.out.println(driver.getTitle());
			driver.close();
			}
			driver.switchTo().window(parentWindowHandle);	
		}
		String Title =driver.getTitle();
		System.out.println("Parent window Title" +Title);
		driver.close();
	}

}
