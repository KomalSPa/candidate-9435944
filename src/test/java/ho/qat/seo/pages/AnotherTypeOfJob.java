package ho.qat.seo.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class AnotherTypeOfJob extends PageObject {


   // @FindBy(xpath = "//input[@id='response-7']")
    private WebElementFacade anyTypeOfJob;

    @FindBy(xpath = "//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    private WebElementFacade nextStepButton;

    public void selectReasonForJob(String type){

        anyTypeOfJob = find(By.xpath("//input[@value='"+ type +"']"));
        clickOn(anyTypeOfJob);
    }

    public void clickNextStepButton(){

        clickOn(nextStepButton);
    }

}
