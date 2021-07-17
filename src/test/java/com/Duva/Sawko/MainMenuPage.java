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
 		
 		System.out.println("STEP  | Open URL ");
 		common.log("<br><br>STEP  | Open URL ");
 		common.pause(10);
 		
 		System.out.println("STEP  | Enter Email address of Admin ");
 		common.log("<br><br>STEP  | Enter Email address of Admin  ");
 		WebElement email = driver.findElement(By.xpath("//*[@id='validationDefaultUsername']"));
 		email.sendKeys("x@x.com");
 		common.pause(10);
 		
 		System.out.println("STEP  | Enter Password of Admin ");
 		common.log("<br><br>STEP  | Enter Password of Admin  ");
 		WebElement password = driver.findElement(By.xpath("//*[@id='validationDefaultUserpassword']"));
 		password.sendKeys("duvadev2018");
 		common.pause(10);
 		
 		WebElement SignIn_button = driver.findElement(By.xpath("//*[@id='signin']/div[3]/div[3]/button"));
 		SignIn_button.click();
 		System.out.println("STEP  | Click on Sign In button ");
 		common.log("<br><br>STEP  | Click on Sign In button  ");
 		common.pause(50);
 		
 		System.out.println("STEP  | Admin Logged In Successfully  ");
 		common.log("<br><br>STEP  | Admin Logged In  Successfully  ");
 		common.pause(20);

  	}

	public void Verify_to_select_radio_buttons() throws InterruptedException, IOException {

		driver.findElement(By.xpath(
				"//html/body/div[3]/div[2]/div/div/div[2]/div[1]/div/form/div[4]/div/div[4]/div[1]/div[2]/div/label[1]"))
				.click();
		System.out.println("STEP  | Select Yes Option ");
		common.log("<br><br>STEP  | Select Yes Option ");
		common.pause(10);

		driver.findElement(By.xpath("//*[@id=\"showhidetabstrip-1\"]/div[1]/div[2]/div[2]/div/label[2]")).click();
		System.out.println("STEP  | Select No Option ");
		common.log("<br><br>STEP  | Select No Option ");
		common.pause(10);

		driver.findElement(By.xpath("//*[@id=\"showhidetabstrip-1\"]/div[1]/div[4]/div[2]/div/label[2]")).click();
		System.out.println("STEP  | Select No Option for Overall Risk ");
		common.log("<br><br>STEP  | Select No Option for Overall Risk  ");
		common.pause(10);
	}
	
	public void Verify_to_Edit_Classification() throws InterruptedException, IOException {
		
		driver.findElement(By.xpath("//*[@id=\"student_answer_key_grid\"]/table/tbody/tr/td[2]")).click();
		System.out.println("STEP  | Select Test from List ");
		common.log("<br><br>STEP  | Select Test from List ");
		common.pause(10);

		driver.findElement(By.xpath("//*[@id=\"panel1\"]/div[1]/div[1]/div/div[5]/div[1]/label[3]")).click();
		System.out.println("STEP  | Edit Classfication ");
		common.log("<br><br>STEP  | Edit Classfication ");
		common.pause(10);

		driver.findElement(By.xpath("//*[@id=\"done_edit\"]")).click();
		System.out.println("STEP  | Click on Done Edit Button ");
		common.log("<br><br>STEP  | Click on Done Edit Button ");
		common.pause(10);
	}
	
public void Verify_to_select_all_radio_button_in_Add_User() throws InterruptedException, IOException {
		
	driver.findElement(By.xpath("//label[text()='Admin']")).click();
	System.out.println("STEP  | Click on Admin Radio Button ");
	common.log("<br><br>STEP  | Click on Admin Radio Button ");
	common.pause(10);

	driver.findElement(By.xpath("//label[text()='Supervisor']")).click();
	System.out.println("STEP  | Click on Supervisor Radio Button ");
	common.log("<br><br>STEP  | Click on Supervisor Radio Button ");
	common.pause(10);

	driver.findElement(By.xpath("//label[text()='Lead']")).click();
	System.out.println("STEP  | Click on Lead Radio Button ");
	common.log("<br><br>STEP  | Click on Lead Radio Button ");
	common.pause(10);
}

