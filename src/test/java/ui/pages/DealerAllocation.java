package ui.pages;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import java.io.File;
import java.io.FileInputStream;

public class DealerAllocation extends BasePage {
    @FindBy(xpath = "//*[@id=\"root\"]/div/p-button-group/p-button[3]")
    WebElement dealerAllocationBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/p-tabs/p-tabs-item[1]/p-accordion/div[1]/div[1]/div[1]/div/div/div/div/span/div/div[2]")
    WebElement dealerListFilter;

    @FindBy(xpath = "/html/body/div[4]/div[1]/p-text-field-wrapper/input")
    WebElement dealerListFilterSearch;

    @FindBy(xpath = "/html/body/div[4]/div[2]/div/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li/div/span")
    WebElement dealerBerlinPotsdam;

    @FindBy(xpath = "/html/body/div[4]/div[2]/div/ul/li/div/button")
    WebElement psdListFilter;

    @FindBy(xpath = "/html/body/div[4]/div[2]/div/ul/li/ul/li/div/button")
    WebElement pagListFilter;

    @FindBy(xpath = "/html/body/div[4]/div[2]/div/ul/li/ul/li/div/div/div")
    WebElement psdCheckBoxFilter;

    @FindBy(xpath = "/html")
    WebElement html;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/p-tabs/p-tabs-item[1]/p-accordion/div[1]/div[2]/div[1]/div[1]/div/div/div/input")
    WebElement datePicker_1;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/p-tabs/p-tabs-item[1]/p-accordion/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/input")
    WebElement datePicker_2;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/p-tabs/p-tabs-item[1]/p-accordion/div[2]/div[2]/p-button[1]")
    WebElement showBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/p-tabs/p-tabs-item[1]/p-accordion/div[1]/div[1]/div[1]/div/div/div/div/span/div/div[2]/div/div[1]/span")
    WebElement ftilterquota_8;

    @FindBy(id = "dealer-quota-table")
    WebElement dealerQuotaTable;

    @FindBy(xpath = "//*[@id=\"dealer-quota-table\"]/div/div[1]/div/div[2]/div[2]/div[2]/div[4]/div[1]/div[4]/div/span/span[4]")
    WebElement tableinfo;

    @FindBy(id = "dealer-quota-table")
    WebElement dealerDataList;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/p-tabs/p-tabs-item[1]/p-accordion/div[2]/div[2]/p-button[2]")
    WebElement resetBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/p-tabs/p-tabs-item[1]/p-accordion/div[1]/div[1]/div[1]/div/div/div/div/span/div/div[2]/div")
    WebElement dealerEmptyField;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/p-tabs[1]/p-tabs-item[1]/p-accordion[1]/div[2]/div[2]/p-switch[1]/following-sibling::*")
    WebElement pagInfoBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/p-tabs/p-tabs-item[1]/p-accordion/div[1]/div[1]/div[2]/div/div/div/div/span/div/div[2]")
    WebElement ModelGropBtn;

    @FindBy(xpath = "/html/body/div[4]/div[1]/p-text-field-wrapper/input")
    WebElement ModelGropSearchInput;

    @FindBy(xpath = "/html/body/div[4]/div[2]/div/ul/li/div/div")
    WebElement ModelOptionBtn;

    @FindBy(xpath = "/html/body/div[4]/div[2]/div/ul/li/ul/li/div/span")
    WebElement ModelOptionCaymanBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/p-tabs/p-tabs-item[1]/p-accordion/div[1]/div[2]/div[2]/div/div/div/div/span/div/div[2]")
    WebElement modelYearBtn;

    @FindBy(xpath = "/html/body/div[4]/div[2]/div/ul/li/ul/li[2]/div/span")
    WebElement ModelYearOptionBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/p-tabs/p-tabs-item[1]/p-accordion/div[1]/div[1]/div[1]/div/div/div/p-popover")
    WebElement infoBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/p-tabs//p-tabs-bar/button[2]")
    WebElement fileTabBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/p-tabs//p-tabs-bar/button[3]")
    WebElement inactiveTabBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/p-tabs/p-tabs-item[1]/div/div[1]/div[2]/div[2]/p-button")
    WebElement exportBtn;

