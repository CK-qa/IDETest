package com.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TestClass {

    private int given;
    private int minus;
    private int start;
    private int eat;


    @Given("^user has (\\d+) items$")
    public void userHasItems(Integer number) {
        given = number;
        System.out.println("Scenario step1: User has " + given + " items");
    }

    @When("^user loses (\\d+) items$")
    public void userLosesItems(Integer number) {
        minus = number;
        System.out.println("Scenario step2: User loses " + minus + " items");
    }

    @Then("^he has (\\d+) items$")
    public void heHasItems(Integer number) {
        Integer result = given - minus;
        Assert.assertEquals(number, result);
        System.out.println("Scenario step3: " + number + " items left");
    }

    @And("^everybody happy$")
    public void everybodyHappy() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Scenario step4: Yay!");
    }

    //region 2
    @Given("^there are (\\d+) cucumbers$")
    public void thereAreStartCucumbers(int start) {
        this.start = start;
        System.out.println("Scenario outline step1: user has " + start + " items");
    }

    @When("^I eat (\\d+) cucumbers$")
    public void iEatEatCucumbers(int eat) {
        this.eat = eat;
        System.out.println("Scenario outline step2: user eats " + eat + " items");
    }

    @Then("^I should have (\\d+) cucumbers$")
    public void iShouldHaveLeftCucumbers(int left) {
        int res = start - eat;
        System.out.println("Scenario outline step3: " + res + " items left");
        Assert.assertEquals(res, left);
    }
    //endregion
}

