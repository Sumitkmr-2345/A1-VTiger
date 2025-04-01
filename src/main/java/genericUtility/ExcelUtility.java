package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This is an utility class which deals with Excel file
 * @author user
 * @version 25.03.03
 */
public class ExcelUtility {
	/**
	 * This is a generic method to fetch a cell data from excel data from the excel file
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getDataFromExcelFile(String sheetName, int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException 

	{
		FileInputStream fis = new FileInputStream(IpathUtility.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row r = sh.getRow(rowIndex);
		Cell c = r.getCell(cellIndex);
		DataFormatter df = new DataFormatter();
		String value = df.formatCellValue(c);
		return value;

	}
	/**
	 * This is a Generic Method to fetch multiple data from Excel file
	 * @param sheetName
	 * @param StartrowIndex
	 * @param StartcellIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public List<String> getMultpleDataFromExcelFilePractice(String sheetName, int StartrowIndex, int StartcellIndex) throws EncryptedDocumentException, IOException
	{

		FileInputStream fis = new FileInputStream(IpathUtility.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		DataFormatter df = new DataFormatter();
		List<String> a1 = new ArrayList<String>();
		for(int i=StartrowIndex; i<=sh.getLastRowNum(); i++)
		{
			Row r= sh.getRow(i);
			for(int j=0; j<r.getLastCellNum(); j++)
			{
				Cell c = r.getCell(j);
				String value = df.formatCellValue(c);
				a1.add(value);
				System.out.println(value+"");
			}
			System.out.println();
		}
		return a1;
	}
	/**
	 * This is a generic method to write a data to excel file from script
	 * @param sheetName
	 * @param rowIndex
	 * @param CellIndex
	 * @param value
	 * @throws Exception
	 */
	public void writeDataToExcelFile(String sheetName, int rowIndex, int CellIndex, String value) throws Exception
	{
		FileInputStream fis = new FileInputStream(IpathUtility.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row= sh.createRow(rowIndex);
		Cell c= row.createCell(CellIndex);
		c.setCellValue(value);
		FileOutputStream fos = new FileOutputStream(IpathUtility.excelPath);
		wb.write(fos);
		
		Random random = new Random();
		int value1 = random.nextInt(10000);
		System.out.println(value1);
	}

}