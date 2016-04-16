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
import org.openqa.selenium.WebElement;
public class ErailExcelUsingWrapper extends ErailSpecificWrapper {
	@Test	
	public void ErailExcelWrite() throws InterruptedException, IOException{	
		launchapp("chrome", "http://erail.in/");
		EnterElemenyById("txtStationFrom", "Nagercoil Jn");
		EnterElemenyById("txtStationTo", "Mumbai CST");
		Thread.sleep(5000);	
		WriteerailHeader();
		WriteerailTable();
		FileOutputStream fout =new FileOutputStream(new File("./data/ErailOutput.xlsx"));
		WriteExcelandClose(fout, wbook);
		System.out.println("Excel write completed");
		driver.close();
	}

}
