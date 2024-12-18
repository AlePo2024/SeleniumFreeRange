package pages;

public class PaginaFundamentosTesting extends BasePage {

    private String introduccionTestingLink = "(//h4[@class='sc-gLLuof sc-iuOOrT ja-dnMY kOviRY'])[2]";

    public PaginaFundamentosTesting() {
        super(driver);
    }

    public void clickIntroduccionTestingLink() {
        clickElement(introduccionTestingLink);
    }

    
}
