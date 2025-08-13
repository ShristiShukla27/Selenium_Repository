package jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PollScmTest {
	@Test
	public void launch() {
		WebDriver driver=new ChromeDriver();
		Reporter.log("PollSCMTest Executed", true);
	}
}
