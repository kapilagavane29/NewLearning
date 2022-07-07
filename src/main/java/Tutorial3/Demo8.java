package Tutorial3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kapil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");//firstName
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("firstName")).sendKeys("virat");
		driver.findElement(By.id("lastName")).sendKeys("kohli");
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("btnSave")).click();
		WebElement wb=driver.findElement(By.id("personal_optGender_1"));
		if((wb.isDisplayed())&&(wb.isEnabled())) {
			boolean a=wb.isSelected();
			System.out.println(a);
			wb.click();
			boolean b =wb.isSelected();
			System.out.println(b);
		}
		else {
			System.out.println("test caeses is failed");
		}
		WebElement abc=driver.findElement(By.id("personal_cmbMarital"));
		Select sel = new Select(abc);
		sel.selectByVisibleText("Married");
		WebElement z= sel.getFirstSelectedOption();
		System.out.println(z.getText());//z.getText();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		




	}

}
