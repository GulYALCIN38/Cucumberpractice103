@gp1
Feature: Amazon search

  Background: amazona git
    Given amazon sayfasina gidilir
    Scenario: Amazonda Selenyum arattik
      Then amazon sayfasinda selenyum aratilir
      And sonuclarin selenium icerdigi test edilir


  Scenario:Amazonda iphone arattik
    Then amazon sayfasinda iphone aratilir
      And sonuclarin iphone icerdigi test edilir


  Scenario:Amazonda tesla arattik
      Then amazon sayfasinda tesla aratilir
      And sonuclarin tesla icerdigi test edilir

Scenario: Amazonda JAVA arattik
  Then amazon sayfasinda JAVA aratilir
  And sonuclarin JAVA icerdigi test edilir
  And sayfa kapatilir