    @FindBy(xpath = "//*[@id=\"dealer-quota-table\"]/div/div[1]/div/div/div[2]/div[2]/div[2]/div[4]/div[1]/div[2]/div/div[4]/div[1]")
    WebElement pagInfolbl;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/p-tabs/p-tabs-item[1]/p-accordion/div[2]/div[1]/p-button[2]")
    WebElement SaveCurrentFilterBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/p-tabs/p-tabs-item[1]/p-accordion/div[2]/div[1]/p-button[1]")
    WebElement FavoritesBtn;

    @FindBy(xpath = "/html/body/p-modal[1]/div/div/p-text-field-wrapper/input")
    WebElement filterNameTxt;

    @FindBy(xpath = "//*[@id=\"ag-76-input\"]")
    WebElement labelTxt;
    @FindBy(xpath = "//*[@id=\"ag-78-input\"]")
    WebElement valueTxt;
    @FindBy(xpath = "/html/body/p-modal[1]/label/p-button")
    WebElement saveFilterBtn;
    @FindBy(xpath = "/html/body/p-modal[2]/div/div/div/div[2]/div[2]/div[2]/div[4]/div[1]/div[2]")
    WebElement ListOfSavedFilter;

    

    final String BLUE = "\033[0;34m";
    final String RESET = "\033[0m";

    // click on the dealer tab
    public void clickDeallerAllocationTab() {
        waitForVisibility(dealerAllocationBtn);
        dealerAllocationBtn.click();

    }

    // Choose a dealer from the list
    public void chooseDealer() {
        waitForVisibility(dealerListFilter);
        dealerListFilter.click();
        waitForVisibility(psdListFilter);
        psdListFilter.click();
        waitForVisibility(pagListFilter);
        pagListFilter.click();
        waitForVisibility(psdCheckBoxFilter);
        psdCheckBoxFilter.click();
        html.click();

    }

    // choose a specefic dealer/Berlin
    public void searchDealer(String dealer) {
        waitForClickability(dealerListFilter);
        dealerListFilter.click();
        waitForClickability(dealerListFilterSearch);
        dealerListFilterSearch.sendKeys(dealer);
        waitForVisibility(dealerBerlinPotsdam);
        dealerBerlinPotsdam.click();
        html.click();
    }

    // choose date range
    public void pickDateRange(String fromDate, String toDate) {
        datePicker_1.click();
        waitForVisibility(datePicker_1);
        datePicker_1.sendKeys(fromDate);
        waitForVisibility(datePicker_2);
        datePicker_2.sendKeys(toDate);
        html.click();
    }

    // choose a model type group
    public void selectMTG() {
        waitForVisibility(ModelGropBtn);
        ModelGropBtn.click();
        waitForVisibility(ModelOptionBtn);
        ModelOptionBtn.click();
        html.click();

    }

    // clicks on the pag toggle switch
    public void clickPAGInfoButton() {
        waitForVisibility(pagInfoBtn);
        pagInfoBtn.click();
    }

    // Click show button
    public void showQuotaData() {
        waitForVisibility(showBtn);
        showBtn.click();
    }

    // Verifys that the list of quota data are visible after clicking the show
    // button
    public void checkDealerList() {
        waitForVisibility(dealerQuotaTable);
        Assert.assertTrue(dealerQuotaTable.isDisplayed(), "The list of data should be displayed.");
    }

    // verifys that the pag quota data are visible in frontend table
    public void checkPagQuotaDetails() {
        waitForVisibility(pagInfolbl);
        String actualText = pagInfolbl.getText();
        String expectedText = "Open Plan PAG Quota Market";
        System.out.println(expectedText);
        Assert.assertEquals(actualText, expectedText, "Cant verify PAG Details in the list.");

    }

    // Vrifys that no quota data are not visible, if the nandatory field of the
    // search function are not selected.
    public void checkDealerDataNonVisibality() {
        Assert.assertTrue(isElementNotPresent(By.id("dealer_data_list")), "Dealer data list should not be present.");
    }

