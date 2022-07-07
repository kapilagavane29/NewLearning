package Tutorial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kapil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("kapilgavanekg@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("kapil1192040");
		//Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		

	}

}
