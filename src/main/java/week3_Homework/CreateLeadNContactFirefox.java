package week3_Homework;

import org.junit.Test;

public class CreateLeadNContactFirefox extends Wrapper_HW {
	
	@Test
	
	public void CreateLead() throws InterruptedException{
		
		launchapp("firefox", "http://demo1.opentaps.org/");
		enterNameById("username", "DemoSalesManager");
		enterNameById("password", "crmsfa");
		enterNameByClassNameButton("decorativeSubmit");
		enterNameByLinkTextButton("CRM/SFA");
		Thread.sleep(5000);
		enterNameByLinkTextButton("Create Lead");
		enterNameById("createLeadForm_companyName", "TCS");
		enterNameById("createLeadForm_firstName", "Mohana");
		enterNameById("createLeadForm_lastName", "Priya");
		enterNameByClassNameButton("smallSubmit");
		enterNameByLinkTextButton("Contacts");
		enterNameByLinkTextButton("Create Contact");
		Thread.sleep(3000);
		enterNameById("firstNameField","Mohana");
		enterNameById("lastNameField","Priya");
		enterNameByClassNameButton("smallSubmit");
		driver.close();
	}
	

}
