package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignIn {
    WebDriver driver;
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));


    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement email;

    @FindBy(xpath = " //*[@name=\"login[password]\"]")
    private WebElement loginpwd;

    @FindBy(xpath = " //*[@id=\"send2\"]")
    private WebElement signinButtton;


    public SignIn(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setEmail(String email){
        this.email.sendKeys(email);


    }
    public void setLoginpwd(String loginpwd){
        this.loginpwd.sendKeys(loginpwd);
    }

    public void setSigninButtton(){
        this.signinButtton.click();
    }

}
