package com.Duva.Sawko;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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
import org.openqa.selenium.interactions.Action;
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
        	String chromeDriverPath = "/Users/adroid/Downloads/chromedriver" ;  
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
    
    public void enterURL1(){
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
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[1]/div[2]/div[2]/div/div[1]/label")).click();
	common.pause(15);
	
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

public void Verify_to_display_next_and_previous_chart() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[8]/td[2]")).click();
	System.out.println("STEP 06 | Select Chart Number ");
	common.log("<br><br>STEP 06 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[7]/td[2]")).click();
	System.out.println("STEP 07 | Select Chart Number ");
	common.log("<br><br>STEP 07 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[6]/td[2]")).click();
	System.out.println("STEP 08 | Select Chart Number ");
	common.log("<br><br>STEP 08 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 09 | Click on Load Button ");
	common.log("<br><br>STEP 09 | Click on Load Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"load_next_chart\"]")).click();
	System.out.println("STEP 10 | Click on Next Button ");
	common.log("<br><br>STEP 10 | Click on Next Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"load_prev_chart\"]")).click();
	System.out.println("STEP 11 | Click on Previous Button ");
	common.log("<br><br>STEP 11 | Click on Previous Button ");
	common.pause(10);
}

public void Verify_to_Select_checkbox_in_Review_of_Systems() throws InterruptedException, IOException{
    
	Verify_to_Add_MetaData_in_Chart_Loader();
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"ROSPanel\"]/span")).click();
	System.out.println("STEP 14 | Click on Review of System ");
	common.log("<br><br>STEP 14 | Click on Review of System ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"ROSForm\"]/div[2]/div[1]/div[1]/label/span")).click();
	System.out.println("STEP 15 | Click on Complete Checkbox ");
	common.log("<br><br>STEP 15 | Click on Complete Checkbox ");
	common.pause(10);
}

public void Verify_to_History_of_Present_illness_text_it_HPI_tab() throws InterruptedException, IOException{
    
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
	
	driver.findElement(By.xpath("//*[@id=\"HPIPanel\"]/span")).click();
	System.out.println("STEP 09 | Click on History Of Present Illness ");
	common.log("<br><br>STEP 09 | Click on History Of Present Illness ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"HPIForm\"]/div[2]/div/div/div[1]/div[1]/label/span")).click();
	System.out.println("STEP 10 | Click on Complete Checkbox ");
	common.log("<br><br>STEP 10 | Click on Complete Checkbox ");
	common.pause(10);
}

public void Verify_to_status_as_In_Progress() throws InterruptedException, IOException{
    
	Verify_to_Add_MetaData_in_Chart_Loader();
	common.pause(10);
	
}

public void Verify_to_user_checked_mark_Complete_checkbox() throws InterruptedException, IOException{
    
	Verify_to_Add_MetaData_in_Chart_Loader();
	common.pause(10);
	
}

public void Verify_to_See_Success_message_when_user_enter_HPI_Parser() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"chart_loader_tabstrip\"]/ul/li[1]/span[2]")).click();
	System.out.println("STEP 06 | Click on Chart Finder Tab ");
	common.log("<br><br>STEP 06 | Click on Chart Finder Tab ");
	common.pause(20);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[7]/td[2]")).click();
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

public void Verify_to_select_EMR_radio_options() throws InterruptedException, IOException{
    
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
	System.out.println("STEP 10 | Click on Complete Checkbox ");
	common.log("<br><br>STEP 10 | Click on Complete Checkbox ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[1]/div[2]/div[4]/div/div/label[4]/span")).click();
	System.out.println("STEP 11 | Select EMR ");
	common.log("<br><br>STEP 11 | Select EMR ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[2]/div/div[1]/div/div/label[2]/span")).click();
	System.out.println("STEP 12 | Select Classification ");
	common.log("<br><br>STEP 12 | Select Classification ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[2]/div/div[2]/div/div/div/label[2]")).click();
	System.out.println("STEP 13 | Select Downcode ");
	common.log("<br><br>STEP 13 | Select Downcode ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[1]/div[2]/div[1]/div[1]/label/span")).click();
	System.out.println("STEP 14 | Click on Complete Checkbox ");
	common.log("<br><br>STEP 14 | Click on Complete Checkbox ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"common_submit_btn\"]")).click();
	System.out.println("STEP 15 | Click on Submit Button ");
	common.log("<br><br>STEP 15 | Click on Submit Button ");
	common.pause(20);
}

public void Verify_Edited_data_in_MetaData() throws InterruptedException, IOException{
    
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
	System.out.println("STEP 10 | Click on Complete Checkbox ");
	common.log("<br><br>STEP 10 | Click on Complete Checkbox ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[1]/div[2]/div[4]/div/div/label[3]/span")).click();
	System.out.println("STEP 11 | Click on any EMR  ");
	common.log("<br><br>STEP 11 | Click on any EMR ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[1]/div[2]/div[4]/div/div/label[3]/span")).click();
	System.out.println("STEP 12 | Click on any EMR  ");
	common.log("<br><br>STEP 12 | Click on any EMR ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[1]/div[2]/div[4]/div/div/label[3]/span")).click();
	System.out.println("STEP 13 | Click on any Classification  ");
	common.log("<br><br>STEP 13 | Click on any Classification ");
	common.pause(20);
	
	WebElement Submit_button = driver.findElement(By.xpath("//input[@id='add_user']"));
	Submit_button.click();
	System.out.println("STEP 14 | Click on Submit Button ");
	common.log("<br><br>STEP 14 | Click on Submit Button ");
	common.pause(40);
}

public void Verify_to_disable_Chart_number_once_it_completed() throws InterruptedException, IOException{
    
	Verify_to_Add_MetaData_in_Chart_Loader();
}


public void Verify_that_if_user_enter_duplicate_chart_number_it_shouldnt_allow_to_enter_data() throws InterruptedException, IOException{
    
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
	driver.findElement(By.xpath("//*[@id=\"meta_chartnumber\"]")).sendKeys("123");
	System.out.println("STEP 07 | Enter Chart Number ");
	common.log("<br><br>STEP 07 | Enter Chart Number ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[1]/div[2]/div[2]/div/div[2]/label")).click();
	common.pause(25);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[1]/div[2]/div[2]/div/div[1]/span[1]")).isDisplayed();
	System.out.println("STEP 08 | Chart number already exists . . . ");
	common.log("<br><br>STEP 08 | Chart number already exists . . . ");
	common.pause(10);
	
}

public void Verify_to_Enlarge_Chart_Image() throws InterruptedException, IOException{
    
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
	
	driver.findElement(By.xpath("//*[@id=\"mdtabright\"]/div/a[2]")).click();
	System.out.println("STEP 09 | Click on Enlarge Button ");
	common.log("<br><br>STEP 09 | Click on Enlarge Button ");
	common.pause(20);
}

public void Verify_that_if_chart_is_locked_then_HPI_Parser_tab_should_be_disabled() throws InterruptedException, IOException{
    
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
	
	driver.findElement(By.xpath("//*[@id=\"HPIPanel\"]/span")).click();
	System.out.println("STEP 09 | Click on HPI Tab disable");
	common.log("<br><br>STEP 09 | Click on HPI Tab disable");
	common.pause(20);
}

public void Verify_to_complete_History_of_Present_illness() throws InterruptedException, IOException{
    
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
		
	driver.findElement(By.xpath("//*[@id=\"HPIForm\"]/div[2]/div/div/div[2]/div[1]/div/div/div/label/span")).click();
	System.out.println("STEP 15 | Select Is there a history Caveat? ");
	common.log("<br><br>STEP 15 | Select Is there a history Caveat? ");
	common.pause(10);
		
	driver.findElement(By.xpath("//*[@id=\"HPIForm\"]/div[2]/div/div/div[2]/div[2]/div/div/label/span")).click();
	System.out.println("STEP 16 | Select Is there a chief complaint documented? ");
	common.log("<br><br>STEP 16 | Select Is there a chief complaint documented? ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"HPIForm\"]/div[2]/div/div/div[2]/div[3]/div/div[1]/div/label/span")).click();
	System.out.println("STEP 17 | Select Is this a new or established problem? ");
	common.log("<br><br>STEP 17 | Select Is this a new or established problem? ");
	common.pause(10);
	
	WebElement Submit_button = driver.findElement(By.xpath("//input[@id='add_user']"));
	Submit_button.click();
	System.out.println("STEP 14 | Click on Submit Button ");
	common.log("<br><br>STEP 14 | Click on Submit Button ");
	common.pause(40);
}


public void Verify_to_default_0_radio_button_selected_in_Special_Studies() throws InterruptedException, IOException{
    
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

	driver.findElement(By.xpath("//*[@id=\"ORDPanel\"]/span")).click();
	System.out.println("STEP 14 | Click on Orders ");
	common.log("<br><br>STEP 14 | Click on Orders ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"orders-tabs\"]/ul/li[1]")).click();
	System.out.println("STEP 15 | Click on Special Studies ");
	common.log("<br><br>STEP 15 | Click on Special Studies ");
	common.pause(10);
}


public void Verify_to_Error_message_when_user_submit_button() throws InterruptedException, IOException{
    
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
	
	WebElement Submit_button = driver.findElement(By.xpath("//input[@id='add_user']"));
	Submit_button.click();
	System.out.println("STEP 08 | Click on Submit Button ");
	common.log("<br><br>STEP 08 | Click on Submit Button ");
	common.pause(40);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[1]/div[2]/div[2]/div/div[2]/span")).isDisplayed();
	System.out.println("STEP 09 | Display Error Message which Fields are blank ");
	common.log("<br><br>STEP 09 | Display Error Message which Fields are blank ");
	common.pause(10);
}

public void Verify_to_check_filter_of_History_of_Present_illness() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);

	driver.findElement(By.xpath("//*[@id=\"HPIPanel_FIND\"]/span")).click();
	System.out.println("STEP 06 | Click on History of Present Illness ");
	common.log("<br><br>STEP 06 | Click on History of Present Illness ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"HPI_FINDForm\"]/div/div/div/div[1]/div[1]/div/div/label/span")).click();
	System.out.println("STEP 07 | Click on Is there a history caveat? ");
	common.log("<br><br>STEP 07 | Click on Is there a history caveat? ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"HPI_FINDForm\"]/div/div/div/div[1]/div[2]/div/div/div/label/span")).click();
	System.out.println("STEP 08 | Click on Is there a chief complaint documented? ");
	common.log("<br><br>STEP 08 | Click on Is there a chief complaint documented? ");
	common.pause(10);
}

