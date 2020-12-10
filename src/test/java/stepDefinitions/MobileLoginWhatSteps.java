package stepDefinitions;

import org.junit.Test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import serenitySteps.LoginHowSteps;

public class MobileLoginWhatSteps {
    @Steps
    LoginHowSteps loginhowsteps=new LoginHowSteps();
    @Test
	@Given("^I want to open the app$")
    public void mobileCapabilities() throws InterruptedException
    {
		loginhowsteps.mobileCapabilities();
    }

    @Then("^I want to enter the (.*)$")
	public void i_want_to_enter_the_emailid(String emailid) throws InterruptedException
	{
		loginhowsteps.enterEmail(emailid);
		
	}

	@And("^I want  enter the (.*)$")
	public void i_want_to_enter_the_password(String password) throws Throwable 
	{
		loginhowsteps.enterPassword(password);
	}

	@And("^I want to click on login button$")
	public void i_want_to_click_on_login_button() throws Throwable 
	{
		loginhowsteps.clicklogin();
	}
	
	@And("^I want to remember credentials$")
	public void i_want_to_click_on_remember_button() throws Throwable 
	{
		loginhowsteps.clickremember();
	}
}
