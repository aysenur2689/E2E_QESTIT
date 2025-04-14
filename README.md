<div align="center">

```
 ██████╗ ███████╗███████╗████████╗██╗████████╗
██╔═══██╗██╔════╝██╔════╝╚══██╔══╝██║╚══██╔══╝
██║   ██║█████╗  ███████╗   ██║   ██║   ██║   
██║▄▄ ██║██╔══╝  ╚════██║   ██║   ██║   ██║   
╚██████╔╝███████╗███████║   ██║   ██║   ██║   
 ╚══▀▀═╝ ╚══════╝╚══════╝   ╚═╝   ╚═╝   ╚═╝   
```

<h1>Test Automation Framework</h1>

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com)
[![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)](https://www.selenium.dev)
[![Cucumber](https://img.shields.io/badge/Cucumber-23D96C?style=for-the-badge&logo=cucumber&logoColor=white)](https://cucumber.io)
[![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)](https://maven.apache.org)
[![Allure](https://img.shields.io/badge/Allure-yellow?style=for-the-badge&logo=allure&logoColor=white)](https://qameta.io/allure-report)

<p align="center">
  <a href="#overview">Overview</a> •
  <a href="#features">Features</a> •
  <a href="#tech-stack">Tech Stack</a> •
  <a href="#setup--installation">Installation</a> •
  <a href="#running-tests">Usage</a> •
  <a href="#reporting">Reports</a>
</p>

</div>

## 📋 Overview

This project implements an end-to-end test automation framework for the QESTIT web application. It focuses on testing the Services section, particularly the Test Logiciel and Automatisation des tests functionalities.

<details>
<summary>🎯 Key Features</summary>

- 🔄 Page Object Model (POM) Design Pattern
- 🥒 BDD with Cucumber
- 📊 Allure Reporting Integration
- 🛠️ Custom Utility Functions
- ⏱️ Smart Wait Strategies
- 📸 Automatic Screenshot Capture on Failure

</details>

## 🛠️ Tech Stack

<table>
  <tr>
    <td align="center" width="160">
      <img src="https://www.svgrepo.com/show/303388/java-4-logo.svg" width="48" height="48" alt="Java" />
      <br>Java 11
    </td>
    <td align="center" width="160">
      <img src="https://raw.githubusercontent.com/detain/svg-logos/master/svg/selenium-logo.svg" width="48" height="48" alt="Selenium" />
      <br>Selenium
    </td>
    <td align="center" width="160">
      <img src="https://raw.githubusercontent.com/cucumber/cucumber-js/master/docs/images/cucumber.png" width="48" height="48" alt="Cucumber" />
      <br>Cucumber
    </td>
    <td align="center" width="160">
      <img src="https://raw.githubusercontent.com/vscode-icons/vscode-icons/master/icons/file_type_maven.svg" width="48" height="48" alt="Maven" />
      <br>Maven
    </td>
  </tr>
</table>

## 📁 Project Structure

```plaintext
E2E_QESTIT/
├── src/
│   └── test/
│       ├── java/
│       │   └── com/
│       │       └── qestit/
│       │           ├── hooks/
│       │           │   └── Hooks.java
│       │           ├── locators/
│       │           │   └── ServicePageLocators.java
│       │           ├── pages/
│       │           │   ├── BasePage.java
│       │           │   └── ServicePage.java
│       │           ├── runners/
│       │           │   └── TestRunner.java
│       │           └── steps/
│       │               └── ServiceSteps.java
│       └── resources/
│           └── features/
│               └── ServiceNavigation.feature
├── pom.xml
├── run-tests.bat
└── README.md
```

## 📝 Test Scenarios

<details>
<summary>Service Navigation Feature</summary>

```gherkin
Feature: Navigation des Services QESTIT
  En tant qu'utilisateur
  Je veux naviguer à travers les services QESTIT
  Afin d'accéder au service de Test Logiciel

  Scenario: Naviguer vers le Service de Test Logiciel
    Given je suis sur la page d'accueil de QESTIT
    When je clique sur le menu Services
    And je clique sur l'option Test Logiciel
    Then je dois voir le titre Test Logiciel
    When je clique sur Automatisation des tests
```

</details>

## 🚀 Setup & Installation

1. Ensure you have Java 11 installed
2. Install Maven
3. Clone the repository
4. Run `mvn clean install`

## ▶️ Running Tests

<details>
<summary>Using Batch File</summary>

```bash
.\run-tests.bat
```

</details>

<details>
<summary>Using Maven</summary>

```bash
mvn clean test
```

</details>

## 📊 Reporting

The framework uses Allure for comprehensive test reporting:

<details>
<summary>Generate & View Reports</summary>

### Generate Report
```bash
mvn allure:report
```

### View Report
```bash
mvn allure:serve
```

### Report Features
- 📈 Test Execution Timeline
- 🔍 Detailed Step Breakdown
- 📸 Failure Screenshots
- 📊 Statistics Dashboard
- 🏷️ Categories View

</details>

## ✅ Best Practices

<details>
<summary>Click to expand</summary>

- **Page Object Model**: Separates test logic from page elements
- **Base Page Class**: Common reusable methods
- **Explicit Waits**: Smart waiting strategies for better reliability
- **Screenshot Capture**: Automatic capture on test failure
- **Clean Code**: Well-organized and documented codebase
- **BDD Approach**: Clear and business-readable test scenarios

</details>

## 🔄 Recent Updates

- Added Allure reporting integration
- Implemented JavaScript click handling for better reliability
- Enhanced element locators for better stability
- Added explicit wait strategies
- Improved error handling and logging

## 🤝 Contributing

Feel free to submit issues, fork the repository, and create pull requests for any improvements.

## 📜 License

This project is licensed under the MIT License - see the LICENSE file for details.

---

<div align="center">
  <br>
  <p>
    <sub>Built with ❤️ by QESTIT Team</sub>
  </p>
  <br>
  <p>
    <a href="https://qestit.com">
      <img src="https://img.shields.io/badge/Visit-QESTIT-blue?style=for-the-badge&logo=globe" alt="Visit QESTIT">
    </a>
  </p>
</div>