package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[normalize-space()='You will not need a visa to come to the UK']")
    WebElement verifyText;
    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement result;

    @FindBy(xpath = "//h2[normalize-space()='You need a visa to work in health and care']")
    WebElement verifytext1;
    @FindBy(xpath = "//h2[contains(text(),'You’ll need a visa to join your family or partner ')]")
    WebElement verifytext2;

    // public String getResultMessage(){return getTextFromElement(result);}
    // public void confirmResultMessage(String expectedMessage){return getTextFromElement(result1);}
//    public String verifyText1(){
//        return getTextFromElement(verifyText);}
    public String verifyText() {
        return getTextFromElement(result);
    }


    public String verifyResultText() {
        System.out.println(getTextFromElement(verifytext1));
        return getTextFromElement(verifytext1);
    }
    public String verifyResultText2(){
        System.out.println(getTextFromElement(verifytext2));
        return getTextFromElement(verifytext2);
    }
}