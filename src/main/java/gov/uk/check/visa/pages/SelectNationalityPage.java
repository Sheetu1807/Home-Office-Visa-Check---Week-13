package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectNationalityPage extends Utility {

    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    public SelectNationalityPage() {
        PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;
    @FindBy(xpath = "//select[@id='response']//option[@value='chile']")
    WebElement CountryDropDown;
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;
    @FindBy(xpath = "//select[@id='response']//option[@value='cambodia']")
    WebElement CountryDropDown1;

    public void selectNationality1() {
        clickOnElement(nationalityDropDownList);}
    public void clicknextStepButton () {
        clickOnElement(nextStepButton);
    }
    public void selectNationality (){
        clickOnElement(CountryDropDown);
    }
    public void setCountryDropDown2(){
        clickOnElement(CountryDropDown1);}


}