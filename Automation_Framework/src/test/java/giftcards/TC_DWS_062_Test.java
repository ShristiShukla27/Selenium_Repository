package giftcards;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericutility.BaseClass;
import genericutility.ListenerUtility;
import objectrepository.GiftcardsPage;
import objectrepository.HomePage;
@Listeners(ListenerUtility.class)
public class TC_DWS_062_Test extends BaseClass{
	@Test
	public void clickOnSortBy() throws EncryptedDocumentException, IOException {
		HomePage hp=new HomePage(driver);
		hp.getGiftcardsLink().click();
		String value = eutil.getStringFromExcelFile("DemoWebShop", 4, 5);
		GiftcardsPage gp=new GiftcardsPage(driver);
		WebElement sortBy = gp.getSortByDropdown();
		wutil.selectDropdown(value, sortBy);
	}
}
