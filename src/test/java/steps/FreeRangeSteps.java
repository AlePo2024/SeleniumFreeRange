package steps;

// import java.util.Arrays;
// import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PaginaCursos;
import pages.PaginaPrincipal;
// import pages.PaginaRegistro;

public class FreeRangeSteps {
    // SoftAssert soft = new SoftAssert();
    
    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaCursos cursosPage = new PaginaCursos();
    // PaginaFundamentosTesting fundamentosPage = new PaginaFundamentosTesting();
    // PaginaRegistro registro = new PaginaRegistro();

    @Given("^I navigate to www.bancoestado--qa.sandbox.my.salesforce.com$")
    public void iNavigateToFRt() {
        landingPage.navigateToFreeRangeTesters();
    }

    @When("^I go to cousers using the navigation bar$")
    public void navigateBarUse() {
        landingPage.clickUsuario();
        
    }

    @And("^Elegir plan$")
    public void selectElegirPlan() {
        landingPage.clickPassword();

        }

    @And("^Ingreso HomePage$")
    public void ingresoHomePageBanco() {
        landingPage.clickHomePage();
    }  

    @And("^Ingreso a objeto Cliente Nuevo$")
    public void navigateToIntro() {
        cursosPage.clickNewCliente();
    }

    @And("^Ingreso Cuenta Nueva$")
        public void ingresoCliente() {
            cursosPage.sendRut(); 
    }

    @Then("^Crear nueva Oportunidad$")
        public void crear_nueva_oportinidad() {
           Assert.assertEquals("Oportunidad", cursosPage.firstResult()) ;
                 
    }

    // @And("I can validate the options in the checkout page")
    // public void validatePlans() {
    //     String palabraEsperada = "Test1";
    //     String palabraEncontrada = "Test2";


    //     List<String> lista = registro.returnPlanDropdownValues();
    //     List<String> listaEsperada = Arrays.asList("Academia: $16.99 / mes • 11 productos",
    //             "Academia: $176 / año • 11 productos", "Free: Gratis • 1 producto");
    //     Assert.assertEquals(listaEsperada, lista);

    //     soft.assertEquals(palabraEsperada, palabraEncontrada);
    //     soft.assertTrue(palabraEncontrada.contains(palabraEsperada));
    //     soft.assertNotEquals(palabraEsperada, palabraEncontrada);

    //     soft.assertAll();
    // }

}