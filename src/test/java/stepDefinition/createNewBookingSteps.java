package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;

public class createNewBookingSteps {
	public WebDriver driver;

	@Given("^I have navigated to Hotel Booking Form$")
	public void i_have_navigated_to_Hotel_Booking_Form() throws Throwable {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/Drivers/geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   driver.get("http://hotel-test.equalexperts.io/");
	}

	
	@When("^I enter required values in all fields$")
	public void i_enter_required_values_in_all_fields() throws Throwable {
		
		HomePage HomePage = PageFactory.initElements(driver, HomePage.class);
		Thread.sleep(5000);
		  // int a = HomePage.firstnameCount().size();
		   HomePage.createBooking();
		 throw new PendingException();
	}

	@When("^click on Save Button$")
	public void click_on_Save_Button() throws Throwable {
		 System.out.println("booking created");
		   Thread.sleep(2000);
		   throw new PendingException();
	}

	@Then("^New Booking should be created$")
	public void new_Booking_should_be_created() throws Throwable {
		//int e = HomePage.firstnameCount().size();
		//Assert.assertEquals(a+1, e); 
		   throw new PendingException();
	}

}
	
