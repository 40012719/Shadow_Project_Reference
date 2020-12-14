package serenitySteps;

import Pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginHowSteps {
	LoginPage loginpage;
	@Step
	public void mobileCapabilities() throws InterruptedException 
    {
		loginpage.setMobileCapabilities();
    }
	@Step
	public void enterEmail(String emailid) throws InterruptedException 
	{
		loginpage.setEmail(emailid);
		
	}
	@Step
	public void enterPassword(String password) throws InterruptedException {
   
		loginpage.setPassword(password);
	}
	@Step
	public void clicklogin() throws InterruptedException  {
		
		loginpage.loggingin();
	}
	@Step
	public void clickremember() throws InterruptedException 
	{
		loginpage.rememberme();
		
	}
	
	

}