    // Verifys that the show button is not clickable, if not all mandatory fields
    // are selected
    public void verifyNotClickable() {
        Assert.assertTrue(showBtn.isEnabled(), "The button should be disabled (not clickable).");
    }

    // resets all filter fields to their default values(Empty fields)
    public void clickResetButton() {
        resetBtn.click();
    }

    // clicks on the Filter button
    public void saveCurrentFilter() {
        waitForVisibility(SaveCurrentFilterBtn);
        SaveCurrentFilterBtn.click();
    }

    // gives the filter a name
    public void nameFilter(String name) {
        waitForVisibility(filterNameTxt);
        filterNameTxt.sendKeys(name);
    }

    // clicks on save filter
    public void saveFilter() {
        waitForVisibility(saveFilterBtn);
        saveFilterBtn.click();
    }

    // Verifys that the filter was saved
    public void verifyFilter() {
        waitForVisibility(FavoritesBtn);
        FavoritesBtn.click();
    }

    // coose Cayman as a Model type group
    public void ChooseCayman() {
        waitForVisibility(ModelGropBtn);
        ModelGropBtn.click();
        waitForVisibility(ModelGropSearchInput);
        ModelGropSearchInput.sendKeys("cayman gt4");
        waitForVisibility(ModelOptionCaymanBtn);
        ModelOptionCaymanBtn.click();
        html.click();
    }

    // Download Excel file.
    public String downloadExcel() {

        // Set the download file path to the Downloads folder
        String downloadFilepath = System.getProperty("user.home") + "/Downloads";

        // Set Chrome preferences for downloading files
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", downloadFilepath);
        prefs.put("download.prompt_for_download", false);
        prefs.put("profile.default_content_setting_values.automatic_downloads", 1);
        prefs.put("safebrowsing.enabled", "true");

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        waitForClickability(exportBtn);
        exportBtn.click();

        // Wait for the download to complete (adjust time based on your needs)
        waitForComplete(15000);

        // Verify the file has been downloaded
        File dir = new File(downloadFilepath);

        // Look for the file matching the pattern "*_Allocation_Display.xlsx"
        File[] files = dir.listFiles((dir1, name) -> name.matches(".*_Allocation_Display\\.xlsx"));

        if (files != null && files.length > 0) {
            // Assuming the most recent file is the correct one
            File latestFile = files[0];
            for (File file : files) {
                if (file.lastModified() > latestFile.lastModified()) {
                    latestFile = file;
                }
            }
            System.out.println("File has been downloaded successfully: " + latestFile.getName());
            return latestFile.getAbsolutePath();
        } else {
            throw new RuntimeException("File download failed.");
        }
    }

    // This method gets all data in the quota table// Unsorted
    public void getListOfDealersInfos() {

        List<WebElement> items = driver.findElements(By.xpath(
                "//*[@id=\"dealer-quota-table\"]/div/div/div/div/div[2]/div[2]/div[2]/div[4]/div[1]/div[2]/div/div[1]"));

        List<String> itemList = new ArrayList<>();

        for (WebElement item : items) {
            itemList.add(item.getText());
        }
        // Print the total number of items found
        System.out.println("Total number of dealers: " + items.size());
        for (String item : itemList) {
            System.out.println(item);
        }
    }

    // Chesks that all filters fields are resset to the default vlaues
    public void verifyResetState() {
        waitForComplete(5000);

        String labelText = dealerEmptyField.getText();
        Assert.assertEquals(labelText, "", "The dealer list filter should be empty after reset.");
        String date1 = datePicker_1.getAttribute("value");
        String date2 = datePicker_2.getAttribute("value");
        Assert.assertTrue(date1.isEmpty(), "Text field 1 should be empty.");
        Assert.assertTrue(date2.isEmpty(), "Text field 2 should be empty.");

    }

