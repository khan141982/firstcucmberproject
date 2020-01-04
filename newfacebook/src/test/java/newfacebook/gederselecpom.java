package newfacebook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gederselecpom extends HOOKUPBASE {

	public gederselecpom() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="u_0_a")
	public WebElement gender;
	
	
}
