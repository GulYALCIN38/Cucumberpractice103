package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.WebElement;
import pages.N11Page;
import utilities.Driver;
import utilities.ExcelUtils;
import utilities.ReusableMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;


public class N11Stepdefinition {
    N11Page n11Page=new N11Page();
    @Then("kullanici secmek istediği harfe {string} tiklar")
    public void kullaniciSecmekIstediğiHarfeTiklar(String string) {
        Driver.wait(2);
        ReusableMethods.clickByJS(n11Page.harfB);


    }

    @And("cikan sonuclari excel'e yazdirir")
    public void cikanSonuclariExcelEYazdirir() throws InterruptedException, IOException {


        List<WebElement> company= n11Page.magazalar;
        String path="src/test/resources/testdata/ulkeler.xlsx";
        ExcelUtils excelUtils =new ExcelUtils(path,"Sheet1");
        List <String> sirketler=ReusableMethods.getElementsText(company);
        //System.out.println("sirketler = " + sirketler);

        for (int i = 0; i < 11; i++) {

            excelUtils.setCellData(sirketler.get(i),i+1,3 );



        }
   /*     Thread.sleep(5000);
        List<WebElement> company= n11Page.magazalar;
        List<String> stores = ReusableMethods.getElementsText(company);
        //System.out.println("stores.size() = " + stores.size());
        String path="./src/test/resources/testdata/ulkeler.xlsx";

        Workbook workbook = WorkbookFactory.create(new FileInputStream(path));
        Sheet sheet = workbook.getSheet("Sheet1");
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("-Stores-");

        for (int i = 0; i < 10; i++) {
            row = sheet.createRow(i+1);
            cell = row.createCell(0);
            cell.setCellValue(stores.get(i));
        }
        workbook.write(new FileOutputStream(path));
    }*/
}}
