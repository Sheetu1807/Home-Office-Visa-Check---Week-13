package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkTypePage extends Utility {

    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());

    public WorkTypePage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    @FindBy(xpath="//main[@id='content']//div[@class='govuk-grid-column-two-thirds']")
    WebElement JobTypeList;

    public void selectJobType(String job){
        clickOnElement((By) nextStepButton);}
    public void clicknextStepButton(){
        clickOnElement((By) JobTypeList);}
}
