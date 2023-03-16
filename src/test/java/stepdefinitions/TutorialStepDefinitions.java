package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.Tutorialpage;
import utilities.Driver;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TutorialStepDefinitions {
    Tutorialpage tutorialpage=new Tutorialpage();
    List<String>isimlerr;
    List<String>sepett;

    @When("kullanici phone sayfasina gider")
    public void kullanici_phone_sayfasina_gider() {
        tutorialpage.phone.click();


    }

    @Then("telefonlarin marka adini alir")
    public void telefonlarin_marka_adini_alir() {

        List<WebElement> isimler=tutorialpage.phoneName;
        isimlerr=isimler.stream().map(t-> t.getText()).collect(Collectors.toList());
        System.out.println("isimlerr = " + isimlerr);


        
        

    }

    @Then("tum ogeleri sepete ekle")
    public void tum_ogeleri_sepete_ekle() {
        List<WebElement> addtocart=tutorialpage.addtocart;
        addtocart.stream().forEach(t->t.click());

    }

    @Then("sepete tikla")
    public void sepete_tikla() {
        tutorialpage.sepet.click();




    }

    @Then("sepetteki isimleri al")
    public void sepetteki_isimleri_al() {


       sepett= tutorialpage.sepettekiler.stream().map(t->t.getText()).collect(Collectors.toList());
        System.out.println("sepett = " + sepett);

    }

    @Then("sepetteki ve sayfadaki listeleri karsilastir")
    public void sepetteki_ve_sayfadaki_listeleri_karsilastir() {

        Collections.sort(isimlerr);
        Collections.sort(sepett);
        Assert.assertEquals(isimlerr,sepett);



    }


}