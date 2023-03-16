@gp1
Feature: Amazon search

  Background: amazona git
    Given amazon sayfasina gidilir
  @g1
    Scenario: Amazonda Selenyum arattik
      Then amazon sayfasinda selenyum aratilir
      And sonuclarin selenium icerdigi test edilir

  @g2
  Scenario:Amazonda iphone arattik
    Then amazon sayfasinda iphone aratilir
      And sonuclarin tesla icerdigi test edilir


  Scenario:Amazonda tesla arattik
      Then amazon sayfasinda tesla aratilir
      And sonuclarin tesla icerdigi test edilir
    @g3
Scenario: Amazonda JAVA arattik
  Then amazon sayfasinda JAVA aratilir
  And sonuclarin JAVA icerdigi test edilir
  And sayfa kapatilir


  Scenario: Amazonda hoparlor arattik
    Then amazon sayfasinda hoparlor aratilir
    And sonuclarin hoparlor icerdigi test edilir
    And sayfa kapatilir
