package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Home {

    WebDriver driver;
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));


    @FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[3]/a")
    private WebElement createAcc;

    @FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
    private WebElement signIn;


    public Home(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setCreateAcc(){
        //wait.until(ExpectedConditions.visibilityOf(createAcc));
        this.createAcc.click();

    }
    public void setSignIn(){
        this.signIn.click();

    }


}
