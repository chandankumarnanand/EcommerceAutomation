package genricUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {
	
	
	public WebDriver driver ;
	public WebDriverWait wait;
	

	 public static ExtentReports extent;
	    public static ExtentTest test;
	    
	  

	   
	   @BeforeSuite
	    public void setupExtent() {
	       
		   File reportDir = new File("test-output");
	        if (!reportDir.exists()) {
	            reportDir.mkdirs();
	        }
	     
	        String reportName = this.getClass().getSimpleName() + "_ExtentReport.html";
	        String reportPath = "test-output/" + reportName;

	        ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
	        extent = new ExtentReports();
	        extent.attachReporter(spark);
	        extent.setSystemInfo("Tester", "chandan kumar");
	        extent.setSystemInfo("Environment", "QA");
	    }

	  
	   @BeforeMethod
		public void bm() throws IOException {
		
			

		        driver = new FirefoxDriver();
		        wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Explicit wait

		      
	       

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			try {
			    driver.get("https://www.automationexercise.com/");
			    System.out.println("✅ Navigated to URL: ");
			} catch (Exception e) {
			    System.err.println("❌ Failed to navigate to URL: " + e.getMessage());
			    Assert.fail("Navigation failed.");
			}

			

		

		}

		@AfterMethod()
		public void am() {
			driver.quit();

		}

	 
	 @AfterSuite
	    public void flushReport() {
	        extent.flush();
	    }

}
