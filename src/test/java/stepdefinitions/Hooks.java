package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    /*
Senaryolar arasındaki baglantıyı saglayan glue yapısına koydugumuz stepdefinition package i içerisinde
 @before ve @after gibi bir notasyon varsa extends testbase demenize gerek kalmadan her senaryodan
 önce veya sonra bu methodlar calisacaktir.
 Cucumber da @before,@after kullanma ihtiyacımız olursa bunu hooks class ına koyarız.
 */
    @Before()
    public void setup1(){
        System.out.println("before methodu");
    }



    @After
    public void tearDown (Scenario scenario){//Scenario tipinde bir veri atamasi yapilir

        if (scenario.isFailed()){
            final byte[] screenchot= ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenchot,"image/jpeg","screenchot");
        }
        //final -> bir degiskenin degerinin degistirilemez oldugunu belirtir
//byte[] -> bir byte dizisi tanımlar.Byte dizeleri sıralı veri depolama ve isleme islemleri icin
//kullanilir.Verilerin depolanmasi,iletilmesi ve okunmasi icin kullanilan cesitli dosya türleri
//resimler ve diger verileri saklamak icin kullanilir.

    }








}
