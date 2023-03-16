package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Tutorialpage {
    public Tutorialpage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='Phones & PDAs']")
    public WebElement phone;

    @FindBy(xpath ="//h4//a")
    public List<WebElement> phoneName;

    @FindBy(xpath ="//div[@class='button-group']")
    public List<WebElement> addtocart;

    @FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[2]")
    public WebElement sepet;

    @FindBy(xpath ="//*[@class='text-left']")
    public List<WebElement> sepettekiler;
}
