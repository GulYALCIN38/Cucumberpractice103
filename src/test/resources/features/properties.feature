@properties
Feature: kullanici amazonda arama yapar
  Scenario:TC01 kullanici  amazonda arama yapar

  Given kullanici "amazon_url" adresine gider
  Then kullanici sql samsung ve nokia kelimelerini aratir
  And  sayfa kapatilir









  # Amazon sayfasında sql,samsung ve nokia aratıp sayfa başlıklarını her arama için test ediniz
#Aranacak kelimeleri config.properties dosyasından alınız