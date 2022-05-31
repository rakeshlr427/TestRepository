package DemoOpencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
@Test
public void loginOpenCart() {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.opencart.com/index.php?route=account/login");
	driver.findElement(By.name("email")).sendKeys("abcvbnmm@gmail.com");
	driver.findElement(By.name("password")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
}
}
