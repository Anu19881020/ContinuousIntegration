package org.automation.test;


	  import org.openqa.selenium.WebDriver;
     import org.openqa.selenium.chrome.ChromeDriver;
     import org.testng.annotations.Test;
	  import org.testng.annotations.BeforeClass;
	  import org.testng.annotations.AfterClass;
	   
	  public class NewTest2 {
	  public WebDriver driver;
	    @Test
	    public void openFacebook() {
	  driver.get("https://www.facebook.com/");
	    }
	    
	    @BeforeClass
	    public void beforeClass() {
	    
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Anuradha\\ContinuousIntegration\\Continuous_Integration\\Continuous_Integration\\chromedriver.exe");
	    	 driver= new ChromeDriver();
	    
	    }
	   
	    @AfterClass
	    public void afterClass() {
	    driver.quit();
	    }
	   
	  
  }

