package AutoFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethodForFB {

	WebDriver driver = new ChromeDriver();
	
	public void loginId(String s ) 
	{
		driver.findElement(By.id("email")).sendKeys(s);
	
	}
	public void Password(String p ) 
	{
		driver.findElement(By.id("pass")).sendKeys(p);
	
	}
	public void clickLogIn() {
		driver.findElement(By.id("loginbutton")).click();
	}

	public void url() {
		driver.get("https://www.facebook.com/");
	}
	
	public void close() {
		driver.close();
	}
}
