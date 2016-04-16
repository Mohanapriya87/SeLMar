package week3_Homework;

import org.junit.Test;

public class CreateLeadNContactChrome extends Wrapper_HW {
	
	@Test
	
	public void CreateLead(){
		
		launchapp("chrome", "http://demo1.opentaps.org/");
		enterNameById("username", "DemoSalesManager");
		enterNameById("password", "crmsfa");
		enterNameByClassNameButton("decorativeSubmit");
		enterNameByLinkTextButton("CRM/SFA");
		enterNameByLinkTextButton("Create Lead");
		enterNameById("createLeadForm_companyName", "TCS");
		enterNameById("createLeadForm_firstName", "Priya");
		enterNameById("createLeadForm_lastName", "Chandru");
		enterNameByClassNameButton("smallSubmit");
		/*enterNameByLinkTextButton("Contacts");
		enterNameByLinkTextButton("Create Contact");
		enterNameById("firstNameField","Mohana");
		enterNameById("lastNameField","Priya");
		enterNameByClassNameButton("smallSubmit");*/
		//driver.close();
	}
	

}
