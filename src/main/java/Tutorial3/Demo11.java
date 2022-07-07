package Tutorial3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kapil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		//String a =driver.findElement(By.className("gb_d")).getText();
		//System.out.println(a);
		WebElement wb =driver.findElement(By.partialLinkText(" account?"));
		String a=wb.getText();
		System.out.println(a);
		wb.click();

	}

}
