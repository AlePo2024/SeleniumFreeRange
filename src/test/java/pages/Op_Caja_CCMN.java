package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Op_Caja_CCMN extends BasePage {

    private final String cuenta = "/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[2]";
    private final String cliente = "//a[contains(@title,'dCdeu QmCVr CRmpN PyIFH')]";
    private final String selectOpportunity = "//lightning-button-menu[@class='menu-button-item slds-dropdown_actions slds-dropdown-trigger slds-dropdown-trigger_click']//lightning-primitive-icon[@variant='bare']";
    private final String oportunidad = "(//span[contains(.,'Oportunidad')])[5]";
    private final String selectOpcion = "//select[@class='slds-select']";
    private final String guardarOportunidad = "//button[@class='slds-button slds-button_brand'][contains(.,'Guardar')]";
    //private final String result = "//records-entity-label[contains(.,'Oportunidad')]";
    private final String monedaOrigen= "//button[contains(@name,'Moneda origen')]";
    private final String monedaDestino = "//button[contains(@name,'Moneda destino')]";
    private final String montoOrigen = "//body[@class='desktop']/div[4]/div[@class='viewport']/section/div[1]//div[@role='main']/div[@class='contentArea fullheight']/div/div/div//one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-cliente_-cambio_-moneda___-opportunity___-v-i-e-w___-l-m-t___1728412360000[@class='adg-rollup-wrapped']/forcegenerated-flexipage_cliente_cambio_moneda_opportunity__view_js___lmt___1728412360000[@class='forcegenerated-flexipage-module']/record_flexipage-desktop-record-page-decorator//records-record-layout-event-broker//flexipage-record-home-template-desktop2[@class='forcegenerated-flexipage-template']//slot[@name='main']/flexipage-component2//c-b-e_-cliente_camb_moned/lightning-card/article[@class='slds-card']//div[@class='step step-one']/div[1]/div/lightning-layout-item[2]/slot/lightning-input[1]/lightning-primitive-input-simple//div[@class='slds-form-element__control slds-grow']/input[@class='slds-input']";
    private final String medioPagoIngreso = "//button[contains(@name,'progress')]";
    private final String selectPagoIngreso = "//span[contains(@title,'Cuenta Corriente MN - CLP -  CCT 82300074517')]";
    private final String medioPagoEgreso="//button[contains(@name,'medioEgreso')]";
    private final String selectPagoEgreso = "(//span[contains(.,'Efectivo caja M/X - USD -  000000000000')])[1]";
    private final String paisOrigen = "//button[contains(@aria-label,'Origen/destino')]";
    private final String motivoOperacion = "//button[contains(@aria-label,'Motivo de operacion')]";
    private final String observaciones = "//input[contains(@name,'Observaciones')]";
    private final String siguiente = "//button[@class='slds-button slds-button_brand'][contains(.,'Siguiente')]";
    private final String enviarEmail = "//button[contains(.,'Enviar por correo')]";
    private final String finalizarOportunidad = "//button[contains(.,'Finalizar')]";

    //
    private final String monto = "150000";
    private final String observacion = "Prueba en USD";

    public Op_Caja_CCMN() {
        super(driver);
    }

public void opCaja_CCMN() {
    Actions actions = new Actions(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    //Ingreso a Vista Cuenta de Ejecutivo
    waitSeconds(5);
    clickElement(cuenta);
    //Selección de Cliente para inicio de Oportunidad
    waitSeconds(2);
    clickElement(cliente);
    //Ingreso y seleccion de Producto Compra y Venta de Moneda extranjera
    waitSeconds(2);
    clickElement(selectOpportunity);
    waitSeconds(2);
    clickElement(oportunidad);
    waitSeconds(2);
    selectFromDropdownValue(selectOpcion, "Compra y venta moneda extranjera");
    waitSeconds(2);
    clickElement(guardarOportunidad);
    //Seleccionar Moneda Origen
    actions.sendKeys(Keys.ESCAPE).perform();
    clickElement(monedaOrigen);
    waitSeconds(1);
    // Navegar con eventos de teclado hacia la moneda deseada
    for (int i = 0; i < 2; i++) {
    actions.sendKeys(Keys.ARROW_DOWN).perform();
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
    waitSeconds(3);
    clickElement(selectPagoIngreso);
    waitSeconds(3);
    for (int i = 0; i < 2; i++) {
        actions.sendKeys(Keys.TAB).perform();
        waitSeconds(1);
    }
    actions.sendKeys(Keys.ENTER).perform();
    //Ingreso Medio de Pago a Entregar 
    waitSeconds(2);
    js.executeScript("window.scrollTo(0, 1000);");
    clickElement(medioPagoEgreso);
    waitSeconds(2);
    clickElement(selectPagoEgreso);
    waitSeconds(2);
    for (int i = 0; i < 2; i++) {
        actions.sendKeys(Keys.TAB).perform();
        waitSeconds(1);
    }
    actions.sendKeys(Keys.ENTER).perform();
    waitSeconds(2);
    clickElement(paisOrigen);
    waitSeconds(2);
        actions.sendKeys(Keys.ENTER).perform();
        waitSeconds(2);
    waitSeconds(2);
    clickElement(motivoOperacion);
    waitSeconds(2);
    for (int i = 0; i > 1; i++) {
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        waitSeconds(i);
    }
        actions.sendKeys(Keys.ENTER).perform();
        waitSeconds(3);
    write(observaciones, observacion); 
    waitSeconds(2);
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
    
}
