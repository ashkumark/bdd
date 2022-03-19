package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

public class DataTableSteps {

    public void log(String message) {
        System.out.println(message);
    }

    @Before
    public void setUp() {
        //System.out.println("\n **Before all steps..");
        log("\n **Before scenario..");
    }

    @After
    public void tearDown() {
        log("\n **After scenario..");
    }

    @Given("I have logged in to the application")
    public void i_have_logged_in_to_the_application() {
        log("\n **Logged in..");
    }

    @Given("I create a policy")
    public void i_create_a_policy(Map<String, String> options) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        log("\n **I create a policy..");
        log("Options: " + options);
    }

    @Given("I create a driver")
    public void i_create_a_driver(List<Map<String, String>> options) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        log("\n **I create a driver..");
        log("Options: " + options);
    }

    @Given("I create more policies")
    public void i_create_more_policies(List<Map<String, String>> options) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        log("\n **I create more policies..");
        log("Options: " + options);
    }



}
