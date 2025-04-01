package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

public class TC_005 extends BaseClass {
	@Test
	public void CON_002() throws EncryptedDocumentException, IOException {
		
		HomePage hp = new HomePage(driver);
		hp.clickOnContactsMenu();
		
		ContactsPage cp = new ContactsPage(driver);
		cp.clickOnCreateNewContactIcon();
		
		String lName = eUtil.getDataFromExcelFile("contacts", 5, 1);
		String email = eUtil.getDataFromExcelFile("contacts", 5, 2);
		String mobile = eUtil.getDataFromExcelFile("contacts", 5, 3);
		String mailingCity = eUtil.getDataFromExcelFile("contacts", 5, 4);
		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		cncp.CreateNewContact(lName, email, mobile, mailingCity);
	}
}