package com.Duva.Sawko;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class BasePage {

     static WebDriver driver ;
     Common common = new Common(driver);
     DateFormat dateFormat;
     
 	/**
 	 * Take a ScreenShot
 	 * 
 	 * @throws IOException
 	 */

 	
 	
    protected WebDriver getDriver() {

        if (driver == null) {
        	String chromeDriverPath = "/Users/mac/Downloads/chromedriver" ;  
        	System.setProperty("webdriver.chrome.driver", chromeDriverPath);  
        	ChromeOptions options = new ChromeOptions();  
//      options.addArguments("--headless", "--disable-gpu", "--window-size=1250,800","--ignore-certificate-errors");  
        	 driver = new ChromeDriver(options);  
        	 Dimension d = new Dimension(1380,1080);
          	//Resize current window to the set dimension
          	   driver.manage().window().setSize(d);
        }
        return driver;
    }

    public void gotoURL(String url) {
        getDriver().get(url);
    }

    public void close() {
        getDriver().quit();
        driver = null;
        //getDriver().close();
    }

    public void enterURL(){
    	gotoURL("https://dstrainingdev.com/admin");
    	
    }
    
    public void Take_ScreenShot() throws IOException {
 		String destDir = "screenshots";
 		File scrFile = ((TakesScreenshot) driver)
 				.getScreenshotAs(OutputType.FILE);
 		dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
 		new File(destDir).mkdirs();
 		String destFile = dateFormat.format(new Date()) + ".png";
 		FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
 	}

    
    public void verify_loing_details() throws InterruptedException, IOException{
    
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions actions = new Actions(driver);
		common.pause(20);
		
		driver.findElement(By.xpath("//*[@id='browserYesButton']")).click();
		common.pause(20);
		
		System.out.println("STEP 01 | Open URL ");
		common.log("<br><br>STEP 01 | Open URL ");
		common.pause(10);
		
		System.out.println("STEP 02 | Enter Email address of Student ");
		common.log("<br><br>STEP 02 | Enter Email address of Student  ");
		WebElement email = driver.findElement(By.xpath("//*[@id='validationDefaultUsername']"));
		email.sendKeys("qa3@mailinator.com");
		common.pause(10);
		
		System.out.println("STEP 03 | Enter Password of Student ");
		common.log("<br><br>STEP 03 | Enter Password of Student  ");
		WebElement password = driver.findElement(By.xpath("//*[@id='validationDefaultUserpassword']"));
		password.sendKeys("Qa@123456");
		common.pause(10);
		
		
		WebElement SignIn_button = driver.findElement(By.xpath("//*[@id='signin']/div[3]/div[3]/button"));
		SignIn_button.click();
		System.out.println("STEP 04 | Click on Sign In button ");
		common.log("<br><br>STEP 04 | Click on Sign In button  ");
		common.pause(30);
		
		driver.findElement(By.xpath("//a[@class='k-button k-bare k-button-icon k-window-action k-dialog-action k-dialog-close']")).click();
		System.out.println("STEP 05 | Student Logged In Successfully  ");
		common.log("<br><br>STEP 05 | Student Logged In  Successfully  ");
		common.pause(10);

    }
    
    public void verify_wrong_password() throws InterruptedException, IOException{
        
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions actions = new Actions(driver);
		common.pause(20);
		
		driver.findElement(By.xpath("//*[@id='browserYesButton']")).click();
		common.pause(20);
		
		System.out.println("STEP 01 | Open URL ");
		common.log("<br><br>STEP 01 | Open URL ");
		common.pause(10);
		
		System.out.println("STEP 02 | Enter Email address of Student ");
		common.log("<br><br>STEP 02 | Enter Email address of Student  ");
		WebElement email = driver.findElement(By.xpath("//*[@id='validationDefaultUsername']"));
		email.sendKeys("qa2@mailinator.com");
		common.pause(10);
		
		System.out.println("STEP 03 | Enter Password of Student ");
		common.log("<br><br>STEP 03 | Enter Password of Student  ");
		WebElement password = driver.findElement(By.xpath("//*[@id='validationDefaultUserpassword']"));
		password.sendKeys("qa@123456");
		common.pause(10);
		
		
		WebElement SignIn_button = driver.findElement(By.xpath("//*[@id='signin']/div[3]/div[3]/button"));
		SignIn_button.click();
		System.out.println("STEP 04 | Click on Sign In button ");
		common.log("<br><br>STEP 04 | Click on Sign In button  ");
		common.pause(20);
		
		driver.findElement(By.xpath("//*[@id='browserYesButton']")).click();
		common.pause(20);
		
		String password_error_msg = driver.findElement(By.xpath("//*[@id='ds-notification-container']/div")).getText();

		if ("The password is not valid. Please try again.".equalsIgnoreCase(password_error_msg)) {
			
			System.out.println("STEP 05 | Error Message: Student Enters Wrong Password ");
			common.log("<br><br>STEP 05 | Error Message: Student Enters Wrong Password ");
			
		}else {
			System.out.println("STEP 05 |  ");
			common.log("<br><br>STEP 05 |   ");
			
		}
    }
    
    public void verify_wrong_email() throws InterruptedException, IOException{
        
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions actions = new Actions(driver);
		common.pause(20);
		
		driver.findElement(By.xpath("//*[@id='browserYesButton']")).click();
		common.pause(20);
		
		System.out.println("STEP 01 | Open URL ");
		common.log("<br><br>STEP 01 | Open URL ");
		common.pause(10);
		
		System.out.println("STEP 02 | Enter Email address of Student ");
		common.log("<br><br>STEP 02 | Enter Email address of Student  ");
		WebElement email = driver.findElement(By.xpath("//*[@id='validationDefaultUsername']"));
		email.sendKeys("qa44@mailinator.com");
		common.pause(10);
		
		System.out.println("STEP 03 | Enter Password of Student ");
		common.log("<br><br>STEP 03 | Enter Password of Student  ");
		WebElement password = driver.findElement(By.xpath("//*[@id='validationDefaultUserpassword']"));
		password.sendKeys("qa@123456");
		common.pause(10);
		
		
		WebElement SignIn_button = driver.findElement(By.xpath("//*[@id='signin']/div[3]/div[3]/button"));
		SignIn_button.click();
		System.out.println("STEP 04 | Click on Sign In button ");
		common.log("<br><br>STEP 04 | Click on Sign In button  ");
		common.pause(20);
		
		driver.findElement(By.xpath("//*[@id='browserYesButton']")).click();
		common.pause(20);
		
		String email_error_msg = driver.findElement(By.xpath("//*[@id='ds-notification-container']/div")).getText();

		if ("This email does not exist. Please try again.".equalsIgnoreCase(email_error_msg)) {
			
			System.out.println("STEP 05 | Error Message:  Student Email Address Nonexistent  ");
			common.log("<br><br>STEP 05 | Error Message:  Student Email Address Nonexistent  ");
			
		}else {
			System.out.println("STEP 05 |  ");
			common.log("<br><br>STEP 05 |   ");
			
		}
    }
    
    public void verify_to_view_applicant_introduction_video() throws InterruptedException, IOException{
        
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Actions actions = new Actions(driver);
			common.pause(20);
			
			verify_loing_details();
			
			WebElement Instructions_button = driver.findElement(By.xpath("//*[@id='menu_instructions']/span"));
			Instructions_button.click();
			System.out.println("STEP 06 | Click on Instructions button ");
			common.log("<br><br>STEP 06 | Click on Instructions button  ");
			common.pause(20);	
			
			WebElement Applicant_Introduction_button = driver.findElement(By.xpath("//*[@id='p_0']"));
			Applicant_Introduction_button.click();
			System.out.println("STEP 07 | Click on Applicant Introduction button  ");
			common.log("<br><br>STEP 07 | Click on Applicant Introduction button  ");
			common.pause(20);
			
			System.out.println("STEP 08 | Student can view Applicant Introduction video ");
			common.log("<br><br>STEP 08 | Student can view Applicant Introduction video.  ");
			common.pause(10);
			
 	}
    
    public void verify_to_view_medical_decision_making_tools_video() throws InterruptedException, IOException{
        
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions actions = new Actions(driver);
		common.pause(20);
		
		verify_loing_details();
		
		WebElement Instructions_button = driver.findElement(By.xpath("//*[@id='menu_instructions']/span"));
		Instructions_button.click();
		System.out.println("STEP 06 | Click on Instructions button ");
		common.log("<br><br>STEP 06 | Click on Instructions button  ");
		common.pause(20);	
		
		WebElement Medical_Decision_Making_Tools_button = driver.findElement(By.xpath("//*[@id='p_1']"));
		Medical_Decision_Making_Tools_button.click();
		System.out.println("STEP 07 | Click on 1-Medical Decision Making Tools button  ");
		common.log("<br><br>STEP 07 | Click on 1-Medical Decision Making Tools button  ");
		common.pause(40);
		
		System.out.println("STEP 08 | Student can view Medical Decision Making Tools video ");
		common.log("<br><br>STEP 08 | Student can view Medical Decision Making Tools video  ");
		common.pause(10);
		
	}
    
    public void verify_to_view_medical_decision_making_tools_DSGCC_video() throws InterruptedException, IOException{
        
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions actions = new Actions(driver);
		common.pause(20);
		
		verify_loing_details();
		
		WebElement Instructions_button = driver.findElement(By.xpath("//*[@id='menu_instructions']/span"));
		Instructions_button.click();
		System.out.println("STEP 06 | Click on Instructions button ");
		common.log("<br><br>STEP 06 | Click on Instructions button  ");
		common.pause(20);	
		
		WebElement Medical_Decision_Making_Tools_DSGCC_button = driver.findElement(By.xpath("//*[@id='p_2']"));
		Medical_Decision_Making_Tools_DSGCC_button.click();
		System.out.println("STEP 07 | Click on 2-Medical Decision Making Tools - DSGCC button  ");
		common.log("<br><br>STEP 07 | Click on 2-Medical Decision Making Tools - DSGCC button  ");
		common.pause(60);
		
		System.out.println("STEP 08 | Student can view Medical Decision Making Tools - DSGCC video ");
		common.log("<br><br>STEP 08 | Student can view Medical Decision Making Tools - DSGCC video  ");
		common.pause(10);
		
	}
    
    public void verify_to_view_medical_decision_making_tools_scenario_video() throws InterruptedException, IOException{
        
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions actions = new Actions(driver);
		common.pause(20);
		
		verify_loing_details();
		
		WebElement Instructions_button = driver.findElement(By.xpath("//*[@id='menu_instructions']/span"));
		Instructions_button.click();
		System.out.println("STEP 06 | Click on Instructions button ");
		common.log("<br><br>STEP 06 | Click on Instructions button  ");
		common.pause(20);	
		
		WebElement Medical_Decision_Making_Tools_Scenario_button = driver.findElement(By.xpath("//*[@id='p_3']"));
		Medical_Decision_Making_Tools_Scenario_button.click();
		System.out.println("STEP 07 | Click on 3-Medical Decision Making Tools - Scenario button  ");
		common.log("<br><br>STEP 07 | Click on 3-Medical Decision Making Tools - Scenario button  ");
		common.pause(60);
		
		System.out.println("STEP 08 | Student can view Medical Decision Making Tools - Scenario video ");
		common.log("<br><br>STEP 08 | Student can view Medical Decision Making Tools - Scenario video ");
		common.pause(10);
		
	}
    
    public void verify_to_view_applicant_tutorial_video() throws InterruptedException, IOException{
        
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions actions = new Actions(driver);
		common.pause(20);
		
		verify_loing_details();
		
		WebElement Instructions_button = driver.findElement(By.xpath("//*[@id='menu_instructions']/span"));
		Instructions_button.click();
		System.out.println("STEP 06 | Click on Instructions button ");
		common.log("<br><br>STEP 06 | Click on Instructions button  ");
		common.pause(20);	
		
		WebElement Applicant_Tutorial_button = driver.findElement(By.xpath("//*[@id='p_4']"));
		Applicant_Tutorial_button.click();
		System.out.println("STEP 07 | Click on Applicant Tutorial button  ");
		common.log("<br><br>STEP 07 | Click on Applicant Tutorial button  ");
		common.pause(60);
		
		System.out.println("STEP 08 | Student can view Applicant Tutorial video ");
		common.log("<br><br>STEP 08 | Student can view Applicant Tutorial video ");
		common.pause(10);
	
    }
    
    public void verify_login_details_of_admin() throws InterruptedException, IOException{
        
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions actions = new Actions(driver);
		common.pause(20);
		
		
		driver.findElement(By.xpath("//*[@id='browserYesButton']")).click();
		common.pause(20);
		
		System.out.println("STEP 01 | Open URL ");
		common.log("<br><br>STEP 01 | Open URL ");
		common.pause(10);
		
		System.out.println("STEP 02 | Enter Email address of Admin ");
		common.log("<br><br>STEP 02 | Enter Email address of Admin  ");
		WebElement email = driver.findElement(By.xpath("//*[@id='validationDefaultUsername']"));
		email.sendKeys("x@x.com");
		common.pause(10);
		
		System.out.println("STEP 03 | Enter Password of Admin ");
		common.log("<br><br>STEP 03 | Enter Password of Admin  ");
		WebElement password = driver.findElement(By.xpath("//*[@id='validationDefaultUserpassword']"));
		password.sendKeys("duvadev2018");
		common.pause(10);
		
		WebElement SignIn_button = driver.findElement(By.xpath("//*[@id='signin']/div[3]/div[3]/button"));
		SignIn_button.click();
		System.out.println("STEP 04 | Click on Sign In button ");
		common.log("<br><br>STEP 04 | Click on Sign In button  ");
		common.pause(50);
		
		System.out.println("STEP 05 | Admin Logged In Successfully  ");
		common.log("<br><br>STEP 05 | Admin Logged In  Successfully  ");
		common.pause(20);

 	}
    
    public void verify_to_add_new_applicant_as_student() throws InterruptedException, IOException{
        
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions actions = new Actions(driver);
		common.pause(20);
		
		verify_login_details_of_admin();
		
		WebElement ManageUsers_button = driver.findElement(By.xpath("//*[@id='menu_manage_users']/span"));
		ManageUsers_button.click();
		System.out.println("STEP 06 | Click on Manage Users button ");
		common.log("<br><br>STEP 06 | Click on Manage Users button ");
		common.pause(40);
		
		Random incdate = new Random();
		int incdateLow = 50;
		int incdateHigh = 250;
		int incdateResult = incdate.nextInt(incdateHigh-incdateLow) + incdateLow;	
		String startvaluedate = "0";
		String Incrementdatevalue =  Integer.toString(incdateResult);
		
		WebElement First_Name = driver.findElement(By.xpath("//*[@id='add_namefirst']"));
		First_Name.sendKeys("qa"+Incrementdatevalue);
		System.out.println("STEP 07 | Enter First Name ");
		common.log("<br><br>STEP 07 | Enter First Name ");
		common.pause(10);
		
		WebElement Last_Name = driver.findElement(By.xpath("//*[@id='add_namelast']"));
		Last_Name.sendKeys("test"+Incrementdatevalue);
		System.out.println("STEP 08 | Enter Last Name ");
		common.log("<br><br>STEP 08 | Enter Last Name ");
		common.pause(10);
		
		Random randomnumber = new Random();
		String number = String.format("%09d", randomnumber.nextInt(100000000));
		WebElement Mobile_No = driver.findElement(By.xpath("//*[@id='add_phonemobile']"));
		Mobile_No.sendKeys("9"+number);
		System.out.println("STEP 09 | Enter Mobile Number ");
		common.log("<br><br>STEP 09 | Enter Mobile Number ");
		common.pause(10);
		
		WebElement Email_Address = driver.findElement(By.xpath("//*[@id='add_email']"));
		Email_Address.sendKeys("qa"+Incrementdatevalue+"@mailinator.com");
		System.out.println("STEP 10 | Enter Email Address ");
		common.log("<br><br>STEP 10 | Enter Email Address ");
		common.pause(10);
		js.executeScript("window.scrollBy(0,7000)");
		common.pause(20);
		
		WebElement Other_Section = driver.findElement(By.xpath("//*[@id='panelbar-other-all-add']/li[2]/span"));
		Other_Section.click();
		System.out.println("STEP 11 | Click on Other Section ");
		common.log("<br><br>STEP 11 | Click on Other Section ");
		common.pause(10);
		
		WebElement Address = driver.findElement(By.xpath("//*[@id='add_address1']"));
		Address.sendKeys("New 500 Jln Sultan, #01-01, Street");
		System.out.println("STEP 12 | Enter Address ");
		common.log("<br><br>STEP 12 | Enter Address "); 
		common.pause(15);
		
		Random randomzipcode = new Random();
		String postalcode = String.format("%04d", randomzipcode.nextInt(100000));
		WebElement Zip_Code = driver.findElement(By.xpath("//*[@id='add_zip']"));
		Zip_Code.sendKeys("2"+postalcode);
		System.out.println("STEP 13 | Enter Zip Code ");
		common.log("<br><br>STEP 13 | Enter Zip Code ");
		common.pause(10);
		
		WebElement City = driver.findElement(By.xpath("//*[@id='add_city']"));
		City.sendKeys("Surat");
		System.out.println("STEP 14 | Enter City ");
		common.log("<br><br>STEP 14 | Enter City ");
		common.pause(10);
		
		WebElement State = driver.findElement(By.xpath("//*[@id='add_state']"));
		State.sendKeys("Gujarat");
		System.out.println("STEP 15 | Enter State ");
		common.log("<br><br>STEP 15 | Enter State ");
		common.pause(10);
		
		WebElement Country = driver.findElement(By.xpath("//*[@id='add_country']"));
		Country.sendKeys("India");
		System.out.println("STEP 16 | Enter Country ");
		common.log("<br><br>STEP 16 | Enter Country ");
		common.pause(10);
		
        js.executeScript("window.scrollBy(0,-1000)");
        
		WebElement Submit_button = driver.findElement(By.xpath("//input[@id='add_user']"));
		Submit_button.click();
		System.out.println("STEP 17 | Click on Submit Button ");
		common.log("<br><br>STEP 17 | Click on Submit Button ");
		common.pause(40);
		
		driver.findElement(By.xpath("//html/body/div[43]/div[3]/button")).click();
		System.out.println("STEP 18 | It display a Pop-up message that New Applicant created successfully  ");
		common.log("<br><br>STEP 18 | It display a Pop-up message that New Applicant created successfull ");
		common.pause(10); 
		driver.findElement(By.xpath("//html/body/nav/ul/li")).click();
		common.pause(10);
		driver.findElement(By.xpath("//html/body/nav/ul/li/div/a[2]")).click();
		common.pause(30);
		
		gotoURL("https://www.mailinator.com/");
		System.out.println("STEP 19 | Open Email Url ");
		common.log("<br><br>STEP 19 | Open Email Url ");
		common.pause(20);
		
		WebElement Enter_Email = driver.findElement(By.xpath("//*[@id='inboxfield']"));
		Enter_Email.sendKeys("qa"+Incrementdatevalue);
		System.out.println("STEP 20 | Enter Email Address ");
		common.log("<br><br>STEP 20 | Enter Email Address ");
		common.pause(20);
		
		WebElement Go_button = driver.findElement(By.xpath("//*[@id='go_inbox1']"));
		Go_button.click();
		System.out.println("STEP 21 | Click on GO button");
		common.log("<br><br>STEP 21 | Clcik on GO button ");
		common.pause(20);
		
		WebElement Open_Email = driver.findElement(By.xpath("//td[contains(text(),'admin@dstrainingdev.com')]"));
		Open_Email.click();
		System.out.println("STEP 22 | Open Mail To Read ");
		common.log("<br><br>STEP 22 | Open Mail To Read ");
		common.pause(20);
		
		driver.switchTo().frame("msg_body");
		
		String Passwrod_Link = driver.findElement(By.xpath("//html[1]/body[1]/p[4]/a[1]")).getText();
		System.out.println("STEP 23 | Clcik on Password Link "+Passwrod_Link);
		common.log("<br><br>STEP 23 | Click on Password Link ");
		common.pause(30);
		driver.switchTo().defaultContent();
		common.pause(10);
		
		gotoURL(Passwrod_Link);
		common.pause(20);
		
		driver.findElement(By.xpath("//*[@id='browserYesButton']")).click();
		common.pause(20);
		
		WebElement New_Password = driver.findElement(By.xpath("//*[@id='validationDefaultUserpassword']"));
		New_Password.sendKeys("qa@12345");
		System.out.println("STEP 24 | Enter Password ");
		common.log("<br><br>STEP 24 | Enter Password ");
		common.pause(20);
		
		WebElement Confirm_Password = driver.findElement(By.xpath("//*[@id='validationConfirmPassword']"));
		Confirm_Password.sendKeys("qa@12345");
		System.out.println("STEP 25 | Enter Confirm Password ");
		common.log("<br><br>STEP 25 | Enter Confirm Password ");
		common.pause(20);
		
		WebElement UpdatePassword_button = driver.findElement(By.xpath("//*[@id='setPassword']"));
		UpdatePassword_button.click();
		System.out.println("STEP 26 | Click on Update Password button ");
		common.log("<br><br>STEP 26 | Click on Update Password button ");
		common.pause(30);
		
		driver.findElement(By.xpath("//*[@id='browserYesButton']")).click();
		common.pause(20);
		
		System.out.println("STEP 27 | Enter Email address of Student ");
		common.log("<br><br>STEP 27 | Enter Email address of Student  ");
		WebElement email = driver.findElement(By.xpath("//*[@id='validationDefaultUsername']"));
		email.sendKeys("qa"+Incrementdatevalue+"@mailinator.com");
		common.pause(10);
		
		System.out.println("STEP 28 | Enter Password of Student ");
		common.log("<br><br>STEP 28 | Enter Password of Student  ");
		WebElement password = driver.findElement(By.xpath("//*[@id='validationDefaultUserpassword']"));
		password.sendKeys("qa@12345");
		common.pause(10);
		
		
		WebElement SignIn_button = driver.findElement(By.xpath("//*[@id='signin']/div[3]/div[3]/button"));
		SignIn_button.click();
		System.out.println("STEP 29 | Click on Sign In button ");
		common.log("<br><br>STEP 29 | Click on Sign In button  ");
		common.pause(30);
		
		driver.findElement(By.xpath("//a[@class='k-button k-bare k-button-icon k-window-action k-dialog-action k-dialog-close']")).click();
		System.out.println("STEP 30 | Student Logged In Successfully  ");
		common.log("<br><br>STEP 30 | Student Logged In  Successfully  ");
		common.pause(20);
		
 	}
    
  public void Verify_to_check_dates_functionality() throws InterruptedException, IOException{
        
		verify_login_details_of_admin();
		common.pause(40);
		
		driver.findElement(By.xpath("//div[3]/div[1]/ul/li[6]/div/span[1]")).click();
		System.out.println("STEP 06 | Click on Utilities ");
		common.log("<br><br>STEP 06 | Click on Utilities  ");
		common.pause(10);
		
		driver.findElement(By.xpath("//*[@id=\"menu_admin\"]/span")).click();
		System.out.println("STEP 07 | Click on Logins ");
		common.log("<br><br>STEP 07 | Click on Logins ");
		common.pause(25);
		
		driver.findElement(By.xpath("//*[@id=\"user_select_label\"]")).isDisplayed();
		System.out.println("STEP 08 | Verify Logins Screen ");
		common.log("<br><br>STEP 08 | Verify Logins Screen ");
		common.pause(25);
  }

  public void Verify_to_check_My_Profile_and_Logout_options() throws InterruptedException, IOException{
      
		verify_login_details_of_admin();
		common.pause(40);
		
		driver.findElement(By.xpath("//*[@id=\"userDropdown\"]/span")).click();
		System.out.println("STEP 06 | Click on My Account ");
		common.log("<br><br>STEP 06 | Click on My Account  ");
		common.pause(10);
  }

  public void Verify_to_Reset_Password() throws InterruptedException, IOException{
      
	    driver.findElement(By.xpath("//*[@id='browserYesButton']")).click();
		common.pause(30);
		
		driver.findElement(By.xpath("//*[@id=\"signin\"]/div[3]/div[2]/a")).click();
		System.out.println("STEP 01 | Click on Reset Password ");
		common.log("<br><br>STEP 01 | Click on Reset Password  ");
		common.pause(30);

		driver.findElement(By.xpath("//*[@id='browserYesButton']")).click();
		common.pause(20);
		
		driver.findElement(By.xpath("//*[@id=\"validationDefaultUsername\"]")).sendKeys("qa2@mailinator.com");
		System.out.println("STEP 02 | Enter Email Address ");
		common.log("<br><br>STEP 02 | Enter Email Address ");				
		common.pause(10);
		
		driver.findElement(By.xpath("//*[@id=\"sendMail\"]")).click();
		System.out.println("STEP 03 | Click on Sent Email Button ");
		common.log("<br><br>STEP 03 | Click on Sent Email Button ");				
		common.pause(10);
		
		driver.findElement(By.xpath("//*[@id='browserYesButton']")).click();
		common.pause(20);
		
		driver.findElement(By.xpath("//*[@id=\"ds-notification-container\"]/div")).isDisplayed();
		System.out.println("STEP 04 | Verify Successfully Send Email to Reset ");
		common.log("<br><br>STEP 04 | Verify Successfully Send Email to Reset ");				
		common.pause(10);
  }

  public void Verify_to_fill_My_Profile() throws InterruptedException, IOException{
      
		verify_login_details_of_admin();
		common.pause(40);
		
		driver.findElement(By.xpath("//*[@id=\"userDropdown\"]/span")).click();
		System.out.println("STEP 06 | Click on My Account ");
		common.log("<br><br>STEP 06 | Click on My Account  ");
		common.pause(10);
		
		driver.findElement(By.xpath("//html/body/nav/ul/li/div/a[1]")).isDisplayed();
		System.out.println("STEP 07 | Click on My Account ");
		common.log("<br><br>STEP 07 | Click on My Account  ");
		common.pause(10);
		
		driver.findElement(By.xpath("//html/body/nav/ul/li/div/a[2]")).isDisplayed();
		System.out.println("STEP 08 | Verify Logout ");
		common.log("<br><br>STEP 08 | Verify Logout  ");
		common.pause(10);
}

  public void Verify_to_Search_User() throws InterruptedException, IOException{
      
	  Verify_to_check_dates_functionality();
	  common.pause(40);
	
	  driver.findElement(By.xpath("//*[@id=\"tabcontent\"]/div/div/div[2]/div[1]/div/div[1]/span/span/span/span[3]/span")).click();
	  System.out.println("STEP 09 | Click on User Dropdown ");
	  common.log("<br><br>STEP 09 | Click on User Dropdown ");
	  Actions builder = new Actions(driver);
	  builder.sendKeys(Keys.ARROW_UP);
	  builder.sendKeys(Keys.ENTER);
	  common.pause(10);
		
  }
  
public void Verify_to_display_Chart_Properly_after_refresh_page() throws InterruptedException, IOException{
      
	  Verify_to_check_dates_functionality();
	  common.pause(40);
}

public void Verify_to_view_Manage_ICD_10() throws InterruptedException, IOException{
    
	verify_login_details_of_admin();
	common.pause(40);
	
	driver.findElement(By.xpath("//html/body/div[3]/div[1]/ul/li[7]/div/span[1]")).click();
	System.out.println("STEP 07 | Click on Coding Tools ");
	common.log("<br><br>STEP 07 | Click on Coding Tools  ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"menu_manage_icd10\"]/span")).click();
	System.out.println("STEP 08 | Click on Manage ICD 10 ");
	common.log("<br><br>STEP 08 | Click on Manage ICD 10  ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"panel1\"]/span")).isDisplayed();
	System.out.println("STEP 09 | Verify Manage ICD 10 ");
	common.log("<br><br>STEP 09 | Verify Manage ICD 10  ");
	common.pause(10);
	
}