public void Verify_to_view_DSGCC_Current_Guideline() throws InterruptedException, IOException{
    
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
	
	driver.findElement(By.xpath("//*[@id=\"DSGCCPanel\"]/span")).click();
	System.out.println("STEP 10 | Click on DSGCC ");
	common.log("<br><br>STEP 10 | Click on DSGCC ");
	common.pause(10);
}

public void Verify_to_view_DSGCC_data_should_be_preload() throws InterruptedException, IOException{
    
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
	
	driver.findElement(By.xpath("//*[@id=\"DSGCCPanel\"]/span")).click();
	System.out.println("STEP 10 | Click on DSGCC ");
	common.log("<br><br>STEP 10 | Click on DSGCC ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"DSGCCForm\"]/div[3]/div[1]/div/label/span")).click();
	System.out.println("STEP 11 | Click on Complete Checkbox ");
	common.log("<br><br>STEP 11 | Click on Complete Checkbox ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"result_dsgcc_search\"]/div/a[3]/span")).click();
	System.out.println("STEP 12 | Click on Next Page Button ");
	common.log("<br><br>STEP 12 | Click on Next Page Button ");
	common.pause(10);
}

public void Verify_to_view_Chart_finder_sort_by_chart_number() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"chart_loader_tabstrip\"]/ul/li[1]/span[2]")).click();
	System.out.println("STEP 06 | Click on Chart Finder Tab ");
	common.log("<br><br>STEP 06 | Click on Chart Finder Tab ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/span[1]/span/span/span[1]")).click();
	System.out.println("STEP 07 | Click on Item Per Page Dropdown ");
	common.log("<br><br>STEP 07 | Click on Item Per Page Dropdown ");
	common.pause(20);

	Actions builder = new Actions(driver);
	builder.sendKeys(Keys.ARROW_DOWN);
	builder.sendKeys(Keys.ENTER);
	common.pause(10);
}

public void Verify_to_preview_of_HPI_Parser_data_for_current_selected_chart() throws InterruptedException, IOException{
    
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
	
	driver.findElement(By.xpath("//*[@id=\"HPIPanel\"]/span")).click();
	System.out.println("STEP 10 | Click on HPI Option ");
	common.log("<br><br>STEP 10 | Click on HPI Option ");
	common.pause(10);	
	
	driver.findElement(By.xpath("//*[@id=\"openhpiparsetab\"]")).click();
	System.out.println("STEP 11 | Click on HPI Parser Button ");
	common.log("<br><br>STEP 11 | Click on HPI Parser Button ");
	common.pause(10);
}

public void Verify_to_Select_No_radio_button_in_Medication_tab() throws InterruptedException, IOException{
    
	Verify_to_Add_MetaData_in_Chart_Loader();
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"ORDPanel\"]/span")).click();
	System.out.println("STEP 14 | Click on Orders ");
	common.log("<br><br>STEP 14 | Click on Orders ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"orders-tabs\"]/ul/li[3]/span[2]")).click();
	System.out.println("STEP 15 | Click on Medication tab ");
	common.log("<br><br>STEP 15 | Click on Medication tab ");
	common.pause(10);
}

public void Verify_to_Select_radio_button_in_MDM_tab() throws InterruptedException, IOException{
    
	Verify_to_Add_MetaData_in_Chart_Loader();
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"MDMPanel\"]/span")).click();
	System.out.println("STEP 14 | Click on Medical Decision Making ");
	common.log("<br><br>STEP 14 | Click on Medical Decision Making ");
	common.pause(10);
	
}

public void Verify_to_Select_No_radio_button() throws InterruptedException, IOException{
    
	Verify_to_Add_MetaData_in_Chart_Loader();
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"ROSPanel\"]/span")).click();
	System.out.println("STEP 14 | Click on Review of System ");
	common.log("<br><br>STEP 14 | Click on Review of System ");
	common.pause(10);
}


public void Verify_to_count_total_in_MDM() throws InterruptedException, IOException{
    
	Verify_to_Select_radio_button_in_MDM_tab();
	
	driver.findElement(By.xpath("//*[@id=\"MDM-1\"]/div/div[1]/div/div[1]/div[2]/label[2]")).click();
	System.out.println("STEP 15 | Select Self Limited ");
	common.log("<br><br>STEP 15 | Select Self Limited ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"MDM-1\"]/div/div[2]/div/div[1]/div[2]/label[3]")).click();
	System.out.println("STEP 16 | Select Established problem, Stable, improved option ");
	common.log("<br><br>STEP 16 | Select Established problem, Stable, improved option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"totalmdmdm\"]")).isDisplayed();
	System.out.println("STEP 17 | Verify it display Total ");
	common.log("<br><br>STEP 17 | Verify it display Total ");
	common.pause(10);
}


public void Verify_to_fill_Special_Studies_Ancillary_Studies_Medication_and_save_data() throws InterruptedException, IOException{
	
	Verify_to_Select_No_radio_button_in_Medication_tab();
	
	driver.findElement(By.xpath("//*[@id=\"ORDForm\"]/div[2]/div[1]/div[1]/label/span")).click();
	System.out.println("STEP 19 | Click on Complete Checkbox ");
	common.log("<br><br>STEP 19 | Click on Complete Checkbox ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"common_submit_btn\"]")).click();
	System.out.println("STEP 20 | Click on Submit Button ");
	common.log("<br><br>STEP 20 | Click on Submit Button ");
	common.pause(20);
	
}

public void Verify_to_select_incorrect_chart_and_that_chart_shouldnt_save() throws InterruptedException, IOException{
    
	Verify_to_Add_MetaData_in_Chart_Loader();
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"IPPanel\"]/span")).click();
	System.out.println("STEP 14 | Click on Impression Plan ");
	common.log("<br><br>STEP 14 | Click on Impression Plan ");
	common.pause(10);
}

public void Verify_to_Asterisks_Should_remove_when_user_select_complete_checkbox1() throws InterruptedException, IOException{
	
	Verify_to_Add_MetaData_in_Chart_Loader();
	
	driver.findElement(By.xpath("//*[@id=\"PEPanel\"]/span")).click();
	System.out.println("STEP 14 | Click on Physical Examination ");
	common.log("<br><br>STEP 14 | Click on Physical Examination ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"PEForm\"]/div[2]/div[1]/div[1]/label")).click();
	System.out.println("STEP 15 | Click on Complete Chekcbox ");
	common.log("<br><br>STEP 15 | Click on Complete Chekcbox ");
	common.pause(20);
	
}

public void Verify_to_Asterisks_Should_remove_when_user_select_complete_checkbox2() throws InterruptedException, IOException{
	
	Verify_to_Add_MetaData_in_Chart_Loader();
	
	driver.findElement(By.xpath("//*[@id=\"MDMPanel\"]/span")).click();
	System.out.println("STEP 14 | Click on Medical Decision Making ");
	common.log("<br><br>STEP 14 | Click on Medical Decision Making ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"MDMForm\"]/div[2]/div[1]/div[1]/label")).click();
	System.out.println("STEP 15 | Click on Complete Chekcbox ");
	common.log("<br><br>STEP 15 | Click on Complete Chekcbox ");
	common.pause(20);
}

public void Verify_to_view_Physical_Examination_chart() throws InterruptedException, IOException{
	
	Verify_to_Add_MetaData_in_Chart_Loader();
	
	driver.findElement(By.xpath("//*[@id=\"PEPanel\"]/span")).click();
	System.out.println("STEP 14 | Click on Physical Examination ");
	common.log("<br><br>STEP 14 | Click on Physical Examination ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"peupload\"]")).sendKeys("/Users/mac/Downloads/103_pe.png");
	System.out.println("STEP 15 | Click on Upload Button ");
	common.log("<br><br>STEP 15 | Click on Upload Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"PEForm\"]/div[2]/div[1]/div[1]/label")).click();
	System.out.println("STEP 16 | Click on Complete Chekcbox ");
	common.log("<br><br>STEP 16 | Click on Complete Chekcbox ");
	common.pause(20);
	
}

public void Verify_to_select_checkbox_in_Review_of_System() throws InterruptedException, IOException{
	
	Verify_to_Add_MetaData_in_Chart_Loader();
	
	driver.findElement(By.xpath("//*[@id=\"ROSPanel\"]/span")).click();
	System.out.println("STEP 16 | Click on Review of System ");
	common.log("<br><br>STEP 16 | Click on Review of System ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"ROSForm\"]/div[2]/div[2]/div[1]/div/div/div/label[2]")).click();
	System.out.println("STEP 17 | Select No Option of Is there a history caveat? ");
	common.log("<br><br>STEP 17 | Select No Option of Is there a history caveat? ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"ROSForm\"]/div[2]/div[2]/div[2]/div/div/label[1]")).click();
	System.out.println("STEP 17 | Select Yes Option of were all systems reviewed? ");
	common.log("<br><br>STEP 17 | Select Yes Option of were all systems reviewed? ");
	common.pause(10);

	driver.findElement(By.xpath("//*[@id=\"ROSForm\"]/div[2]/div[1]/div[1]/label/span")).click();
	System.out.println("STEP 17 | Click on Complete Checkbox ");
	common.log("<br><br>STEP 17 | Click on Complete Checkbox ");
	common.pause(10);
}

public void Verify_to_select_page_it_should_find_and_display_into_list() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"MD_FINDForm\"]/div/div[3]/div/div[4]/div/div/div/ul/li[6]")).click();
	System.out.println("STEP 06 | Select 5 Page Number ");
	common.log("<br><br>STEP 06 | Select 5 Page Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"MD_FINDForm\"]/div/div[3]/div/div[4]/div/div/div/ul/li[13]]")).click();
	System.out.println("STEP 06 | Select 12 Page Number ");
	common.log("<br><br>STEP 06 | Select 12 Page Number ");
	common.pause(10);
}

public void Verify_to_select_radio_button_and_submit_data() throws InterruptedException, IOException{
	
	Verify_to_Add_MetaData_in_Chart_Loader();
	
	driver.findElement(By.xpath("//*[@id=\"IPPanel\"]/span")).click();
	System.out.println("STEP 22 | Click on Impression Plan ");
	common.log("<br><br>STEP 22 | Click on Impression Plan ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"IPForm\"]/div[2]/div[1]/div[1]/label/span")).click();
	System.out.println("STEP 23 | Click on Complete Checkbox ");
	common.log("<br><br>STEP 23 | Click on Complete Checkbox ");
	common.pause(10);
	
}

