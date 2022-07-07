package Tutorial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kapil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		//driver.findElement(By.name("firstname")).sendKeys("Kapil");
		//driver.findElement(By.name("lastname")).sendKeys("gavane");
		//WebElement wb=driver.findElement(By.name("firstname"));
		//wb.isDisplayed();
		//wb.isEnabled();
		//wb.sendKeys("kapil");
		boolean b=driver.findElement(By.name("firstname")).isDisplayed();
		System.out.println(b);
		

	}

}