public void Verify_to_view_Manage_CPT() throws InterruptedException, IOException{
    
	verify_login_details_of_admin();
	common.pause(40);
	
	driver.findElement(By.xpath("//html/body/div[3]/div[1]/ul/li[7]/div/span[1]")).click();
	System.out.println("STEP 07 | Click on Coding Tools ");
	common.log("<br><br>STEP 07 | Click on Coding Tools  ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"menu_manage_cpt\"]/span")).click();
	System.out.println("STEP 08 | Click on Manage CPT ");
	common.log("<br><br>STEP 08 | Click on Manage CPT  ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"panel1\"]/span")).isDisplayed();
	System.out.println("STEP 09 | Verify Manage CPT ");
	common.log("<br><br>STEP 09 | Verify Manage CPT ");
	common.pause(10);
	
}

public void Verify_to_Select_Date_In_Calendar() throws InterruptedException, IOException{
    
	Verify_to_check_dates_functionality();
	common.pause(40);
	
	driver.findElement(By.xpath("//*[@id=\"calendar_icon_div0\"]/span")).click();
	System.out.println("STEP 09 | Click on Calendar ");
	common.log("<br><br>STEP 09 | Click on Calendar ");
	common.pause(10);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/ol/li[2]/div/div[2]/div[2]/table/tbody/tr[3]/td[2]")).click();
	System.out.println("STEP 10 | Select Starting Date ");
	common.log("<br><br>STEP 10 | Select Starting Date ");
	common.pause(10);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/ol/li[2]/div/div[2]/div[2]/table/tbody/tr[5]/td[2]")).click();
	System.out.println("STEP 11 | Select Ending Date ");
	common.log("<br><br>STEP 11 | Select Ending Date ");
	common.pause(10);
	driver.findElement(By.xpath("//*[@id=\"tabcontent\"]/div/div/div[2]/div[1]/div/div[1]")).click();
	common.pause(10);
}

