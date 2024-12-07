package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageObject {


    public static class LoginPage {


        @FindBy(id = "user-name")
        public WebElement usernameField;

        @FindBy(name = "password")
        public WebElement passwordField;

        @FindBy(xpath ="//input[@data-test='login-butten']" )
        public WebElement loginButton;

        public LoginPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }




        public void autharize(String username,String password){
            usernameField.sendKeys(username);
            passwordField.sendKeys(password);
            loginButton.click();
        }




    }
}
