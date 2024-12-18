package pages;


public class PaginaCursos extends BasePage {
  

    private final String clienteNuevo= "/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[2]";
    private final String nuevaCuenta = "//div[@title='Nuevo'][contains(.,'Nuevo')]";
    private final String cambiosInternacionales = "//span[normalize-space()='Persona natural']";
    private final String selectFinal = "//span[normalize-space()='Siguiente']";
    private final String newRut = "//input[contains(@name,'rut')]";
    private final String rut= ("13290992k");
    private final String validaRut = "//button[normalize-space()='Validar RUT']";
    private final String oportunidad = "//button[contains(.,'Oportunidad')]";
    private final String selectOpcion = "//select[@class='slds-select']";
    private final String guardarOportunidad = "//button[@class='slds-button slds-button_brand'][contains(.,'Guardar')]";
    private final String result = "//records-entity-label[contains(.,'Oportunidad')]";


    public PaginaCursos() {

        super(driver);


    }

    public void clickNewCliente() {
        clickElement(clienteNuevo);
        clickElement(nuevaCuenta);
        clickElement(cambiosInternacionales);
        clickElement(selectFinal);
        
    }

    public void sendRut() {
        clickElement(newRut);
        write(newRut, rut);
        clickElement(validaRut);
        clickElement(oportunidad);
        selectFromDropdownValue(selectOpcion, "Cambios Internacionales");
        clickElement(guardarOportunidad);
    }

    public String firstResult() {
        return textFromElement(result);
    }

}