public void Verify_to_display_valid_error_message_when_user_didnt_enter_Email_Address() throws InterruptedException, IOException{
    
		common.pause(10);

		driver.findElement(By.xpath("//*[@id='browserYesButton']")).click();
		common.pause(20);
		
		System.out.println("STEP 01 | Open URL ");
		common.log("<br><br>STEP 01 | Open URL ");
		common.pause(10);
		
		System.out.println("STEP 02 | Enter Email address of Admin ");
		common.log("<br><br>STEP 02 | Enter Email address of Admin  ");
		WebElement email = driver.findElement(By.xpath("//*[@id='validationDefaultUsername']"));
		email.click();
		common.pause(20);
	
		driver.findElement(By.xpath("//*[@id=\"signin\"]/div[1]/div/span")).isDisplayed();
		System.out.println("STEP 03 | Verify Error Message Display When Email address is empty ");
		common.log("<br><br>STEP 03 | Verify Error Message Display When Email address is empty  ");
		common.pause(10);
}

public void Verify_to_Find_by_data_First_Name() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	
	WebElement ManageUsers_button = driver.findElement(By.xpath("//*[@id='menu_manage_users']/span"));
	ManageUsers_button.click();
	System.out.println("STEP 06 | Click on Manage Users button ");
	common.log("<br><br>STEP 06 | Click on Manage Users button ");
	common.pause(40);
	
	driver.findElement(By.xpath("//*[@id=\"namefirst\"]")).sendKeys("Site");
	System.out.println("STEP 06 | Enter First Name ");
	common.log("<br><br>STEP 06 | Enter First Name ");
	common.pause(20);
}

