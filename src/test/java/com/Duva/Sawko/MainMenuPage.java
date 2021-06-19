package com.Duva.Sawko;

import java.io.IOException;
import java.text.DateFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;


public class MainMenuPage {

	 WebDriver driver ;
     Common common = new Common(driver);
     DateFormat dateFormat;
     
     public MainMenuPage(WebDriver d) {
 		driver = d;
 		common = new Common(d);
 		PageFactory.initElements(this.driver, this);
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

	public void Verify_to_select_radio_buttons() throws InterruptedException, IOException {

		driver.findElement(By.xpath(
				"//html/body/div[3]/div[2]/div/div/div[2]/div[1]/div/form/div[4]/div/div[4]/div[1]/div[2]/div/label[1]"))
				.click();
		System.out.println("STEP 08 | Select Yes Option ");
		common.log("<br><br>STEP 08 | Select Yes Option ");
		common.pause(10);

		driver.findElement(By.xpath("//*[@id=\"showhidetabstrip-1\"]/div[1]/div[2]/div[2]/div/label[2]")).click();
		System.out.println("STEP 09 | Select No Option ");
		common.log("<br><br>STEP 09 | Select No Option ");
		common.pause(10);

		driver.findElement(By.xpath("//*[@id=\"showhidetabstrip-1\"]/div[1]/div[4]/div[2]/div/label[2]")).click();
		System.out.println("STEP 10 | Select No Option for Overall Risk ");
		common.log("<br><br>STEP 10 | Select No Option for Overall Risk  ");
		common.pause(10);
	}
	
	public void Verify_to_Edit_Classification() throws InterruptedException, IOException {
		
		driver.findElement(By.xpath("//*[@id=\"student_answer_key_grid\"]/table/tbody/tr/td[2]")).click();
		System.out.println("STEP 10 | Select Test from List ");
		common.log("<br><br>STEP 10 | Select Test from List ");
		common.pause(10);

		driver.findElement(By.xpath("//*[@id=\"panel1\"]/div[1]/div[1]/div/div[5]/div[1]/label[3]")).click();
		System.out.println("STEP 11 | Edit Classfication ");
		common.log("<br><br>STEP 11 | Edit Classfication ");
		common.pause(10);

		driver.findElement(By.xpath("//*[@id=\"done_edit\"]")).click();
		System.out.println("STEP 12 | Click on Done Edit Button ");
		common.log("<br><br>STEP 12 | Click on Done Edit Button ");
		common.pause(10);
	}
	
public void Verify_to_select_all_radio_button_in_Add_User() throws InterruptedException, IOException {
		
	driver.findElement(By.xpath("//label[text()='Admin']")).click();
	System.out.println("STEP 09 | Click on Admin Radio Button ");
	common.log("<br><br>STEP 09 | Click on Admin Radio Button ");
	common.pause(10);

	driver.findElement(By.xpath("//label[text()='Supervisor']")).click();
	System.out.println("STEP 10 | Click on Supervisor Radio Button ");
	common.log("<br><br>STEP 10 | Click on Supervisor Radio Button ");
	common.pause(10);

	driver.findElement(By.xpath("//label[text()='Lead']")).click();
	System.out.println("STEP 11 | Click on Lead Radio Button ");
	common.log("<br><br>STEP 11 | Click on Lead Radio Button ");
	common.pause(10);
}

public void Verify_to_reset_fill_data_in_chart_finder() throws InterruptedException, IOException {
	
	driver.findElement(By.xpath("//span[text()='Cerner']")).click();
	System.out.println("STEP 09 | Select EMR Option ");
	common.log("<br><br>STEP 09 | Select EMR Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//span[text()='Straightforward']")).click();
	System.out.println("STEP 10 | Select Classification Option ");
	common.log("<br><br>STEP 10 | Select Classification Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//span[text()='No']")).click();
	System.out.println("STEP 11 | Select Downcoded Option ");
	common.log("<br><br>STEP 11 | Select Downcoded Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"MD_FINDForm\"]/div/div[3]/div/div[4]/div/div/div/ul/li[7]/span")).click();
	System.out.println("STEP 12 | Select Pages Option ");
	common.log("<br><br>STEP 12 | Select Pages Option ");
	common.pause(10);
}
public void Verify_to_load_charts_and_when_user_add_more_it_increase_chat_number_load_it() throws InterruptedException, IOException {
	
	driver.findElement(By.xpath("//*[@id=\"chart_loader_tabstrip\"]/ul/li[1]/span[2]")).click();
	System.out.println("STEP 13 | Click on Chart Finder Tab ");
	common.log("<br><br>STEP 13 | Click on Chart Finder Tab ");
	common.pause(10);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[8]/td[2]")).click();
	System.out.println("STEP 14 | Select Chart Number ");
	common.log("<br><br>STEP 14 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 15 | Click on Load Button ");
	common.log("<br><br>STEP 15 | Click on Load Button ");
	common.pause(20);
}

