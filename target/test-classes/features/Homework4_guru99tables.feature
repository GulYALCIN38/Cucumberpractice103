@Homework4
Feature: Guru_Web_Tables
#
#1. http://demo.guru99.com/test/web-table-element.php sayfasina gidelim
#2. Cucumber framework'de US1012_Guru_Web_Tables olusturun
#3. Scenario : TC_16_kullanici_liste_alabilmeli asagidaki testi yapin
#Given user web sayfasinda
#Then Company listesini consola yazdirir
#And DCB Bank'in listede oldug

  Scenario: Homework4
    Given "http://demo.guru99.com/test/web-table-element.php" sayfasina gider.
    Then Company listesini consola yazdirir.
    And kullanici "DCB Bank" in listede oldugunu gorur

    @Homwork5
Scenario:Homwork5
    Given "http://demo.guru99.com/test/web-table-element.php" sayfasina gider.
    Then "IDFC Bank" in Prev.Close degerini yazdirir
    #And sayfa kapatilir