public void Verify_to_View_Chart_Loader() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"chartloadertabid\"]/span[2]")).click();
	System.out.println("STEP 06 | Click on Chart Loader Tab ");
	common.log("<br><br>STEP 06 | Click on Chart Loader Tab ");
	common.pause(20);
}

public void Verify_to_Find_data_By_CPT() throws InterruptedException, IOException{
    
	Verify_to_view_Manage_CPT();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"find\"]")).sendKeys("0001M");
	System.out.println("STEP 10 | Enter CPT Number ");
	common.log("<br><br>STEP 10 | Enter CPT Number ");
	common.pause(20);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/ul/li[1]/div/div[2]/div/div[2]/table/tbody/tr/td[2]")).isDisplayed();
	System.out.println("STEP 11 | Verify It display CPT ");
	common.log("<br><br>STEP 11 | Verify It display CPT ");
	common.pause(20);
}

public void Verify_to_Update_CPT() throws InterruptedException, IOException{
    
	Verify_to_Find_data_By_CPT();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"cpt_grid\"]/div[2]/table/tbody/tr/td[5]/a")).click();
	System.out.println("STEP 12 | Click on Edit Button ");
	common.log("<br><br>STEP 12 | Click on Edit Button ");
	common.pause(20);

	driver.findElement(By.xpath("//*[@id=\"cpt_grid\"]/div[2]/table/tbody/tr/td[2]/input")).sendKeys("q");
	System.out.println("STEP 13 | Edit Descriptions ");
	common.log("<br><br>STEP 13 | Edit Descriptions ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"cpt_grid\"]/div[2]/table/tbody/tr/td[5]/a[2]")).click();
	System.out.println("STEP 14 | Click on Update Button ");
	common.log("<br><br>STEP 14 | Click on Update Button ");
	common.pause(20);
}

public void Verify_to_Add_DSGCC() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//html/body/div[3]/div[1]/ul/li[7]/div/span[1]")).click();
	System.out.println("STEP 07 | Click on Coding Tools ");
	common.log("<br><br>STEP 07 | Click on Coding Tools  ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"menu_manage_dsgcc\"]/span")).click();
	System.out.println("STEP 08 | Click on DSGCC ");
	common.log("<br><br>STEP 08 | Click on DSGCC ");
	common.pause(10);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[1]/div/div[1]/div/div[2]/div[2]/div[1]/label/span")).click();
	System.out.println("STEP 09 | Select Risk Level ");
	common.log("<br><br>STEP 09 | Select Risk Level ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"tabcontent\"]/div/div/div/div[1]/div/div[3]/div[1]/div/label[2]/span")).click();
	System.out.println("STEP 10 | Select Type ");
	common.log("<br><br>STEP 10 | Select Type ");
	common.pause(10);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[3]/div/div/table/tbody/tr[1]/td[3]")).isDisplayed();
	System.out.println("STEP 11 | Verify It display Manage DSGCC ");
	common.log("<br><br>STEP 11 | Verify It display Manage DSGCC ");
	common.pause(10);
}

public void Verify_to_Find_Manage_ICD_10_by_Diagnosis_Code() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//html/body/div[3]/div[1]/ul/li[7]/div/span[1]")).click();
	System.out.println("STEP 07 | Click on Coding Tools ");
	common.log("<br><br>STEP 07 | Click on Coding Tools ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"menu_manage_icd10\"]")).click();
	System.out.println("STEP 08 | Click on Manage ICD 10 ");
	common.log("<br><br>STEP 08 | Click on Manage ICD 10 ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"icd10_find_diagnosis_code\"]")).sendKeys("A00.0");
	System.out.println("STEP 09 | Enter Diagnosis Code ");
	common.log("<br><br>STEP 09 | Enter Diagnosis Code ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"icd10_grid\"]/table/tbody/tr/td[2]")).isDisplayed();
	System.out.println("STEP 10 | Verfiy Diagnosis List Displayed ");
	common.log("<br><br>STEP 10 | Verfiy Diagnosis List Displayed ");
	common.pause(10);
	
}

public void Verify_to_delete_DSGCC() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//html/body/div[3]/div[1]/ul/li[7]/div/span[1]")).click();
	System.out.println("STEP 07 | Click on Coding Tools ");
	common.log("<br><br>STEP 07 | Click on Coding Tools  ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"menu_manage_dsgcc\"]/span")).click();
	System.out.println("STEP 08 | Click on DSGCC ");
	common.log("<br><br>STEP 08 | Click on DSGCC ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"manage_dsgcc_grid\"]/table/tbody/tr[1]/td[5]/a[2]")).click();
	System.out.println("STEP 09 | Click on Delete Button ");
	common.log("<br><br>STEP 09 | Click on Delete Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"noButton\"]")).click();
	System.out.println("STEP 10 | Click on No Button ");
	common.log("<br><br>STEP 10 | Click on No Button ");
	common.pause(10);
}

public void Verify_to_Find_by_Text_1_DSGCC() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//html/body/div[3]/div[1]/ul/li[7]/div/span[1]")).click();
	System.out.println("STEP 07 | Click on Coding Tools ");
	common.log("<br><br>STEP 07 | Click on Coding Tools  ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"menu_manage_dsgcc\"]/span")).click();
	System.out.println("STEP 08 | Click on DSGCC ");
	common.log("<br><br>STEP 08 | Click on DSGCC ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"stext1\"]")).sendKeys("Qa");
	System.out.println("STEP 09 | Enter Text 1 to find ");
	common.log("<br><br>STEP 09 | Enter Text 1 to find ");
	common.pause(10);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[3]/div/div/table/tbody/tr[1]/td[3]")).click();
	System.out.println("STEP 10 | Verify it display DSGCC List ");
	common.log("<br><br>STEP 10 | Verify it display DSGCC List ");
	common.pause(10);
}

public void Verify_to_View_Item_per_page() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//html/body/div[3]/div[1]/ul/li[7]/div/span[1]")).click();
	System.out.println("STEP 07 | Click on Coding Tools ");
	common.log("<br><br>STEP 07 | Click on Coding Tools  ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"menu_manage_dsgcc\"]/span")).click();
	System.out.println("STEP 08 | Click on DSGCC ");
	common.log("<br><br>STEP 08 | Click on DSGCC ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"manage_dsgcc_grid\"]/div/a[3]")).click();
	System.out.println("STEP 09 | Click on Page ");
	common.log("<br><br>STEP 09 | Click on Page ");
	common.pause(10);
	
}

public void Verify_to_View_Sequence() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//html/body/div[3]/div[1]/ul/li[6]/div/span[1]")).click();
	System.out.println("STEP 07 | Click on Utilities ");
	common.log("<br><br>STEP 07 | Click on Utilities ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"menu_utilities\"]/span")).click();
	System.out.println("STEP 08 | Click on Utilities ");
	common.log("<br><br>STEP 08 | Click on Utilities ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"sequence\"]/span[2]")).click();
	System.out.println("STEP 08 | Click on Sequence ");
	common.log("<br><br>STEP 08 | Click on Sequence ");
	common.pause(10);
}

public void Verify_to_Clear_All() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//html/body/div[3]/div[1]/ul/li[7]/div/span[1]")).click();
	System.out.println("STEP 07 | Click on Coding Tools ");
	common.log("<br><br>STEP 07 | Click on Coding Tools  ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"menu_manage_dsgcc\"]/span")).click();
	System.out.println("STEP 08 | Click on DSGCC ");
	common.log("<br><br>STEP 08 | Click on DSGCC ");
	common.pause(10);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[1]/div/div[1]/div/div[2]/div[2]/div[1]/label/span")).click();
	System.out.println("STEP 09 | Select Risk Level ");
	common.log("<br><br>STEP 09 | Select Risk Level ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"tabcontent\"]/div/div/div/div[1]/div/div[3]/div[1]/div/label[2]/span")).click();
	System.out.println("STEP 10 | Select Type ");
	common.log("<br><br>STEP 10 | Select Type ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"clear_findtext\"]")).click();
	System.out.println("STEP 11 | Click on Clear All Button ");
	common.log("<br><br>STEP 11 | Click on Clear All Button ");
	common.pause(10);
}

