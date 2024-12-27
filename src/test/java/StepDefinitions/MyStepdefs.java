package StepDefinitions;

import Base.BaseClass;
import Page.CreateAcc;
import Page.Home;
import Page.SignIn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    WebDriver driver;
    Home home= new Home(driver);
    CreateAcc create=new CreateAcc(driver);
    SignIn signIn=new SignIn(driver);


    @Given("User launch the browser and navigates to LUMA home page")
    public void userLaunchTheBrowserAndNavigatesToLUMAHomePage() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com");

    }

    @When("User clicks on Create an Account button")
    public void userClicksOnCreateAnAccountButton() {
        home.setCreateAcc();

    }

    @Then("User should be navigated to {string} page")
    public void userShouldBeNavigatedToPage(String title) {
        Assert.assertEquals(title,driver.getTitle());


    }

    @And("User enters first name as {string} and last name as {string}")
    public void userEntersFirstNameAsAndLastNameAs(String firstName, String lastName) {
        create.setFirstName(firstName);
        create.setLastName(lastName);
    }

    @And("User enters email as {string}")
    public void userEntersEmailAs(String email) {
        create.setEmail(email);

    }

    @And("User enters password as {string}")
    public void userEntersPasswordAs(String pwd) {
        create.setPassword(pwd);
        create.setConfirmpassword(pwd);

    }

    @And("User Clicks on Create an Account button")
    public void userClicksOnCreateAnAccountButton1() {
        //create.setCreateButton();
    }

    @Then("User shuld be navigated to {string} page")
    public void userShuldBeNavigatedToPage(String title) {
        Assert.assertEquals(title,driver.getTitle());

    }

    @When("User clicks on Sign in button")
    public void userClicksOnSignInButton() {
        home.setSignIn();
        
    }

    @Then("{string} page should appeare")
    public void pageShouldAppeare(String title) {
        Assert.assertEquals(title,driver.getTitle());
        
    }

    @And("User enters email for signin {string}")
    public void userEntersEmailForSignin(String email) {
        signIn.setEmail(email);


    }

    @And("User enters password for signin {string}")
    public void userEntersPasswordForSignin(String pwd) {
        signIn.setLoginpwd(pwd);

    }

    @And("user clicks on Sign in button{int}")
    public void userClicksOnSignInButton1() {
        signIn.setSigninButtton();
    }
}
