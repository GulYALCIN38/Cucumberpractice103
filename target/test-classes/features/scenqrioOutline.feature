
@outline
  Feature: Kullanici amazon sayfasinda arama yapar

    Scenario Outline: Amazon sayfasi
      Given "https://www.amazon.com" sayfasina gidilir
      Then kullanici "<aranankelime>" icin arama yapar
      And  sayfa basliginin "<istenenkelime>" icerdigini dogrular
      And sayfa kapatilir
      Examples:
      |aranankelime|istenenkelime|
      |selenium|selenium|
      |java|java|
      |iphone|iphone|