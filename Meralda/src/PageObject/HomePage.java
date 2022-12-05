package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends CommonPage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void userLogout() {
		driver.get("https://meralda.scalenext.io/user/login");
		waitExplicitlyForElement("(//*[@id='profileDropdown']//img)[last()]");
		driver.findElement(By.xpath("(//*[@id='profileDropdown']//img)[last()]")).click();

		driver.findElement(By.xpath(
				"//[@id='profileDropdown']//following-sibling::div[@class='dropdown-menu show']//[text()='Logout']"))
				.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
