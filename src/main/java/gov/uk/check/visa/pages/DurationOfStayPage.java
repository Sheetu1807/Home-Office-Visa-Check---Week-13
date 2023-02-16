package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DurationOfStayPage extends Utility {

    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());

    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement lessThanSixMonths;
    @FindBy(xpath = "//div[@class='govuk-radios']//label[contains(text(),'longer than 6 months')]")
    WebElement selectmoreThanSixMonth;


    public void selectLengthOfStay() {
        clickOnElement(selectmoreThanSixMonth);

    }

    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
    }

    public void setMoreThanSixMonths() {
        clickOnElement(lessThanSixMonths);
    }
}