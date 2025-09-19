package stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Home {
	WebDriver driver;
	@Given("user  open the application url")
	public void user_open_the_application_url() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
	    
	}

	@Then("user should able to find the page title")
	public void user_should_able_to_find_the_page_title() {
	    // Write code here that turns the phrase above into concrete actions
	//	driver.getTitle().equals("STORE")
		Assert.assertEquals(driver.getTitle(), "STORE");
	    
	}

	@When("user clicks on any product in the homepage")
	public void user_clicks_on_any_product_in_the_homepage() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//a[normalize-space()='Samsung galaxy s6']")).click();
	}

	@When("navigates to respective  page")
	public void navigates_to_respective_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(driver.getCurrentUrl());
	    
	}

	@When("click on add cart")
	public void click_on_add_cart() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg']")).click();
	}

	@Then("product should add to the cart successfully")
	public void product_should_add_to_the_cart_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("access the homepage")
	public void access_the_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("display the below contents  or links")
	public void display_the_below_contents_or_links(io.cucumber.datatable.DataTable dataTable) {
	 // List<String> data=dataTable.asList();
		List<String> data=dataTable.transpose().asList(String.class);
	  for(int i=0;i<=data.size();i++)
	  {
		  driver.findElement(By.xpath("//li//a[text()='"+data.get(i)+"']")).isDisplayed();
	  }
	  
	    
	}

	@When("user clicks on login link")
	public void user_clicks_on_login_link() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(5000);
	    driver.findElement(By.id("login2")).click();
	    
	}
	@When("enters {string} {string} into the input fields")
	public void enters_into_the_input_fields(String username, String password) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 Thread.sleep(5000);
		driver.findElement(By.id("loginusername")).sendKeys(username);
		driver.findElement(By.id("loginpassword")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='logInModal']/div/div/div[3]/button[2]")).click();
		
	}

	@Then("user should logged in succcesfully")
	public void user_should_logged_in_succcesfully() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("enters test demo into the input fields")
	public void enters_test_demo_into_the_input_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