public void Verify_to_select_all_Date_of_Last_Updates() throws InterruptedException, IOException{
    
	driver.findElement(By.xpath("//*[@id=\"overview\"]/div[1]/div[5]/div/label[5]")).click();
	System.out.println("STEP 09 | Click on All Time Raio Button ");
	common.log("<br><br>STEP 09 | Click on All Time Raio Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"overview\"]/div[1]/div[5]/div/label[4]")).click();
	System.out.println("STEP 10 | Click on Last Day 7 Raio Button ");
	common.log("<br><br>STEP 10 | Click on Last Day 7 Raio Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"overview\"]/div[1]/div[5]/div/label[4]")).click();
	System.out.println("STEP 11 | Click on Last Day 3 Raio Button ");
	common.log("<br><br>STEP 11 | Click on Last Day 3 Raio Button ");
	common.pause(10);
}

public void Verify_to_apply_datagrid() throws InterruptedException, IOException{
	driver.findElement(By.xpath("//html/body/div[3]/div[2]/div/div/div[2]/div[3]/div/div/div[2]/span[1]/span/span/span[1]")).click();
	common.pause(5);
//	driver.findElement(By.xpath("//li[text()='10']")).click();
	System.out.println("STEP 07 | Click on Item Per Page Dropdown ");
	common.log("<br><br>STEP 07 | Click on Item Per Page Dropdown ");
	common.pause(20);
}

public void Verify_to_load_all_charts_when_user_select_one_Chart_from_In_Progress_and_one_Chart_from_Complete_status() throws InterruptedException, IOException{
	 
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[6]/td[2]")).click();
	System.out.println("STEP 10 | Select Chart Number ");
	common.log("<br><br>STEP 10 | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP 11 | Click on Load Button ");
	common.log("<br><br>STEP 11 | Click on Load Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"common_submit_btn\"]")).click();
	System.out.println("STEP 12 | Click on Submit Button ");
	common.log("<br><br>STEP 12 | Click on Submit Button ");
	common.pause(20);
}
public void Verify_to_enter_CPT_and_Provider1() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"WRPForm\"]/div[3]/div[1]/div/label/span")).click();
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"cpt_1\"]")).sendKeys("99286");
	System.out.println("STEP  | Enter CPT ");
	common.log("<br><br>STEP  | Enter CPT ");
	common.pause(10);
	
	driver.findElement(By.xpath("//html/body/div[3]/div[2]/div/div/div/div[4]/div/div[2]/div/div[4]/ul/li[12]/div/form/div[3]/div[6]/div/div/table/tbody/tr[1]/td[2]/span/span/span[1]")).click();
	common.pause(5);
	driver.findElement(By.xpath("//html/body/div[38]/div/div[2]/ul/li[22]")).click();
	System.out.println("STEP  | Select Provider 1 from Dropdown ");
	common.log("<br><br>STEP  | Select Provider 1 from Dropdown ");
	common.pause(20);
}

public void Verify_to_Lock_Message_not_display_on_Chart_Finder() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"chart_loader_tabstrip\"]/ul/li[1]/span[2]")).click();
	System.out.println("STEP  | Click on Chart Finder Tab ");
	common.log("<br><br>STEP  | Click on Chart Finder Tab ");
	common.pause(20);
}
public void Verify_to_find_chart_by_History_of_Present_illness() throws InterruptedException, IOException{
	
	driver.findElement(By.xpath("//*[@id=\"HPI_FINDForm\"]/div/div/div/div[1]/div[1]/div/div/label/span")).click();
	System.out.println("STEP  | Select Is there a history caveat? ");
	common.log("<br><br>STEP  | Select Is there a history caveat? ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"HPI_FINDForm\"]/div/div/div/div[1]/div[2]/div/div/label/span")).click();
	System.out.println("STEP  | Select Is there a chief complaint documented? ");
	common.log("<br><br>STEP  | Select Is there a chief complaint documented? ");
	common.pause(10);
}

public void Verify_to_find_chart_by_Review_of_System() throws InterruptedException, IOException{
	
	driver.findElement(By.xpath("//*[@id=\"ROSPanel_FIND\"]/div/div/div/div[1]/div/div/div/label[2]/span")).click();
	System.out.println("STEP  | Select Is there a history caveat? ");
	common.log("<br><br>STEP  | Select Is there a history caveat? ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"ROSPanel_FIND\"]/div/div/div/div[2]/div/div/label[2]/span")).click();
	System.out.println("STEP  | Select Were all systems reviewed? ");
	common.log("<br><br>STEP  | Select Were all systems reviewed? ");
	common.pause(10);
}

	

}
