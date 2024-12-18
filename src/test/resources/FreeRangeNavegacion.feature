Feature: Compra Venta COMEX

Background: Ingreso a HomePage Banco Estado
    Given I navigate to www.bancoestado--qa.sandbox.my.salesforce.com

Scenario: Scenario name
    Given I navigate to www.freerangetesters.com
    When I go to a section using the navigation bar
    

Scenario: Courser are presented correctly to potential customers
     Given I navigate to www.freerangetesters.com
     When I go to cousers using the navigation bar
     And Select introduction the testing1
     
@test
Scenario: Ingreso Cliente Nuevo Banco Estado
    When I go to cousers using the navigation bar
    And Elegir plan
    And Ingreso HomePage
    And Ingreso a objeto Cliente Nuevo
    And Ingreso Cuenta Nueva
    Then Crear nueva Oportunidad
    #Then Oportinidad Creada Correctamente