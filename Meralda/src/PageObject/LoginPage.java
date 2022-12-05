package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends CommonPage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void userLogin() {
		driver.get("https://meralda.scalenext.io/user/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		waitExplicitlyForElement("//*[@name='username']");
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Tejshree");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Tejshree");
		waitExplicitlyForElement("//button[text()='Login']");
		clickUsingJavascript(driver.findElement(By.xpath("//button[text()='Login']")));
	}
}