public void Verify_to_select_radio_button_and_drop_down_list_and_submit_data() throws InterruptedException, IOException{
	
	Verify_to_Add_MetaData_in_Chart_Loader();
	
	driver.findElement(By.xpath("//*[@id=\"AAPanel\"]/span")).click();
	System.out.println("STEP 14 | Click on Addenda Option ");
	common.log("<br><br>STEP 14 | Click on Addenda Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"AAForm\"]/div[3]/div[1]/div[1]/label/span")).click();
	System.out.println("STEP 15 | Click on Complete Checkbox ");
	common.log("<br><br>STEP 15 | Click on Complete Checkbox ");
	common.pause(10);
}

public void Verify_to_Edit_Pages_and_no_unwanted_flash_message_display() throws InterruptedException, IOException{
    
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
}

public void Verify_to_load_multiple_chart_and_When_user_click_on_next_button_it_should_also_change_chart_number() throws InterruptedException, IOException{
    
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
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[6]/td[2]")).click();
	System.out.println("STEP 08 | Select Chart Number ");
	common.log("<br><br>STEP 08 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[4]/td[2]")).click();
	System.out.println("STEP 09 | Select Chart Number ");
	common.log("<br><br>STEP 09 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 10 | Click on Load Button ");
	common.log("<br><br>STEP 10 | Click on Load Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"tabcontent\"]/div/div/div/div[4]/div/div[1]/span/span[2]/span/span[2]")).click();
	System.out.println("STEP 11 | Click on Unlock Button ");
	common.log("<br><br>STEP 11 | Click on Unlock Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"load_next_chart\"]")).click();
	System.out.println("STEP 12 | Click on Next Button ");
	common.log("<br><br>STEP 12 | Click on Next Button ");
	common.pause(20);
}

public void Verify_to_view_DSGCC_option() throws InterruptedException, IOException{
    
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
	
	driver.findElement(By.xpath("//*[@id=\"DSGCCPanel\"]/span")).click();
	System.out.println("STEP 10 | Click on DSGCC Option ");
	common.log("<br><br>STEP 10 | Click on DSGCC Option ");
	common.pause(20);
	
}

public void Verify_to_view_Impression_Plan_option() throws InterruptedException, IOException{
    
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
	
	driver.findElement(By.xpath("//*[@id=\"IPPanel\"]/span")).click();
	System.out.println("STEP 10 | Click on Impression Plan ");
	common.log("<br><br>STEP 10 | Click on Impression Plan ");
	common.pause(10);
	
}

public void Verify_to_search_Supervising_physician_and_display_into_list() throws InterruptedException, IOException{
    
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
	
	driver.findElement(By.xpath("//*[@id=\"AAPanel\"]/span")).click();
	System.out.println("STEP 10 | Click on Addenda Option ");
	common.log("<br><br>STEP 10 | Click on Addenda Option ");
	common.pause(10);
	
}
public void Verify_to_Search_keywords_in_DSGCC_Current_Guideline() throws InterruptedException, IOException{
	Verify_to_view_DSGCC_option();
	
	driver.findElement(By.xpath("//*[@id=\"DSGCCForm\"]/div[3]/div[1]/div/label/span")).click();
	System.out.println("STEP 10 | Click on Complete Checkbox ");
	common.log("<br><br>STEP 10 | Click on Complete Checkbox ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"search_dsgcc\"]")).sendKeys("qa");
	System.out.println("STEP 11 | Enter Keyword to Search ");
	common.log("<br><br>STEP 11 | Enter Keyword to Search ");
	common.pause(10);
	
}

public void Verify_to_View_Answer_Key_option() throws InterruptedException, IOException{
	Verify_to_Add_MetaData_in_Chart_Loader();
	
	driver.findElement(By.xpath("//*[@id=\"WRPPanel\"]/span")).click();
	System.out.println("STEP 14 | Click on Answer Key Option ");
	common.log("<br><br>STEP 14 | Click on Answer Key Option ");
	common.pause(10);

}

public void Verify_to_view_DSGCC_data_grid_in_right_side() throws InterruptedException, IOException{
	Verify_to_Search_keywords_in_DSGCC_Current_Guideline();

	driver.findElement(By.xpath("//*[@id=\"chart_loader_tabstrip2_ts_active\"]/span[2]")).click();
	System.out.println("STEP 12 | Click on DSGCC Tab ");
	common.log("<br><br>STEP 12 | Click on DSGCC Tab ");
	common.pause(10);
}

public void Verify_to_view_Notes() throws InterruptedException, IOException{
    
	Verify_to_view_Manage_ICD_10();
	
	System.out.println("STEP 10 | Click on Note ");
	common.log("<br><br>STEP 10 | Click on Note ");
	common.pause(10);
}

public void Verify_to_Edit_Manage_Users() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	WebElement ManageUsers_button = driver.findElement(By.xpath("//*[@id='menu_manage_users']/span"));
	ManageUsers_button.click();
	System.out.println("STEP 06 | Click on Manage Users button ");
	common.log("<br><br>STEP 06 | Click on Manage Users button ");
	common.pause(40);
	
	driver.findElement(By.xpath("//*[@id=\"manage_user_grid\"]/table/tbody/tr[1]/td[4]")).click();
	System.out.println("STEP 07 | Select User From List ");
	common.log("<br><br>STEP 07 | Select User From List ");
	common.pause(10);
	
	WebElement edit_firstname = driver.findElement(By.xpath("//*[@id=\"add_namefirst\"]"));
	edit_firstname.clear();
	edit_firstname.sendKeys("Gwyn");
	System.out.println("STEP 08 | Edit First Name ");
	common.log("<br><br>STEP 08 | Edit First Name ");
	common.pause(10);
	
	WebElement edit_lastname = driver.findElement(By.xpath("//*[@id=\"add_namelast\"]"));
	edit_lastname.clear();
	edit_firstname.sendKeys("QaTest");
	System.out.println("STEP 08 | Edit Last Name ");
	common.log("<br><br>STEP 08 | Edit Last Name ");
	common.pause(10);
	
	WebElement edit_MobileNumber = driver.findElement(By.xpath("//*[@id=\"add_phonemobile\"]"));
	edit_MobileNumber.clear();
	edit_MobileNumber.sendKeys("2233232318");
	System.out.println("STEP 09 | Edit Mobile Number ");
	common.log("<br><br>STEP 09 | Edit Mobile Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"done_user\"]")).click();
	System.out.println("STEP 10 | Click on Done Edit Button ");
	common.log("<br><br>STEP 10 | Edit Done Edit Button ");
	common.pause(10);
}

public void Verify_to_reset_all_fields_and_Status_should_be_blank() throws InterruptedException, IOException{
	
	Verify_to_Completed_New_Chart_Loader();
	
	driver.findElement(By.xpath("//*[@id=\"loadnewchart\"]")).isDisplayed();
	System.out.println("STEP 26 | Verify New Chart Button Display ");
	common.log("<br><br>STEP 26 | Verify New Chart Button Display ");
	common.pause(10);
}

public void Verify_to_view_My_Profile() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"userDropdown\"]/span")).click();
	System.out.println("STEP 06 | Click on Profile ");
	common.log("<br><br>STEP 06 | Click on Profile ");
	common.pause(10);
	
	driver.findElement(By.xpath("//html/body/nav/ul/li/div/a[1]")).click();
	System.out.println("STEP 06 | Click on My Profile ");
	common.log("<br><br>STEP 06 | Click on My Profile ");
	common.pause(10);
}

public void Verify_to_view_Parameter() throws InterruptedException, IOException{
    
	verify_login_details_of_admin();
	common.pause(40);
	
	driver.findElement(By.xpath("//div[3]/div[1]/ul/li[6]/div/span[1]")).click();
	System.out.println("STEP 06 | Click on Utilities ");
	common.log("<br><br>STEP 06 | Click on Utilities  ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"menu_parameters\"]/span")).click();
	System.out.println("STEP 07 | Click on Parameters ");
	common.log("<br><br>STEP 07 | Click on Parameters  ");
	common.pause(10);
	
}


public void Verify_to_edit_Answer_Key() throws InterruptedException, IOException{
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
	
	driver.findElement(By.xpath("//*[@id=\"WRPPanel\"]/span")).click();
	System.out.println("STEP 10 | Click on Answer Key Option ");
	common.log("<br><br>STEP 10 | Click on Answer Key Option ");
	common.pause(10);

	driver.findElement(By.xpath("//*[@id=\"WRPForm\"]/div[3]/div[1]/div/label")).click();
	System.out.println("STEP 11 | Click on Complete Button ");
	common.log("<br><br>STEP 11 | Click on Complete Button ");
	common.pause(10);
}

public void Verify_after_login_display_chart_finder() throws InterruptedException, IOException{
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
}

public void Verify_to_edit_Impression_Plan() throws InterruptedException, IOException{
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
	
	driver.findElement(By.xpath("//*[@id=\"IPPanel\"]/span")).click();
	System.out.println("STEP 10 | Click on Impression Plan ");
	common.log("<br><br>STEP 10 | Click on Impression Plan ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"IPForm\"]/div[2]/div[1]/div[1]/label/span")).click();
	System.out.println("STEP 11 | Click on Complete Checkbox ");
	common.log("<br><br>STEP 11 | Click on Complete Checkbox ");
	common.pause(10);
	
}


public void Verify_to_add_all_selected_charts() throws InterruptedException, IOException{
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
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[6]/td[2]")).click();
	System.out.println("STEP 08 | Select Chart Number ");
	common.log("<br><br>STEP 08 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[4]/td[2]")).click();
	System.out.println("STEP 09 | Select Chart Number ");
	common.log("<br><br>STEP 09 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[7]/td[2]")).click();
	System.out.println("STEP 10 | Select Chart Number ");
	common.log("<br><br>STEP 10 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 11 | Click on Load Button ");
	common.log("<br><br>STEP 11 | Click on Load Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"load_next_chart\"]")).click();
	System.out.println("STEP 12 | Click on Next Button ");
	common.log("<br><br>STEP 12 | Click on Next Button ");
	common.pause(10);
}

