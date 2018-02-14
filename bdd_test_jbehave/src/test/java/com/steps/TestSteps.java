package com.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import java.util.Stack;

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
        }
    }

    @Then("the stack should have $number elements")
    public void assertElementCount(int elementCount) {
        // assertThat(stack.size(), equalTo(elementCount));
        Assert.assertEquals(stack.size(), elementCount);
    }
    /**
     * foo
     * foo
     */
}
