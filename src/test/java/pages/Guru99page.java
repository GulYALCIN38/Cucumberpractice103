package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Guru99page {
    public Guru99page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//table[@class='dataTable']//tbody//tr//td[1]")
    public List<WebElement> companys;

    @FindBy(xpath = "//table[@class='dataTable']//tbody//tr//td[3]")
    public List<WebElement> prevCloss;
    @FindBy(xpath = "//iframe[@id='gdpr-consent-notice']")
    public WebElement iframee;

    @FindBy(xpath = "//span[text()='Accept All']")
    public WebElement accepteAll;

}