public void Verify_to_edit_dropdown_in_Addenda_Attestation() throws InterruptedException, IOException{
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
	System.out.println("STEP 11 | Click on Load Button ");
	common.log("<br><br>STEP 11 | Click on Load Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"tabcontent\"]/div/div/div/div[4]/div/div[1]/span/span[2]/span/span[2]")).click();
	System.out.println("STEP 09 | Click on Unlock Button ");
	common.log("<br><br>STEP 09 | Click on Unlock Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"AAPanel\"]/span")).click();
	System.out.println("STEP 12 | Click on Addenda Option ");
	common.log("<br><br>STEP 12 | Click on Addenda Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"AAForm\"]/div[3]/div[2]/div[4]/div/span/span/span[1]")).click();
	Actions builder = new Actions(driver);
	builder.sendKeys(Keys.ARROW_DOWN);
	builder.sendKeys(Keys.ARROW_DOWN);
	builder.sendKeys(Keys.ENTER);
	System.out.println("STEP 13 | Select Supervising physician Dropwdown ");
	common.log("<br><br>STEP 13 | Select Supervising physician Dropwdown ");
	common.pause(10);
}

public void Verify_to_edit_Manage_DSGCC() throws InterruptedException, IOException{
	
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//html/body/div[3]/div[1]/ul/li[7]/div/span[1]")).click();
	System.out.println("STEP 07 | Click on Coding Tools ");
	common.log("<br><br>STEP 07 | Click on Coding Tools  ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"menu_manage_dsgcc\"]/span")).click();
	System.out.println("STEP 08 | Click on Mange DSGCC ");
	common.log("<br><br>STEP 08 | Click on Mange DSGCC ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"manage_dsgcc_grid\"]/table/tbody/tr[1]/td[5]/a[1]")).click();
	System.out.println("STEP 09 | Click on Edit button ");
	common.log("<br><br>STEP 09 | Click on Edit button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"manage_dsgcc_grid\"]/table/tbody/tr[1]/td[3]/input")).sendKeys(" Test");
	System.out.println("STEP 10 | Edit Text ");
	common.log("<br><br>STEP 10 | Edit Text ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"manage_dsgcc_grid\"]/table/tbody/tr[1]/td[5]/a[1]")).click();
	System.out.println("STEP 11 | Click on Update button ");
	common.log("<br><br>STEP 11 | Click on Update button ");
	common.pause(10);

}

public void Verify_to_load_chart_no_128_and_129() throws InterruptedException, IOException{
	
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	System.out.println("STEP 07 | Click on Next button ");
	common.log("<br><br>STEP 07 | Click on Next button ");
	common.pause(10);

	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[15]/td[2]")).click();
	System.out.println("STEP 08 | Select Chart Number ");
	common.log("<br><br>STEP 08 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	System.out.println("STEP 09 | Click on Next button ");
	common.log("<br><br>STEP 09 | Click on Next button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[2]/td[2]")).click();
	System.out.println("STEP 10 | Select Chart Number ");
	common.log("<br><br>STEP 10 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 11 | Click on Load Button ");
	common.log("<br><br>STEP 11 | Click on Load Button ");
	common.pause(20);
}

public void Verify_to_add_user_and_linking_data() throws InterruptedException, IOException{
	
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//html/body/div[3]/div[1]/ul/li[7]/div/span[1]")).click();
	System.out.println("STEP 07 | Click on Coding Tools ");
	common.log("<br><br>STEP 07 | Click on Coding Tools  ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"menu_manage_dsgcc\"]/span")).click();
	System.out.println("STEP 08 | Click on Mange DSGCC ");
	common.log("<br><br>STEP 08 | Click on Mange DSGCC ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"dsfccaddform\"]/div[2]/div/div/div/div[1]/label/span")).click();
	System.out.println("STEP 09 | Select Risk Level ");
	common.log("<br><br>STEP 09 | Select Risk Level ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"dsfccaddform\"]/div[4]/div[1]/div/label[1]/span")).click();
	System.out.println("STEP 10 | Select Type ");
	common.log("<br><br>STEP 10 | Select Type ");
	common.pause(10);
}

public void Verify_to_add_multiple_HPI_Parser1() throws InterruptedException, IOException{
	
	Verify_to_Add_MetaData_in_Chart_Loader();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"HPIPanel\"]")).click();
	System.out.println("STEP 14 | Click on History of Present Option ");
	common.log("<br><br>STEP 14 | Click on History of Present Option ");
	common.pause(10);
	
//	driver.findElement(By.xpath("//*[@id=\"HPIForm\"]/div[2]/div/div/div[1]/div[1]/label/span")).click();
//	System.out.println("STEP 15 | Click on Complete Button ");
//	common.log("<br><br>STEP 15 | Click on Complete Button ");
//	common.pause(10);

	driver.findElement(By.xpath("//*[@id=\"openhpiparsetab\"]")).click();
	System.out.println("STEP 16 | Click on HPI Parser Button ");
	common.log("<br><br>STEP 16 | Click on HPI Parser Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"toparse\"]")).sendKeys("Testing Data");
	System.out.println("STEP 17 | Enter HPI Parser Text ");
	common.log("<br><br>STEP 17 | Enter HPI Parser Text ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"chart_loader_tabstrip-3\"]/div/div[2]/input")).click();
	System.out.println("STEP 18 | Click on Parse it button ");
	common.log("<br><br>STEP 18 | Click on Parse it button ");
	common.pause(10);
}

public void Verify_to_Student_grid_in_Answer_Key() throws InterruptedException, IOException{
	
	Verify_to_Add_MetaData_in_Chart_Loader();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"WRPPanel\"]/span")).click();
	System.out.println("STEP 14 | Click on Answer Key Option ");
	common.log("<br><br>STEP 14 | Click on Answer Key Option ");
	common.pause(10);
}

public void Verify_to_upload_correct_file() throws InterruptedException, IOException{
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
	System.out.println("STEP 11 | Click on Load Button ");
	common.log("<br><br>STEP 11 | Click on Load Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"metaupload\"]")).click();
	System.out.println("STEP 12 | Click on Upload Button ");
	common.log("<br><br>STEP 12 | Click on Upload Button ");
	common.pause(20);
}

public void Verify_to_Export_selected_data() throws InterruptedException, IOException{
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	WebElement ManageUsers_button = driver.findElement(By.xpath("//*[@id='menu_manage_users']/span"));
	ManageUsers_button.click();
	System.out.println("STEP 06 | Click on Manage Users button ");
	common.log("<br><br>STEP 06 | Click on Manage Users button ");
	common.pause(40);
	
	driver.findElement(By.xpath("//*[@id=\"export\"]")).click();
	System.out.println("STEP 07 | Click on Export Button ");
	common.log("<br><br>STEP 07 | Click on Export Button ");
	common.pause(20);
}

public void Verify_to_Edit_Answer_Key_with_multiple_charts() throws InterruptedException, IOException{
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
	
	driver.findElement(By.xpath("//*[@id=\"WRPPanel\"]/span")).click();
	System.out.println("STEP 10 | Click on Answer Key Option ");
	common.log("<br><br>STEP 10 | Click on Answer Key Option ");
	common.pause(10);
}

public void Verify_to_select_PE_and_display_todays_data() throws InterruptedException, IOException{
	common.pause(20);
	verify_login_details_of_admin();
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
	
	driver.findElement(By.xpath("//*[@id=\"PEPanel\"]/span")).click();
	System.out.println("STEP 10 | Click on Physical Examination Option ");
	common.log("<br><br>STEP 10 | Click on Physical Examination Option ");
	common.pause(10);
	
}


public void Verify_to_Load_In_Progress_Chart() throws InterruptedException, IOException{
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[8]/td[2]")).click();
	System.out.println("STEP 07 | Select Chart Number ");
	common.log("<br><br>STEP 07 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 08 | Click on Load Button ");
	common.log("<br><br>STEP 08 | Click on Load Button ");
	common.pause(20);
}

public void Verify_to_display_error_message_when_user_wrong_CPT() throws InterruptedException, IOException{
	common.pause(20);
	verify_login_details_of_admin();
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
	
	driver.findElement(By.xpath("//*[@id=\"WRPPanel\"]/span")).click();
	System.out.println("STEP 10 | Click on Answer Key Option ");
	common.log("<br><br>STEP 10 | Click on Answer Key Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"WRPForm\"]/div[3]/div[1]/div/label/span")).click();
	System.out.println("STEP 11 | Click on Complete Checkbox ");
	common.log("<br><br>STEP 11 | Click on Complete Checkbox ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"cpt_1\"]")).sendKeys("11111");
	System.out.println("STEP 12 | Enter wrong CPT ");
	common.log("<br><br>STEP 12 | Enter wrong CPT ");
	common.pause(10);
	
}

public void Verify_to_Enrollment_enhancement() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	WebElement ManageUsers_button = driver.findElement(By.xpath("//*[@id='menu_manage_users']/span"));
	ManageUsers_button.click();
	System.out.println("STEP 06 | Click on Manage Users button ");
	common.log("<br><br>STEP 06 | Click on Manage Users button ");
	common.pause(40);
	
	driver.findElement(By.xpath("//*[@id=\"manage_user_grid\"]/table/tbody/tr[1]/td[4]")).click();
	System.out.println("STEP 07 | Select User From List ");
	common.log("<br><br>STEP 07 | Select User From List ");
	common.pause(10);
}

public void Verify_to_view_Student_Progress() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"menu_student_progress\"]/span")).click();
	System.out.println("STEP 07 | Click on Student Progress ");
	common.log("<br><br>STEP 07 | Click on Student Progress ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"panel1\"]/span")).isDisplayed();
	System.out.println("STEP 08 | Verify It display Student Progress!!! ");
	common.log("<br><br>STEP 08 | Verify It display Student Progress!!! ");
	common.pause(20);
	
}

public void Verify_to_edited_data_should_save() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	WebElement ManageUsers_button = driver.findElement(By.xpath("//*[@id='menu_manage_users']/span"));
	ManageUsers_button.click();
	System.out.println("STEP 06 | Click on Manage Users button ");
	common.log("<br><br>STEP 06 | Click on Manage Users button ");
	common.pause(40);
	
	driver.findElement(By.xpath("//*[@id=\"manage_user_grid\"]/table/tbody/tr[1]/td[4]")).click();
	System.out.println("STEP 07 | Select User From List ");
	common.log("<br><br>STEP 07 | Select User From List ");
	common.pause(10);
	
	WebElement edit_firstname = driver.findElement(By.xpath("//*[@id=\"add_namefirst\"]"));
	edit_firstname.clear();
	edit_firstname.sendKeys("Gwyn");
	System.out.println("STEP 08 | Edit First Name ");
	common.log("<br><br>STEP 08 | Edit First Name ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"done_user\"]")).click();
	System.out.println("STEP 09 | Click on Done Edit Button ");
	common.log("<br><br>STEP 09 | Edit Done Edit Button ");
	common.pause(10);
	
}


