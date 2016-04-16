package openTaps;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CreateLead extends openTapsWrapper{
  @Test(invocationCount=2,threadPoolSize=2)
  public void createLeads() {
	  System.out.println("Leads created");
  }
  
 @AfterMethod
 
 public void verifycreateLead(){
	 System.out.println("Create Lead Verified");
 }
}
