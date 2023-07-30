package task16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedriver {

	
	
void m1(){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Pradeep Marimuthu\\Downloads\\chromedriver\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe") ;
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoblaze.com/");
	String title=driver.getTitle();
	System.out.println(title);
	if (title.equalsIgnoreCase("store")) {
		System.out.println("page landed on correct website");
		
		
	}
	else {
		System.out.println("page not landed on correct website");
		
	}
}
	
	
	void m2() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pradeep Marimuthu\\Downloads\\chromedriver\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe") ;
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Artificial Intelligence");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.linkText("History")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
		
		
		
		
	}

	

	

	

	public static void main(String[] args) {
		
		Chromedriver s=new Chromedriver ();
		//s.m1();
		s.m2();

}}
