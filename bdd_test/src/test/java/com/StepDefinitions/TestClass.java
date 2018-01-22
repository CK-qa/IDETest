package com.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TestClass {

    private int given;
    private int minus;
    private int result;


    @Given("^user has (\\d+) items$")
    public void userHasItems(int number) throws Throwable {
        given = number;
        System.out.println("user has " + given + " items");
    }

    @When("^user loses (\\d+) items$")
    public void userLosesItems(int number) throws Throwable {
        minus = number;
        System.out.println("user loses " + minus + " items");
    }

    @Then("^he has (\\d+) items$")
    public void heHasItems(int number) throws Throwable {
        result = given - minus;
        Assert.assertEquals(number, result);
        System.out.println(number + " items left");
    }
}
