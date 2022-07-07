package Tutorial3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kapil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String a=driver.findElement(By.className("_8eso")).getText();
		System.out.println(a);
		if(a.contains("connect")) {
			System.out.println("test cases is passed");
		}
		else {
			System.out.println("test cases failed");
		}
	}

}
