package week4_Homework;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExcelWrapper {
	
	WebDriver driver;
	
	public void CreateWorkbookandSheet(String sheetName){
		XSSFWorkbook wbook =new XSSFWorkbook();
		XSSFSheet sheet = wbook.createSheet(sheetName);
	}
	
	public void Openworkbook(String filepath, String sheetName) throws IOException{
		FileInputStream finput = new FileInputStream((filepath));
		XSSFWorkbook wbook = new XSSFWorkbook(finput);
		XSSFSheet sheet = wbook.getSheet(sheetName);
		
	}
	
	public int getNoOfRows(String Xpath){
		List<WebElement> Rows = driver.findElements(By.xpath(Xpath));
		int a = Rows.size();
		return a;
		
	}
	
	public String getCellValue(int RowNum, int colNum,XSSFSheet sheet){
		XSSFRow row = sheet.getRow(RowNum);
		String cellValue= row.getCell(colNum).getStringCellValue();
		return cellValue;
	}
	
	public void writeData(int RowNum, int ColNum, String Data,String sheetName,String filePath) throws IOException{
		XSSFWorkbook wbook = new XSSFWorkbook();
		XSSFSheet sheet = wbook.createSheet(sheetName);
		XSSFRow row = sheet.createRow(RowNum);
		XSSFCell cell = row.createCell(ColNum);
		cell.setCellValue(Data);
		FileOutputStream fileOutput = new FileOutputStream(new File(filePath));
		wbook.write(fileOutput);
		}
	
	public void closeWorkBook(FileOutputStream fileOutput,XSSFWorkbook wbook) throws IOException{
		wbook.close();
		fileOutput.close();
	}

}
