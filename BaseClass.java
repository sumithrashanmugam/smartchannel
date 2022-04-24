package baseClass;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseClass {
	public ChromeDriver driver;
	  @BeforeMethod
	  public void beforeMethod() {
	  	WebDriverManager.chromedriver().setup();
	  	driver = new ChromeDriver();
	  	driver.get("http://d2ggk2m8z3e33q.cloudfront.net/auth/signin");
	  	driver.manage().window().maximize();
	  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  	driver.get("http://d2ggk2m8z3e33q.cloudfront.net/auth/signin");
	  	String string = "esauat@gmail.com";
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(string);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pass123");
        driver.findElement(By.xpath("//div[contains(@class,'form-group text-left')]/following-sibling::button[1]")).click();
	  }
}
