package sample;

import java.io.FileInputStream;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;

public class FetchingDataFromExcelFile {

	public static void main(String[] args) throws IOException, Exception  {
//		FileInputStream fis = new FileInputStream("C:\\Anim.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet("Animal");
//		Row r = sh.getRow(1);
//		Cell c = r.getCell(0);
//	//	String value = c.getStringCellValue();
//		DataFormatter df = new DataFormatter();
//		String value =	df.formatCellValue(c);
//		System.out.println(value);
		
		ExcelUtility eUtil = new ExcelUtility();
//		String value1 = eUtil.getDataFromExcelFile("Animal", 1, 3);
//		String value2 = eUtil.getDataFromExcelFile("Animal", 2, 2);
//		String value3 = eUtil.getDataFromExcelFile("Bird", 1, 2);
//		String value4 = eUtil.getDataFromExcelFile("Bird", 3, 1);
//		String value5 = eUtil.getDataFromExcelFile("fish", 0, 3);
//		String value6 = eUtil.getDataFromExcelFile("fish", 2, 0);
//		System.out.println(value1);
//		System.out.println(value2);
//		System.out.println(value3);
//		System.out.println(value4);
//		System.out.println(value5);
//		System.out.println(value6);
		String value7 = eUtil.getDataFromExcelFile("Leads", 4, 2);
		String value8 = eUtil.getDataFromExcelFile("Contacts", 4, 3);
		System.out.println(value7);
		System.out.println(value8);
	}

}
