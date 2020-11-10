package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;

public class DeleteBookingSteps {
	WebDriver driver;
	HomePage HomePage = PageFactory.initElements(driver, HomePage.class);
     
	@When("^I click on delete button for first booking$")
	public void i_click_on_delete_button_for_first_booking() throws Throwable {
		HomePage.deleteBooking();
		   System.out.println("booking deleted");
		   Thread.sleep(2000);
	}

	@Then("^That Booking should be deleted$")
	public void that_Booking_should_be_deleted() throws Throwable {
		   int a = HomePage.firstnameCount().size();
		 int deletecount = HomePage.firstnameCount().size();
		   Assert.assertEquals(a, deletecount);
}
}
