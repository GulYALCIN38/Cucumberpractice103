@parametre
Feature: Amazon testi
  Scenario: TC01_amazon-iphon-arama
    Given "https://www.amazon.com" sayfasina gidilir
    Then amazon sayfasinda "kalem" aratilir
    Then Kullanici 3 saniye bekler
    And sonuclarin "kalem" icerdigi test edilir
    And sayfa kapatilir
  # ctrl ye basip ustune tiklayinca ilgili step definitiona gidersiniz
  #featurefile da rakam kullaninca tirnak icine almadan parametreli step definition olusur