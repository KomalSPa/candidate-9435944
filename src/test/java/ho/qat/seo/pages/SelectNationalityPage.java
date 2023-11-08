package ho.qat.seo.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class SelectNationalityPage extends PageObject {

    @FindBy(xpath = "//select[@id='response']")
    private WebElementFacade nationalityDropDownList;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    private WebElementFacade nextStepButton;
    
    public void selectNationality(String nationality){
        selectFromDropdown(nationalityDropDownList, nationality);
    }

    public void clickNextStepButton(){
        clickOn(nextStepButton);
    }
}
