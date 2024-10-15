package ui.steps;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ui.pages.DealerAllocation;

public class DealerAllocationSteps {

    DealerAllocation dealerAllocation = new DealerAllocation();

    @When("User clicks dealer Allocation Tab")
    public void clickDeallerAllocationTab() {
        dealerAllocation.clickDeallerAllocationTab();
    }

    @And("User chooses a dealer")
    public void chooseDealer() {
        dealerAllocation.chooseDealer();
    }

    @And("User chooses dealer Berlin")
    public void getDealerBerlin() {
        dealerAllocation.searchDealer("Berlin");
    }

    @When("User extract the frontend data")
    public void readFrontendData() {
    }

    @And("User picks a date range")
    public void pickDateRange() {
        dealerAllocation.pickDateRange("April 2024", "August 2024");
    }

    @And("User picks an MTG")
    public void selectMTG() {
        dealerAllocation.selectMTG();
    }

    @And("the User clicks the show button")
    public void showQuotaData() {
        dealerAllocation.showQuotaData();

    }

    @Then("A list of dealer data should appear")
    public void checkDealerData() {
        dealerAllocation.checkDealerList();
    }

    @And("Leaves the data range empty")
    public void leaveDataRangeEmpty() {

    }

    @And("A list of dealer data should not appear")
    public void verifyDataInvisibilty() {
        dealerAllocation.checkDealerDataNonVisibality();
    }

    @Then("Extract frontend data")
    public void extractFrontendData() {

    }

    @And("the show button should not be clickable")
    public void checkShowButtonClickablility() {
        dealerAllocation.verifyNotClickable();
    }

    @And("User clicks the reset button")
    public void clickResetButton() {
        dealerAllocation.clickResetButton();
    }

    @And("The fields should return to their default state")
    public void verifyResetState() {
        dealerAllocation.verifyResetState();
    }

    @And("User clicks PAG quota details toggle")
    public void clickPAGInfoButton() {
        dealerAllocation.clickPAGInfoButton();
    }

    @And("PAG Details should appear in the Quota Table")
    public void checkPAGDeatils() {
        dealerAllocation.checkPagQuotaDetails();
    }

    @Then("an Excel File is generated")
    public void generateExcelFile() throws IOException {

    }

    @Then("An Export Excel button should appear")
    public void verifyExcelButtun() throws IOException {
        dealerAllocation.isExportButtonVisible();
    }

    @Then("An Excel File is downloaded")
    public void verifyExcelDownload() throws IOException {
        dealerAllocation.downloadExcel();
    }

    @Then("an Info button should appear next to the dealer filter tab")
    public void verifyInfoButton() throws IOException {
        dealerAllocation.verifyInfoButton();
    }

    @Then("the button should be by default not be clicked")
    public void the_button_should_be_by_default_not_clicked() {
        dealerAllocation.checkIfInfoButtonClicked();
    }

    @And("User clicks on save current filter")
    public void SaveFilter() {
        dealerAllocation.saveCurrentFilter();
    }

    @And("User enters filter name")
    public void clickSaveFilter() {
        dealerAllocation.nameFilter("Test Filter");
    }

    @And("User clicks Save")
    public void saveFilter() {
        dealerAllocation.saveFilter();
    }

    @Then("A filter should be saved")
    public void verifySavedFilter() {
        dealerAllocation.verifyFilter();
    }

    @Then("User picks an MTG cayman gt4")
    public void selectCayman() {
       dealerAllocation.ChooseCayman();
    
    }

    @Then("user validates the data")
    public void validateFrontendAndExcelData() throws IOException {
       dealerAllocation.compareData();
       dealerAllocation.checkHowManyinList();
       dealerAllocation.getListOfDealersInfos();
    
    }


    
 





    

}
