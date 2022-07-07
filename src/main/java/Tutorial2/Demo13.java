package Tutorial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kapil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		WebElement wb=driver.findElement(By.id("txtUsername"));
		boolean a =wb.isDisplayed();
		//System.out.println(a);
		boolean b =wb.isEnabled();
		//System.out.println(b);
		if((a==true)&&(b==true)) {
		wb.sendKeys("Admin");
		}
		WebElement abc=driver.findElement(By.id("txtPassword"));
		boolean c = abc.isDisplayed();
		//System.out.println(c);
		boolean d =abc.isEnabled();
		//System.out.println(d);
		if((c==true)&&(d==true)) {
		abc.sendKeys("admin123");}
		driver.findElement(By.id("btnLogin")).click();
		//String g=driver.getTitle();
		//System.out.println(g);
		if(driver.getTitle().contains("HRM")) {
			System.out.println("test cases is pass");
		}
		else {
			System.out.println("test cases is failed");}
		}
		

	}

