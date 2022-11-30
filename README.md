# Testing Web automation on sauce demo website.

Serenity BDD is a library that makes it easier to write high quality automated acceptance tests, with powerful reporting and living documentation features. It has strong support for both web testing with Selenium, and API testing using RestAssured.

Serenity strongly encourages good test automation design, and supports several design patterns, including classic Page Objects, the newer Lean Page Objects/ Action Classes approach, and the more sophisticated and flexible Screenplay pattern.

The latest version of Serenity supports Cucumber 6.x.

This demo including feature login, add to cart, checkout, remove item, feature sort, and continue button.


### The project directory structure
The project has build scripts for both Maven and Gradle, and follows the standard directory structure used in most Serenity projects:
```Gherkin
src
  + main
  + test
    + java                        Test runners and supporting code
      + starter
          + Pages
          + StepDefinitions
    + resources
      + features                  Feature files

```

## The sample scenario

```Gherkin
Feature: login

  Scenario Outline: Successfully logged in
    Given I already on log in page
    When I input username "<username>"
    And I input password "<password>"
    And I click login button
    Then I redirected to inventory page
    Examples:
      | username        | password       |
      | standard_user | secret_sauce |
```

### Step definitions

```java
    @Given("I already on log in page")
    public void IamAlreadyOnLoginPage(){
        loginPage.open();
    }

    @When("I input username {string}")
    public void IInputUsername (String username){
        loginPage.InputUsername(username);

    }

    @And("I input password {string}")
    public void IInputPassword (String password){
        loginPage.InputPassword(password);

    }

    @And("I click login button")
    public void IClickLoginButton (){
        loginPage.ClickLoginButton();

    }

    @Then("I redirected to inventory page")
    public void IRedirectedToInventoryPage (){
        assertEquals("https://www.saucedemo.com/inventory.html",inventoryPage.getUrl());
        assertTrue(inventoryPage.isCartVisible());
        assertEquals("PRODUCTS", inventoryPage.getHeaderTitle());
        assertTrue(inventoryPage.checkSortInventoryNameByDefault());
    }
```

## Executing the tests
1. Clone this repository using this command
   ```sh
   git clone https://github.com/a-febri/web-automation.git 
   ```
2. Change directory to project directory
   ```sh
   cd web-automation
   ```
3. Run using this command below
   ```sh
   mvn clean verify
   ```


The test results will be recorded in the `target/site/serenity` directory.


