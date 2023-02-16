package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends TestBase {

    StartPage startPage;
    SelectNationalityPage selectNationalityPage;
    ReasonForTravelPage reasonForTravelPage;
    ResultPage resultPage;
    DurationOfStayPage durationOfStayPage;
    WorkTypePage wtp;
    FamilyImmigrationStatusPage immigrationstatus1;

    @BeforeMethod
    public void inIT() {
        startPage = new StartPage();
        selectNationalityPage = new SelectNationalityPage();
        reasonForTravelPage = new ReasonForTravelPage();
        resultPage = new ResultPage();
        durationOfStayPage = new DurationOfStayPage();
        wtp = new WorkTypePage();
        immigrationstatus1 = new FamilyImmigrationStatusPage();
    }

    @Test
    public void anAustralianCominToUKForTourism() {
        startPage.clickOnAcceptCookies();//click on accecpt cookies
        startPage.clickStartNow();//Click on start button
        startPage.setCountryDropDown();//
        startPage.clickOnContinue();
        reasonForTravelPage.clickOnTourism();
        reasonForTravelPage.setClickcontinue();
        resultPage.verifyText();
    }//verify result 'You will not need a visa to come to the UK'

    @Test
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() throws InterruptedException {
        startPage.clickOnAcceptCookies();
        startPage.clickStartNow();
        selectNationalityPage.selectNationality();
        startPage.clickOnContinue();
        reasonForTravelPage.clickVisitList();
        reasonForTravelPage.clickNextStepButton();
        Thread.sleep(2000);
        durationOfStayPage.selectLengthOfStay();
        Thread.sleep(3000);
        durationOfStayPage.clickNextStepButton();
        Thread.sleep(3000);
        reasonForTravelPage.setReasonForVisitList();
        reasonForTravelPage.setClickcontinue();
        String expectedResult = "You need a visa to work in health and care";
        String actualResult = resultPage.verifyResultText();
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void aCambodianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card() throws InterruptedException {
        startPage.clickOnAcceptCookies();
        startPage.clickStartNow();
        selectNationalityPage.setCountryDropDown2();
        Thread.sleep(3000);
        startPage.clickOnContinue();
        reasonForTravelPage.setReasonForVisitList1();
        reasonForTravelPage.clickNextStepButton();
        immigrationstatus1.immigrationstatus();
        immigrationstatus1.selectImmigrationStatus1();
        String expectedRusult1 = "You’ll need a visa to join your family or partner in the UK";
        String actualResult1 = resultPage.verifyResultText2();
        Assert.assertEquals(expectedRusult1, actualResult1);


    }
}