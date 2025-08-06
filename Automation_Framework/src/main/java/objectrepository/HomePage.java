package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(linkText = "BOOKS")
	private WebElement booksLink;
	
	@FindBy(linkText = "COMPUTERS")
	private WebElement computersLink;
	
	@FindBy(linkText = "ELECTRONICS")
	private WebElement electronicsLink;
	
	@FindBy(linkText = "GIFT CARDS")
	private WebElement giftcardsLink;
	
	@FindBy(linkText = "Log out")
	private WebElement logoutLink;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public WebElement getGiftcardsLink() {
		return giftcardsLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
}
