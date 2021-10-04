package stepDefinations;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObjects.FormPage;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import Cucumber.Automation.Base;



public class stepDefination {
	
	public WebDriver driver;
	FormPage formPage = new FormPage(driver);
	

    @Given("^User is on Practice Form page$")
    public void user_is_on_practice_form_page() throws Throwable {
    	driver= Base.getDriver();
    	driver.manage().window().maximize();
    }
    


    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
    	
    	  List<Map<String, String>> formDetails=data.asMaps(String.class,String.class);
    	  formPage.getFirstName().sendKeys(formDetails.get(0).get("FirstName"));
    	  formPage.getLastName().sendKeys(formDetails.get(0).get("LastName"));
    	  System.out.print(formDetails.get(0).get("Gender"));
    	 formPage.getGender((formDetails.get(0).get("Gender"))).click();
    	 
    	  formPage.getMobile().sendKeys(formDetails.get(0).get("Mobile"));
        
    }
    
    @And("^cliks on Submit$")
    public void cliks_on_submit() throws Throwable {
    	formPage.submitForm().submit();
    }

    @Then("^Form successfully submitted$")
    public void form_successfully_submitted() throws Throwable {
    	
    	//Assert.assertTrue(null, false);  //we can assert , here validating the data that displays on cliking submit
       
    }

    

}