package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonPage {
	WebDriver driver;

	public CommonPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickUsingJavascript(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);
	}

	public void waitExplicitlyForElement(String ele) {
		new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath(ele)));
	}

	public String verifyPageTitle() {
		return driver.getTitle();
	}
}
