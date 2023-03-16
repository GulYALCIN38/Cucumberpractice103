@tutorial
Feature:tutorialsninja Search
  Scenario: TC01 kullanici tutorialsninja search'de telefon aratir
    Given kullanici "ninjaUrl" gider
    When kullanici phone sayfasina gider
    Then telefonlarin marka adini alir
    And Kullanici 2 saniye bekler
    Then tum ogeleri sepete ekle
    And Kullanici 2 saniye bekler
    Then sepete tikla
    And Kullanici 2 saniye bekler
    Then sepetteki isimleri al
    And Kullanici 2 saniye bekler
    Then sepetteki ve sayfadaki listeleri karsilastir
    #And sayfa kapatilir