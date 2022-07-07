package Tutorial1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kapil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","path of chrome");
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.linkedin.com");
		String title =driver.getTitle();
		System.out.println(title);
		Thread.sleep(5000);
		driver.navigate().to("http:/www.amazon.com");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(5000);
		driver.navigate().back();
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		Thread.sleep(5000);
		driver.navigate().forward();
		String title1=driver.getTitle();
		System.out.println(title1);
		Thread.sleep(5000);
		driver.close();

	}

}
