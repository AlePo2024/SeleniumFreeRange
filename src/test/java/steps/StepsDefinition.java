package steps;

// import java.util.Arrays;
// import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.NuevaOportunidad;
import pages.Op_Caja_CCMN;
import pages.Op_Caja_Caja;
import pages.Op_Cuentas_vs_Cuentas_CTCMod;
import pages.Op_Cuentas_vs_Cuentas_STCMod;

public class StepsDefinition {
    // SoftAssert soft = new SoftAssert();
    
    HomePage landingPage = new HomePage();
    NuevaOportunidad cursosPage = new NuevaOportunidad();
    Op_Caja_Caja newOpportunity = new Op_Caja_Caja();
    Op_Caja_CCMN newOportunity = new Op_Caja_CCMN();
    Op_Cuentas_vs_Cuentas_STCMod newOp_CAhorro_Caja = new Op_Cuentas_vs_Cuentas_STCMod();
    Op_Cuentas_vs_Cuentas_CTCMod newCaja_CCMN_Caja_CCMX = new Op_Cuentas_vs_Cuentas_CTCMod();

    @Given("^I navigate to www.bancoestado--qa.sandbox.my.salesforce.com$")
    public void iNavigateToFRt() {
        landingPage.navigateToFreeRangeTesters();
    }
    //Proviene de la Clase HomePage_Ingreso HomePage Salforce
    @When("^I go to cousers using the navigation bar$")
    public void navigateBarUse() {
        landingPage.clickUsuario();
    }
    //Proviene de la Clase NuevaOportunidad_Registro de Cliente y creación de nueva Oportunidad
    @And("^Ingreso a objeto Cliente Nuevo$")
    public void navigateToIntro() {
        cursosPage.clickNewCliente();
    }
    //Proviene de la Clase Oportunidad_Se llena Formulario para concretar la Oportunidad
    @Then("^Crear nueva Oportunidad$")
        public void crear_nueva_oportinidad() throws Exception {
            newOpportunity.oportunidadCreada();
        //Assert.assertEquals("Oportunidad", cursosPage.firstResult()) ;
    }
    // Oportunidad Caja con Cuenta Moneda Extranjera
    @Then("^Oportunidad Caja contra CCMN$") 
    public void createNewOp() {
        newOportunity.opCaja_CCMN();
    }
    // Oportunidad Caja con Cuenta Moneda Extranjera
    @Then("^Oportunidad Cuenta de Ahorro contra Caja$") 
    public void createNewOpCAhoCaja() {
        newOp_CAhorro_Caja.opCAhorro_Caja();
    }
    // Oportunidad Caja/CCMN contra Caja/CCMX
    @Then("^Oportunidad Caja_CCMN contra Caja_CCMX$") 
    public void Caja_CCMN_Caja_CCMX() {
        newCaja_CCMN_Caja_CCMX.Caja_CCMN_Caja_CCMX();
    }  
}