public void Verify_to_reset_fill_data_in_chart_finder() throws InterruptedException, IOException {
	
	driver.findElement(By.xpath("//span[text()='Cerner']")).click();
	System.out.println("STEP  | Select EMR Option ");
	common.log("<br><br>STEP  | Select EMR Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//span[text()='Straightforward']")).click();
	System.out.println("STEP  | Select Classification Option ");
	common.log("<br><br>STEP  | Select Classification Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//span[text()='No']")).click();
	System.out.println("STEP  | Select Downcoded Option ");
	common.log("<br><br>STEP  | Select Downcoded Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"MD_FINDForm\"]/div/div[3]/div/div[4]/div/div/div/ul/li[7]/span")).click();
	System.out.println("STEP  | Select Pages Option ");
	common.log("<br><br>STEP  | Select Pages Option ");
	common.pause(10);
}
public void Verify_to_load_charts_and_when_user_add_more_it_increase_chat_number_load_it() throws InterruptedException, IOException {
	
	driver.findElement(By.xpath("//*[@id=\"chart_loader_tabstrip\"]/ul/li[1]/span[2]")).click();
	System.out.println("STEP  | Click on Chart Finder Tab ");
	common.log("<br><br>STEP  | Click on Chart Finder Tab ");
	common.pause(10);
	
	driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div[6]/div[4]/div[2]/table/tbody/tr[8]/td[2]")).click();
	System.out.println("STEP  | Select Chart Number ");
	common.log("<br><br>STEP  | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"goloadcharts\"]")).click();
	System.out.println("STEP  | Click on Load Button ");
	common.log("<br><br>STEP  | Click on Load Button ");
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

public void Verify_to_find_chart_by_Past_Medical_Family() throws InterruptedException, IOException{
	
	driver.findElement(By.xpath("//*[@id=\"PFSHPanel_FIND\"]/div/div/div/div[1]/div/div/label[2]/span")).click();
	System.out.println("STEP  | Select Past Medical/Surgical History Documented ");
	common.log("<br><br>STEP  | Select Past Medical/Surgical History Documented ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"PFSHPanel_FIND\"]/div/div/div/div[2]/div/div/label[1]/span")).click();
	System.out.println("STEP  | Select Family History Documented? ");
	common.log("<br><br>STEP  | Select Family History Documented? ");
	common.pause(10);
}

public void Verify_to_find_chart_by_Pysical_Examination() throws InterruptedException, IOException{
	
	driver.findElement(By.xpath("//*[@id=\"PEPanel_FIND\"]/div/div/div/div[1]/div/div/div/label[2]/span")).click();
	System.out.println("STEP  | Select Fever ≥ 100.5°F or 38.0°C documented in the ED");
	common.log("<br><br>STEP  | Select Fever ≥ 100.5°F or 38.0°C documented in the ED ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"PEPanel_FIND\"]/div/div/div/div[3]/div/label/span")).click();
	System.out.println("STEP  | Select Gastrointestinal ");
	common.log("<br><br>STEP  | Select Gastrointestinal ");
	common.pause(10);
}

public void Verify_to_find_chart_by_Orders() throws InterruptedException, IOException{
	
	driver.findElement(By.xpath("//*[@id=\"orders-tabs-find-1\"]/div/div[1]/div[1]/div/div/div/label[2]/span")).click();
	System.out.println("STEP  | Select CT Special Studies ");
	common.log("<br><br>STEP  | Select CT Special Studies ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"orders-tabs-find\"]/ul/li[2]/span[2]")).click();
	System.out.println("STEP  | Click on Ancillary Studies Tab ");
	common.log("<br><br>STEP  | Click on Ancillary Studies Tab ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"orders-tabs-find-2\"]/div/div[3]/div/div/label[3]/span")).click();
	System.out.println("STEP  | Select Lab Ancillary Studies ");
	common.log("<br><br>STEP  | Select Lab Ancillary Studies ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"orders-tabs-find\"]/ul/li[3]/span[2]")).click();
	System.out.println("STEP  | Select Medication tab ");
	common.log("<br><br>STEP  | Select Medication tab ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"orders-tabs-find-3\"]/div/div[1]/div/div/label[1]")).click();
	System.out.println("STEP  | Select IV fluids ");
	common.log("<br><br>STEP  | Select IV fluids ");
	common.pause(10);
}