public void Verify_to_clear_all_fields() throws InterruptedException, IOException{
    
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

	driver.findElement(By.xpath("//*[@id=\"add_namefirst\"]")).sendKeys("Qa"+Incrementdatevalue);
	System.out.println("STEP 07 | Enter First Name ");
	common.log("<br><br>STEP 07 | Enter First Name ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"add_namelast\"]")).sendKeys("Qa"+Incrementdatevalue);
	System.out.println("STEP 07 | Enter Last Name ");
	common.log("<br><br>STEP 07 | Enter Last Name ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"add_phonemobile\"]")).sendKeys("9898123287");
	System.out.println("STEP 08 | Enter Mobile Number ");
	common.log("<br><br>STEP 08 | Enter Mobile Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"add_email\"]")).sendKeys("qa"+Incrementdatevalue+"@mailinator.com");
	System.out.println("STEP 09 | Enter Email Address ");
	common.log("<br><br>STEP 09 | Enter Email Address ");
	common.pause(10);
	
	driver.findElement(By.xpath("//html/body/div[3]/div[2]/div/div/div[2]/div[1]/div/form/div[4]/div/input[3]")).click();
	System.out.println("STEP 10 | Click on Clear Button ");
	common.log("<br><br>STEP 10 | Click on Clear Button ");
	common.pause(10);
}


public void Verify_to_display_error_message_when_other_fields_are_blank() throws InterruptedException, IOException{
    
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

	driver.findElement(By.xpath("//*[@id=\"add_namefirst\"]")).click();
	System.out.println("STEP 07 | Enter First Name ");
	common.log("<br><br>STEP 07 | Enter First Name ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"add_namelast\"]")).click();
	System.out.println("STEP 07 | Enter Last Name ");
	common.log("<br><br>STEP 07 | Enter Last Name ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"add_phonemobile\"]")).click();
	System.out.println("STEP 08 | Enter Mobile Number ");
	common.log("<br><br>STEP 08 | Enter Mobile Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"add_phonemobile\"]")).click();
	System.out.println("STEP 09 | Enter Email Address ");
	common.log("<br><br>STEP 09 | Enter Email Address ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"panelbar-other-all-add\"]/li[1]/div/div/div[1]/div[1]/div/span")).isDisplayed();
	System.out.println("STEP 10 | Verify It Display Error Message ");
	common.log("<br><br>STEP 10 | Verify It Display Error Message ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"panelbar-other-all-add\"]/li[1]/div/div/div[1]/div[3]/div/span")).isDisplayed();
	System.out.println("STEP 11 | Verify It Display Error Message ");
	common.log("<br><br>STEP 11 | Verify It Display Error Message ");
	common.pause(10);
}

public void Verify_when_user_enter_all_values_it_should_display_blank_fields() throws InterruptedException, IOException{
    
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

	driver.findElement(By.xpath("//*[@id=\"add_namefirst\"]")).sendKeys("Qa"+Incrementdatevalue);
	System.out.println("STEP 07 | Enter First Name ");
	common.log("<br><br>STEP 07 | Enter First Name ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"add_namelast\"]")).sendKeys("Qa"+Incrementdatevalue);
	System.out.println("STEP 07 | Enter Last Name ");
	common.log("<br><br>STEP 07 | Enter Last Name ");
	common.pause(10);
	
	WebElement mobile_no = driver.findElement(By.xpath("//*[@id=\"add_phonemobile\"]"));
	mobile_no.sendKeys(Keys.BACK_SPACE);
	mobile_no.sendKeys(Keys.BACK_SPACE);
	mobile_no.sendKeys(Keys.BACK_SPACE);
	mobile_no.sendKeys(Keys.BACK_SPACE);
	mobile_no.sendKeys(Keys.BACK_SPACE);
	mobile_no.sendKeys(Keys.BACK_SPACE);
	mobile_no.sendKeys(Keys.BACK_SPACE);
	mobile_no.sendKeys(Keys.BACK_SPACE);
	mobile_no.sendKeys(Keys.BACK_SPACE);
	mobile_no.sendKeys(Keys.BACK_SPACE);
	mobile_no.sendKeys(Keys.BACK_SPACE);
	mobile_no.sendKeys(Keys.BACK_SPACE);
	mobile_no.sendKeys("9889123485");
	System.out.println("STEP 08 | Enter Mobile Number ");
	common.log("<br><br>STEP 08 | Enter Mobile Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"add_email\"]")).sendKeys("qa"+Incrementdatevalue+"@mailinator.com");
	System.out.println("STEP 09 | Enter Email Address ");
	common.log("<br><br>STEP 09 | Enter Email Address ");
	common.pause(10);

	driver.findElement(By.xpath("//*[@id=\"panelbar-other-all-add\"]/li[2]/span")).click();
	System.out.println("STEP 10 | Click on Other Tab ");
	common.log("<br><br>STEP 10 | Click on Other Tab ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"add_address1\"]")).sendKeys("Qa Testing Address");
	System.out.println("STEP 11 | Enter Address ");
	common.log("<br><br>STEP 11 | Enter Address ");
	common.pause(10);

	driver.findElement(By.xpath("//*[@id=\"add_zip\"]")).sendKeys("32164");
	System.out.println("STEP 12 | Enter Address ");
	common.log("<br><br>STEP 12 | Enter Address ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"panelbar-other-all-add\"]/li[2]/div/div/div[3]/div[2]/label")).click();
	System.out.println("STEP 13 | Enter City, State, Country ");
	common.log("<br><br>STEP 13 | Enter City, State, Country ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"add_user\"]")).click();
	System.out.println("STEP 14 | Click on Submit Button ");
	common.log("<br><br>STEP 14 | Click on Submit Button ");
	common.pause(20);
}

public void Verify_to_make_data_grid_per_page() throws InterruptedException, IOException{
    
	verify_login_details_of_admin();
	
	WebElement ManageUsers_button = driver.findElement(By.xpath("//*[@id='menu_manage_users']/span"));
	ManageUsers_button.click();
	System.out.println("STEP 06 | Click on Manage Users button ");
	common.log("<br><br>STEP 06 | Click on Manage Users button ");
	common.pause(40);
	
	driver.findElement(By.xpath("//*[@id=\"manage_user_grid\"]/div[2]/a[3]/span")).click();
	System.out.println("STEP 06 | Click on Next button ");
	common.log("<br><br>STEP 06 | Click on Next button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"manage_user_grid\"]/div[2]/a[4]/span")).click();
	System.out.println("STEP 07 | Click on Last button ");
	common.log("<br><br>STEP 07 | Click on Last button ");
	common.pause(10);
}

public void Verify_to_apply_filter_from_first_letter() throws InterruptedException, IOException{
    
	verify_login_details_of_admin();
	
	WebElement ManageUsers_button = driver.findElement(By.xpath("//*[@id='menu_manage_users']/span"));
	ManageUsers_button.click();
	System.out.println("STEP 06 | Click on Manage Users button ");
	common.log("<br><br>STEP 06 | Click on Manage Users button ");
	common.pause(40);
	
	driver.findElement(By.xpath("//*[@id=\"namefirst\"]")).sendKeys("Qa");
	System.out.println("STEP 07 | Enter First Name to Search ");
	common.log("<br><br>STEP 07 | Enter First Name to Search ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"manage_user_grid\"]/table/tbody/tr[1]/td[3]")).isDisplayed();
	System.out.println("STEP 08 | It search and Display Manage User List!!! ");
	common.log("<br><br>STEP 08 | It search and Display Manage User List!!! ");
	common.pause(20);
}

public void Verify_to_Search_by_Mobile_Phone() throws InterruptedException, IOException{
    
	verify_login_details_of_admin();
	
	WebElement ManageUsers_button = driver.findElement(By.xpath("//*[@id='menu_manage_users']/span"));
	ManageUsers_button.click();
	System.out.println("STEP 06 | Click on Manage Users button ");
	common.log("<br><br>STEP 06 | Click on Manage Users button ");
	common.pause(40);
	
	WebElement mobile_no = driver.findElement(By.xpath("//*[@id=\"phonemobile\"]"));
	mobile_no.sendKeys(Keys.BACK_SPACE);
	mobile_no.sendKeys(Keys.BACK_SPACE);
	mobile_no.sendKeys(Keys.BACK_SPACE);
	mobile_no.sendKeys(Keys.BACK_SPACE);
	mobile_no.sendKeys(Keys.BACK_SPACE);
	mobile_no.sendKeys(Keys.BACK_SPACE);
	mobile_no.sendKeys(Keys.BACK_SPACE);
	mobile_no.sendKeys(Keys.BACK_SPACE);
	mobile_no.sendKeys(Keys.BACK_SPACE);
	mobile_no.sendKeys(Keys.BACK_SPACE);
	mobile_no.sendKeys(Keys.BACK_SPACE);
	mobile_no.sendKeys(Keys.BACK_SPACE);
	mobile_no.sendKeys("9898989812");
	System.out.println("STEP 07 | Enter Mobile Number to Search ");
	common.log("<br><br>STEP 07 | Enter Mobile Number to Search ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"manage_user_grid\"]/table/tbody/tr[1]/td[3]")).isDisplayed();
	System.out.println("STEP 08 | It search and Display Manage User List!!! ");
	common.log("<br><br>STEP 08 | It search and Display Manage User List!!! ");
	common.pause(20);
}

public void Verify_that_Other_phone_is_optional() throws InterruptedException, IOException{
    
	Verify_when_user_enter_all_values_it_should_display_blank_fields();
}


