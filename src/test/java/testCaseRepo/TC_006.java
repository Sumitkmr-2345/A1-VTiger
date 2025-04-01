package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

public class TC_006 extends BaseClass {
	@Test
	public void CON_003() throws EncryptedDocumentException, IOException {
		
		HomePage hp = new HomePage(driver);
		hp.clickOnContactsMenu();
		
		ContactsPage cp = new ContactsPage(driver);
		cp.clickOnCreateNewContactIcon();
		
		String lName = eUtil.getDataFromExcelFile("contacts", 8, 1);
		String email = eUtil.getDataFromExcelFile("contacts", 8, 2);
		String mobile = eUtil.getDataFromExcelFile("contacts", 8, 3);
		String mailingCity = eUtil.getDataFromExcelFile("contacts", 8, 4);
		String mailingState = eUtil.getDataFromExcelFile("contacts", 8, 5);
		String mailingCountry = eUtil.getDataFromExcelFile("contacts", 8, 6);
		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		cncp.CreateNewContact(lName, email, mobile, mailingCity, mailingState, mailingCountry);
	}
}

