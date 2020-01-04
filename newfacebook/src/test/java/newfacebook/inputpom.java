package newfacebook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class inputpom extends HOOKUPBASE {

	
	public inputpom() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="firstname")
	public WebElement FirstName;
	
	@FindBy(id="u_0_h")
	public WebElement LastName;
	
	@FindBy(id="u_0_k")
	public WebElement EmailPhone;
	
	@FindBy(name="reg_passwd__")
	public WebElement Password;
	
	

	
}
