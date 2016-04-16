package week3_Homework;

import org.junit.Test;
import org.openqa.selenium.By;

public class TestframeandAlerts extends Wrapper_HW {
	
	@Test
	
	public void Test() throws InterruptedException{
		
		/*launchapp("firefox", "http://layout.jquery-dev.com/demos/iframes_many.html");
		SwithToFirstFrame();
		SwithToFrameByElement("iframe");
		driver.close();*/
		
		launchapp("firefox","http://popuptest.com/");
		String parentWindowHandle = driver.getWindowHandle();
		SwitchToPrimaryWindow(parentWindowHandle);
		System.out.println("Primary window handle length" +parentWindowHandle);
		enterNameByLinkTextButton("Multi-PopUp Test #2");
		Thread.sleep(3000);
		SwitchToLastWindow();
		driver.close();
		
		
	}

	
	
	
	
	
	
	
}
