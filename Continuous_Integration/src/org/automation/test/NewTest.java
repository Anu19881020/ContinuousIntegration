package org.automation.test;


	  import org.openqa.selenium.WebDriver;
     import org.openqa.selenium.chrome.ChromeDriver;
     import org.testng.annotations.Test;
	  import org.testng.annotations.BeforeClass;
	  import org.testng.annotations.AfterClass;
	   
	  public class NewTest {
	  public WebDriver driver;
	    @Test
	    public void openGoogle() {
	  driver.get("https://www.google.com/");
	    }
	    
	    @BeforeClass
	    public void beforeClass() {
	    
	    	System.setProperty("webdriver.chrome.driver","D:\\Java\\Continuous_Integration\\chromedriver.exe");
	    	 driver= new ChromeDriver();
	    
	    }
	   
	    @AfterClass
	    public void afterClass() {
	    driver.quit();
	    }
	   
	  
  }

