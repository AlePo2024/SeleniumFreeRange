package pages;


public class HomePage extends BasePage {

    private final String sectionLink = "//input[contains(@type,'email')]";
    private final String siguiente = "//input[contains(@type,'submit')]";
    private final String sectionPass = "/html//div[@id='lightbox']/div[@role='main']/div/div[2]/div//input[@name='passwd']";
    private final String siguiente2 = "/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[5]/div/div/div/div/input";
    private final String homePage = "/html/body/div/form/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[3]/div[2]/div/div/div[2]/input";

    //Variables de usuario y contraseña
    private final String Button = "aascenci@externos.bancoestado.cl";
    private final String passWord = "//.22Danae08";
    

    public HomePage() {
        super(driver);
    }

    public void navigateToFreeRangeTesters() {
        driver.manage().window().maximize();
        navigateTo("https://bancoestado--qa.sandbox.lightning.force.com/lightning/page/home");
        
    }

    public void clickUsuario() {//(String section) {
        //String xpathSection = String.format(sectionLin, section); leccion 33 segunda parte
        clickElement(sectionLink);
        write(sectionLink, Button);
        clickElement(siguiente);
        clickElement(sectionPass);
        write(sectionPass, passWord);
        clickElement(siguiente2);
        clickElement(homePage);
    }

    public String getPassWord() {
        return passWord;
    }
}