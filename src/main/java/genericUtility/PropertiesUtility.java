package genericUtility;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

/**
 * This is an utility class to deal with Properties file
 * @author sumit
 * @version 25.02.28
 */
public class PropertiesUtility {

	/**
	 * This is a generic method to fetch data from a properties file
	 * @param key
	 * @return
	 * @throws IOException 
	 * @throws Exception
	 */
	public String getDataFromPropertiesFile(String key) throws IOException 
	{
		FileInputStream fis = new FileInputStream(IpathUtility.propertiesPath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
}
