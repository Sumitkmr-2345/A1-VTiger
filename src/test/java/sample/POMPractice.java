package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import genericUtility.SeleniumUtility;
public class POMPractice {
	
	@FindBy(id = "name")
	
	WebElement element;
	@FindBy()
	
	WebElement ele;
	
	
	public POMPractice (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public static void main(String[] args) throws InterruptedException   {
		SeleniumUtility sUtil = new SeleniumUtility();
		WebDriver driver = new ChromeDriver();
		sUtil.navigateToApplication(driver, "https://demoapps.qspiders.com/ui?scenario=1");
		sUtil.maximizeWindow(driver);
		sUtil.implicitlyWait(driver , 15);
		Thread.sleep(2000);
		POMPractice p = new POMPractice(driver);
		p.element.sendKeys("sumit");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		p.element.sendKeys("sumit");	

	}

}
