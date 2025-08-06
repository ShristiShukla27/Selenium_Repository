package giftcards;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ListenerUtility;
import objectrepository.HomePage;
@Listeners(ListenerUtility.class)
public class TC_DWS_061_Test extends BaseClass {
	@Test
	public void clickOnGiftCards() {
		HomePage hp=new HomePage(driver);
		hp.getGiftcardsLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Gift Cards", "Giftcards page is not displayed");
		test.log(Status.PASS, "Giftcards page is displayed");
	}
}
