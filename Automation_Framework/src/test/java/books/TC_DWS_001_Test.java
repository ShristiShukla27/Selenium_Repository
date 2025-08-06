package books;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ListenerUtility;
import objectrepository.HomePage;
@Listeners(ListenerUtility.class)
public class TC_DWS_001_Test extends BaseClass{
	@Test
	public void clickOnBooks(){
		HomePage hpage=new HomePage(driver);
		hpage.getBooksLink().click();;
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Books","Books page is not displayed");
		test.log(Status.PASS, "Books page is displayed");
	}
}
