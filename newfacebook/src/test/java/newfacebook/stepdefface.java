package newfacebook;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepdefface extends HOOKUPBASE {
    inputpom IP = new inputpom();        
	gederselecpom GS = new gederselecpom();
	Buttonpom BS = new Buttonpom();
	
	@Given("^user should navigate to facebook home page$")
	public void user_should_navigate_to_facebook_home_page() throws Throwable {
	   driver.get("https://www.facebook.com");
	}

	@Then("^user should should enter firstname in first name field$")
	public void user_should_should_enter_firstname_in_first_name_field() throws Throwable {
	   //driver.findElement(By.id("u_0_f")).sendKeys("farrukh");
		IP.FirstName.sendKeys("farrukh");
	}

	@Then("^user should enter lastname in lastname field$")
	public void user_should_enter_lastname_in_lastname_field() throws Throwable {
	  //driver.findElement(By.id("u_0_h")).sendKeys("khan");
		IP.LastName.sendKeys("khan");
	}

	@Then("^user should enter email/mobile in email/mobile field$")
	public void user_should_enter_email_mobile_in_email_mobile_field() throws Throwable {
	   //driver.findElement(By.name("reg_email__")).sendKeys("812771");
		IP.EmailPhone.sendKeys("812771");
	}

	@Then("^user should enter password in password field$")
	public void user_should_enter_password_in_password_field() throws Throwable {
	  // driver.findElement(By.name("reg_passwd__")).sendKeys("Fswatian");
		IP.Password.sendKeys("fSWAJJAJ");
	}

	@Given("^user should enter month in DOB section$")
	public void user_should_enter_month_in_DOB_section() throws Throwable {
	    Select ddb = new Select(driver.findElement(By.id("month")));
	    ddb.selectByValue("9");
	}

	@Then("^user should enter date in DOB section$")
	public void user_should_enter_date_in_DOB_section() throws Throwable {
	    Select ddd = new Select(driver.findElement(By.name("birthday_day")));
	    ddd.selectByValue("14");
	    ddd.selectByVisibleText("14");
	}

	@Then("^user should enter year in DOB section$")
	public void user_should_enter_year_in_DOB_section() throws Throwable {
	    Select ddy = new Select(driver.findElement(By.name("birthday_year")));
	    
	    ddy.selectByVisibleText("1982");
	}

	@Given("^user should select gender from radio gender section$")
	public void user_should_select_gender_from_radio_gender_section() throws Throwable {
	   //driver.findElements(By.name("sex")).get(1).click();
		GS.gender.click();
	}

	@Given("^user should click on the signup button$")
	public void user_should_click_on_the_signup_button() throws Throwable {
	   //driver.findElement(By.name("websubmit")).click();
		BS.signupbutton.click();
	   
	}


@Then("^user should should enter \"([^\"]*)\" in first name field$")
public void user_should_should_enter_in_first_name_field(String firstname) throws Throwable {
	IP.FirstName.sendKeys(firstname);
}
   


@Then("^user should enter \"([^\"]*)\" in lastname field$")
public void user_should_enter_in_lastname_field(String lastname) throws Throwable {
    IP.LastName.sendKeys(lastname);
}

@Then("^user should enter \"([^\"]*)\" in email/mobile field$")
public void user_should_enter_in_email_mobile_field(String emailmobile) throws Throwable {
  IP.EmailPhone.sendKeys(emailmobile);
}

@Then("^user should enter \"([^\"]*)\" in password field$")
public void user_should_enter_in_password_field(String password) throws Throwable {
   
IP.Password.sendKeys(password);

}	
	
}
