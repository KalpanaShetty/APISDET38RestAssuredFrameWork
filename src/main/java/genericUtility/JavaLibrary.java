package genericUtility;

import java.util.Random;

/**
 * This class consist of java library
 * @author Kalpana Shetty
 *
 */
public class JavaLibrary {
	
	/**
	 * This method will return random number within specified range(5000)
	 * @author Kalpana Shetty
	 * @return
	 */
public int randomNum() {
	Random ran = new Random();
	int randomNumber = ran.nextInt(5000);
	return randomNumber;
}
}
