package sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;
import genericUtility.JavaUtility;

public class FetchingMultipleDataFromExcelFilePractice {
	
	public static void main(String[] args)  {
	/*	FileInputStream fis = new FileInputStream("C:\\Users\\sumit\\OneDrive\\Desktop\\Anim3.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Animal");
		DataFormatter df = new DataFormatter();
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			Row r= sh.getRow(i);
			for(int j=0;j<r.getLastCellNum();j++)
			{
				Cell c = r.getCell(j);
				String value = df.formatCellValue(c);
				System.out.println(value);
			}
			
		}   */
		
//		ExcelUtility eUtil = new ExcelUtility();
//		List<String> value = eUtil.getMultpleDataFromExcelFilePractice("Sheet1", 2, 1);
//		System.out.println(value);
		
		JavaUtility jUtil = new JavaUtility();
		int value = jUtil.generateRandomNumber(100);
		System.out.println(value);
		String dateStamp = jUtil.getCalendarDetails("hh-MM-YYYY");
		System.out.println(dateStamp);
		String dateTimeStamp = jUtil.getCalendarDetails("hh-MM-YYYY hh-mm-ss");
		System.out.println(dateTimeStamp);

	}

}
