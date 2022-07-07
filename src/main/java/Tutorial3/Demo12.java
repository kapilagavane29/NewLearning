package Tutorial3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo12 {
	public static String abc(WebElement wb,String a) {
		Select sel = new Select(wb);
		sel.selectByVisibleText("a");
		return a;
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kapil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		WebElement wb=driver.findElement(By.id("day"));
		//Select sel = new Select(wb);
		//sel.selectByVisibleText("29");
		//WebElement abc=sel.getFirstSelectedOption();
		//String a =a.getText();
		//System.out.println(a);
		
		WebElement cb=driver.findElement(By.id("month"));
		Select mon =new Select(cb);
		mon.selectByVisibleText("Jul");
		WebElement cde=mon.getFirstSelectedOption();
		String b=cde.getText();
		System.out.println(b);//year
		
		WebElement bb=driver.findElement(By.id("year"));
		Select y=new Select(bb);
		y.selectByVisibleText("1995");
		WebElement mno=y.getFirstSelectedOption();
		String c=mno.getText();
		System.out.println(c);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	}


