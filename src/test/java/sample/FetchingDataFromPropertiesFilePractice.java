package sample;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;

public class FetchingDataFromPropertiesFilePractice {

	public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
//		FileInputStream fis =  new FileInputStream("C:\\Users\\sumit\\OneDrive\\Desktop\\CommonTestData.properties");
//		Properties prop = new Properties();
//		prop.load(fis);
//		String value = prop.getProperty("url");
//		String UN = prop.getProperty("username");
//		String PWD = prop.getProperty("password");
//		
//		driver.get(value);		
//		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys(UN,Keys.TAB,PWD,Keys.ENTER);
//		
		PropertiesUtility pUtil = new PropertiesUtility();
		String value = pUtil.getDataFromPropertiesFile("url");
		driver.get(value);
		String UN = pUtil.getDataFromPropertiesFile("username");
		String PWD= pUtil.getDataFromPropertiesFile("password");
	
	}

}
