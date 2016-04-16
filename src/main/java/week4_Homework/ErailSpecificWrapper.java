package week4_Homework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailSpecificWrapper extends ExcelWrapper {
	WebDriver driver;
	XSSFWorkbook wbook =new XSSFWorkbook();
	XSSFSheet sheet = wbook.createSheet("ErailOutput");
	public void launchapp(String browser, String URL){
		if(browser =="chrome"){
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Softwares\\drivers\\chromedriver.exe");			
			 driver=new  ChromeDriver();
		}				
		driver.get(URL);		
		driver.manage().window().maximize();	
	}
	
	public  void EnterElemenyById(String Id, String data){
		driver.findElement(By.id(Id)).clear();		
		driver.findElement(By.id(Id)).sendKeys(data,Keys.ENTER);		
	}

	public void WriteExcelandClose(FileOutputStream fout,XSSFWorkbook wbook) throws IOException{
		wbook.write(fout);
		//wbook.close();
		fout.close();
	}
	
	public void WriteerailHeader(){
		List<WebElement> Rowsheader =driver.findElements(By.xpath("//*[@id='divTrainsListHeader']/table/tbody/tr"));
		for (WebElement iterator0 : Rowsheader) {
			XSSFRow row = sheet.createRow(0);	
			List<WebElement> iterator00=iterator0.findElements(By.tagName("td"));
			for(int j=0;j<iterator00.size();j++){
				XSSFCell cell = row.createCell(j);
				cell.setCellValue(iterator00.get(j).getText());						
			}		
		}	
		
	}
	
	public void WriteerailTable(){
		List<WebElement> Rows = driver.findElements(By.xpath("//*[@id='divTrainsList']/table[1]/tbody/tr"));
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

	}
}
