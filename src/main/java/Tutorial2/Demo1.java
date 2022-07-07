package Tutorial2;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","path of chrome");
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.google.com");
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.WINDOW).get("https:/www.facebook.com");
		String g =driver.getCurrentUrl();
		System.out.println(g);

		//TargetLocator tr =driver.switchTo();
		//WebDriver b=tr.newWindow(WindowType.WINDOW);
		//get("https:/www.facebook.com");
		Thread.sleep(5000);
		driver.close();
   
	}

}