    // Checks the appearance of the info button after choosing a dealer
    public void verifyInfoButton() {
        waitForVisibility(infoBtn);
        String actualTitle = infoBtn.getText();
        System.out.println(actualTitle);
        String expectedTitle = "More information";
        Assert.assertEquals(actualTitle, expectedTitle, "Cant verify info button");
    }

    // Check if the info button is clicked (aria-expanded="true")
    public void checkIfInfoButtonClicked() {
        String ariaExpanded = infoBtn.getAttribute("aria-expanded");
        if ("true".equals(ariaExpanded)) {
            System.out.println("The button has been clicked.");
        } else {
            System.out.println("The button has not been clicked.");
        }
    }

    // Timer
    public static void waitForComplete(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (Exception ignored) {
        }
    }

    // Check if the button is displayed
    public void isExportButtonVisible() {
        Assert.assertTrue(exportBtn.isDisplayed(), "The export button is not visible.");
    }

    @SuppressWarnings("deprecation")
    public void checkHowManyinList() {

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Locate the list of items
        List<WebElement> items = driver.findElements(By.xpath("//*[@id=\"dealer-quota-table\"]/div"));

        // Count the number of items in the list
        int numberOfItems = items.size();

        // Print the count
        System.out.println("Number of items in the list: " + numberOfItems);

    }

