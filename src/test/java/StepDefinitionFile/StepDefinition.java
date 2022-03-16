package StepDefinitionFile;



import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@RunWith(Cucumber.class)
public class StepDefinition {
	public WebDriver driver;
    @Given("^Initialize browser with Chrome$")
    public void initialize_browser_with_chrome() throws Throwable {
    	System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		driver=new ChromeDriver();
       
    }
    @And("^Navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
    	driver.get(strArg1);
        
    }
	  

    @When("^User enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
    	driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys(username);
    	driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(password);
    	Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[id=\"Login\"]")).click();
        
    }

    @Then("^Verify that user is successfully signed in$")
    public void verify_that_user_is_successfully_signed_in() throws Throwable {
    	System.out.println("Login Sucessfull");
        
    }

   

	    
	   

}
