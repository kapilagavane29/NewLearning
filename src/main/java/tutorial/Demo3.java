package tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kapil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","path of chrome");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com");
		String a=driver.getTitle();
		System.out.println(a);
		driver.navigate().to("https://www.flipkart.com");
		String b=driver.getCurrentUrl();
		System.out.println(b);
		driver.close();
		


}}
