package newfacebook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Buttonpom extends HOOKUPBASE {
 
	 public Buttonpom() {
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(id="u_0_w")
	 public WebElement signupbutton;
	 
}
