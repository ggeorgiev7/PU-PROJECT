

Feature: Izprashtane  na poruchkata

 Scenario: Izprashtane na poruchka s validen nachin na plashtane
    Given Potrebitelqt natiska na formata  za pravene na poruchka
    And Potrebitelqt vuvejda validen nachin na plashtane "Nalojen platej"
    And Natiska butona napravi poruchka
    Then Vijda suobshtenie za uspeshno napravena poruchka

 Scenario: Izprashtane na poruchka s nevaliden nachin na plashtane
    Given Potrebitelqt natiska na formata  za pravene na poruchka
    And Potrebitelqt vuvejda nevaliden nachin na plashtane "Nevaliden argument"
    And Natiska butona napravi poruchka
    Then Vijda suobshtenie za nevaliden nachin za plashtane
    
    
     Scenario: Izprashtane na poruchka s validen nachin za dostavka
    Given Potrebitelqt natiska na formata  za pravene na poruchka
    And Potrebitelqt vuvejda validen nachin za dostavka "Do adres"
    And Natiska butona napravi poruchka
    Then Vijda suobshtenie za uspeshno napravena poruchka
    
     Scenario: Izprashtane na poruchka s nevaliden nachin za dostavka
    Given Potrebitelqt natiska na formata  za pravene na poruchka
    And Potrebitelqt vuvejda validen nachin za dostavka "Nevaliden argument"
    And Natiska butona napravi poruchka
    Then Vijda suobshtenie za nevaliden nachin za dostavka
    
 
    

