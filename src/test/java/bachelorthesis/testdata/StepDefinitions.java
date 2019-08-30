package bachelorthesis.testdata;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static junit.framework.TestCase.fail;


public class StepDefinitions {

    public static int int1;
    public static int int2;
    public static int int3;


    @Given("I have the number {int}")
    public void i_have_the_number(Integer int1) {
        if(int1 == 5){
            System.out.println("Number is " + int1);
        }else{
            fail("Number is not 5");
        }
    }

    @And("I also have the number {int}")
    public void i_also_have_the_number(Integer int2) {
        if(int2 == 7){
            System.out.println("Number is " + int2);
        }else{
            fail("Number is not 7");
        }
    }

    @When("I multiply {int} with {int}")
    public void i_multiply_with(Integer int1, Integer int2) {
        if(int1 == 5 && int2 == 7){
           int3 = int1 * int2;
        }
    }

    @Then("I get {int}")
    public void i_should_get(Integer int3) {
        if(int3 == 35){
            System.out.println("Multiplication of 5 and 7 is " + int3);
        }else{
            fail("You got 35");
        }
    }

    /*@Then("I should not get {int}")
    public void i_multiply_with*/
}