public void Verify_to_search_user() throws InterruptedException, IOException{
    
	verify_login_details_of_admin();
	
	WebElement ManageUsers_button = driver.findElement(By.xpath("//*[@id='menu_manage_users']/span"));
	ManageUsers_button.click();
	System.out.println("STEP 06 | Click on Manage Users button ");
	common.log("<br><br>STEP 06 | Click on Manage Users button ");
	common.pause(40);
	
	driver.findElement(By.xpath("//*[@id=\"panelbar-other-all\"]/li[1]/div/div/div[2]/div/div/label[1]")).click();
	System.out.println("STEP 07 | Select User Role ");
	common.log("<br><br>STEP 07 | Select User Role ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"manage_user_grid\"]/table/tbody/tr[1]/td[1]")).isDisplayed();
	System.out.println("STEP 08 | It Display User List ");
	common.log("<br><br>STEP 08 | It Display User List ");
	common.pause(10);
}

public void Verify_to_reset_filter_when_user_go_to_next_chart_in_DSGCC_tab() throws InterruptedException, IOException{
    
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
	
	driver.findElement(By.xpath("//*[@id=\"tabcontent\"]/div/div/div/div[4]/div/div[1]/span/span[2]/span/span[2]")).click();
	System.out.println("STEP 09 | Click on Unlock Button ");
	common.log("<br><br>STEP 09 | Click on Unlock Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"DSGCCPanel\"]/span")).click();
	System.out.println("STEP 10 | Click on DUVASAWKO tab ");
	common.log("<br><br>STEP 10 | Click on DUVASAWKO tab ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"DSGCCForm\"]/div[3]/div[1]/div/label/span")).click();
	System.out.println("STEP 11 | Click on Complete Checkbox ");
	common.log("<br><br>STEP 11 | Click on Complete Checkbox ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"result_dsgcc_search\"]/table/tbody/tr[1]/td[6]/a/svg/path")).click();
	System.out.println("STEP 12 | Click on + Button ");
	common.log("<br><br>STEP 12 | Click on + Button ");
	common.pause(30);
	
	driver.findElement(By.xpath("//*[@id=\"current_dsgcc_result\"]/table/tbody/tr[1]/td[6]/a")).click();
	System.out.println("STEP 13 | Click on Delete Button ");
	common.log("<br><br>STEP 13 | Click on Delete Button ");
	common.pause(20);
	
}

public void Verify_functionality_when_user_left_blank_fields() throws InterruptedException, IOException{
    
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"admin_menu_treeview_tv_active\"]/div/span[1]")).click();
	System.out.println("STEP 06 | Click on Answer Key ");
	common.log("<br><br>STEP 06 | Click on Answer Key ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"menu_student_answer_key\"]/span")).click();
	System.out.println("STEP 07 | Click on Student Answer Key ");
	common.log("<br><br>STEP 07 | Click on Student Answer Key ");
	common.pause(40);
	
	driver.findElement(By.xpath("//*[@id=\"menu_student_answer_key\"]/span")).click();
	System.out.println("STEP 08 | Click on Student Answer Key ");
	common.log("<br><br>STEP 08 | Click on Student Answer Key ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"panel2\"]/span")).click();
	System.out.println("STEP 09 | Click on Add Key ");
	common.log("<br><br>STEP 09 | Click on Add Key ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"add_user\"]")).click();
	System.out.println("STEP 10 | Click on Submit Button ");
	common.log("<br><br>STEP 10 | Click on Submit Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"panel1\"]/div[1]/div[1]/div/div[1]/span")).isDisplayed();
	System.out.println("STEP 11 | Verify It Display Error Message ");
	common.log("<br><br>STEP 11 | Verify It Display Error Message ");
	common.pause(10);
}

public void Verify_that_submit_button_is_disable() throws InterruptedException, IOException{
    
	Verify_to_view_Parameter();
}

public void Verify_to_change_In_Progress_status_to_Complete() throws InterruptedException, IOException{
    
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

	driver.findElement(By.xpath("//*[@id=\"WRPPanel\"]/span")).click();
	System.out.println("STEP 09 | Click on Answer Key Option ");
	common.log("<br><br>STEP 09 | Click on Answer Key Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"common_submit_btn\"]")).click();
	System.out.println("STEP 10 | Clcik on Submit Button ");
	common.log("<br><br>STEP 10 | Clcik on Submit Button ");
	common.pause(10);
}

public void Verify_to_upload_video_file_and_it_show_error_message() throws InterruptedException, IOException{
    
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 07 | Click on Load Button ");
	common.log("<br><br>STEP 07 | Click on Load Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[4]/div/div[2]/div/button[3]")).isDisplayed();
	System.out.println("STEP 08 | Verify Select Chart Display ");
	common.log("<br><br>STEP 08 | Verify Select Chart Display ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"tabcontent\"]/div/div/div/div[4]/div/div[1]/span/span[2]/span/span[2]")).click();
	System.out.println("STEP 09 | Click on Unlock Button ");
	common.log("<br><br>STEP 09 | Click on Unlock Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"metaupload\"]")).sendKeys("/Users/mac/Downloads/test.mp4");
	System.out.println("STEP 10 | Click on Upload button ");
	common.log("<br><br>STEP 10 | Click on Upload button ");
	common.pause(10);
}


public void Verify_to_Select_Mid_Level() throws InterruptedException, IOException{
    
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[8]/td[2]")).click();
	System.out.println("STEP 06 | Select Chart Number ");
	common.log("<br><br>STEP 06 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[9]/td[2]")).click();
	System.out.println("STEP 07 | Select Chart Number ");
	common.log("<br><br>STEP 07 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 08 | Click on Load Button ");
	common.log("<br><br>STEP 08 | Click on Load Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"tabcontent\"]/div/div/div/div[4]/div/div[1]/span/span[2]/span/span[2]")).click();
	System.out.println("STEP 09 | Click on Unlock Button ");
	common.log("<br><br>STEP 09 | Click on Unlock Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"AAPanel\"]/span")).click();
	System.out.println("STEP 10 | Click on Addenda Option ");
	common.log("<br><br>STEP 10 | Click on Addenda Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"AAForm\"]/div[3]/div[2]/div[1]/div/div/label[1]")).click();
	System.out.println("STEP 11 | Select Yes Option for is there an Addenda? ");
	common.log("<br><br>STEP 11 | Select Yes Option for is there an Addenda? ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"midlevel-block\"]/div/span/span/span[1]")).click();
	Actions builder = new Actions(driver);
	builder.sendKeys(Keys.ARROW_DOWN);
	builder.sendKeys(Keys.ENTER);
	common.pause(10);
	System.out.println("STEP 12 | Select Midlevel Dropwdown ");
	common.log("<br><br>STEP 12 | Select Midlevel Dropwdown ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"AAForm\"]/div[3]/div[1]/div[1]/label/span")).click();
	System.out.println("STEP 13 | Click on Complete Checkobox ");
	common.log("<br><br>STEP 13 | Click on Complete Checkobox ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"common_submit_btn\"]")).click();
	System.out.println("STEP 14 | Click on Submit Button ");
	common.log("<br><br>STEP 14 | Click on Submit Button ");
	common.pause(20);
	
}

public void Verify_to_delete_and_add_DSGCC() throws InterruptedException, IOException{
    
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[8]/td[2]")).click();
	System.out.println("STEP 06 | Select Chart Number ");
	common.log("<br><br>STEP 06 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[9]/td[2]")).click();
	System.out.println("STEP 07 | Select Chart Number ");
	common.log("<br><br>STEP 07 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 07 | Click on Load Button ");
	common.log("<br><br>STEP 07 | Click on Load Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"tabcontent\"]/div/div/div/div[4]/div/div[1]/span/span[2]/span/span[2]")).click();
	System.out.println("STEP 08 | Click on Unlock Button ");
	common.log("<br><br>STEP 08 | Click on Unlock Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"DSGCCPanel\"]/span")).click();
	System.out.println("STEP 10 | Click on DUVASAWKO tab ");
	common.log("<br><br>STEP 10 | Click on DUVASAWKO tab ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"DSGCCForm\"]/div[3]/div[1]/div/label")).click();
	System.out.println("STEP 11 | Click on Complete Checkobox ");
	common.log("<br><br>STEP 11 | Click on Complete Checkobox ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"result_dsgcc_search\"]/table/tbody/tr[1]/td[6]/a")).click();
	System.out.println("STEP 12 | Click on + Button");
	common.log("<br><br>STEP 12 | Click on + Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"current_dsgcc_result\"]/table/tbody/tr[3]/td[6]")).click();
	System.out.println("STEP 13 | Click on delete Button");
	common.log("<br><br>STEP 13 | Click on delete Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"load_next_chart\"]")).click();
	System.out.println("STEP 14 | Click on Next Button ");
	common.log("<br><br>STEP 14 | Click on Next Button ");
	common.pause(10);
}

public void Verify_to_create_new_chart_once_existing_chart_complete() throws InterruptedException, IOException{
    
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[7]/td[2]")).click();
	System.out.println("STEP 06 | Select Chart Number ");
	common.log("<br><br>STEP 06 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 07 | Click on Load Button ");
	common.log("<br><br>STEP 07 | Click on Load Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"tabcontent\"]/div/div/div/div[4]/div/div[1]/span/span[2]/span/span[2]")).click();
	System.out.println("STEP 08 | Click on Unlock Button ");
	common.log("<br><br>STEP 08 | Click on Unlock Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"WRPPanel\"]/span")).click();
	System.out.println("STEP 09 | Click on Answer Key Option ");
	common.log("<br><br>STEP 09 | Click on Answer Key Option ");
	common.pause(10);

	driver.findElement(By.xpath("//*[@id=\"WRPForm\"]/div[3]/div[1]/div/label")).click();
	System.out.println("STEP 10 | Click on Complete Button ");
	common.log("<br><br>STEP 10 | Click on Complete Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"loadnewchart\"]")).click();
	System.out.println("STEP 10 | Click on New Chart Button ");
	common.log("<br><br>STEP 10 | Click on New Chart Button ");
	common.pause(20);
}

public void Verify_to_View_HPI_Parser_tab() throws InterruptedException, IOException{
    
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[7]/td[2]")).click();
	System.out.println("STEP 06 | Select Chart Number ");
	common.log("<br><br>STEP 06 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 07 | Click on Load Button ");
	common.log("<br><br>STEP 07 | Click on Load Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"tabcontent\"]/div/div/div/div[4]/div/div[1]/span/span[2]/span/span[2]")).click();
	System.out.println("STEP 08 | Click on Unlock Button ");
	common.log("<br><br>STEP 08 | Click on Unlock Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"HPIPanel\"]/span")).click();
	System.out.println("STEP 09 | Click on History Of Present Illness ");
	common.log("<br><br>STEP 09 | Click on History Of Present Illness ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"openhpiparsetab\"]")).click();
	System.out.println("STEP 10 | Click on HPI Button ");
	common.log("<br><br>STEP 10 | Click on HPI Button ");
	common.pause(10);
}

