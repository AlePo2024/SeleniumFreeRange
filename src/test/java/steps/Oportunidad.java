package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import pages.BasePage;

public class Oportunidad extends BasePage{
    public Oportunidad(){
        super(driver);
    }

    @After
    public void tearDown(Scenario scenario) {
        if(scenario.equals(scenario)) {
            scenario.log("Oportunidad creada correctamente");
            final byte[] screenshot = ((TakesScreenshot) driver)
            .getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "Vista Oportunidad");
        }

    }    
}
