package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends CommonPage {

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}

	public void userRegistration() {
		driver.get("https://meralda.scalenext.io/user/register");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		waitExplicitlyForElement("//*[@name='first_name']");
		driver.findElement(By.xpath("//*[@name='first_name']")).sendKeys("Tejshree");
		driver.findElement(By.xpath("//*[@name='last_name']")).sendKeys("Yewale");
		driver.findElement(By.xpath("//*[@placeholder='Email Address']")).sendKeys("teja.21@gmail.com");
		driver.findElement(By.xpath("//*[@name='mobile']")).sendKeys("9568234545");
		driver.findElement(By.xpath("//*[@name='date']")).sendKeys("1");
		waitExplicitlyForElement("//*[@title='2022-12-01']");
		driver.findElement(By.xpath("//*[@title='2022-12-01']")).click();
		driver.findElement(By.xpath(" //*[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@name='password_confirmation']")).sendKeys("123456");

		waitExplicitlyForElement("//button[@type='submit']");
		clickUsingJavascript(driver.findElement(By.xpath("//button[@type='submit']")));
	}

	
}
