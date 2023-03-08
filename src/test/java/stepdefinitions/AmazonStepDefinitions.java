package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.Amazonpage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    Amazonpage amazonpage=new Amazonpage();


    @Given("amazon sayfasina gidilir")
    public void amazonSayfasinaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));

    }

    @Then("amazon sayfasinda selenyum aratilir")
    public void amazonSayfasindaSelenyumAratilir() {
        amazonpage.searchbox.sendKeys("selenium", Keys.ENTER);

    }
    @And("sonuclarin selenium icerdigi test edilir")
    public void sonuclarinSeleniumIcerdigiTestEdilir() {

        Driver.getDriver().getTitle().contains("selenium");
    }

    @And("sayfa kapatilir")
    public void sayfaKapatilir() {
        Driver.closeDriver();
    }

    @Then("amazon sayfasinda iphone aratilir")
    public void amazonSayfasindaIphoneAratilir() {
        amazonpage.searchbox.sendKeys("iphone", Keys.ENTER);
    }

    @And("sonuclarin iphone icerdigi test edilir")
    public void sonuclarinIphoneIcerdigiTestEdilir() {
        Driver.getDriver().getTitle().contains("iphone");
    }

    @Then("amazon sayfasinda tesla aratilir")
    public void amazonSayfasindaTeslaAratilir() {
        amazonpage.searchbox.sendKeys("tesla", Keys.ENTER);
    }

    @And("sonuclarin tesla icerdigi test edilir")
    public void sonuclarinTeslaIcerdigiTestEdilir() {
        Driver.getDriver().getTitle().contains("tesla");
    }

    @Then("amazon sayfasinda {string} aratilir")
    public void amazonSayfasindaAratilir(String string) {
        amazonpage.searchbox.sendKeys(string, Keys.ENTER);
    }

    @And("sonuclarin {string} icerdigi test edilir")
    public void sonuclarinIcerdigiTestEdilir(String arg0) {
        Driver.getDriver().getTitle().contains(arg0);

    }

    @Then("amazon sayfasinda JAVA aratilir")
    public void amazonSayfasindaJAVAAratilir() {
        amazonpage.searchbox.sendKeys("JAVA", Keys.ENTER);
    }

    @And("sonuclarin JAVA icerdigi test edilir")
    public void sonuclarinJAVAIcerdigiTestEdilir() {
        Driver.getDriver().getTitle().contains("JAVA");
    }

    @Given("kullanici {string} gider")
    public void kullaniciGider(String girilenurl) {
        Driver.getDriver().get(ConfigReader.getProperty(girilenurl));
    }

    @Then("Kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int girilensayi) {

        try {
            Thread.sleep(girilensayi*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
