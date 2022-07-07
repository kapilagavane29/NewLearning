package Tutorial3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo5 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kapil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		WebElement wb=driver.findElement(By.id("day"));
		Select sel =new Select(wb);
		sel.selectByValue("10");
		WebElement abc=sel.getFirstSelectedOption();
		String a=abc.getText();
		System.out.println(a);
		List<WebElement>b=sel.getOptions();//we count the drop down values
		int c=b.size();//by using size method how many values.
		for (WebElement pqr:b) {
			String g=pqr.getText();
			System.out.println(g);
		}
		
		System.out.println(c);
		

	}

}
