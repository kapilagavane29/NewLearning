package Tutorial1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kapil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver""path of chrome);
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.amazon.com");
		String b=driver.getCurrentUrl();
		System.out.println(b);
		if(b.contains("Amazon")) {
			System.out.println("test cases passed for url");}
		else {
			System.err.println("test cases faild for url");}
		driver.navigate().refresh();
		Thread.sleep(5000);
		String z = driver.getTitle();
		System.out.println(z);
		if(z.contains("amazon")) {
			System.out.println("test cases passed for title");}
		else {
			System.err.println("test cases failed for title");
			Thread.sleep(5000);
			driver.close();
		
		
		}
		

	}

}
