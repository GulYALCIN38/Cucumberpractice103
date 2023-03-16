package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.Guru99page;
import utilities.Driver;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Homework4_guru99tables {
    Guru99page guru99page = new Guru99page();

    @Given("{string} sayfasina gider.")
    public void sayfasina_gider(String string) {
        Driver.getDriver().get(string);

        WebElement w = guru99page.iframee;
        Driver.getDriver().switchTo().frame(w);
        guru99page.accepteAll.click();
        Driver.getDriver().switchTo().defaultContent();


    }

    @Then("Company listesini consola yazdirir.")
    public void company_listesini_consola_yazdirir() {
        List<WebElement> sirket = guru99page.companys;
        Driver.wait(2);
        for (WebElement x : sirket) {

            System.out.println(x.getText());
        }


    }

    @Then("kullanici {string} in listede oldugunu gorur")
    public void kullanici_in_listede_oldugunu_gorur(String string) {
       /* List<WebElement> sirket = guru99page.companys;
        Driver.wait(2);
        for (WebElement x : sirket) {

            if (x.getText().contains(string)) {
                assert x.getText().contains(string);
            }
        }*/
        List<String> text =guru99page.companys.stream().map(t->t.getText()).collect(Collectors.toList());
        System.out.println(text);
        Assert.assertTrue(text.contains(string));
    }

    @Then("{string} in Prev.Close degerini yazdirir")
    public void in_prev_close_degerini_yazdirir(String string) {

        Guru99page guru99page = new Guru99page();
        List<String> text =guru99page.companys.stream().map(t->t.getText()).collect(Collectors.toList());
        List<String> prevcloss=guru99page.prevCloss.stream().map(t->t.getText()).collect(Collectors.toList());
        HashMap<String,String> deger=new HashMap<>();
        for (int i = 0; i < text.size(); i++) {

            deger.put(text.get(i), prevcloss.get(i) );

            if(text.get(i).equals(string)){
                System.out.println("istenen;"+prevcloss.get(i));
            }

        }
        System.out.println("deger = " + deger);
        }
    }





