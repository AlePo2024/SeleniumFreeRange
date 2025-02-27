package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;


public class Op_Caja_Caja extends BasePage {

    private final String monedaOrigen= "//button[contains(@name,'Moneda origen')]";
    private final String monedaDestino = "//button[contains(@name,'Moneda destino')]";
    private final String montoOrigen = "//body[@class='desktop']/div[4]/div[@class='viewport']/section/div[1]//div[@role='main']/div[@class='contentArea fullheight']/div/div/div//one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-cliente_-cambio_-moneda___-opportunity___-v-i-e-w___-l-m-t___1728412360000[@class='adg-rollup-wrapped']/forcegenerated-flexipage_cliente_cambio_moneda_opportunity__view_js___lmt___1728412360000[@class='forcegenerated-flexipage-module']/record_flexipage-desktop-record-page-decorator//records-record-layout-event-broker//flexipage-record-home-template-desktop2[@class='forcegenerated-flexipage-template']//slot[@name='main']/flexipage-component2//c-b-e_-cliente_camb_moned/lightning-card/article[@class='slds-card']//div[@class='step step-one']/div[1]/div/lightning-layout-item[2]/slot/lightning-input[1]/lightning-primitive-input-simple//div[@class='slds-form-element__control slds-grow']/input[@class='slds-input']";
    private final String medioPagoIngreso = "//button[contains(@name,'progress')]";
    private final String medioPagoEgreso="//button[contains(@name,'medioEgreso')]";
    private final String paisOrigen = "//button[contains(@aria-label,'Origen/destino')]";
    private final String observaciones = "//input[contains(@name,'Observaciones')]";
    private final String siguiente = "//button[@class='slds-button slds-button_brand'][contains(.,'Siguiente')]";
    private final String enviarEmail = "//button[contains(.,'Enviar por correo')]";
    private final String finalizarOportunidad = "//button[contains(.,'Finalizar')]";
    

    //
    private final String monto = "1000";
    private final String observacion = "Prueba en Dólares";
    

    public Op_Caja_Caja() {
        super(driver);        
    }

    public void oportunidadCreada() throws Exception {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Actions actions = new Actions(driver);
        //Seleccionar Moneda Origen
        actions.sendKeys(Keys.ESCAPE).perform();
        clickElement(monedaOrigen);
        waitSeconds(1);
        // Navegar con las teclas hacia la moneda deseada
        for (int i = 0; i < 2; i++) {
            actions.sendKeys(Keys.ARROW_DOWN).perform();
            //Thread.sleep(5000);
              waitSeconds(3);            
            }
            actions.sendKeys(Keys.ENTER).perform();
            waitSeconds(2);
        //Seleccionar Moneda Destino            
        clickElement(monedaDestino);
            actions.sendKeys(Keys.ENTER).perform();
            waitSeconds(2);
        //Ingreso de Monto a transar    
        write(montoOrigen, monto);
            waitSeconds(2);
        //Ingreso Medio de Pago a Entregar   
        clickElement(medioPagoIngreso);
        actions.sendKeys(Keys.ENTER).perform();
        waitSeconds(2);
        for (int i = 0; i < 2; i++) {
            actions.sendKeys(Keys.TAB).perform();
            waitSeconds(2);            
            }
            actions.sendKeys(Keys.ENTER).perform();
            waitSeconds(2);
        //Se realiza un Scroll para ir al final de la pagina    
        js.executeScript("window.scrollTo(0, 1000);");
        waitSeconds(2);  
        //Ingreso Medio de Pago a Recibir    
        clickElement(medioPagoEgreso);
        actions.sendKeys(Keys.ENTER).perform();
        waitSeconds(2);
        for (int i = 0; i < 2; i++) {
            actions.sendKeys(Keys.TAB).perform();
            waitSeconds(2);            
            }
            actions.sendKeys(Keys.ENTER).perform();
            waitSeconds(2);
        //Ingreso de Pais de Origen    
        clickElement(paisOrigen);
        waitSeconds(2);
        actions.sendKeys(Keys.ENTER).perform();
        waitSeconds(2);
        actions.sendKeys(Keys.TAB).perform();
        waitSeconds(2);
        actions.sendKeys(Keys.ENTER).perform();
        waitSeconds(2);
        for (int i = 0; i < 2; i++) {
            actions.sendKeys(Keys.ARROW_DOWN).perform();
            waitSeconds(1);            
            }
            actions.sendKeys(Keys.ENTER).perform();
            waitSeconds(2);
        //Ingreso de Observación    
        write(observaciones, observacion);
        waitSeconds(2);
        // Pasar a hoja resumen de la Oportunidad
        clickElement(siguiente);
        waitSeconds(2);
        js.executeScript("window.scrollTo(0, 1000);");
        //Datos Resumen de la Oportunidad
        waitSeconds(5);
        actions.sendKeys(Keys.ENTER).perform();
        waitSeconds(3);
        clickElement(enviarEmail);
        waitSeconds(3);
        clickElement(finalizarOportunidad);
        waitSeconds(1);    
        
           
    }
    //Screenshot 
    /*public String firstResult() {
        return textFromElement(result);
    }*/

}