
# Quota Management Tool

## Overview

This project is a Selenium test automation framework using Java and Cucumber. It is designed to automate the testing of the Quota Management application and is structured to be easily extended with additional tests.

## Prerequisites

To set up and run this project, you need to have the following installed:

1. **Java Development Kit (JDK) 1.8 or above**: Ensure that Java is properly installed and configured in your system's PATH.
2. **Apache Maven**: This project uses Maven for dependency management and build automation. You can download Maven from [Maven's official website](https://maven.apache.org/download.cgi).
3. **IDE (Optional but recommended)**: IntelliJ IDEA, Eclipse, or any other Java IDE that supports Maven projects.

## Project Structure

- **`src/main/java`**: Contains the main application code (if any).
- **`src/test/java`**: Contains all the test scripts and Cucumber feature files.
  - **UI.pages**: Page Object Model (POM) classes representing different pages of the application.
  - **UI.runners**: Cucumber runners to execute the test suites.
  - **UI.stepdefinitions**: Step definition classes where the Gherkin steps are implemented in Java.

   - **UI.utils**: Utils contains selenium webderiver configuration and some other test related Configurations. 
- **`pom.xml`**: Maven configuration file that manages project dependencies and plugins.


## Dependencies

The project uses the following dependencies: All dependencies can be downloaded through the maven repositories: https://mvnrepository.com/

- **TestNG**: A testing framework inspired by JUnit and NUnit, but introducing some new functionalities.
- **Cucumber-Java**: For writing BDD-style tests.
- **Cucumber-TestNG**: Integration of Cucumber with TestNG.
- **Selenium-Java**: Selenium WebDriver bindings for Java to interact with web browsers.
- **WebDriverManager**: A utility to automate the management of WebDriver binaries for various browsers.

These dependencies are automatically handled by Maven. They are defined in the `pom.xml` file and will be downloaded when you build the project.

## Setup Instructions

1. **Clone the Repository**: 
   ```sh
   git clone 
   ```
   
2. **Navigate to the Project Directory**:
   ```sh
   cd QuotaManagement
   ```
   
3. **Install Dependencies**:
   Run the following command to install all necessary dependencies defined in the `pom.xml` file:
   ```sh
   mvn clean install
   ```

4. 1.**Run the Tests**:
   You can run the standard test suite using Maven:
   ```sh
   mvn test
   ```

    2.You can run the test suite on a spefific Browser using Maven:
   ```sh
   mvn test -Dbrowser=firefox
   ```

      3.You can run the test suite on a spefific Browser and using Tags using Maven:
   ```sh
    mvn test -Dbrowser=firefox -Dcucumber.filter.tags="@ValidCredentials"
   ```

   Alternatively, if you are using an IDE, you can run the test directly from the Cucumber runner classes located in the `src/test/java/UI/runners` directory.

## Tests Implemented

The project currently includes the following types of tests:
- **Opening website Test**: Verifies that URL is reachable and callable.
- **Login Tests**: Verifies that users can log in with valid credentials. All login Test scienarios are written except 2FA
- **Filtering Quota data**: Filtering quota data according to differenct criterias Like dealer,date,pag infos, mtg ...
- **Downloading Excel file**: Downloading Excelfile with the filtered Quota data and verify the downloaded file
- **Compqaring Quota data**: compare the data inside the excelfile if they match the filtered data on the frontend
These tests are implemented using the Page Object Model (POM) pattern, which makes the tests more maintainable and reusable.

## How to Add New Tests

1. **Create a New Feature File**: Add a new `.feature` file in the `src/test/resources/features` directory.
2. **Define the Steps**: Write the corresponding step definitions in the `src/test/java/UI/steps` package.
3. **Update the Page Objects**: If necessary, update or create new page object classes in the `UI.pages` package.
4. **Run the Tests**: Execute the tests using Maven or your IDE. Steps to run a test are described in this file


## Important Extensions for vs code

1. **Live Server**: To open HTML files like reports after test execution.
2. **Java dev kit**:  Tol help you run, debug and auto complete code.
3. **Cucumber**: To help you with cucumber feature files and color and auto complete feature steps
4. **Mavens**: Maven extension for VS Code. It provides a project explorer and shortcuts to execute Maven commands, improving user experience for Java developers who use Maven
5. **Git Extensions**: To connect and to git repo and do git commands 



## Reporting

Test reports are generated automatically after each test run. You can find the reports in the `target/surefire-reports` directory. These reports provide a detailed overview of the test execution results.

## Troubleshooting

- **Common Issues**:
  - **WebDriver Binary Not Found**: Ensure that WebDriverManager is correctly configured to automatically manage the WebDriver binaries.
  - **Java or Maven Not Found**: Verify that both Java and Maven are installed and properly configured in your system's PATH.

- **Logs**: Detailed logs are available in the `target/logs` directory, which can help diagnose issues during test execution.

## Contributions

Contributions are welcome! Please fork the repository, create a new branch for your changes, and submit a pull request.

## License