public void Verify_to_View_Panel_Bars() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	
	WebElement ManageUsers_button = driver.findElement(By.xpath("//*[@id='menu_manage_users']/span"));
	ManageUsers_button.click();
	System.out.println("STEP 06 | Click on Manage Users button ");
	common.log("<br><br>STEP 06 | Click on Manage Users button ");
	common.pause(40);
	
	driver.findElement(By.xpath("//*[@id=\"manage_user_tabstrip2\"]/ul/li[4]/span[2]")).click();
	System.out.println("STEP 06 | Click on PanelBar Tab ");
	common.log("<br><br>STEP 06 | Click on PanelBar Tab ");
	common.pause(20);
}

public void Verify_to_edit_Notes() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//html/body/div[3]/div[1]/ul/li[7]/div/span[1]")).click();
	System.out.println("STEP 07 | Click on Coding Tools ");
	common.log("<br><br>STEP 07 | Click on Coding Tools ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"menu_manage_icd10\"]")).click();
	System.out.println("STEP 08 | Click on Manage ICD 10 ");
	common.log("<br><br>STEP 08 | Click on Manage ICD 10 ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"icd10_grid\"]/table/tbody/tr[2]/td[5]")).click();
	System.out.println("STEP 09 | Click on Edit Button ");
	common.log("<br><br>STEP 09 | Click on Edit Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"icd10_grid\"]/table/tbody/tr[2]/td[2]/input")).sendKeys("AA");
	System.out.println("STEP 10 | Edit Description ");
	common.log("<br><br>STEP 10 | Edit Description ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"icd10_grid\"]/table/tbody/tr[2]/td[5]/a[1]")).click();
	System.out.println("STEP 11 | Click on Update Button ");
	common.log("<br><br>STEP 11 | Click on Update Button ");
	common.pause(10);
}

public void Verify_to_Add_MetaData_in_Chart_Loader() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"chartloadertabid\"]/span[2]")).click();
	System.out.println("STEP 06 | Click on Chart Loader Tab ");
	common.log("<br><br>STEP 06 | Click on Chart Loader Tab ");
	common.pause(20);
	
	Random rand = new Random(); 
	int rand_int1 = rand.nextInt(10000); 
	String number = String.valueOf(rand_int1);
	driver.findElement(By.xpath("//*[@id=\"meta_chartnumber\"]")).sendKeys(number);
	System.out.println("STEP 07 | Enter Chart Number ");
	common.log("<br><br>STEP 07 | Enter Chart Number ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[1]/div[2]/div[2]/div/div[2]/label")).click();
	common.pause(25);
	
	driver.findElement(By.xpath("//*[@id=\"meta_facility\"]")).sendKeys("34");
	System.out.println("STEP 08 | Enter Facility Number ");
	common.log("<br><br>STEP 08 | Enter Facility Number ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[1]/div[2]/div[2]/div/div[3]/div/label[1]/span")).click();
	System.out.println("STEP 09 | Select Chart Type ");
	common.log("<br><br>STEP 09 | Select Chart Type ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[1]/div[2]/div[3]/div/div/span/span/span[2]/span")).click();
	System.out.println("STEP 09 | Click on Visit Type ");
	common.log("<br><br>STEP 09 | Click on Visit Type ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[1]/div[2]/div[4]/div/div/label[4]/span")).click();
	System.out.println("STEP 10 | Select EMR ");
	common.log("<br><br>STEP 10 | Select EMR ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[2]/div/div[1]/div/div/label[2]/span")).click();
	System.out.println("STEP 11 | Select Classification ");
	common.log("<br><br>STEP 11 | Select Classification ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[2]/div/div[2]/div/div/div/label[2]")).click();
	System.out.println("STEP 12 | Select Downcode ");
	common.log("<br><br>STEP 12 | Select Downcode ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[2]/div/div[3]/div/div/div/ul/li[10]/span")).click();
	common.pause(15);
	
	driver.findElement(By.xpath("//*[@id=\"common_submit_btn\"]")).click();
	System.out.println("STEP 13 | Click on Submit Button ");
	common.log("<br><br>STEP 13 | Click on Submit Button ");
	common.pause(20);
}

public void Verify_to_Completed_New_Chart_Loader() throws InterruptedException, IOException{
    
	Verify_to_Add_MetaData_in_Chart_Loader();
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"BIPanel\"]/span")).click();
	System.out.println("STEP 12 | Click on Basic Information ");
	common.log("<br><br>STEP 12 | Click on Basic Information ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"BIForm\"]/div[2]/div/div[2]/div[1]/div[1]/label/span")).click();
	System.out.println("STEP 13 | Click on Complete Checkbox ");
	common.log("<br><br>STEP 13 | Click on Complete Checkbox ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"HPIPanel\"]/span")).click();
	System.out.println("STEP 14 | Click on History Of Present Illness ");
	common.log("<br><br>STEP 14 | Click on History Of Present Illness ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"HPIForm\"]/div[2]/div/div/div[1]/div[1]/label/span")).click();
	System.out.println("STEP 15 | Click on Complete Checkbox ");
	common.log("<br><br>STEP 15 | Click on Complete Checkbox ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"ROSPanel\"]/span")).click();
	System.out.println("STEP 16 | Click on Review of System ");
	common.log("<br><br>STEP 16 | Click on Review of System ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"ROSForm\"]/div[2]/div[1]/div[1]/label/span")).click();
	System.out.println("STEP 17 | Click on Complete Checkbox ");
	common.log("<br><br>STEP 17 | Click on Complete Checkbox ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"ORDPanel\"]/span")).click();
	System.out.println("STEP 18 | Click on Orders ");
	common.log("<br><br>STEP 18 | Click on Orders ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"ORDForm\"]/div[2]/div[1]/div[1]/label/span")).click();
	System.out.println("STEP 19 | Click on Complete Checkbox ");
	common.log("<br><br>STEP 19 | Click on Complete Checkbox ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"DSGCCPanel\"]/span")).click();
	System.out.println("STEP 20 | Click on DSGCC ");
	common.log("<br><br>STEP 20 | Click on DSGCC ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"DSGCCForm\"]/div[3]/div[1]/div/label/span")).click();
	System.out.println("STEP 21 | Click on Complete Checkbox ");
	common.log("<br><br>STEP 21 | Click on Complete Checkbox ");
	common.pause(10);

	driver.findElement(By.xpath("//*[@id=\"IPPanel\"]/span")).click();
	System.out.println("STEP 22 | Click on Impression Plan ");
	common.log("<br><br>STEP 22 | Click on Impression Plan ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"IPForm\"]/div[2]/div[1]/div[1]/label/span")).click();
	System.out.println("STEP 23 | Click on Complete Checkbox ");
	common.log("<br><br>STEP 23 | Click on Complete Checkbox ");
	common.pause(10);

	driver.findElement(By.xpath("//*[@id=\"WRPPanel\"]/span")).click();
	System.out.println("STEP 24 | Click on Impression Plan ");
	common.log("<br><br>STEP 24 | Click on Impression Plan ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"WRPForm\"]/div[3]/div[1]/div/label/span")).click();
	System.out.println("STEP 25 | Click on Complete Checkbox ");
	common.log("<br><br>STEP 25 | Click on Complete Checkbox ");
	common.pause(10);

}

public void Verify_to_view_HPI_Parser_tab() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"HPIParser\"]/span[2]")).click();
	System.out.println("STEP 06 | Click on HPI Parser tab ");
	common.log("<br><br>STEP 06 | Click on HPI Parser tab ");
	common.pause(10);
} 

public void Verify_to_Upload_Image_for_Mockups() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"chartloadertabid\"]/span[2]")).click();
	System.out.println("STEP 06 | Click on Chart Loader Tab ");
	common.log("<br><br>STEP 06 | Click on Chart Loader Tab ");
	common.pause(20);
}


public void Verify_to_view_Datagrid_Per_Page() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	System.out.println("STEP 07 | Click on Next Page ");
	common.log("<br><br>STEP 07 | Click on Next Page ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	System.out.println("STEP 08 | Click on Next Page ");
	common.log("<br><br>STEP 08 | Click on Next Page ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	System.out.println("STEP 09 | Click on Next Page ");
	common.log("<br><br>STEP 09 | Click on Next Page ");
	common.pause(20);
}

public void Verify_to_Show_Error_Message_In_Red_Color() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"chartloadertabid\"]/span[2]")).click();
	System.out.println("STEP 06 | Click on Chart Loader Tab ");
	common.log("<br><br>STEP 06 | Click on Chart Loader Tab ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"meta_chartnumber\"]")).click();
	System.out.println("STEP 07 | Enter Chart Number ");
	common.log("<br><br>STEP 07 | Enter Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"meta_facility\"]")).click();
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[1]/div[2]/div[2]/div/div[1]/span[1]")).click();
	System.out.println("STEP 08 | Verify It Display Error Message ");
	common.log("<br><br>STEP 08 | Verify It Display Error Message ");
	common.pause(10);
	
}

public void Verify_to_Remember_Chart_number() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);

	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[8]/td[2]")).click();
	System.out.println("STEP 06 | Select Chart Number ");
	common.log("<br><br>STEP 06 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 07 | Click on Load Button ");
	common.log("<br><br>STEP 07 | Click on Load Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[4]/div/div[2]/div/button[3]")).isDisplayed();
	System.out.println("STEP 08 | Verify Select Chart Display ");
	common.log("<br><br>STEP 08 | Verify Select Chart Display ");
	common.pause(10);
}

