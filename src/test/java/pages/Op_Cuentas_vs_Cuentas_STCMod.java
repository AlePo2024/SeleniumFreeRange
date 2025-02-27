package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Op_Cuentas_vs_Cuentas_STCMod extends BasePage {

    private final String cuenta = "/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[2]";
    private final String cliente = "//a[contains(@title,'XnazN LiJWI MMQJf kfeAV')]";
    private final String selectOpportunity = "//lightning-button-menu[@class='menu-button-item slds-dropdown_actions slds-dropdown-trigger slds-dropdown-trigger_click']//lightning-primitive-icon[@variant='bare']";
    private final String oportunidad = "(//span[contains(.,'Oportunidad')])[5]";
    private final String selectOpcion = "//select[@class='slds-select']";
    private final String guardarOportunidad = "//button[@class='slds-button slds-button_brand'][contains(.,'Guardar')]";
    private final String monedaOrigen= "//button[contains(@name,'Moneda origen')]";
    private final String monedaDestino = "//button[contains(@name,'Moneda destino')]";
    private final String montoOrigen = "//body[@class='desktop']/div[4]/div[@class='viewport']/section/div[1]//div[@role='main']/div[@class='contentArea fullheight']/div/div/div//one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-cliente_-cambio_-moneda___-opportunity___-v-i-e-w___-l-m-t___1728412360000[@class='adg-rollup-wrapped']/forcegenerated-flexipage_cliente_cambio_moneda_opportunity__view_js___lmt___1728412360000[@class='forcegenerated-flexipage-module']/record_flexipage-desktop-record-page-decorator//records-record-layout-event-broker//flexipage-record-home-template-desktop2[@class='forcegenerated-flexipage-template']//slot[@name='main']/flexipage-component2//c-b-e_-cliente_camb_moned/lightning-card/article[@class='slds-card']//div[@class='step step-one']/div[1]/div/lightning-layout-item[2]/slot/lightning-input[1]/lightning-primitive-input-simple//div[@class='slds-form-element__control slds-grow']/input[@class='slds-input']";
    //Atributos Medios de Pago Ingreso
    private final String medioPagoIngreso = "//button[contains(@name,'progress')]";
    private final String selectPagoIngreso = "//span[contains(@title,'Cuenta Corriente MN - CLP -  CCT 02500122865')]";
    private final String imputMonto = "(//input[@type='text'])[5]";
    private final String selectPagoIngreso2 = "//span[contains(@title,'Ahorro - CLP -  AHO 02566938955')]";
    private final String selectPagoIngreso3 = "//span[contains(@title,'Efectivo caja M/N - CLP -  000000000000')]";
    //Atributos Medios de Pago Egreso
    private final String medioPagoEgreso="//button[contains(@name,'medioEgreso')]";
    private final String selectPagoEgreso = "(//span[contains(.,'Efectivo caja M/X - USD -  000000000000')])[1]";
    private final String inputMontoEgreso = "(//input[@type='text'])[6]";
    private final String selectPagoEgreso2 = "(//span[contains(.,'Cuenta Corriente MX - USD -  ECC 02508050006')])[1]";
    //Atributos de Ingreso Datos de Planilla
    private final String paisOrigen = "//button[contains(@aria-label,'Origen/destino')]";
    private final String motivoOperacion = "//button[contains(@aria-label,'Motivo de operacion')]";
    private final String observaciones = "//input[contains(@name,'Observaciones')]";
    private final String siguiente = "//button[@class='slds-button slds-button_brand'][contains(.,'Siguiente')]";
    private final String enviarEmail = "//button[contains(.,'Enviar por correo')]";
    private final String finalizarOportunidad = "//button[contains(.,'Finalizar')]";

    //Variables ingreso Monto Origen
    private final String monto = "100000";
    //Variables ingreso Monto de Pago ingreso
    private final String montoCCMN = "10000";
    private final String montoCAhorro = "10000";
    private final String montoCaja = "80000";
    //Variables ingreso Monto Egreso
    private final String montoCCMX= "3,41";
    private final String montoCajaMX = "100"; 

    private final String observacion = "Prueba en USD";

    public Op_Cuentas_vs_Cuentas_STCMod() {
        super(driver);
    }

public void opCAhorro_Caja() {
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
    clickElement(monedaOrigen);
    waitSeconds(2);
    for (int i = 0; i < 2; i++) {
    actions.sendKeys(Keys.ARROW_DOWN).perform();
    waitSeconds(3);            
           }
    actions.sendKeys(Keys.ENTER).perform();
    waitSeconds(3);
    //Seleccionar Moneda Destino            
    clickElement(monedaDestino);
    actions.sendKeys(Keys.ENTER).perform();
    waitSeconds(8);
    //Ingreso de Monto a transar    
    write(montoOrigen, monto);
    waitSeconds(5);
    js.executeScript("window.scrollTo(0, 250);");
   //Primer Ingreso Medio de Pago a Entregar   
    clickElement(medioPagoIngreso);
    waitSeconds(3);
    clickElement(selectPagoIngreso);
    waitSeconds(5);
    clickElement(imputMonto);
    waitSeconds(3);
    write(imputMonto, montoCCMN);
    for (int i = 0; i < 1; i++) {
        actions.sendKeys(Keys.TAB).perform();
        waitSeconds(5);
    }
    actions.sendKeys(Keys.ENTER).perform();
    waitSeconds(3);
    //Segundo medio de Pago Ingreso
    clickElement(medioPagoIngreso);
    waitSeconds(3);
    clickElement(selectPagoIngreso2);
    waitSeconds(3);
    clickElement(imputMonto);
    waitSeconds(3);
    write(imputMonto, montoCAhorro);
    for (int i = 0; i < 1; i++) {
        actions.sendKeys(Keys.TAB).perform();
        waitSeconds(5);
    }
    actions.sendKeys(Keys.ENTER).perform();
    waitSeconds(3);
    //Tercer Medio de Pago a Entregar
    clickElement(medioPagoIngreso);
    waitSeconds(3);
    clickElement(selectPagoIngreso3);
    waitSeconds(3);
    clickElement(imputMonto);
    waitSeconds(3);
    write(imputMonto, montoCaja);
    for (int i = 0; i < 1; i++) {
        actions.sendKeys(Keys.TAB).perform();
        waitSeconds(5);
    }
    actions.sendKeys(Keys.ENTER).perform();
    waitSeconds(3);
    //Ingreso Medio de Pago a Entregar 
    js.executeScript("window.scrollTo(0, 1000);");
    clickElement(medioPagoEgreso);
    waitSeconds(2);
    //Primer ingreso Medio de pago
    clickElement(selectPagoEgreso);
    waitSeconds(3);
    clickElement(inputMontoEgreso);
    waitSeconds(3);
    write(inputMontoEgreso, montoCajaMX);
    for (int i = 0; i < 1; i++) {
        actions.sendKeys(Keys.TAB).perform();
        waitSeconds(5);
    }
    actions.sendKeys(Keys.ENTER).perform();
    waitSeconds(3);
    //Seleccionar segundo medio de pago de Egreso
    clickElement(medioPagoEgreso);
    waitSeconds(2);
    clickElement(selectPagoEgreso2);
    waitSeconds(2);
    write(inputMontoEgreso, montoCCMX);
    for (int i = 0; i < 1; i++) {
        actions.sendKeys(Keys.TAB).perform();
        waitSeconds(5);
    }
    actions.sendKeys(Keys.ENTER).perform();
    waitSeconds(3);
    //Ingreso Datos de Planilla
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
    waitSeconds(5);
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
