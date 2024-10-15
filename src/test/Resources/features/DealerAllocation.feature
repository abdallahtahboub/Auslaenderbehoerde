Feature: Dealer Allocation

    @QuotaData @DealerAllocation
    Scenario: Choose a dealer
        Given User is logged in
        When User clicks dealer Allocation Tab
        And User chooses a dealer
        And User picks a date range
        And the User clicks the show button
        Then A list of dealer data should appear

    @QuotaDataMTG @DealerAllocation
    Scenario: Display Quota Table for Multiple Dealers and MTGs
        Given User is logged in
        When User clicks dealer Allocation Tab
        And User chooses a dealer
        And User picks a date range
        And User picks an MTG
        And the User clicks the show button
        Then A list of dealer data should appear

    @mandatoryFields @DealerAllocation
    Scenario: Neglecting filling mandatory filter field
        Given User is logged in
        When User clicks dealer Allocation Tab
        And User chooses a dealer
        And Leaves the data range empty
        Then A list of dealer data should not appear
        And the show button should not be clickable

    # To be done
    @ShowPAGInfos @DealerAllocation
    Scenario: show PAG Quota Details in the Quota table
        Given User is logged in
        When User clicks dealer Allocation Tab
        And User chooses a dealer
        And User picks a date range
        And User clicks PAG quota details toggle
        And the User clicks the show button
        Then A list of dealer data should appear
        And PAG Details should appear in the Quota Table


    @infoButton @DealerAllocation
    Scenario: show info button after choosing a dealer
        Given User is logged in
        When User clicks dealer Allocation Tab
        And User chooses a dealer
        Then an Info button should appear next to the dealer filter tab
        And the button should be by default not be clicked


    @QuotaDataFrontend @DealerAllocation
    Scenario: show info button after choosing a dealer
        Given User is logged in
        When User clicks dealer Allocation Tab
        And User chooses a dealer
        And User picks a date range
        And the User clicks the show button
        Then A list of dealer data should appear
        Then Extract frontend data


    @DownloadExcelFile @DealerAllocation
    Scenario: Generate Excel file of filtered quota Data
        Given User is logged in
        When User clicks dealer Allocation Tab
        And User chooses a dealer
        And User picks a date range
        And the User clicks the show button
        Then A list of dealer data should appear
        Then An Export Excel button should appear
        Then An Excel File is downloaded

    @SaveCurrentFilter @DealerAllocation
    Scenario: User saves a filter
        Given User is logged in
        When User clicks dealer Allocation Tab
        And User chooses a dealer
        And User picks a date range
        And User clicks on save current filter
        And User enters filter name
        And User clicks Save
        Then A filter should be saved


    @AnalyzeExcelData @DealerAllocation
    Scenario: User saves a filter
        Given User is logged in
        When User clicks dealer Allocation Tab
        And User chooses dealer Berlin
        And User picks a date range
         And User picks an MTG cayman gt4
        And the User clicks the show button
        Then A list of dealer data should appear
        Then user validates the data
 
        

