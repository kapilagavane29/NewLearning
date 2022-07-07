package Tutorial1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//System.setProperty(webdriver.chrome.driver,path of chrome )
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.wwe.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(5000);
		
		driver.navigate().to("https:/www.cricbuzz.com");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(5000);
		driver.navigate().back();
		
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		
		String title1 = driver.getTitle();
		System.out.println(title1);
		Thread.sleep(5000);
		driver.close();
		

	}

}