public void Verify_that_if_checkbox_is_checked_then_it_should_disable_dropdown() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"chartloadertabid\"]/span[2]")).click();
	System.out.println("STEP 06 | Click on Chart Loader Tab ");
	common.log("<br><br>STEP 06 | Click on Chart Loader Tab ");
	common.pause(20);
	
	Random rand = new Random(); 
	int rand_int1 = rand.nextInt(10000); 
	String number = String.valueOf(rand_int1);
	driver.findElement(By.xpath("//*[@id=\"meta_chartnumber\"]")).sendKeys(number);
	System.out.println("STEP 07 | Enter Chart Number ");
	common.log("<br><br>STEP 07 | Enter Chart Number ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"meta_facility\"]")).sendKeys("34");
	System.out.println("STEP 08 | Enter Facility Number ");
	common.log("<br><br>STEP 08 | Enter Facility Number ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[1]/div[2]/div[2]/div/div[3]/div/label[1]/span")).click();
	System.out.println("STEP 09 | Select Chart Type ");
	common.log("<br><br>STEP 09 | Select Chart Type ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[1]/div[2]/div[3]/div/div/span/span/span[2]/span")).click();
	System.out.println("STEP 09 | Click on Visit Type ");
	common.log("<br><br>STEP 09 | Click on Visit Type ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[1]/div[2]/div[4]/div/div/label[2]")).click();
	System.out.println("STEP 10 | Select EMR ");
	common.log("<br><br>STEP 10 | Select EMR ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[2]/div/div[1]/div/div/label[2]/span")).click();
	System.out.println("STEP 10 | Select Classification ");
	common.log("<br><br>STEP 10 | Select Classification ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[2]/div/div[2]/div/div/div/label[2]/span")).click();
	System.out.println("STEP 10 | Select Downcode ");
	common.log("<br><br>STEP 10 | Select Downcode ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[1]/div[2]/div[1]/div[1]/label/span")).click();
	System.out.println("STEP 11 | Click on Complete Checkbox ");
	common.log("<br><br>STEP 11 | Click on Complete Checkbox ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"common_submit_btn\"]")).click();
	System.out.println("STEP 12 | Click on Submit Button ");
	common.log("<br><br>STEP 12 | Click on Submit Button ");
	common.pause(10);
}

public void Verify_to_tickers_button_on_Metadata() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"MD_FINDForm\"]/div/div[3]/div/div[4]/div/div/div/ul/li[6]/span")).click();
	System.out.println("STEP 06 | Select Tickers from Page ");
	common.log("<br><br>STEP 06 | Select Tickers from Page ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"MD_FINDForm\"]/div/div[3]/div/div[4]/div/div/div/ul/li[15]/span")).click();
	System.out.println("STEP 07 | Select Tickers from Page ");
	common.log("<br><br>STEP 07 | Select Tickers from Page ");
	common.pause(10);
}

public void Verify_to_reset_data_in_Chart_Finder_MetaData() throws InterruptedException, IOException{
	
	Verify_to_tickers_button_on_Metadata();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"reset_filter\"]")).click();
	System.out.println("STEP 08 | Click on Reset Button ");
	common.log("<br><br>STEP 08 | Click on Reset Button ");
	common.pause(10);
	
}

public void Verify_to_dont_load_chart_data_when_no_data_selected() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 07 | Click on Load Button ");
	common.log("<br><br>STEP 07 | Click on Load Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"findmessage\"]")).isDisplayed();
	System.out.println("STEP 08 | Verify It display Error Message ");
	common.log("<br><br>STEP 08 | Verify It display Error Message ");
	common.pause(10);
}

public void Verify_to_Refresh_page_and_it_Reset_Chart() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);

	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[8]/td[2]")).click();
	System.out.println("STEP 06 | Select Chart Number ");
	common.log("<br><br>STEP 06 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 07 | Click on Load Button ");
	common.log("<br><br>STEP 07 | Click on Load Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[4]/div/div[2]/div/button[3]")).isDisplayed();
	System.out.println("STEP 08 | Verify Select Chart Display ");
	common.log("<br><br>STEP 08 | Verify Select Chart Display ");
	common.pause(10);
}

public void Verify_to_select_Visit_type_Classification_and_EMR_filter_to_search_Chart_list() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"MD_FINDForm\"]/div/div[2]/div/div[3]/div/div/label[3]/span")).click();
	System.out.println("STEP 06 | Select EMR option ");
	common.log("<br><br>STEP 06 | Select EMR option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"MD_FINDForm\"]/div/div[2]/div/div[1]/div/div[3]/div/label[1]")).click();
	System.out.println("STEP 07 | Select Chart Type option ");
	common.log("<br><br>STEP 07 | Select Chart Type option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"MD_FINDForm\"]/div/div[3]/div/div[1]/div/div/label[2]/span")).click();
	System.out.println("STEP 08 | Select Classification option ");
	common.log("<br><br>STEP 08 | Select Classification option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"MD_FINDForm\"]/div/div[3]/div/div[2]/div/div/div/label[2]/span")).click();
	System.out.println("STEP 09 | Select Downcoded option ");
	common.log("<br><br>STEP 09 | Select Downcoded option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"MD_FINDForm\"]/div/div[3]/div/div[3]/div/div/label[2]/span")).click();
	System.out.println("STEP 10 | Select Status option ");
	common.log("<br><br>STEP 10 | Select Status option ");
	common.pause(10);
	
}

public void Verify_to_Asterisks_shouldnt_display_if_complete_checkbox_is_checked() throws InterruptedException, IOException{
    
	common.pause(20);
	Verify_to_Add_MetaData_in_Chart_Loader();
	common.pause(20);
	
}

public void Verify_to_view_New_Chart_button() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);

	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[8]/td[2]")).click();
	System.out.println("STEP 06 | Select Chart Number ");
	common.log("<br><br>STEP 06 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 07 | Click on Load Button ");
	common.log("<br><br>STEP 07 | Click on Load Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"loadnewchart\"]")).isDisplayed();
	System.out.println("STEP 08 | Verify New Chart Button Display ");
	common.log("<br><br>STEP 08 | Verify New Chart Button Display ");
	common.pause(10);
}

public void Verify_to_Delete_Selected_Chart() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);

	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[8]/td[2]")).click();
	System.out.println("STEP 06 | Select Chart Number ");
	common.log("<br><br>STEP 06 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"deletecharts\"]")).click();
	System.out.println("STEP 07 | Click on Delete Button ");
	common.log("<br><br>STEP 07 | Click on Delete Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//button[text()='NO']")).click();
	System.out.println("STEP 08 | Click on Yes Button ");
	common.log("<br><br>STEP 08 | Click on Yes Button ");
	common.pause(20);
	
}

public void Verify_to_load_selected_chart_in_Chart_Loader() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);

	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[8]/td[2]")).click();
	System.out.println("STEP 06 | Select Chart Number ");
	common.log("<br><br>STEP 06 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[6]/td[2]")).click();
	System.out.println("STEP 07 | Select Chart Number ");
	common.log("<br><br>STEP 07 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[5]/td[2]")).click();
	System.out.println("STEP 08 | Select Chart Number ");
	common.log("<br><br>STEP 08 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[3]/td[2]")).click();
	System.out.println("STEP 09 | Select Chart Number ");
	common.log("<br><br>STEP 09 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[4]/td[2]")).click();
	System.out.println("STEP 10 | Select Chart Number ");
	common.log("<br><br>STEP 10 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 11 | Click on Load Button ");
	common.log("<br><br>STEP 11 | Click on Load Button ");
	common.pause(20);
	
}

public void Veriy_to_Find_Chart_and_Display_Basic_Information_Correctly() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);

	driver.findElement(By.xpath("//*[@id=\"findchartnumber\"]")).sendKeys("21");
	System.out.println("STEP 06 | Enter Chart Number ");
	common.log("<br><br>STEP 06 | Enter Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[4]/td[2]")).click();
	System.out.println("STEP 07 | Select Chart Number ");
	common.log("<br><br>STEP 07 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 08 | Click on Load Button ");
	common.log("<br><br>STEP 08 | Click on Load Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"BIPanel\"]/span")).click();
	System.out.println("STEP 09 | Verify Basic Information Tab ");
	common.log("<br><br>STEP 09 | Verify Basic Information Tab ");
	common.pause(20);
	
}

public void Verify_to_Find_Chart_and_Display_HPI_Parser() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);

	driver.findElement(By.xpath("//*[@id=\"findchartnumber\"]")).sendKeys("21");
	System.out.println("STEP 06 | Enter Chart Number ");
	common.log("<br><br>STEP 06 | Enter Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[4]/td[2]")).click();
	System.out.println("STEP 07 | Select Chart Number ");
	common.log("<br><br>STEP 07 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 08 | Click on Load Button ");
	common.log("<br><br>STEP 08 | Click on Load Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"HPIPanel\"]/span")).click();
	System.out.println("STEP 09 | Click on HPI Tab ");
	common.log("<br><br>STEP 09 | Click on HPI Tab ");
	common.pause(20);
	
}

public void Verify_that_if_Complete_checkbox_is_checked_then_it_should_disable_all_the_things() throws InterruptedException, IOException{
    
	common.pause(20);
	Verify_to_Completed_New_Chart_Loader();
	common.pause(20);
}

public void Veriy_to_display_Message_for_Submit_button() throws InterruptedException, IOException{
    
	common.pause(20);
	Verify_to_Completed_New_Chart_Loader();
	common.pause(20);
}

public void Verify_When_user_Create_New_Chart_it_display_Asterisks() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"chartloadertabid\"]/span[2]")).click();
	System.out.println("STEP 06 | Click on Chart Loader Tab ");
	common.log("<br><br>STEP 06 | Click on Chart Loader Tab ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"chart_loader_tabstrip\"]/ul/li[1]/span[2]")).click();
	System.out.println("STEP 07 | Click on Chart Finder Tab ");
	common.log("<br><br>STEP 07 | Click on Chart Finder Tab ");
	common.pause(20);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[8]/td[2]")).click();
	System.out.println("STEP 08 | Select Chart Number ");
	common.log("<br><br>STEP 08 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 09 | Click on Load Button ");
	common.log("<br><br>STEP 09 | Click on Load Button ");
	common.pause(20);
	
}


