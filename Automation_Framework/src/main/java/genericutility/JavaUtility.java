package genericutility;

import java.time.LocalDateTime;
import java.util.Random;
/**
 * @author Shristi
 */
public class JavaUtility {
	/**
	 * This method will return current system date and time in String format and return value to the caller
	 * @return String
	 */
	public String getSystemTime() {
		return LocalDateTime.now().toString().replace(":", "-");
	}
	/**
	 * This method will return random number within 1000 and return value to the caller
	 * @return int
	 */
	public int getRandomNumber() {
		Random ran=new Random();
		return ran.nextInt(1000);
	}
}
