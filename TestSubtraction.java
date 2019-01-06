/**
 * 
 */

/**
 * @author sdabre
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSubtraction {
		

		public static void main(String[] args) {
	        // declaration and instantiation of objects/variables
	    	//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
			
			String exePath = "chromedriver.exe";
			 System.setProperty("webdriver.chrome.driver","/Users/sdabre/eclipse-workspace/SujayRevision/chromedriver");
			 WebDriver driver = new ChromeDriver();
			 driver.get("http://toolsqa.com/automation-practice-form/");

	       
	        driver.close();
	       
	    }

	}


