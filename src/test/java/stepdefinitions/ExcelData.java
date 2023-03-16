package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ExcelUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExcelData {
    ExcelUtils excelUtils;
    String path="src/test/resources/testdata/ulkeler.xlsx";
    String sheetname="Sayfa1";
    List<String>ulkeler;
    List<Map<String,String>> excelData;
    @Given("{int} inci satirdaki {int} inci hucreye gidelim ve yazdiralim")
    public void inci_satirdaki_inci_hucreye_gidelim_ve_yazdiralim(Integer int1, Integer int2) {


     excelUtils= new ExcelUtils(path,sheetname);
        System.out.println(excelUtils.getCellData(int1, int2));


    }
    @Then("baskenti {string} olan ulke ismini yazdiralim")
    public void baskenti_olan_ulke_ismini_yazdiralim(String string) {
        excelData=excelUtils.getDataList();
        System.out.println("excelData = " + excelData);
        ulkeler=new ArrayList<>();
       for(Map<String,String> w:excelData){
           excelData=excelUtils.getDataList();
           ulkeler.add(w.get("ulke "));
          if(w.get("baskent").equals(string)){
              System.out.println(w.get("ulke "));
          }


       }

        System.out.println(ulkeler.size());

    }
    @Then("kullanici ulke sayisini yazdirir")
    public void kullanici_ulke_sayisini_yazdirir() {

        System.out.println(excelUtils.rowCount());


    }
    @Then("kullanici fiziki olarak kullanilan satir sayisini bulur")
    public void kullanici_fiziki_olarak_kullanilan_satir_sayisini_bulur() {
        //excelUtils.getDataArrayWithoutFirstRow();

    }
    @Then("kullanici baskenti {string} olan ulkenin tum bilgilerini yazdirir")
    public void kullanici_baskenti_olan_ulkenin_tum_bilgilerini_yazdirir(String string) {
        for(Map<String,String> w:excelData){
            excelData=excelUtils.getDataList();

            if(w.get("baskent").equals(string)){
                System.out.println(w);
            }


        }

    }
    @Then("kullanici kullanilan toplam satir ve sutun sayisini yazdirir")
    public void kullanici_kullanilan_toplam_satir_ve_sutun_sayisini_yazdirir() {
       int w= excelUtils.rowCount()+excelUtils.columnCount();
        System.out.println("satir +sutun = " + w);

    }

}
