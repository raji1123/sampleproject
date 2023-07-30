package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxdriver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.gecko.driver",
				"C:\\Users\\Pradeep Marimuthu\\Downloads\\firefox\\geckodriver-v0.33.0-win32.geckoDriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		String title=driver.getCurrentUrl();
		System.out.println(title);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();

	}

}
