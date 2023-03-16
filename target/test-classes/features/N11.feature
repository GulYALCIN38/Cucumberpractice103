@N11
Feature:excel_yazdirma
  Scenario:list_excel_yazdirma
    Given "https://www.n11.com/magazalar" sayfasina gidilir
    Then  kullanici secmek istediği harfe "B" tiklar
    And  cikan sonuclari excel'e yazdirir
    #And  sayfa kapatilir