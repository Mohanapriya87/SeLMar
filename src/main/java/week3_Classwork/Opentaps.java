package week3_Classwork;

import org.junit.Test;

public class Opentaps extends Wrapper{
	
	@Test
	public void login(){
		
		launchapp("firefox", "http://demo1.opentaps.org/");
		enterNameById("username", "DemoSalesManager");
		enterNameById("password", "crmsfa");
		
	}
	

}
