package openTaps;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Editlead extends openTapsWrapper {
  @Test(dependsOnMethods="openTaps.CreateLead.createLeads")
  public void editLeads() {
	  System.out.println("Edit lead");
  }
  
  @AfterMethod
  
  public void verifyEditLead(){
 	 System.out.println("Create edit Verified");
  }
 }
