package genericutility;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
/**
 * @author Shristi
 */
public class WebDriverUtility {
	
	/**
	 * This method will maximize the window
	 * @param driver
	 */
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	/**
	 * This method will minimize the window
	 * @param driver
	 */
	public void minimize(WebDriver driver) {
		driver.manage().window().minimize();
	}
	
	/**
	 * This method will fullscreen the window
	 * @param driver
	 */
	public void fullscreen(WebDriver driver) {
		driver.manage().window().fullscreen();
	}
	
	/**
	 * This method will get the height and width of webpage
	 * @param driver
	 */
	public void getSize(WebDriver driver) {
		driver.manage().window().getSize();
	}
	
	/**
	 * This method will set the new height and width of webpage
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void setSize(WebDriver driver, int x, int y) {
		driver.manage().window().setSize(new Dimension(x, y));
	}
	
	/**
	 * This method will get the x and y coordinates of webpage
	 * @param driver
	 */
	public void getPosition(WebDriver driver) {
		driver.manage().window().getPosition();
	}
	
	/**
	 * This method will set the new x and y coordinates of webpage by caller
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void setPosition(WebDriver driver, int x, int y) {
		driver.manage().window().setPosition(new Point(x, y));
	}
	
	/**
	 * This method will perform back operation in webpage
	 * @param driver
	 */
	public void back(WebDriver driver) {
		driver.navigate().back();
	}
	
	/**
	 * This method will perform forward operation in webpage
	 * @param driver
	 */
	public void forward(WebDriver driver) {
		driver.navigate().forward();
	}
	
	/**
	 * This method will perform refresh operation in webpage
	 * @param driver
	 */
	public void refresh(WebDriver driver) {
		driver.navigate().refresh();
	}
	
	/**
	 * This method will return the single window id/ session id
	 * @param driver
	 * @return
	 */
	public String getWindowHandle(WebDriver driver) {
		return driver.getWindowHandle();
	}
	
	/**
	 * This method will mouse Hover the element
	 * @param driver
	 * @param element
	 */
	public void mouseHover(WebDriver driver, WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	/**
	 * This method will scroll to the element
	 * @param driver
	 * @param element
	 */
	public void scrollToElement(WebDriver driver, WebElement element) {
		Actions act=new Actions(driver);
		act.scrollToElement(element).perform();
	}
	/**
	 * This method will scroll by giving x and y values by caller
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void scrollByAmount(WebDriver driver, int x, int y) {
		Actions act=new Actions(driver);
		act.scrollByAmount(x, y).perform();
	}
	/**
	 * This method will drag the element from source and will drop the element to the target
	 * @param driver
	 * @param source
	 * @param target
	 */
	public void dragAndDrop(WebDriver driver, WebElement source, WebElement target) {
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}
	/**
	 * This method will perform right click on webpage
	 * @param driver
	 */
	public void rightClick(WebDriver driver) {
		Actions act=new Actions(driver);
		act.contextClick().perform();
	}
	
	/**
	 * This method will perform right click on web element of webpage
	 * @param driver
	 * @param element
	 */
	public void rightClick(WebDriver driver, WebElement element) {
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	
	/**
	 * This method will perform double click on webpage
	 * @param driver
	 */
	public void doubleClick(WebDriver driver) {
		Actions act=new Actions(driver);
		act.doubleClick().perform();
	}
	
	/**
	 * This method will perform double click on web element of webpage
	 * @param driver
	 * @param element
	 */
	public void doubleClick(WebDriver driver, WebElement element) {
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	
	/**
	 * This method will perform click and hold operation on webpage
	 * @param driver
	 */
	public void clickAndHold(WebDriver driver) {
		Actions act=new Actions(driver);
		act.clickAndHold().perform();
	}
	
	/**
	 * This method will perform click and hold operation on web element of webpage
	 * @param driver
	 * @param element
	 */
	public void clickAndHold(WebDriver driver, WebElement element) {
		Actions act=new Actions(driver);
		act.clickAndHold(element).perform();
	}
	
	/**
	 * This method will select option from dropdown using Index passed by caller
	 * @param element
	 * @param index
	 */
	public void selectDropdown(WebElement element, int index) {
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	
	/**
	 * This method will select option from dropdown using Value passed by caller
	 * @param element
	 * @param value
	 */
	public void selectDropdown(WebElement element, String value) {
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	
	/**
	 * This method will select option from dropdown using Visible text passed by caller
	 * @param text
	 * @param element
	 */
	public void selectDropdown(String text,WebElement element) {
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	
	/**
	 * This method will switch to frame using index passed by caller
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}
	
	/**
	 * This method will switch to frame using name or Id passed by caller
	 * @param driver
	 * @param nameOrId
	 */
	public void switchToFrame(WebDriver driver, String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	
	/**
	 * This method will switch to frame using element passed by caller
	 * @param driver
	 * @param element
	 */
	public void switchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}
	
	/**
	 * This method will switch to alert and caller can perform action as per his requirement
	 * @param driver
	 * @return
	 */
	public Alert switchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}
	
	/**
	 * This method will take the screenshot of the webpage
	 * @param driver
	 * @throws IOException
	 */
	public void getScreenshot(WebDriver driver) throws IOException {
		JavaUtility jutil=new JavaUtility();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("./screenshots/"+jutil.getSystemTime()+".png");
		FileHandler.copy(temp, dest);
	}
	
	/**
	 * This method switches the control from one window to the other window using url passed by caller
	 * @param driver
	 * @param expUrl
	 */
	public void switchToWindow(WebDriver driver, String expUrl) {
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id : allWindowIds) {
			driver.switchTo().window(id);
			if(driver.getCurrentUrl().contains(expUrl)) {
				break;
			}
		}
	}
	
	/**
	 * This method switches the control from one window to the other window using Title passed by caller
	 * @param expTitle
	 * @param driver
	 */
	public void switchToWindow(String expTitle,WebDriver driver) {
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id : allWindowIds) {
			driver.switchTo().window(id);
			if(driver.getTitle().contains(expTitle)) {
				break;
			}
		}
	}
}
