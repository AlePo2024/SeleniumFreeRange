package pages;

public class NuevaOportunidad extends BasePage {
  

    private final String clienteNuevo= "/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[2]";
    private final String nuevaCuenta = "//div[@title='Nuevo'][contains(.,'Nuevo')]";
    private final String cambiosInternacionales = "//span[normalize-space()='Persona natural']";
    private final String selectFinal = "//span[normalize-space()='Siguiente']";
    private final String newRut = "//input[contains(@name,'rut')]";
    private final String rut= ("13290992k");
    private final String validaRut = "//button[normalize-space()='Validar RUT']";
    private final String selectOpportunity = "//lightning-button-menu[@class='menu-button-item slds-dropdown_actions slds-dropdown-trigger slds-dropdown-trigger_click']//lightning-primitive-icon[@variant='bare']";
    private final String oportunidad = "(//span[contains(.,'Oportunidad')])[5]";
    private final String selectOpcion = "//select[@class='slds-select']";
    private final String guardarOportunidad = "//button[@class='slds-button slds-button_brand'][contains(.,'Guardar')]";
    private final String result = "//records-entity-label[contains(.,'Oportunidad')]";


    public NuevaOportunidad() {
        super(driver);
    }

    public void clickNewCliente() {
       
        clickElement(clienteNuevo);
        waitSeconds(2);
        clickElement(nuevaCuenta);
        waitSeconds(2);
        clickElement(cambiosInternacionales);
        waitSeconds(2);
        clickElement(selectFinal); 
        waitSeconds(2);
        clickElement(newRut);
        waitSeconds(2);
        write(newRut, rut);
        waitSeconds(2);
        clickElement(validaRut);
        waitSeconds(2);
        clickElement(selectOpportunity);
        waitSeconds(2);
        clickElement(oportunidad);
        waitSeconds(2);
        selectFromDropdownValue(selectOpcion, "Compra y venta moneda extranjera");
        waitSeconds(10);
        clickElement(guardarOportunidad);
              
    }

    public String firstResult() {
        return textFromElement(result);
    }

}