public void Verify_to_Load_Chart_no_168_for_HPI_Parser_tab() throws InterruptedException, IOException{
    
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	System.out.println("STEP 06 | Click on Next Page Button ");
	common.log("<br><br>STEP 06 | Click on Next Page Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[12]/td[2]")).click();
	System.out.println("STEP 07 | Select Chart Number ");
	common.log("<br><br>STEP 07 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 08 | Click on Load Button ");
	common.log("<br><br>STEP 08 | Click on Load Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"tabcontent\"]/div/div/div/div[4]/div/div[1]/span/span[2]/span/span[2]")).click();
	System.out.println("STEP 09 | Click on Unlock Button ");
	common.log("<br><br>STEP 09 | Click on Unlock Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"HPIPanel\"]/span")).click();
	System.out.println("STEP 10 | Click on History Of Present Illness ");
	common.log("<br><br>STEP 10 | Click on History Of Present Illness ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"openhpiparsetab\"]")).click();
	System.out.println("STEP 11 | Click on HPI Button ");
	common.log("<br><br>STEP 11 | Click on HPI Button ");
	common.pause(10);
}

public void Verify_to_change_score_based_on_CPT() throws InterruptedException, IOException{
    
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[7]/td[2]")).click();
	System.out.println("STEP 06 | Select Chart Number ");
	common.log("<br><br>STEP 06 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 07 | Click on Load Button ");
	common.log("<br><br>STEP 07 | Click on Load Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"tabcontent\"]/div/div/div/div[4]/div/div[1]/span/span[2]/span/span[2]")).click();
	System.out.println("STEP 08 | Click on Unlock Button ");
	common.log("<br><br>STEP 08 | Click on Unlock Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"WRPPanel\"]/span")).click();
	System.out.println("STEP 09 | Click on Answer Key Option ");
	common.log("<br><br>STEP 09 | Click on Answer Key Option ");
	common.pause(10);

	driver.findElement(By.xpath("//*[@id=\"WRPForm\"]/div[3]/div[1]/div/label")).click();
	System.out.println("STEP 10 | Click on Complete Button ");
	common.log("<br><br>STEP 10 | Click on Complete Button ");
	common.pause(10);
}

public void Verify_to_view_user_Progress() throws InterruptedException, IOException{
    
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"menu_student_progress\"]/span")).click();
	System.out.println("STEP 07 | Click on Student Progress ");
	common.log("<br><br>STEP 07 | Click on Student Progress ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"panel1\"]/span")).isDisplayed();
	System.out.println("STEP 08 | Verify It display Student Progress!!! ");
	common.log("<br><br>STEP 08 | Verify It display Student Progress!!! ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"overview\"]/div[1]/div[5]/div/label[5]")).click();
	System.out.println("STEP 09 | Click on All Time Raio Button ");
	common.log("<br><br>STEP 09 | Click on All Time Raio Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"studentgrid\"]/table/tbody/tr[4]/td[3]")).click();
	System.out.println("STEP 10 | Select User from List ");
	common.log("<br><br>STEP 10 | Select User from List ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"testhistory\"]/table/tbody/tr/td[2]")).click();
	System.out.println("STEP 11 | Click on Test History By Day ");
	common.log("<br><br>STEP 11 | Click on Test History By Day ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"question\"]/table/tbody/tr[1]/td[3]")).isDisplayed();
	System.out.println("STEP 12 | Verify It Display User Progress ");
	common.log("<br><br>STEP 12 | Verify It Display User Progress ");
	common.pause(10);
	
}

public void Verify_to_search_Student_by_name_and_no_record_found_display_message() throws InterruptedException, IOException{
    
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"menu_student_progress\"]/span")).click();
	System.out.println("STEP 07 | Click on Student Progress ");
	common.log("<br><br>STEP 07 | Click on Student Progress ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"panel1\"]/span")).isDisplayed();
	System.out.println("STEP 08 | Verify It display Student Progress!!! ");
	common.log("<br><br>STEP 08 | Verify It display Student Progress!!! ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"overview\"]/div[1]/div[5]/div/label[5]")).click();
	System.out.println("STEP 09 | Click on All Time Raio Button ");
	common.log("<br><br>STEP 09 | Click on All Time Raio Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"overview\"]/div[1]/div[1]/input")).sendKeys("May");
	System.out.println("STEP 09 | Enter Name to Search ");
	common.log("<br><br>STEP 09 | Enter Name to Search ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"overview\"]/div[1]/div[5]/div/label[5]")).click();
	System.out.println("STEP 10 | Verify It Display Search Result ");
	common.log("<br><br>STEP 10 | Verify It Display Search Result ");
	common.pause(10);
}

public void Verify_to_view_Manage_Stage() throws InterruptedException, IOException{
    
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"menu_student_progress\"]/span")).click();
	System.out.println("STEP 06 | Click on Training Tools ");
	common.log("<br><br>STEP 06 | Click on Training Tools ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"menu_manage_test\"]/span")).click();
	System.out.println("STEP 07 | Click on Manage Test ");
	common.log("<br><br>STEP 07 | Click on Manage Test ");
	common.pause(10);

	driver.findElement(By.xpath("//*[@id=\"manage_test_container\"]/div/div[1]/div/label")).isDisplayed();
	System.out.println("STEP 08 | Click on Visit Type ");
	common.log("<br><br>STEP 08 | Click on Visit Type ");
	common.pause(10);
}

public void Verify_to_Load_Chart_no_524_to_Load_all_data() throws InterruptedException, IOException{
    
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	driver.findElement(By.xpath("//*[@id=\"grid_result_chart_finder\"]/div/a[3]/span")).click();
	common.pause(10);
	System.out.println("STEP 06 | Click on Next Page Button ");
	common.log("<br><br>STEP 06 | Click on Next Page Button ");
	common.pause(10);

	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[8]/td[2]")).click();
	System.out.println("STEP 07 | Select Chart Number ");
	common.log("<br><br>STEP 07 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 08 | Click on Load Button ");
	common.log("<br><br>STEP 08 | Click on Load Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"tabcontent\"]/div/div/div/div[4]/div/div[1]/span/span[2]/span/span[2]")).click();
	System.out.println("STEP 09 | Click on Unlock Button ");
	common.log("<br><br>STEP 09 | Click on Unlock Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"HPIPanel\"]/span")).click();
	System.out.println("STEP 10 | Click on History Of Present Illness ");
	common.log("<br><br>STEP 10 | Click on History Of Present Illness ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"openhpiparsetab\"]")).click();
	System.out.println("STEP 11 | Click on HPI Button ");
	common.log("<br><br>STEP 11 | Click on HPI Button ");
	common.pause(10);
}

public void Verify_to_load_charts() throws InterruptedException, IOException{
    
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[8]/td[2]")).click();
	System.out.println("STEP 06 | Select Chart Number ");
	common.log("<br><br>STEP 06 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[9]/td[2]")).click();
	System.out.println("STEP 07 | Select Chart Number ");
	common.log("<br><br>STEP 07 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 07 | Click on Load Button ");
	common.log("<br><br>STEP 07 | Click on Load Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"tabcontent\"]/div/div/div/div[4]/div/div[1]/span/span[2]/span/span[2]")).click();
	System.out.println("STEP 08 | Click on Unlock Button ");
	common.log("<br><br>STEP 08 | Click on Unlock Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"load_next_chart\"]")).click();
	System.out.println("STEP 09 | Click on Next Button ");
	common.log("<br><br>STEP 09 | Click on Next Button ");
	common.pause(10);
}

public void Verify_to_functionality_of_Email() throws InterruptedException, IOException{
    
	verify_login_details_of_admin();
	common.pause(20);

	driver.findElement(By.xpath("//div[3]/div[1]/ul/li[6]/div/span[1]")).click();
	System.out.println("STEP 06 | Click on Utilities ");
	common.log("<br><br>STEP 06 | Click on Utilities ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"menu_manage_email\"]/span")).click();
	System.out.println("STEP 07 | Click on Manage Email ");
	common.log("<br><br>STEP 07 | Click on Manage Email ");
	common.pause(10);
}

public void Verify_to_check_Risk_Level() throws InterruptedException, IOException{
    
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//html/body/div[3]/div[1]/ul/li[7]/div/span[1]")).click();
	System.out.println("STEP 06 | Click on Coding Tools ");
	common.log("<br><br>STEP 06 | Click on Coding Tools  ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"menu_manage_dsgcc\"]/span")).click();
	System.out.println("STEP 07 | Click on Manage DSGCC ");
	common.log("<br><br>STEP 07 | Click on Manage DSGCC ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"tabcontent\"]/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/div[1]/label/span")).isDisplayed();
	System.out.println("STEP 08 | Verify It Display Risk Level ");
	common.log("<br><br>STEP 08 | Verify It Display Risk Level ");
	common.pause(10);
}

public void Verify_to_refresh_page_and_charts_list() throws InterruptedException, IOException{
    
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[8]/td[2]")).click();
	System.out.println("STEP 06 | Select Chart Number ");
	common.log("<br><br>STEP 06 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[9]/td[2]")).click();
	System.out.println("STEP 07 | Select Chart Number ");
	common.log("<br><br>STEP 07 | Select Chart Number ");
	common.pause(10);
}

public void Verify_to_search_chart_by_Page_Range() throws InterruptedException, IOException{
    
	verify_login_details_of_admin();
	common.pause(20);

	driver.findElement(By.xpath("//*[@id=\"MD_FINDForm\"]/div/div[3]/div/div[4]/div/div/div/ul/li[7]/span")).click();
	System.out.println("STEP 06 | Select Page Number ");
	common.log("<br><br>STEP 06 | Select Page Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"MD_FINDForm\"]/div/div[3]/div/div[4]/div/div/div/ul/li[16]/span")).click();
	System.out.println("STEP 07 | Select Page Number ");
	common.log("<br><br>STEP 07 | Select Page Number ");
	common.pause(10);
}

public void Verify_to_display_error_message_when_user_upload_any_other_format_file() throws InterruptedException, IOException{
    
	verify_login_details_of_admin();
	common.pause(20);
}


