package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftcardsPage {
	@FindBy(id = "products-orderby")
	private WebElement sortByDropdown;
	
	@FindBy(id = "products-pagesize")
	private WebElement displayDropdown;
	
	@FindBy(id = "products-viewmode")
	private WebElement viewDropdown;
	
	public GiftcardsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSortByDropdown() {
		return sortByDropdown;
	}

	public WebElement getDisplayDropdown() {
		return displayDropdown;
	}

	public WebElement getViewDropdown() {
		return viewDropdown;
	}
	
}
