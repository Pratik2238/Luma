package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

public WebDriver setUp(){

    System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://magento.softwaretestingboard.com");
    return driver;


}
}
