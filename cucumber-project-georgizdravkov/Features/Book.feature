
Feature: Tursene na kniga kniga

    Scenario: Tursene na nalichna kniga
    Given Potrebitelqt natiska na formata  za vuvejdane na ime na knigata
    And Potrebitelqt vuvejda ime na knigata "Pod Igoto" 
    And Natiska butona za tursene
    Then Vijda suobshtenie za namerena kniga
    
    Scenario: Tursene na nenalichna kniga
    Given Potrebitelqt natiska na formata  za vuvejdane na ime na knigata
    And Potrebitelqt vuvejda ime na knigata "Jelezniqt svetelnik" 
    And Natiska butona za tursene
    Then Vijda suobshtenie za ne namerena kniga
    

  
