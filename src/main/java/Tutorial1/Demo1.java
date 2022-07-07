package Tutorial1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated met
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kapil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","path of chrome");
		WebDriver driver = new ChromeDriver();
		//goto the specific browser
		driver.get("https:/www.cricbuzz.com");
		//capture title
	String Title	=driver.getTitle();
	System.out.println("Title =="+Title);
	Thread.sleep(5000);
	//navigate to other browser
	driver.navigate().to("https:/www.facebook.com");
	String url=driver.getCurrentUrl();
	System.out.println(url);
	Thread.sleep(5000);
	driver.navigate().back();
	String d=driver.getCurrentUrl();
	System.out.println(d);
	Thread.sleep(5000);
	driver.close();

	}

}
