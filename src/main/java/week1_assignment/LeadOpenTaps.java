package week1_assignment;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LeadOpenTaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
						FirefoxDriver driver = new FirefoxDriver();
						
						driver.get("http://demo1.opentaps.org");
						
						driver.manage().window().maximize();
						
						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						
						driver.findElementById("username").sendKeys("DemoSalesManager");
						
						driver.findElementByName("PASSWORD").sendKeys("crmsfa");
						
						driver.findElementByClassName("decorativeSubmit").click();
						
						driver.findElementByLinkText("CRM/SFA").click();
						
						driver.findElementByLinkText("Create Lead").click();
											
						driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
						
						driver.findElementById("createLeadForm_firstName").sendKeys("MOHANA");
								
						driver.findElementById("createLeadForm_lastName").sendKeys("PRIYA");	
						
						driver.findElementByClassName("x-btn-text").click();
			}


	}