public void Verify_that_when_user_click_on_New_Chart_button_it_clear_fields() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"chartloadertabid\"]/span[2]")).click();
	System.out.println("STEP 06 | Click on Chart Loader Tab ");
	common.log("<br><br>STEP 06 | Click on Chart Loader Tab ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"chart_loader_tabstrip\"]/ul/li[1]/span[2]")).click();
	System.out.println("STEP 07 | Click on Chart Finder Tab ");
	common.log("<br><br>STEP 07 | Click on Chart Finder Tab ");
	common.pause(20);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[8]/td[2]")).click();
	System.out.println("STEP 08 | Select Chart Number ");
	common.log("<br><br>STEP 08 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 09 | Click on Load Button ");
	common.log("<br><br>STEP 09 | Click on Load Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"loadnewchart\"]")).click();
	System.out.println("STEP 10 | Click on New Chart Button ");
	common.log("<br><br>STEP 10 | Click on New Chart Button ");
	common.pause(20);
}


public void Verify_to_deselect_chart_from_selected_charts() throws InterruptedException, IOException{
    
	common.pause(20);
	Verify_to_load_selected_chart_in_Chart_Loader();
	common.pause(20);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[6]/td[2]")).click();
	System.out.println("STEP 07 | Deselect Chart Number ");
	common.log("<br><br>STEP 07 | Deselect Chart Number ");
	common.pause(10);
}

public void Verify_to_display_error_message_when_required_fields_are_empty() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"chartloadertabid\"]/span[2]")).click();
	System.out.println("STEP 06 | Click on Chart Loader Tab ");
	common.log("<br><br>STEP 06 | Click on Chart Loader Tab ");
	common.pause(20);
	
	Random rand = new Random(); 
	int rand_int1 = rand.nextInt(10000); 
	String number = String.valueOf(rand_int1);
	driver.findElement(By.xpath("//*[@id=\"meta_chartnumber\"]")).sendKeys(number);
	System.out.println("STEP 07 | Enter Chart Number ");
	common.log("<br><br>STEP 07 | Enter Chart Number ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[1]/div[2]/div[2]/div/div[2]/label")).click();
	common.pause(25);
	
	driver.findElement(By.xpath("//*[@id=\"common_submit_btn\"]")).click();
	System.out.println("STEP 08 | Click on Submit Button ");
	common.log("<br><br>STEP 08 | Click on Submit Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[1]/div[2]/div[2]/div/div[2]/span")).isDisplayed();
	System.out.println("STEP 09 | Verify Error Message Display ");
	common.log("<br><br>STEP 09 | Verify Error Message Display ");
	common.pause(10);
}

public void Verify_to_redirect_HPI_Parser_tab_when_user_click_on_HPI_Parser_button() throws InterruptedException, IOException{
    
	common.pause(20);
	Verify_to_Add_MetaData_in_Chart_Loader();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"HPIPanel\"]/span")).click();
	System.out.println("STEP 12 | Click on HPI Option ");
	common.log("<br><br>STEP 12 | Click on HPI Option ");
	common.pause(10);	
	
	driver.findElement(By.xpath("//*[@id=\"openhpiparsetab\"]")).click();
	System.out.println("STEP 13 | Click on HPI Parser Button ");
	common.log("<br><br>STEP 13 | Click on HPI Parser Button ");
	common.pause(10);	
}

public void Verify_to_add_multiple_HPI_Parser() throws InterruptedException, IOException{
    
	common.pause(20);
	Verify_to_Add_MetaData_in_Chart_Loader();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"HPIPanel\"]/span")).click();
	System.out.println("STEP 14 | Click on HPI Option ");
	common.log("<br><br>STEP 14 | Click on HPI Option ");
	common.pause(10);	
	
	driver.findElement(By.xpath("//*[@id=\"openhpiparsetab\"]")).click();
	System.out.println("STEP 15 | Click on HPI Parser Button ");
	common.log("<br><br>STEP 15 | Click on HPI Parser Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"toparse\"]")).sendKeys("Testing Data");
	System.out.println("STEP 16 | Enter HPI Parser Text ");
	common.log("<br><br>STEP 16 | Enter HPI Parser Text ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"chart_loader_tabstrip-3\"]/div/div[2]/input")).click();
	System.out.println("STEP 17 | Click on Parse it button ");
	common.log("<br><br>STEP 17 | Click on Parse it button ");
	common.pause(10);
	
}

public void Verify_to_select_only_one_option_in_History_of_Present_illness_option() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"chart_loader_tabstrip\"]/ul/li[1]/span[2]")).click();
	System.out.println("STEP 06 | Click on Chart Finder Tab ");
	common.log("<br><br>STEP 06 | Click on Chart Finder Tab ");
	common.pause(20);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[8]/td[2]")).click();
	System.out.println("STEP 07 | Select Chart Number ");
	common.log("<br><br>STEP 07 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 08 | Click on Load Button ");
	common.log("<br><br>STEP 08 | Click on Load Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"tabcontent\"]/div/div/div/div[4]/div/div[1]/span/span[2]/span/span[2]")).click();
	System.out.println("STEP 09 | Click on Unlock Button ");
	common.log("<br><br>STEP 09 | Click on Unlock Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"HPIPanel\"]")).click();
	System.out.println("STEP 10 | Click on History of Present Option ");
	common.log("<br><br>STEP 10 | Click on History of Present Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"HPIForm\"]/div[2]/div/div/div[1]/div[1]/label/span")).click();
	System.out.println("STEP 11 | Click on Complete Button ");
	common.log("<br><br>STEP 11 | Click on Complete Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"HPIForm\"]/div[2]/div/div/div[2]/div[3]/div/div[1]/label/span")).click();
	System.out.println("STEP 12 | Click on Establish Option ");
	common.log("<br><br>STEP 12 | Click on Establish Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"HPIForm\"]/div[2]/div/div/div[2]/div[3]/div/div[2]/div/label/span")).click();
	System.out.println("STEP 13 | Click on Stable Option ");
	common.log("<br><br>STEP 13 | Click on Stable Option ");
	common.pause(10);
	
}


public void Verify_to_upload_bulk_images() throws InterruptedException, IOException{
    
	common.pause(20);
	Verify_to_Add_MetaData_in_Chart_Loader();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"bulkupload\"]")).sendKeys("/Users/mac/Downloads/102");
	System.out.println("STEP 14 | Click on Bulk Upload button ");
	common.log("<br><br>STEP 14 | Click on Bulk Upload button ");
	common.pause(10);
}

public void Verify_to_remove_error_message_when_radio_button_selected() throws InterruptedException, IOException{
    
	common.pause(20);
	Verify_to_display_error_message_when_required_fields_are_empty();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[1]/div[2]/div[4]/div/div/label[5]/span")).click();
	System.out.println("STEP 10 | Select EMR ");
	common.log("<br><br>STEP 10 | Select EMR ");
	common.pause(10);
	
	System.out.println("STEP 11 | Verify Error Message Not Display ");
	common.log("<br><br>STEP 11 | Verify Error Message Not Display ");
	common.pause(10);
	
}

public void Verify_to_view_all_tabs() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"chart_loader_tabstrip\"]/ul/li[1]/span[2]")).click();
	System.out.println("STEP 06 | Click on Chart Finder Tab ");
	common.log("<br><br>STEP 06 | Click on Chart Finder Tab ");
	common.pause(20);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[8]/td[2]")).click();
	System.out.println("STEP 07 | Select Chart Number ");
	common.log("<br><br>STEP 07 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 08 | Click on Load Button ");
	common.log("<br><br>STEP 08 | Click on Load Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"tabcontent\"]/div/div/div/div[4]/div/div[1]/span/span[2]/span/span[2]")).click();
	System.out.println("STEP 09 | Click on Unlock Button ");
	common.log("<br><br>STEP 09 | Click on Unlock Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"HPIPanel\"]")).click();
	System.out.println("STEP 10 | Click on History of Present Option ");
	common.log("<br><br>STEP 10 | Click on History of Present Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"ROSPanel\"]/span")).click();
	System.out.println("STEP 11 | Click on Review of System Option ");
	common.log("<br><br>STEP 11 | Click on Review of System Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"PFSHPanel\"]/span")).click();
	System.out.println("STEP 12 | Click on Past Medical History Option ");
	common.log("<br><br>STEP 12 | Click on Past Medical History Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"PEPanel\"]/span")).click();
	System.out.println("STEP 13 | Click on Physical Examination Option ");
	common.log("<br><br>STEP 13 | Click on Physical Examination Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"ORDPanel\"]/span")).click();
	System.out.println("STEP 14 | Click on Orders Option ");
	common.log("<br><br>STEP 14 | Click on Orders Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"IPPanel\"]/span")).click();
	System.out.println("STEP 15 | Click on Impression Plan Option ");
	common.log("<br><br>STEP 15 | Click on Impression Plan Option ");
	common.pause(10);

	driver.findElement(By.xpath("//*[@id=\"AAPanel\"]/span")).click();
	System.out.println("STEP 16 | Click on Addenda Option ");
	common.log("<br><br>STEP 16 | Click on Addenda Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"WRPPanel\"]/span")).click();
	System.out.println("STEP 17 | Click on Answer Key Option ");
	common.log("<br><br>STEP 17 | Click on Answer Key Option ");
	common.pause(10);
}

public void Verify_to_select_dropdown_list_in_MetaData() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"chart_loader_tabstrip\"]/ul/li[1]/span[2]")).click();
	System.out.println("STEP 06 | Click on Chart Finder Tab ");
	common.log("<br><br>STEP 06 | Click on Chart Finder Tab ");
	common.pause(20);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[8]/td[2]")).click();
	System.out.println("STEP 07 | Select Chart Number ");
	common.log("<br><br>STEP 07 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 08 | Click on Load Button ");
	common.log("<br><br>STEP 08 | Click on Load Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"tabcontent\"]/div/div/div/div[4]/div/div[1]/span/span[2]/span/span[2]")).click();
	System.out.println("STEP 09 | Click on Unlock Button ");
	common.log("<br><br>STEP 09 | Click on Unlock Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[1]/div[2]/div[1]/div[1]/label/span")).click();
	System.out.println("STEP 10 | Click on Complete Button ");
	common.log("<br><br>STEP 10 | Click on Complete Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[2]/div/div[2]/div/div/div/label[1]/span")).click();
	System.out.println("STEP 11 | Click on Yes Option ");
	common.log("<br><br>STEP 11 | Click on Yes Option ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[2]/div/div[2]/div/div/span[2]/span/span[1]")).click();
	System.out.println("STEP 12 | Select Dropdown Option ");
	common.log("<br><br>STEP 12 | Select Dropdown Option ");
	common.pause(20);
	
}

