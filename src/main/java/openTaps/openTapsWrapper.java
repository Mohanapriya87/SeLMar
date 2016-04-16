package openTaps;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class openTapsWrapper {
  @BeforeMethod
  public void LoginandClickLead() {
	  
	  System.out.println("LOgin, click CRMSFA,ClickLEad");
	  
  }
  @BeforeClass
public void LaunchBrowser() {
	  
	  System.out.println("Brower launched");
	  
  }
  
  @AfterClass
  
public void CloseBrowser() {
	  
	  System.out.println("Browser closed");
	  
  }
}
