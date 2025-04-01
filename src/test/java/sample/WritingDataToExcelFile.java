package sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingDataToExcelFile {
	public static void main(String[]args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\sumit\\OneDrive\\Desktop\\Anim3.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh =  wb.getSheet("Sheet1");
		Row r=sh.createRow(4);
		Cell c=r.createCell(0);
		c.setCellValue("Hello");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\sumit\\OneDrive\\Desktop\\Anim3.xlsx");
		wb.write(fos);
		}
	
		

 }
	


