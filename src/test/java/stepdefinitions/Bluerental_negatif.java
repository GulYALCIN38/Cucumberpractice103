package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BlueRentalCarPage;
import pages.BluerentalcarHomepage;
import utilities.Driver;

import java.time.Duration;

public class Bluerental_negatif {

    WebDriverWait wait= new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));


    BluerentalcarHomepage bluerentalcarHomepage=new BluerentalcarHomepage();
    BlueRentalCarPage blueRentalCarPage=new BlueRentalCarPage();
    @Given("{string} sayfasina gidilir")
    public void sayfasina_gidilir(String string) {
        Driver.getDriver().get(string);




    }
    @When("Login tusuna basin")
    public void login_tusuna_basin() {
        bluerentalcarHomepage.firstLogin.click();


    }
    @Then("{string} kullanici adini girin")
    public void kullanici_adini_girin(String string) {
        blueRentalCarPage.email.sendKeys(string);
wait.until(ExpectedConditions.alertIsPresent());
    }
    @Then("{string} sifreyi girin")
    public void sifreyi_girin(String string) {
        blueRentalCarPage.password.sendKeys(string);

    }
    @Then("kullanici login submite tiklar")
    public void kullanici_login_submite_tiklar() {
        blueRentalCarPage.loginyap.click();

    }
    @Then("yanlis sifre ve kullanici adi ile login yapilamaz")
    public void yanlis_sifre_ve_kullanici_adi_ile_login_yapilamaz() throws InterruptedException {

        Thread.sleep(1000);
        assert bluerentalcarHomepage.hatamesaji.isDisplayed();

        System.out.println(bluerentalcarHomepage.hatamesaji.getText());

    }

}
