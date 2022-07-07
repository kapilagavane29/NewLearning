package Tutorial3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kapil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("firstName")).sendKeys("kagiso");
		driver.findElement(By.id("lastName")).sendKeys("Rabada");
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("btnSave")).click();
		WebElement wb=driver.findElement(By.id("personal_optGender_1"));
		boolean a=wb.isDisplayed();	
		System.out.println(a);
		boolean b=wb.isEnabled();
		System.out.println(b);
		boolean c=wb.isSelected();
		System.out.println(c);//personal_optGender_2
		wb.click();
		boolean d=wb.isSelected();
		System.out.println(d);
		driver.findElement(By.id("personal_optGender_2")).click();
		boolean e=wb.isSelected();
		System.out.println(e);
		Thread.sleep(5000);
		driver.close();
		


		

		

		

		
		

	}

}
