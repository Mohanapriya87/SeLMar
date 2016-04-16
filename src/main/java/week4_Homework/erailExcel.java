package week4_Homework;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class erailExcel {	
		public static void main(String[] args)throws InterruptedException, IOException {		
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Softwares\\drivers\\chromedriver.exe");			
			ChromeDriver driver=new  ChromeDriver();			
			driver.get("http://erail.in/");		
			driver.manage().window().maximize();		
			driver.findElementById("txtStationFrom").clear();		
			driver.findElementById("txtStationFrom").sendKeys("Nagercoil Jn",Keys.ENTER);		
			driver.findElementById("txtStationTo").clear();			
			driver.findElementById("txtStationTo").sendKeys("Mumbai CST",Keys.ENTER);			
			Thread.sleep(5000);		
			List<WebElement> Rows = driver.findElementsByXPath("//*[@id='divTrainsList']/table[1]/tbody/tr");			
			
			for (WebElement iterator : Rows) {												
						iterator.findElements(By.tagName("td"));					
						System.out.println(iterator.getText());			
					}	
			
			XSSFWorkbook wbook =new XSSFWorkbook();
			XSSFSheet sheet = wbook.createSheet("ErailOutput");
			List<WebElement> Rowsheader =driver.findElementsByXPath("//*[@id='divTrainsListHeader']/table/tbody/tr");
			for (WebElement iterator0 : Rowsheader) {
				XSSFRow row = sheet.createRow(0);	
				List<WebElement> iterator00=iterator0.findElements(By.tagName("td"));
				for(int j=0;j<iterator00.size();j++){
					XSSFCell cell = row.createCell(j);
					cell.setCellValue(iterator00.get(j).getText());						
				}
				
			}	
			int i=1;
			for (WebElement iterator : Rows) {	
					XSSFRow row = sheet.createRow(i);	
					List<WebElement> iterator2=	iterator.findElements(By.tagName("td"));
					for(int j=0;j<iterator2.size();j++){
						XSSFCell cell = row.createCell(j);
						cell.setCellValue(iterator2.get(j).getText());						
					}	
					i++;
			}
			FileOutputStream fil =new FileOutputStream(new File("./data/ErailOutput.xlsx"));
			wbook.write(fil);
			//wbook.close();
			fil.close();
			System.out.println("EXcel write completed");
			driver.close();
			
}
		
}

