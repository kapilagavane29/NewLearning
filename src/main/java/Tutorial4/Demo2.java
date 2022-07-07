package Tutorial4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kapil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		WebElement wb=driver.findElement(By.xpath("//iframe[@name=\"classFrame\"]"));
		driver.switchTo().frame(wb);
		Thread.sleep(5000);
		driver.findElement(By.linkText("org.openqa.selenium.docker")).click();
		Thread.sleep(5000);
            //goto the top window
		driver.switchTo(). defaultContent();
		driver.navigate().refresh();
		WebElement cb=driver.findElement(By.xpath("//iframe[@name='packageListFrame']"));
		driver.switchTo().frame(cb);
		Thread.sleep(5000);

		driver.findElement(By.linkText("org.openqa.selenium")).click();
		Thread.sleep(5000);
		driver.close();


	}

}
