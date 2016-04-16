package openTaps;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Mergelead extends openTapsWrapper {
	@Test(enabled=false,description="Functionality not ready,so do not Run")
	  public void MergeLeads() {
		  System.out.println("Merge lead");
	  }
  @AfterMethod
  
  public void verifyMergeLead(){
 	 System.out.println("Merge Lead Verified");
  }
}
