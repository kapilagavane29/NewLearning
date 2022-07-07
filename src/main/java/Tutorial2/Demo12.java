package Tutorial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kapil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		//driver.findElement(By.name("lastname")).sendKeys("Kapil");
		//Thread.sleep(5000);
		//driver.findElement(By.name("lastname")).clear();
		WebElement we=driver.findElement(By.name("lastname"));
		boolean a =we.isDisplayed();
		System.out.println(a);
		boolean b =we.isEnabled();
		System.out.println(b);
		we.sendKeys("kapil");
		Thread.sleep(5000);
		we.clear();
		
		

	}

}
