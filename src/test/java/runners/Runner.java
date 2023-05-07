package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//test calistirici notasyon
@CucumberOptions(//senaryolarin nerede nasil calisacagi ve hangi rapru kullanacagini ayarlar
plugin = {"html:target/cucumberReport.html",
         "json:target/json-reports/cucumber.json"},

        features="src/test/resources/features",//features dosya yolunu yazariz
        glue="stepdefinitions",//kodlarin yazildigi yeri belirtiriz
        tags="@N11",//calistirmak istedigimiz senaryoya verdigimiz tag i belirtiriz
        dryRun = false//senaryo adimlarini kontrol eder ve calistigini goruruz



)
public class Runner {



}
