package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

public class TC_004 extends BaseClass {
	@Test
	public void CON_001() throws EncryptedDocumentException, IOException {
		
		HomePage hp = new HomePage(driver);
		hp.clickOnContactsMenu();
		
		ContactsPage cp = new ContactsPage(driver);
		cp.clickOnCreateNewContactIcon();
		
		String lName = eUtil.getDataFromExcelFile("contacts", 2, 1);
		String title = eUtil.getDataFromExcelFile("contacts", 2, 2);
		String dept = eUtil.getDataFromExcelFile("contacts", 2, 3);
		
		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		cncp.CreateNewContact(lName, title, dept);
		
	}
}

