package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testUtils.BaseClass;

public class RegistrationSteps extends BaseClass {
	
	
//	@Given("^I open browser$")
//	public void i_open_the_browser() throws Throwable {
//	    System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver");
//	    driver=new ChromeDriver();
//	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	    driver.manage().window().fullscreen();
//	}

	
	@When("^I am on the site click on Sign up$")
	public void i_am_on_the_site_click_on_Sign_up() throws Throwable {
		Thread.sleep(2000);
	    driver.findElement(By.linkText("Sign Up")).click();
	}

	@When("^I click on dropdown and select free edition$")
	public void i_click_on_dropdown_and_select_free_edition() throws Throwable {
	    WebElement dd=driver.findElement(By.xpath("//select[@id='payment_plan_id']"));
	    Thread.sleep(2000);
	    Select dropdown=new Select(dd);
	    dropdown.selectByVisibleText("Free Edition");
	}

	@When("^I enter \"([^\"]*)\" , \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and(String firstName, String lastName, String email) throws Throwable {
	    driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstName);
	    driver.findElement(By.xpath("//input[@name='surname']")).sendKeys(lastName);
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
	    driver.findElement(By.xpath("//input[@name='email_confirm']")).sendKeys(email);
	    
	    
	}
	
	@When("^I enter credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_credentials_and(String uName, String pwd) throws Throwable {
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uName);
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	    driver.findElement(By.xpath("//input[@name='passwordconfirm']")).sendKeys(pwd);
	}

	@When("^I check agree terms box$")
	public void i_check_agree_terms_box() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='agreeTerms']")).click();
	}

	@When("^I click submit$")
	public void i_click_submit() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='submitButton']")).click();
	}

	@When("^I enter company information \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_company_information_and(String companyName, String phone) throws Throwable {
	   driver.findElement(By.xpath("//input[@name='company_name']")).sendKeys(companyName);
	   driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(phone);
	}

	@When("^I click on Continue$")
	public void i_click_on_Continue() throws Throwable {
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@name='btnSubmit']")).click();
	}
	
	@When("^I click on continue registration$")
	public void i_click_on_continue_registration() throws Throwable {
	  driver.findElement(By.xpath("//button[@name='btnSubmit']")).click();
	}

	@Then("^I have successfully created new user$")
	public void i_have_successfully_created_new_user() throws Throwable {
	   boolean finish= driver.findElement(By.xpath("//span[@class='text_normal']")).isDisplayed();
	   
	   Assert.assertTrue(finish);
	   
	}
	
	





}