public void Verify_to_find_chart_by_MDM() throws InterruptedException, IOException{
	
//	driver.findElement(By.xpath("//*[@id=\"PEPanel_FIND\"]/div/div/div/div[1]/div/div/div/label[2]/span")).click();
	System.out.println("STEP  | Select Self limited/minor ");
	common.log("<br><br>STEP  | Select Self limited/minor ");
	common.pause(10);
	
//	driver.findElement(By.xpath("//*[@id=\"PEPanel_FIND\"]/div/div/div/div[3]/div/label/span")).click();
	System.out.println("STEP  | Select Established problem, stable; improved ");
	common.log("<br><br>STEP  | Select Established problem, stable; improved ");
	common.pause(10);
}

public void Verify_to_find_chart_by_Duvasawko_Guideline() throws InterruptedException, IOException{
	
	driver.findElement(By.xpath("//html/body/div[3]/div[2]/div/div/div/div[4]/div/div[2]/div/div[3]/ul/li[9]/div/div/div[3]/table/tbody/tr[3]/td[5]")).click();
	System.out.println("STEP  | Select Risk Level ");
	common.log("<br><br>STEP  | Select Risk Level ");
	common.pause(10);
}

public void Verify_to_find_chart_by_Addenda_Attestation() throws InterruptedException, IOException{
	
	driver.findElement(By.xpath("//*[@id=\"AAPanel_FIND\"]/div/div/div/div[1]/div/div/label[2]")).click();
	System.out.println("STEP  | Select Is there an addenda? ");
	common.log("<br><br>STEP  | Select Is there an addenda? ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"AAPanel_FIND\"]/div/div/div/div[2]/div/div/label[2]")).click();
	System.out.println("STEP  | Select Is this a split/shared visit? ");
	common.log("<br><br>STEP  | Select Is this a split/shared visit? ");
	common.pause(10);
}

public void Verify_to_find_chart_by_Reset_Button() throws InterruptedException, IOException{
	
	driver.findElement(By.xpath("//*[@id=\"reset_filter\"]")).click();
	System.out.println("STEP  | Click on Reset Button ");
	common.log("<br><br>STEP  | Click on Reset Button ");
	common.pause(10);
}


public void Verify_to_Parameters_Show_hide_Left_options() throws InterruptedException, IOException{
	
	driver.findElement(By.xpath("//*[@id=\"APPLICANT_stage5_values\"]/div[1]/div[2]/div/label[1]")).click();
	System.out.println("STEP  | Select Basic Information ");
	common.log("<br><br>STEP  | Select Basic Information ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"APPLICANT_stage5_values\"]/div[2]/div[2]/div/label[1]")).click();
	System.out.println("STEP  | Select Diagnosis And Management Option ");
	common.log("<br><br>STEP  | Select Diagnosis And Management Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"APPLICANT_stage5_values\"]/div[5]/div[2]/div/label[1]")).click();
	System.out.println("STEP  | Select E/M Summary For Coders ");
	common.log("<br><br>STEP  | Select E/M Summary For Coders ");
	common.pause(10);
}