public void Verify_to_display_data_as_per_Select_Data_Grid() throws InterruptedException, IOException{
    
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"menu_student_progress\"]/span")).click();
	System.out.println("STEP 07 | Click on Student Progress ");
	common.log("<br><br>STEP 07 | Click on Student Progress ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"panel1\"]/span")).isDisplayed();
	System.out.println("STEP 08 | Verify It display Student Progress!!! ");
	common.log("<br><br>STEP 08 | Verify It display Student Progress!!! ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"overview\"]/div[1]/div[5]/div/label[5]")).click();
	System.out.println("STEP 09 | Click on All Time Raio Button ");
	common.log("<br><br>STEP 09 | Click on All Time Raio Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"studentgrid\"]/div/span[1]/span/span/span[2]")).click();
	System.out.println("STEP 10 | Click on Data Gride to Select other option ");
	common.log("<br><br>STEP 10 | Click on Data Gride to Select other option ");
	common.pause(10);
	
	 Actions builder = new Actions(driver);
	  builder.sendKeys(Keys.ARROW_UP);
	  builder.sendKeys(Keys.ENTER);
	  common.pause(10);
	  
}

public void Verify_to_Clear_Filters() throws InterruptedException, IOException, AWTException{
    
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"menu_student_progress\"]/span")).click();
	System.out.println("STEP 07 | Click on Student Progress ");
	common.log("<br><br>STEP 07 | Click on Student Progress ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"panel1\"]/span")).isDisplayed();
	System.out.println("STEP 08 | Verify It display Student Progress!!! ");
	common.log("<br><br>STEP 08 | Verify It display Student Progress!!! ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"overview\"]/div[1]/div[5]/div/label[5]")).click();
	System.out.println("STEP 09 | Click on All Time Raio Button ");
	common.log("<br><br>STEP 09 | Click on All Time Raio Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"overview\"]/div[1]/div[4]/div/label[3]")).click();
	System.out.println("STEP 10 | Click on Test Raio Button ");
	common.log("<br><br>STEP 10 | Click on Test Raio Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"overview\"]/div[1]/div[2]/span/span/span[2]")).click();
	common.pause(5);
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	common.pause(10);
	System.out.println("STEP 11 | Click on User Type Dropdown ");
	common.log("<br><br>STEP 11 | Click on User Type Dropdown ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"clearFilter\"]")).click();
	System.out.println("STEP 12 | Click on Clear Button ");
	common.log("<br><br>STEP 12 | Click on Clear Button ");
	common.pause(10);
}

public void Verify_to_apply_Classification_filter() throws InterruptedException, IOException, AWTException{
    
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//html/body/div[3]/div[1]/ul/li[4]/div/span[1]")).click();
	System.out.println("STEP 07 | Click on Answer Key ");
	common.log("<br><br>STEP 07 | Click on Answer Key ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"menu_student_answer_key\"]/span")).click();
	System.out.println("STEP 08 | Click on Student Answer Key ");
	common.log("<br><br>STEP 08 | Click on Student Answer Key ");
	common.pause(30);
	
	driver.findElement(By.xpath("//*[@id=\"search_studentasnwerkey\"]/div[1]/div[4]/div/div/div/label[2]")).click();
	System.out.println("STEP 09 | Select Classification Filter ");
	common.log("<br><br>STEP 09 | Select Classification Filter ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"student_answer_key_grid\"]/table/tbody/tr/td[4]")).isDisplayed();
	System.out.println("STEP 10 | Verify it Display Apply Filter Data ");
	common.log("<br><br>STEP 10 | Verify it Display Apply Filter Data ");
	common.pause(10);
}

public void Verify_to_Select_First_Provider() throws InterruptedException, IOException, AWTException{
    
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//html/body/div[3]/div[1]/ul/li[4]/div/span[1]")).click();
	System.out.println("STEP 07 | Click on Answer Key ");
	common.log("<br><br>STEP 07 | Click on Answer Key ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"menu_student_answer_key\"]/span")).click();
	System.out.println("STEP 08 | Click on Student Answer Key ");
	common.log("<br><br>STEP 08 | Click on Student Answer Key ");
	common.pause(30);
	
	driver.findElement(By.xpath("//*[@id=\"search_studentasnwerkey\"]/div[1]/div[5]/div/span/span/span[2]/span")).click();
	common.pause(5);
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	common.pause(10);
	System.out.println("STEP 09 | Click on User Type Dropdown ");
	common.log("<br><br>STEP 09 | Click on User Type Dropdown ");
	common.pause(10);
}

public void Verify_to_Select_Next_and_Back_button_for_Data_Grid() throws InterruptedException, IOException, AWTException{
    
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"menu_student_progress\"]/span")).click();
	System.out.println("STEP 07 | Click on Student Progress ");
	common.log("<br><br>STEP 07 | Click on Student Progress ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"panel1\"]/span")).isDisplayed();
	System.out.println("STEP 08 | Verify It display Student Progress!!! ");
	common.log("<br><br>STEP 08 | Verify It display Student Progress!!! ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"overview\"]/div[1]/div[5]/div/label[5]")).click();
	System.out.println("STEP 09 | Click on All Time Raio Button ");
	common.log("<br><br>STEP 09 | Click on All Time Raio Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"studentgrid\"]/div/a[3]/span")).click();
	System.out.println("STEP 10 | Click on Next Button ");
	common.log("<br><br>STEP 10 | Click on Next Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"studentgrid\"]/div/a[2]/span")).click();
	System.out.println("STEP 11 | Click on Previous Button ");
	common.log("<br><br>STEP 11 | Click on Previous Button ");
	common.pause(10);
}

public void Verify_to_Clear_data() throws InterruptedException, IOException, AWTException{
    
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//html/body/div[3]/div[1]/ul/li[4]/div/span[1]")).click();
	System.out.println("STEP 07 | Click on Answer Key ");
	common.log("<br><br>STEP 07 | Click on Answer Key ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"menu_student_answer_key\"]/span")).click();
	System.out.println("STEP 08 | Click on Student Answer Key ");
	common.log("<br><br>STEP 08 | Click on Student Answer Key ");
	common.pause(30);
	
	driver.findElement(By.xpath("//*[@id=\"addkey\"]")).click();
	System.out.println("STEP 09 | Click on Add Option ");
	common.log("<br><br>STEP 09 | Click on Add Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"add_Chart\"]")).sendKeys("342");
	System.out.println("STEP 10 | Enter Chart No. ");
	common.log("<br><br>STEP 10 | Enter Chart No. ");
	common.pause(10);
	
//	driver.findElement(By.xpath("//*[@id=\"panel1\"]/div[1]/div[1]/div/div[2]/div")).sendKeys("e");
//	common.pause(5);
//	driver.findElement(By.xpath("//*[@id=\"add_Testname_id_taglist\"]/li/span[1]")).click();
	
	driver.findElement(By.xpath("//*[@id=\"add_CPTSTRING\"]")).sendKeys("34134");
	System.out.println("STEP 11 | Enter CPT No. ");
	common.log("<br><br>STEP 11 | Enter Chart No. ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"panel1\"]/div[1]/div[1]/div/div[5]/div[1]/label[2]")).click();
	System.out.println("STEP 12 | Select Classification ");
	common.log("<br><br>STEP 12 | Select Classification ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"clear_user\"]")).click();
	System.out.println("STEP 13 | Click on Clear Button ");
	common.log("<br><br>STEP 13 | Click on Clear Button ");
	common.pause(10);
}

public void Verify_to_click_on_Statistics() throws InterruptedException, IOException, AWTException{
    
	Verify_to_check_dates_functionality();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"tabcontent\"]/div/div/div[2]/div[1]/div/div[2]/div[1]/div/div/div[1]")).click();
	System.out.println("STEP 09 | Click on Statistics ");
	common.log("<br><br>STEP 09 | Click on Statistics ");
	common.pause(10);
}

public void Verify_to_Add_New_Row() throws InterruptedException, IOException, AWTException{
    
	verify_login_details_of_admin();
	common.pause(20);
}

public void Verify_to_check_Stage_and_Role_filter() throws InterruptedException, IOException, AWTException{
    
	verify_login_details_of_admin();
	common.pause(20);
}

public void Verify_to_Change_values_in_Parameters() throws InterruptedException, IOException, AWTException{
    
	Verify_to_view_Parameter();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"parameter_tab_section-1\"]/div/div/div[1]/div[1]/label[2]")).click();
	System.out.println("STEP 09 | Select Trainee Option ");
	common.log("<br><br>STEP 09 | Select Trainee Option ");
	common.pause(10);
	
	WebElement edit_Chart_hour = driver.findElement(By.xpath("//*[@id=\"TRAINEE_chartsperhour\"]"));
	edit_Chart_hour.clear();
	edit_Chart_hour.sendKeys("4");
	System.out.println("STEP 10 | Edit Chart Per Hour ");
	common.log("<br><br>STEP 10 | Edit Chart Per Hour ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"parameter_submit\"]")).click();
	System.out.println("STEP 11 | Click on Submit Button ");
	common.log("<br><br>STEP 11 | Click on Submit Button ");
	common.pause(10);
}

public void Verify_to_Check_Sorting() throws InterruptedException, IOException, AWTException{
    
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//html/body/div[3]/div[1]/ul/li[7]/div/span[1]")).click();
	System.out.println("STEP 06 | Click on Coding Tools ");
	common.log("<br><br>STEP 06 | Click on Coding Tools  ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"menu_manage_dsgcc\"]/span")).click();
	System.out.println("STEP 07 | Click on Manage DSGCC ");
	common.log("<br><br>STEP 07 | Click on Manage DSGCC ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"tabcontent\"]/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/div[1]/label/span")).click();
	System.out.println("STEP 08 | Select any Risk Level ");
	common.log("<br><br>STEP 08 | Select any Risk Level ");
	common.pause(10);
	
	driver.findElement(By.xpath("//html/body/div[3]/div[2]/div/div/div/div[3]/div/div/table/thead/tr/th[1]/a")).click();
	System.out.println("STEP 09 | Click on Level Ascending Level ");
	common.log("<br><br>STEP 09 | Click on Level Ascending Level ");
	common.pause(10);
	
	driver.findElement(By.xpath("//html/body/div[3]/div[2]/div/div/div/div[3]/div/div/table/thead/tr/th[1]/a")).click();
	System.out.println("STEP 09 | Click on Level Descending Level ");
	common.log("<br><br>STEP 09 | Click on Level Descending Level ");
	common.pause(10);
	
}





}
