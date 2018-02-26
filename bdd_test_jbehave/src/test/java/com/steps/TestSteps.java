package com.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import java.util.Stack;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

public class TestSteps {

    private Stack<String> stack;

    public TestSteps() {
        stack = new Stack<String>();

    }

    @Given("an empty stack")
    public void givenAnEmptyStack() {
        stack.clear();
    }

    /**
     *
     * @param elementCount todo
     */
    @When("I add $number elements")
    public void addElements(int elementCount) {
        for (int i = 0; i < elementCount; i++) {
            stack.add((new Integer(i)).toString());
            System.out.println("I add " + elementCount + " elements");
        }
    }

    @Then("the stack should have $number elements")
    public void assertElementCount(int elementCount) {
        Assert.assertThat(stack.size(), equalTo(elementCount));
        Assert.assertEquals(stack.size(), elementCount);
    }
    /**
     * foo
     * foo
     */

    @Then("test it properly")
    public void testItProperly() {
        Assert.assertFalse(false);
    }
}
