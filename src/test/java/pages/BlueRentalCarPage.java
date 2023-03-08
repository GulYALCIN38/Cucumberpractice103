package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class BlueRentalCarPage {
    public BlueRentalCarPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(partialLinkText = "Login")
    public WebElement login;

    @FindBy(id= "formBasicEmail")
    public WebElement email;

    @FindBy(id= "formBasicPassword")
    public WebElement password;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement loginyap;



}