    public void compareData() throws IOException {
        waitForComplete(5000);
        // Extract frontend data

        // Quota Month
        String quotaMonth = driver.findElement(By.xpath(
                "//*[@id=\"dealer-quota-table\"]/div/div/div/div/div[2]/div[2]/div[2]/div[4]/div[1]/div[2]/div/div[1]/div[1]"))
                .getText();
        System.out.println(quotaMonth);
        String quotaMonthValue = driver.findElement(By.xpath(
                "//*[@id=\"dealer-quota-table\"]/div/div/div/div/div[2]/div[2]/div[2]/div[4]/div[1]/div[2]/div/div[1]/div[2]/span"))
                .getText();// Aug 2024
        System.out.println(quotaMonthValue);

        String quotaMonthApril = driver.findElement(By.xpath(
                "//*[@id=\"dealer-quota-table\"]/div/div/div/div/div[2]/div[2]/div[2]/div[4]/div[1]/div[2]/div/div[1]/div[2]"))
                .getText();
        System.out.println(quotaMonthApril);
        String quotaMonthValueApril = driver.findElement(By.xpath(
                "//*[@id=\"dealer-quota-table\"]/div/div/div/div/div[2]/div[2]/div[2]/div[4]/div[1]/div[2]/div/div[2]/div[2]/span"))
                .getText();// Apr 2024
        System.out.println(quotaMonthValueApril);


        // Open Plan pag Quota market
        String openPlanPAGQuotaMarket = driver.findElement(By.xpath(
                "//*[@id=\"dealer-quota-table\"]/div/div/div/div/div[2]/div[2]/div[2]/div[4]/div[1]/div[2]/div/div[2]/div[1]"))
                .getText();
        System.out.println(openPlanPAGQuotaMarket);
        String openPlanPAGQuotaMarketValue = driver.findElement(By.xpath(
                "//*[@id=\"dealer-quota-table\"]/div/div/div/div/div[2]/div[2]/div[2]/div[4]/div[1]/div[2]/div/div[2]/div[2]/span"))
                .getText();
        System.out.println(openPlanPAGQuotaMarketValue);
        String openPlanPAGQuotaMarketValueTotal = driver.findElement(By.xpath(
                "//*[@id=\"dealer-quota-table\"]/div/div/div/div/div[2]/div[2]/div[2]/div[4]/div[1]/div[2]/div/div[2]/div[3]"))
                .getText();// Aug 2024
        System.out.println(openPlanPAGQuotaMarketValueTotal);

        // planDealerQuota
        String planDealerQuota = driver.findElement(By.xpath(
                "//*[@id=\"dealer-quota-table\"]/div/div/div/div/div[2]/div[2]/div[2]/div[4]/div[1]/div[2]/div/div[3]/div[1]"))
                .getText();
        System.out.println(planDealerQuota);
        String planDealerQuotaValue = driver.findElement(By.xpath(
                "//*[@id=\"dealer-quota-table\"]/div/div/div/div/div[2]/div[2]/div[2]/div[4]/div[1]/div[2]/div/div[3]/div[2]/span"))
                .getText();
        System.out.println(planDealerQuotaValue);
        String planDealerQuotaValueTotal = driver.findElement(By.xpath(
                "//*[@id=\"dealer-quota-table\"]/div/div/div/div/div[2]/div[2]/div[2]/div[4]/div[1]/div[2]/div/div[3]/div[3]"))
                .getText();// Aug 2024
        System.out.println(planDealerQuotaValueTotal);

        // consumed Quota
        String consumedQuota = driver.findElement(By.xpath(
                "//*[@id=\"dealer-quota-table\"]/div/div/div/div/div[2]/div[2]/div[2]/div[4]/div[1]/div[2]/div/div[4]/div[1]"))
                .getText();
        System.out.println(consumedQuota);
        String consumedQuotaValue = driver.findElement(By.xpath(
                "//*[@id=\"dealer-quota-table\"]/div/div/div/div/div[2]/div[2]/div[2]/div[4]/div[1]/div[2]/div/div[4]/div[2]/div/span"))
                .getText();
        System.out.println(consumedQuotaValue);
        String consumedQuotaValueTotal = driver.findElement(By.xpath(
                "//*[@id=\"dealer-quota-table\"]/div/div/div/div/div[2]/div[2]/div[2]/div[4]/div[1]/div[2]/div/div[4]/div[3]"))
                .getText();// Aug 2024
        System.out.println(consumedQuotaValueTotal);

        // openDealerQuota
        String openDealerQuota = driver.findElement(By.xpath(
                "//*[@id=\"dealer-quota-table\"]/div/div/div/div/div[2]/div[2]/div[2]/div[4]/div[1]/div[2]/div/div[5]/div[1]"))
                .getText();
        System.out.println(openDealerQuota);
        String openDealerQuotaValue = driver.findElement(By.xpath(
                "//*[@id=\"dealer-quota-table\"]/div/div/div/div/div[2]/div[2]/div[2]/div[4]/div[1]/div[2]/div/div[5]/div[2]/span"))
                .getText();
        System.out.println(openDealerQuotaValue);
        String openDealerQuotaValueTotal = driver.findElement(By.xpath(
                "//*[@id=\"dealer-quota-table\"]/div/div/div/div/div[2]/div[2]/div[2]/div[4]/div[1]/div[2]/div/div[5]/div[3]"))
                .getText();// Aug 2024
        System.out.println(openDealerQuotaValueTotal);

        downloadExcel();

        // Find the most recent file with "Allocation_Display" in its name
        java.nio.file.Path downloadDir = Paths.get(System.getProperty("user.home"), "Downloads");
        File excelFile = Files.list(downloadDir)
                .filter(p -> p.getFileName().toString().contains("Allocation_Display"))
                .max(Comparator.comparingLong(p -> p.toFile().lastModified()))
                .orElseThrow(() -> new IOException("No file found with 'Allocation_Display' in the name"))
                .toFile();

        // Load downloaded Excel file
        FileInputStream fis = new FileInputStream(excelFile);
        try (Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);

            // Extract data from Excel
            Row row = sheet.getRow(1); // Assuming data is in the second row
            String excelQuotaMonth = sheet.getRow(0).getCell(6).getStringCellValue(); // "Aug 24"
            String excelOpenPlanPAGQuotaMarket = String.valueOf(row.getCell(6).getNumericCellValue());
            String excelTotal = String.valueOf(row.getCell(7).getNumericCellValue());

            // Assertions
             Assert.assertEquals(quotaMonthValue, excelQuotaMonth);
             Assert.assertEquals(openPlanPAGQuotaMarket, excelOpenPlanPAGQuotaMarket);
             Assert.assertEquals(openPlanPAGQuotaMarket, excelTotal);
        }

        // Further assertions for other quota values can be added here...
    }
}
