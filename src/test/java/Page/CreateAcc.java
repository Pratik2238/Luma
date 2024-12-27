package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateAcc {
    WebDriver driver;
//    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

    @FindBy(xpath = "//*[@id=\"firstname\"]")
    private WebElement firstName;
    @FindBy(xpath = "//*[@id=\"lastname\"]")
    private WebElement lastName;

    @FindBy(xpath = "//*[@id=\"email_address\"]")
    private WebElement email;
    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"password-confirmation\"]")
    private WebElement confirmpassword;

    @FindBy(xpath = "//*[@id=\"form-validate\"]/div/div[1]/button")
    private WebElement createButton;




    public CreateAcc(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setFirstName(String firstName){
        this.firstName.sendKeys(firstName);


    }
    public void setLastName(String lastName){
        this.lastName.sendKeys(lastName);

    }

    public void setEmail(String email){
        this.email.sendKeys(email);

    }
    public void setPassword(String password){
        this.password.sendKeys(password);


    }
    public void setConfirmpassword(String confirmpassword){
        this.confirmpassword.sendKeys(confirmpassword);



    }
    public void setCreateButton(){
        this.createButton.click();

    }

}
