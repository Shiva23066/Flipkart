package stepdefinitionfile;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
	
	WebDriver driver;
	
	@Given("browser is open")
	public void browser_is_open() throws InterruptedException {
	    System.out.println("Inside step - browser is open");
	    
	   // String projectpath=(System.getProperty("user.dir"));
	    // System.out.println("Project path is:" + projectpath);
		WebDriverManager.chromedriver().setup();

	    
	   // System.setProperty("webdriver.chrome.driver", projectpath + "//Users/admin//Downloads//chromedriver-mac-x64//");
	
	    driver=new ChromeDriver();
	    Thread.sleep(5000);
	    //driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
	   driver.navigate().to("https://demo.nopcommerce.com/login");
	}

	@When("user enters valid Email and password")
	public void user_enters_valid_email_and_password() throws InterruptedException {
		
		driver.findElement(By.id("Email")).sendKeys("shiva@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("12345");
	     Thread.sleep(3000);	


	}
	@And("user clicks on login")
	public void user_clicks_on_login() throws InterruptedException {
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
	     Thread.sleep(3000);	

	}


	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_homepage() throws InterruptedException {
     Thread.sleep(3000);	
     
     driver.close();
	}
	

}