public void Verify_that_when_user_select_New_option_is_shouldnt_select_radio_button_in_HPI() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"chart_loader_tabstrip\"]/ul/li[1]/span[2]")).click();
	System.out.println("STEP 06 | Click on Chart Finder Tab ");
	common.log("<br><br>STEP 06 | Click on Chart Finder Tab ");
	common.pause(20);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[8]/td[2]")).click();
	System.out.println("STEP 07 | Select Chart Number ");
	common.log("<br><br>STEP 07 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 08 | Click on Load Button ");
	common.log("<br><br>STEP 08 | Click on Load Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"tabcontent\"]/div/div/div/div[4]/div/div[1]/span/span[2]/span/span[2]")).click();
	System.out.println("STEP 09 | Click on Unlock Button ");
	common.log("<br><br>STEP 09 | Click on Unlock Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"HPIPanel\"]")).click();
	System.out.println("STEP 10 | Click on History of Present Option ");
	common.log("<br><br>STEP 10 | Click on History of Present Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"HPIForm\"]/div[2]/div/div/div[1]/div[1]/label/span")).click();
	System.out.println("STEP 11 | Click on Complete Button ");
	common.log("<br><br>STEP 11 | Click on Complete Button ");
	common.pause(10);

	driver.findElement(By.xpath("//*[@id=\"HPIForm\"]/div[2]/div/div/div[2]/div[3]/div/div[1]/div/label/span")).click();
	System.out.println("STEP 12 | Select New Option ");
	common.log("<br><br>STEP 12 | Select New Option ");
	common.pause(10);
}

public void Verify_to_display_Message_when_user_make_change_in_MetaData_Pages() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"chart_loader_tabstrip\"]/ul/li[1]/span[2]")).click();
	System.out.println("STEP 06 | Click on Chart Finder Tab ");
	common.log("<br><br>STEP 06 | Click on Chart Finder Tab ");
	common.pause(20);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[8]/td[2]")).click();
	System.out.println("STEP 07 | Select Chart Number ");
	common.log("<br><br>STEP 07 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 08 | Click on Load Button ");
	common.log("<br><br>STEP 08 | Click on Load Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"tabcontent\"]/div/div/div/div[4]/div/div[1]/span/span[2]/span/span[2]")).click();
	System.out.println("STEP 09 | Click on Unlock Button ");
	common.log("<br><br>STEP 09 | Click on Unlock Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[1]/div[2]/div[4]/div/div/label[5]/span")).click();
	System.out.println("STEP 10 | Select EMR Options ");
	common.log("<br><br>STEP 10 | Select EMR Options ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[2]/div/div[1]/div/div/label[3]/span")).click();
	System.out.println("STEP 11 | Select Classification Options ");
	common.log("<br><br>STEP 11 | Select Classification Options ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[2]/div/div[2]/div/div/div/label[2]/span")).click();
	System.out.println("STEP 12 | Select Downcoded Options ");
	common.log("<br><br>STEP 12 | Select Downcoded Options ");
	common.pause(10);
}

public void Verify_to_Click_on_all_Complete_check_box_in_all_options() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"chart_loader_tabstrip\"]/ul/li[1]/span[2]")).click();
	System.out.println("STEP 06 | Click on Chart Finder Tab ");
	common.log("<br><br>STEP 06 | Click on Chart Finder Tab ");
	common.pause(20);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[8]/td[2]")).click();
	System.out.println("STEP 07 | Select Chart Number ");
	common.log("<br><br>STEP 07 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 08 | Click on Load Button ");
	common.log("<br><br>STEP 08 | Click on Load Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"tabcontent\"]/div/div/div/div[4]/div/div[1]/span/span[2]/span/span[2]")).click();
	System.out.println("STEP 09 | Click on Unlock Button ");
	common.log("<br><br>STEP 09 | Click on Unlock Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"BIPanel\"]/span")).click();
	System.out.println("STEP 10 | Click on Basic Information ");
	common.log("<br><br>STEP 10 | Click on Basic Information ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"BIForm\"]/div[2]/div/div[2]/div[1]/div[1]/label/span")).click();
	System.out.println("STEP 11 | Click on Complete Checkbox ");
	common.log("<br><br>STEP 11 | Click on Complete Checkbox ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"HPIPanel\"]/span")).click();
	System.out.println("STEP 12 | Click on History Of Present Illness ");
	common.log("<br><br>STEP 12 | Click on History Of Present Illness ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"HPIForm\"]/div[2]/div/div/div[1]/div[1]/label/span")).click();
	System.out.println("STEP 13 | Click on Complete Checkbox ");
	common.log("<br><br>STEP 13 | Click on Complete Checkbox ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"ROSPanel\"]/span")).click();
	System.out.println("STEP 14 | Click on Review of System ");
	common.log("<br><br>STEP 14 | Click on Review of System ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"ROSForm\"]/div[2]/div[1]/div[1]/label/span")).click();
	System.out.println("STEP 15 | Click on Complete Checkbox ");
	common.log("<br><br>STEP 15 | Click on Complete Checkbox ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"ORDPanel\"]/span")).click();
	System.out.println("STEP 16 | Click on Orders ");
	common.log("<br><br>STEP 16 | Click on Orders ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"ORDForm\"]/div[2]/div[1]/div[1]/label/span")).click();
	System.out.println("STEP 17 | Click on Complete Checkbox ");
	common.log("<br><br>STEP 17 | Click on Complete Checkbox ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"DSGCCPanel\"]/span")).click();
	System.out.println("STEP 18 | Click on DSGCC ");
	common.log("<br><br>STEP 18 | Click on DSGCC ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"DSGCCForm\"]/div[3]/div[1]/div/label/span")).click();
	System.out.println("STEP 19 | Click on Complete Checkbox ");
	common.log("<br><br>STEP 19 | Click on Complete Checkbox ");
	common.pause(10);

	driver.findElement(By.xpath("//*[@id=\"IPPanel\"]/span")).click();
	System.out.println("STEP 20 | Click on Impression Plan ");
	common.log("<br><br>STEP 20 | Click on Impression Plan ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"IPForm\"]/div[2]/div[1]/div[1]/label/span")).click();
	System.out.println("STEP 21 | Click on Complete Checkbox ");
	common.log("<br><br>STEP 21 | Click on Complete Checkbox ");
	common.pause(10);

	driver.findElement(By.xpath("//*[@id=\"WRPPanel\"]/span")).click();
	System.out.println("STEP 22 | Click on Impression Plan ");
	common.log("<br><br>STEP 22 | Click on Impression Plan ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"WRPForm\"]/div[3]/div[1]/div/label/span")).click();
	System.out.println("STEP 23 | Click on Complete Checkbox ");
	common.log("<br><br>STEP 23 | Click on Complete Checkbox ");
	common.pause(10);

}


public void Verify_to_Reset_all_apply_filters_IN_Metadata() throws InterruptedException, IOException{
    
	common.pause(20);
	Verify_to_select_Visit_type_Classification_and_EMR_filter_to_search_Chart_list();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"reset_filter\"]")).click();
	System.out.println("STEP 11 | Click on Reset Button ");
	common.log("<br><br>STEP 11 | Click on Reset Button ");
	common.pause(10);
}

public void Verify_to_find_chart_by_Apply_History_of_Present_illness_option() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"HPIPanel_FIND\"]/span")).click();
	System.out.println("STEP 06 | Click on History of Present Illness Option ");
	common.log("<br><br>STEP 06 | Click on History of Present Illness Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"HPI_FINDForm\"]/div/div/div/div[1]/div[1]/div/div/label/span")).click();
	System.out.println("STEP 07 | Click on No Option ");
	common.log("<br><br>STEP 07 | Click on No Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"HPI_FINDForm\"]/div/div/div/div[1]/div[3]/div/div[1]/div/label/span")).click();
	System.out.println("STEP 08 | Click on New Option ");
	common.log("<br><br>STEP 08 | Click on New Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"HPI_FINDForm\"]/div/div/div/div[2]/div/div/div/div[3]/label/span")).click();
	System.out.println("STEP 09 | Click on Quality Option ");
	common.log("<br><br>STEP 09 | Click on Quality Option ");
	common.pause(10);
}

public void Verify_to_load_and_retrieve_all_data_of_chart() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"chart_loader_tabstrip\"]/ul/li[1]/span[2]")).click();
	System.out.println("STEP 06 | Click on Chart Finder Tab ");
	common.log("<br><br>STEP 06 | Click on Chart Finder Tab ");
	common.pause(20);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[8]/td[2]")).click();
	System.out.println("STEP 07 | Select Chart Number ");
	common.log("<br><br>STEP 07 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 08 | Click on Load Button ");
	common.log("<br><br>STEP 08 | Click on Load Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"tabcontent\"]/div/div/div/div[4]/div/div[1]/span/span[2]/span/span[2]")).click();
	System.out.println("STEP 09 | Click on Unlock Button ");
	common.log("<br><br>STEP 09 | Click on Unlock Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"BIPanel\"]/span")).click();
	System.out.println("STEP 10 | Click on Basic Information ");
	common.log("<br><br>STEP 10 | Click on Basic Information ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"HPIPanel\"]/span")).click();
	System.out.println("STEP 11 | Click on History Of Present Illness ");
	common.log("<br><br>STEP 11 | Click on History Of Present Illness ");
	common.pause(10);
	
	
}















  

}
