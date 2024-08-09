package bddFinal.SetUpDefination;

import bddFinal.Utility.finalSeleniumUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePageSetUp extends finalSeleniumUtility {

    @Given("open browser and navigate to Tek App")
    public void open_browser_and_navigate_to_tek_App() {
        setupBrowser();
    }
    @Then("validate top left corner is Tek Insurance App")
    public void validate_top_left_corner_is_tek_insurance_App() {
        String topLeftCornerLogo = getElementText(By.xpath("//*[@id=\"root\"]/div/div[1]/div/h2"));
        Assert.assertEquals("TEK Insurance App", topLeftCornerLogo);
    }
    @Then("close the browser")
    public void close_the_browser() {
        quitBrowser();

    }


}
