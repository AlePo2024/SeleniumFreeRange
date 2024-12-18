package pages;

import java.util.List;

public class PaginaRegistro extends BasePage {

    private String planDropdown = "//a[@href='/comunidad/83037/buy'][contains(.,'Elegir Plan')]";

    public PaginaRegistro() {
        super(driver);
    }

    public List<String> returnPlanDropdownValues() {
        return getDropdownValues(planDropdown);
    }
    
}
