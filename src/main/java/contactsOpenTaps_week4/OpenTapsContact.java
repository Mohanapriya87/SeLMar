package contactsOpenTaps_week4;
import org.junit.Test;
public class  OpenTapsContact extends OpenTapsWrapper{

	@Test
	public void Createcontact() throws InterruptedException
{	
	loginOpenTaps("chrome", "DemoSalesManager","crmsfa");
	clickByLinkText("CRM/SFA");
	clickByLinkText("Contacts");
	clickByLinkText("Create Contact");
	enterById("firstNameField","Mohana");
	enterById("lastNameField","Priya");
	clickByClassName("smallSubmit");
	Thread.sleep(5000);
	verifyTitle("View Contact | opentaps CRM");
	clickByLinkText("Edit");
	Thread.sleep(5000);
	selectValueByVisibleTextUsingId("addMarketingCampaignForm_marketingCampaignId", "Pay Per Click Advertising");
	Thread.sleep(5000);
	clickByXpath("//input[@class='smallSubmit']/following::input[2]");
	Thread.sleep(5000);
	clickByXpath("//input[@class='smallSubmit']");
	Thread.sleep(5000);
	verifyPartialText("viewContact_marketingCampaigns_sp", "Pay Per Click Advertising");
	clickByLinkText("Deactivate Contact");
	acceptAlert();	
	driver.close();
}
}