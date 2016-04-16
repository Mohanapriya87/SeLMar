package week2_Homework;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameSearch_Cond {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Softwares\\drivers\\chromedriver.exe");
		
		ChromeDriver driver=new  ChromeDriver();
		
		driver.get("https://www.google.co.in/");
				
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//*[@id='lst-ib']").sendKeys("Mohana Priya");
		
		driver.findElementByName("btnG").click();
		
		Thread.sleep(3000);
		
		List<WebElement> quote =driver.findElementsByTagName("a");
		
		System.out.println(quote.size());
		
			for (WebElement iterator : quote) {
				
				if (iterator.getText().contains("Mohana Priya")||iterator.getText().contains("MohanaPriya")
						||iterator.getText().contains("mohanapriya")||iterator.getText().contains("mohana priya")){
					
					String S= iterator.getText();
					
					if(iterator.getLocation().getX()>100 && S.length()>20){
									
							System.out.println(iterator.getText());						
						}
				}
				}
			driver.close();
			} 
	}

