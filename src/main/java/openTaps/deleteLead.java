package openTaps;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class deleteLead extends openTapsWrapper {
	@Test(dependsOnMethods="openTaps.CreateLead.createLeads",timeOut=10000)
	  public void deleteLeads() {
		  System.out.println("Delete lead");
	  }  @AfterMethod
  
  public void verifyDeleteLead(){
 	 System.out.println("Delete Lead Verified");
  }
}
