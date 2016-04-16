/**
 * 
 */
package week3_Classwork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Mona
 *
 */
public class AmazonXpathExcelInput {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Softwares\\drivers\\chromedriver.exe");
		
		ChromeDriver driver=new  ChromeDriver();
		
		driver.get("http://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		FileInputStream fis= new FileInputStream(new File("./data/login.xls"));
		
		HSSFWorkbook workbook=new HSSFWorkbook(fis);
		
		HSSFSheet sheet =workbook.getSheet("Login");
		
		HSSFRow currentrow=sheet.getRow(1);
		
		String a = currentrow.getCell(0).getStringCellValue();
		
		String b= currentrow.getCell(1).getStringCellValue();
				
		driver.findElementByXPath("//input[@id='twotabsearchtextbox']").sendKeys(a);
		
		driver.findElementByXPath("//*[@class='nav-search-submit nav-sprite']/input").click();
		
		System.out.println(driver.findElementByXPath("(//h2[@class='a-size-medium a-color-null s-inline  s-access-title a-text-normal'])[" + b + "]").getText());
		
		driver.close();
		
	}
	

}
