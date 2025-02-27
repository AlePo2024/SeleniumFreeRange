Feature: Compra Venta COMEX


Background: Ingreso a HomePage Banco Estado
    Given I navigate to www.bancoestado--qa.sandbox.my.salesforce.com
    When I go to cousers using the navigation bar

@test
Scenario: Oportunidad Caja contra Caja
    And Ingreso a objeto Cliente Nuevo
    Then Crear nueva Oportunidad

@C_CCMN
Scenario: Oportunidad Caja contra CCMN
  Then Oportunidad Caja contra CCMN 
    
@Cahorro_Caja
Scenario: Oportunidad Cuenta de Ahorro contra Caja
  Then Oportunidad Cuenta de Ahorro contra Caja
  #When I go to cousers using the navigation bar
  #And Select introduction the testing1

@Caja_CCMN_Caja_CCMX
Scenario: Caja_CCMN contra Caja_CCMX
  Then Oportunidad Caja_CCMN contra Caja_CCMX
     


    
    