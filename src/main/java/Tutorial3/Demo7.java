package Tutorial3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kapil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("kapilgavanekg@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("kapil1192040");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]")).click();
		//driver.findElement(By.xpath("//div[@class='b20td4e0 muag1w35']/following::div[@class='n00je7tq arfg74bv qs9ysxi8 k77z8yql i09qtzwb n7fi1qx3 b5wmifdl hzruof5a pmk7jnqg j9ispegn kr520xx4 c5ndavph art1omkt ot9fgl3s rnr61an3']")).submit();
		//driver.findElement(By.xpath("//div[@class='a8nywdso sj5x9vvc rz4wbd8a ecm0bbzt']/following::div[@class='n00je7tq arfg74bv qs9ysxi8 k77z8yql i09qtzwb n7fi1qx3 b5wmifdl hzruof5a pmk7jnqg j9ispegn kr520xx4 c5ndavph art1omkt ot9fgl3s rnr61an3']").submit();
		//driver.findElement(By.className("class=\"n00je7tq arfg74bv qs9ysxi8 k77z8yql i09qtzwb n7fi1qx3 b5wmifdl hzruof5a pmk7jnqg j9ispegn kr520xx4 c5ndavph art1omkt ot9fgl3s rnr61an3\"")).click();
////div[@class='b20td4e0 muag1w35']/following::span[1]
		driver.findElement(By.xpath("//div[@className='dati1w0a ihqw7lf3 hv4rvrfc discj3wi']/preceding::div[149]")).click();
	}

}
