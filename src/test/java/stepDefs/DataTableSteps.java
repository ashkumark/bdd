package stepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import pages.Driver;

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

    // Method 1: using List<Map<String, String>>
/*    @Given("I create a driver")
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
    }*/

    // Method 2: using DataTable
    @Given("I create a driver")
    public void i_create_a_driver(DataTable table) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        log("\n **I create a driver..");
        log("Options: " + table);

        List<Map<String, String>> options = table.asMaps(String.class, String.class);

        for (Map<String, String> option : options) {
            log(option.get("firstName"));
        }
    }

    // Method 3: register DataTableType
    // https://github.com/cucumber/cucumber-jvm/tree/main/java#data-tables
    /*@DataTableType
    public Driver driverEntryTransformer(Map<String, String> entry) {
        return new Driver (
                entry.get("firstName"),
                entry.get("lastName"),
                entry.get("birthDate"));
    }

    @Given("I create a driver")
    public void i_create_a_driver(List<Driver> drivers) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        log("\n **I create a driver..");
        //log("Options: " + drivers);

        for (Driver driver : drivers) {
            System.out.println(driver.getFirstName());
            System.out.println(driver.getLastName());
            System.out.println(driver.getBirthDate());
        }
    }*/


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
