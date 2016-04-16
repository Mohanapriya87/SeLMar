package week2_Homework;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DragDroppable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://jqueryui.com/");
		
		driver.manage().window().maximize();
		
		driver.findElementByLinkText("Draggable").click();
		
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		System.out.println(driver.findElementByTagName("p").getText());
		
		driver.switchTo().defaultContent();
		
		driver.findElementByLinkText("Droppable").click();
		
		driver.close();
		

	}

}
