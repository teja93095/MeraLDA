package testSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.CommonPage;
import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.RegistrationPage;

public class Meradla {
	public WebDriver driver;
	public RegistrationPage registrationPage;
	public HomePage homePage;
	public LoginPage loginPage;
	public CommonPage commonPage;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tanmay\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

	@Test(priority = 0)
	public void registration() {
		registrationPage = new RegistrationPage(driver);
		registrationPage.userRegistration();
		registrationPage.verifyPageTitle();
		Assert.assertEquals(registrationPage.verifyPageTitle().trim().equals("MERALDA || HOME"), true);

	}

	@Test(priority = 1)
	public void logout() {
		homePage = new HomePage(driver);
		homePage.userLogout();
	}

	@Test(priority = 2)
	public void login() {
		
		loginPage = new LoginPage(driver);
		loginPage.userLogin();
	}

	@AfterSuite
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