public void Verify_to_Find_Chart_Edit_Chart() throws InterruptedException, IOException{
	
	driver.findElement(By.xpath("//*[@id=\"search_studentasnwerkey\"]/div[1]/div[1]/div/span/span")).click();
	common.pause(5);
	driver.findElement(By.xpath("//li[text()='43']")).click();
	System.out.println("STEP  | Select Chart ");
	common.log("<br><br>STEP  | Select Chart ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"student_answer_key_grid\"]/table/tbody/tr/td[4]")).click();
	System.out.println("STEP  | Select Chart to Edit ");
	common.log("<br><br>STEP  | Select Chart to Edit ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"addkeytabstrip\"]/ul/li[2]/span[2]")).click();
	System.out.println("STEP  | Click on FeedBack CPT/Provider ");
	common.log("<br><br>STEP  | Click on FeedBack CPT/Provider ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"addkeytabstrip\"]/ul/li[3]/span[2]")).click();
	System.out.println("STEP  | Click on FeedBack ICD/Modifier ");
	common.log("<br><br>STEP  | Click on FeedBack CPT/Modifier ");
	common.pause(10);
}

public void Verify_to_Clear_search_fields() throws InterruptedException, IOException{
	
	driver.findElement(By.xpath("//*[@id=\"findnamefirst\"]")).sendKeys("Abigail");
	common.pause(5);
	System.out.println("STEP  | Enter First Name ");
	common.log("<br><br>STEP  | Enter First Name ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"clear_provider\"]")).click();
	common.pause(5);
	System.out.println("STEP  | Click on Clear Button ");
	common.log("<br><br>STEP  | Click on Clear Button ");
	common.pause(10);
}

public void Verify_to_Finalize_Student_Score() throws InterruptedException, IOException{
	
	driver.findElement(By.xpath("//*[@id=\"question\"]/table/tbody/tr[1]/td[18]/a")).click();
	System.out.println("STEP  | Click on Edit Button ");
	common.log("<br><br>STEP  | Click on Edit Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"question\"]/table/tbody/tr[1]/td[13]/textarea")).sendKeys("1.5");
	System.out.println("STEP  | Enter Score ");
	common.log("<br><br>STEP  | Enter Score ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"question\"]/table/tbody/tr[1]/td[18]/a[1]")).click();
	System.out.println("STEP  | Click on Save Button ");
	common.log("<br><br>STEP  | Click on Save Button ");
	common.pause(10);
}

public void Verify_to_Display_test_by_Test() throws InterruptedException, IOException{
	
	driver.findElement(By.xpath("//*[@id=\"search_studentasnwerkey\"]/div[1]/div[2]/div/span/span")).click();
	common.pause(5);
	driver.findElement(By.xpath("//li[text()='ED_APP_1']")).click();
	System.out.println("STEP  | Select # Test ");
	common.log("<br><br>STEP  | Select # Test");
	common.pause(10);
}

public void Verify_to_view_2_row_option_display_in_dropdown() throws InterruptedException, IOException{
	common.pause(10);
	driver.findElement(By.xpath("//html/body/div[3]/div[2]/div[1]/div/div[4]/div/span[1]/span/span/span[1]")).click();
	common.pause(5);
	driver.findElement(By.xpath("//html/body/div[44]/div/div[2]/ul/li[2]")).click();
	System.out.println("STEP  | Click on Dropdown ");
	common.log("<br><br>STEP  | Click on Dropdown ");
	common.pause(10);
}

public void Verify_to_Enter_only_String_not_Number() throws InterruptedException, IOException {
	
	driver.findElement(By.xpath("//html/body/div[3]/div[2]/div/div/div/div/div/div[1]/ul/li[1]/div/div/form/div[1]/div[1]/div/span")).click();
	common.pause(5);
	driver.findElement(By.xpath("//li[text()='43']")).click();
	System.out.println("STEP  | Select Chart # ");
	common.log("<br><br>STEP  | Select Chart # ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"student_answer_key_grid\"]/table/tbody/tr/td[4]")).click();
	System.out.println("STEP  | Select Chart ");
	common.log("<br><br>STEP  | Select Chart ");
	common.pause(20);
	
	driver.findElement(By.xpath("//input[@id='add_Chart']")).isDisplayed();
	common.pause(5);
	System.out.println("STEP  | Edit Chart ");
	common.log("<br><br>STEP  | Edit Chart ");
	common.pause(10);
}









	

}
