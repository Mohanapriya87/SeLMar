/**
 * 
 */
package week4_classwork;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author Mona
 *
 */
public class ExcelTry{
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook wbook =new XSSFWorkbook();
		XSSFSheet sheet = wbook.createSheet("Output");
		String a[]={"SerialNo","TestCase","Status",};
		String b[]={"CreateLead","EditLead","Mergelead","DeleteLead"};
		
		XSSFRow rowheader = sheet.createRow(0);
		for(int j=0;j<3;j++){
		XSSFCell cell0=rowheader.createCell(j);
		cell0.setCellValue(a[j]);
		}
		for (int i=1;i<=4;i++){
			XSSFRow row = sheet.createRow(i);
				XSSFCell cell = row.createCell(0);
				cell.setCellValue(i);
				XSSFCell cell1 = row.createCell(1);
				cell1.setCellValue(b[i-1]);
				XSSFCell cell2 = row.createCell(2);
				if(i%2==0){
				cell2.setCellValue("PASS");
				}
				else{
				cell2.setCellValue("FAIL");
				}
		}
		
		FileOutputStream fil =new FileOutputStream(new File("./data/output.xlsx"));
		wbook.write(fil);
		wbook.close();
		fil.close();
		System.out.println("EXcel write completed");

	}

}
