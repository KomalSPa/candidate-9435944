package ho.qat.seo.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class ReasonForTravelPage extends PageObject {


    WebElementFacade reasonToSelect;

    @FindBy(xpath = "//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    private WebElementFacade nextStepButton;


    public void selectReasonForVisit(String reason){

        //String selector = String.join("","div[value='", reason.toLowerCase(), "']");
        reasonToSelect = find(By.xpath("//input[@value='"+reason.toLowerCase()+"']"));
        clickOn(reasonToSelect);
    }

    public void clickNextStepButton(){

        clickOn(nextStepButton);
    }


}

