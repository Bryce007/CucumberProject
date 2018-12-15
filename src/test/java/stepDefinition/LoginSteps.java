package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testUtils.BaseClass;

public class LoginSteps extends BaseClass {
	

	@Given("^I open the browser$")
	public void i_open_the_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver");
		driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}

	@Given("^I navigate to the FreeCrm$")
	public void i_navigate_to_the_FreeCrm() throws Throwable {
		driver.get("https://www.freecrm.com/index.html");
	}

	@When("^I enter valid \"(.*)\" and \"(.*)\"$")
	public void i_enter_valid_and(String uName, String pwd) throws Throwable {
		driver.findElement(By.name("username")).sendKeys(uName);
		driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@When("^I click login button$")
	public void i_click_login_button() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Login']")).click();

	}

	@Then("^I successfully logged in$")
	public void i_successfully_logged_in() throws Throwable {
		driver.switchTo().frame(1);
		Thread.sleep(1000);
		boolean b = driver.findElement(By.xpath("//a[@href='https://www.freecrm.com/system/index.cfm?action=home']"))
				.isDisplayed();
		System.out.println(b + " home is displayed");
	}

	

	@Then("^I see error message$")
	public void i_see_error_message() throws Throwable {
		boolean error = driver.findElement(By.xpath("//input[@value='Login']")).isDisplayed();
		Assert.assertTrue(error);
		System.out.println("When user cannot login they will see " + error);
	}

	@Then("^I quit browser$")
	public void i_quit_browser() throws Throwable {
		driver.quit();
	}

	@Then("^I still see sign up link$")
	public void i_still_see_sign_up_link() throws Throwable {
		boolean crm = driver.findElement(By.xpath("//input[@value='Login']")).isDisplayed();
		Thread.sleep(2000);
		Assert.assertTrue(crm);
	}

}
