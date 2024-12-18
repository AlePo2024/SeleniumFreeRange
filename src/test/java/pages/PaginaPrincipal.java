package pages;


public class PaginaPrincipal extends BasePage {

    private final String sectionLink = "//input[@id='username']";
    private final String sectionPass = "//input[@id='password']";
    private final String homePage = "//input[@id='Login']";

    //Variables de usuario y contraseña
    private final String Button = "aascenci@externos.bancoestado.cl.devcomex";
    private final String passWord = "22Danae08d";
    

    public PaginaPrincipal() {
        super(driver);
    }

    public void navigateToFreeRangeTesters() {
        driver.manage().window().maximize();
        navigateTo("https://bancoestado--devcomex.sandbox.my.salesforce.com");
        
    }

    public void clickUsuario() {//(String section) {
        //String xpathSection = String.format(sectionLin, section); leccion 33 segunda parte
        clickElement(sectionLink);
        write(sectionLink, Button);

    }

    public void clickPassword() {
        clickElement(sectionPass);
        write(sectionPass, passWord);

    }

    public void clickHomePage() {
        clickElement(homePage);

    }

    public String getPassWord() {
        return passWord;
    }
}