@bluerental
Feature:bluerentalcar_login_negatif
   Scenario Outline: TC01_Hotel_kampa_login_yap
     Given  "https://www.bluerentalcars.com/" sayfasina gidilir
     When Login tusuna basin
     Then  "<kullanici_adi>" kullanici adini girin
     Then "<pasword>" sifreyi girin
     Then kullanici login submite tiklar
     Then  yanlis sifre ve kullanici adi ile login yapilamaz
     And sayfa kapatilir




   Examples:login_bilgileri
     | kullanici_adi |pasword|
       |Manager@gmail.com        | Manager|
     |Manager1@gmail.com       | Manager1|
       |Manager2@gmail.com      | Manager2|
       |Manager3@gmail.com        | Manager3|
       |Manager4@gmail.com      | Manager4|








#     //Soru 1
#    //1. https://www.hotelmycamp.com sayfasina gidelim
#    //2. Cucumber parametre ,cucumber scenario outline ve TestNg framework
#    //@Dataprovider kullanarak asagidaki gorevi tamamlayin
#    //- Login tusuna basin
#    //- Asagidaki 5 kullanici adi ve sifreyi deneyin ve login olmadigini test edin
#    //- Manager – Manager
#    //- Manager1- Manager1
#    //- Manager2 - Manager2
#    //- Manager3 - Manager3
#    //- Manager4 – Manager4