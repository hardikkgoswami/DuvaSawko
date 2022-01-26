package com.Duva.Sawko;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.xerces.xni.parser.XMLDTDContentModelSource;
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
	driver.findElement(By.xpath("//html/body/div/div/div[2]/ul/li[6]")).click();
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

public void Verify_to_load_all_questions_in_list() throws InterruptedException, IOException{
    
	common.pause(20);
	driver.findElement(By.xpath("//*[@id=\"panel3\"]/div/div/div[1]/div[4]/div/label[3]")).click();
	System.out.println("STEP  | Click on All Radio Button ");
	common.log("<br><br>STEP  | Click on All Radio Button ");
	common.pause(20);
}

public void Verify_to_that_if_user_add_score_it_should_jump_to_top() throws InterruptedException, IOException{
    
	common.pause(20);
	driver.findElement(By.xpath("//*[@id=\"panel3\"]/div/div/div[1]/div[4]/div/label[3]")).click();
	System.out.println("STEP  | Click on All Radio Button ");
	common.log("<br><br>STEP  | Click on All Radio Button ");
	common.pause(20);
	
}

public void Verify_to_Add_Key_two_times() throws InterruptedException, IOException{
	
	driver.findElement(By.xpath("//*[@id=\"panel2\"]/span")).click();
	System.out.println("STEP   | Click on Add Key ");
	common.log("<br><br>STEP   | Click on Add Key ");
	common.pause(10);
	
	Random incdate = new Random();
	int incdateLow = 50;
	int incdateHigh = 250;
	int incdateResult = incdate.nextInt(incdateHigh-incdateLow) + incdateLow;	
	String startvaluedate = "0";
	String Incrementdatevalue =  Integer.toString(incdateResult);
	
	driver.findElement(By.xpath("//*[@id=\"add_Chart\"]")).sendKeys("140");
	System.out.println("STEP   | Enter Chart Number ");
	common.log("<br><br>STEP   | Enter Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//html/body/div[3]/div[2]/div/div/div/div/div/div[1]/ul/li[2]/div/div[2]/form/div[2]/div/div[1]/div[1]/div[1]/div/div[2]/div")).click();
	common.pause(5);
	driver.findElement(By.xpath("//html/body/div/div/div[2]/ul/li[4]")).click();
	System.out.println("STEP   | Enter Test# ");
	common.log("<br><br>STEP   | Enter Test# ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"add_CPTSTRING\"]")).sendKeys("99205");
	System.out.println("STEP   | Enter CPT ");
	common.log("<br><br>STEP   | Enter CPT ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"panel1\"]/div[1]/div[1]/div/div[5]/div[1]/label[2]")).click();
	System.out.println("STEP   | Select Classification ");
	common.log("<br><br>STEP   | Select Classification ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"add_ICDString\"]")).sendKeys("R10.9");
	System.out.println("STEP   | Enter ICD String ");
	common.log("<br><br>STEP   | Enter ICD String ");
	common.pause(10);
	
	driver.findElement(By.xpath("//html/body/div[3]/div[2]/div/div/div/div/div/div[1]/ul/li[2]/div/div[2]/form/div[2]/div/div[1]/div[1]/div[2]/div/span/span")).click();
	common.pause(5);
	driver.findElement(By.xpath("//html/body/div/div/div[2]/ul/li[4]")).click();
	System.out.println("STEP   | Select Provider 1 ");
	common.log("<br><br>STEP   | Select Provider 1 ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"add_user\"]")).click();
	System.out.println("STEP  | Click on Submit Button ");
	common.log("<br><br>STEP  | Click on Submit Button ");
	common.pause(10);
}

public void Verify_to_apply_different_filters() throws InterruptedException, IOException{
	
	driver.findElement(By.xpath("//*[@id=\"search_Modifier\"]")).sendKeys("2");
	System.out.println("STEP   | Enter Mod ");
	common.log("<br><br>STEP   | Enter Mod ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"search_studentasnwerkey\"]/div[1]/div[4]/div/div/div/label[2]")).click();
	System.out.println("STEP   | Select Classification ");
	common.log("<br><br>STEP   | Select Classification ");
	common.pause(10);
	
	driver.findElement(By.xpath("//html/body/div[3]/div[2]/div/div/div/div/div/div[1]/ul/li[1]/div/div/form/div[1]/div[5]/div/span/span")).click();
	common.pause(5);
	driver.findElement(By.xpath("//html/body/div/div/div[2]/ul/li[3]")).click();
	System.out.println("STEP   | Select Provider 1 ");
	common.log("<br><br>STEP   | Select Provider 1 ");
	common.pause(10);
}

public void Verify_to_View_Auto_Promotion_when_Student_Score_Finalize() throws InterruptedException, IOException{
	driver.findElement(By.xpath("//*[@id=\"finalized\"]")).click();
	System.out.println("STEP   | Click on Finlize Button ");
	common.log("<br><br>STEP   | Click on Finlize Button ");
	common.pause(10);
}

public void Verify_if_user_enter_valid_ICD_String_it_should_display_any_error_message() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"panel2\"]/span")).click();
	System.out.println("STEP   | Click on Add Option ");
	common.log("<br><br>STEP   | Click on Add Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"add_ICDString\"]")).sendKeys("S39.012A");
	System.out.println("STEP   | Enter ICD String ");
	common.log("<br><br>STEP   | Enter ICD String ");
	common.pause(10);
}

public void Verify_to_Update_EMail_Template() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"email_grid\"]/table/tbody/tr[1]/td[7]/a[1]")).click();
	System.out.println("STEP   | Click on Edit Button ");
	common.log("<br><br>STEP   | Click on Edit Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//html/body")).sendKeys("qa");
	System.out.println("STEP   | Edit Body ");
	common.log("<br><br>STEP   | Edit Body ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"email_grid\"]/table/tbody/tr[1]/td[7]/a[1]")).click();
	System.out.println("STEP   | Click on Update Button ");
	common.log("<br><br>STEP   | Click on Update Button ");
	common.pause(10);
}

public void Verify_to_Check_ICD_String_of_Particular_Chart() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//html/body/div[3]/div[2]/div/div/div/div/div/div[1]/ul/li[1]/div/div/form/div[1]/div[1]/div/span/span/span[2]")).click();
	common.pause(5);
	driver.findElement(By.xpath("//li[text()='382']")).click();
	System.out.println("STEP   | Select Chart Number ");
	common.log("<br><br>STEP   | Select Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"student_answer_key_grid\"]/table/tbody/tr/td[2]")).click();
	System.out.println("STEP   | Click on 382 Chart ");
	common.log("<br><br>STEP   | Click on 382 Chart ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"add_ICDString\"]")).click();
	System.out.println("STEP   | Edit ICD String ");
	common.log("<br><br>STEP   | Edit ICD String ");
	common.pause(10);
}

public void Verify_to_View_By_Select_Data_By_Date_of_Last_Update() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"overview\"]/div[1]/div[5]/div/label[5]")).click();
	System.out.println("STEP   | Click on All Time Raio Button ");
	common.log("<br><br>STEP   | Click on All Time Raio Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"overview\"]/div[1]/div[5]/div/label[3]")).click();
	System.out.println("STEP   | Click on Last 3 Days ");
	common.log("<br><br>STEP   | Click on Last 3 Days ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"overview\"]/div[1]/div[5]/div/label[4]")).click();
	System.out.println("STEP   | Click on Last 7 Days ");
	common.log("<br><br>STEP   | Click on Last 7 Days ");
	common.pause(10);
}

public void Verify_to_display_Error_Message_When_user_not_fill_email() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//input[@id='add_user']")).click();
	System.out.println("STEP   | Click on Add Button ");
	common.log("<br><br>STEP   | Click on Add Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"message_box\"]/span")).isDisplayed();
	System.out.println("STEP   | Verify It Displayed Error Message When Fields are Blank ");
	common.log("<br><br>STEP   | Verify It Displayed Error Message When Fields are Blank ");
	common.pause(10);
}

public void Verify_Display_Notes_option() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//html/body/div[3]/div[2]/div/div/div[2]/div[3]/div/div/table/tbody/tr[1]/td[3]")).click();
	System.out.println("STEP   | Select User From List ");
	common.log("<br><br>STEP   | Select User From List ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"manage_user_tabstrip2\"]/ul/li[3]")).click();
	System.out.println("STEP   | Click on Dates tabs ");
	common.log("<br><br>STEP   | Click on Dates tabs ");
	common.pause(10);
}


public void Verify_to_Student_Move_Applicant_to_PreHire() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"manage_user_grid\"]/table/tbody/tr[2]/td[1]")).click();
	System.out.println("STEP   | Select User From List ");
	common.log("<br><br>STEP   | Select User From List ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"manage_user_tabstrip2\"]/ul/li[2]/span[2]")).click();
	System.out.println("STEP   | Click on Test tabs ");
	common.log("<br><br>STEP   | Click on Test tabs ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"dynamic_content\"]/div[1]/div[2]/span/span/span[1]")).click();
	common.pause(5);
	driver.findElement(By.xpath("//html/body/div/div/div[2]/ul/li[4]")).click();
	System.out.println("STEP   | Select User Type ");
	common.log("<br><br>STEP   | Select User Type ");
	common.pause(10);
	
	driver.findElement(By.xpath("//input[@id='add_user']")).click();
	System.out.println("STEP   | Click on Submit Button ");
	common.log("<br><br>STEP   | Click on Submit Button ");
	common.pause(10);
}

public void Verify_to_View_Total_Chart_Coded() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//label[contains(text(),'Last 7 days')]")).click();
	System.out.println("STEP   | Select 7 days Radio Option ");
	common.log("<br><br>STEP   | Select 7 days Radio Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//label[contains(text(),'Last 3 days')]")).click();
	System.out.println("STEP   | Select 3 days Radio Option ");
	common.log("<br><br>STEP   | Select 3 days Radio Option ");
	common.pause(10);
}

public void Verify_to_Not_Hide_History_PI_DATA_when_BI_option_selected() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"BIPanel\"]/span")).click();
	System.out.println("STEP  | Click on Basic Information ");
	common.log("<br><br>STEP  | Click on Basic Information ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"HPIPanel\"]/span")).click();
	System.out.println("STEP  | Click on History Of Present Illness ");
	common.log("<br><br>STEP  | Click on History Of Present Illness ");
	common.pause(10);
}

public void Verify_to_Calculate_Score_on_basics_of_select_option() throws InterruptedException, IOException{
	
	driver.findElement(By.xpath("//*[@id=\"MDMPanel\"]/span")).click();
	System.out.println("STEP  | Click on Medical Decision Making ");
	common.log("<br><br>STEP  | Click on Medical Decision Making ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"MDMForm\"]/div[2]/div[1]/div[1]/label")).click();
	System.out.println("STEP  | Click on Complete Chekcbox ");
	common.log("<br><br>STEP  | Click on Complete Chekcbox ");
	common.pause(20);
}

public void Verify_to_Select_Provider_2_and_Clear_it() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"panel2\"]/span")).click();
	System.out.println("STEP   | Click on Add Key ");
	common.log("<br><br>STEP   | Click on Add Key ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"panel1\"]/div[3]/div[2]/div/span/span/span[1]")).click();
	common.pause(5);
	driver.findElement(By.xpath("//html/body/div/div/div[2]/ul/li[6]")).click();
	System.out.println("STEP   | Select Provider 2 ");
	common.log("<br><br>STEP   | Select Provider 2 ");
	common.pause(10);
	
	driver.findElement(By.xpath("//input[@id='clear_user']")).click();
	System.out.println("STEP   | Click on Clear Button ");
	common.log("<br><br>STEP   | Click on Clear Button ");
	common.pause(10);
}

public void Verify_to_view_Guideline_in_PanelBar_Override() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"manage_user_grid\"]/table/tbody/tr/td[1]")).click();
	System.out.println("STEP   | Select User From List ");
	common.log("<br><br>STEP   | Select User From List ");
	common.pause(10);
	
	driver.findElement(By.xpath("//span[contains(text(),'Panelbar Override')]")).click();
	System.out.println("STEP   | Click on Panelbar Overriden ");
	common.log("<br><br>STEP   | Click on Panelbar Overriden ");
	common.pause(10);
	
	driver.findElement(By.xpath("//span[contains(text(),'Right Side')]")).click();
	System.out.println("STEP   | Click on Right Side ");
	common.log("<br><br>STEP   | Click on Right Side ");
	common.pause(10);
	
	driver.findElement(By.xpath("//input[@id='add_user']")).click();
	System.out.println("STEP   | Click on Submit Button ");
	common.log("<br><br>STEP   | Click on Submit Button ");
	common.pause(10);
}

public void Verify_to_Dates_tab_enabled_by_clicking_on_the_Done_Edit_button() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"panelbar-other-all\"]/li[1]/div/div/div[2]/div/div/label[4]")).click();
	System.out.println("STEP   | Select Trainer Radio Option ");
	common.log("<br><br>STEP   | Select Trainer Radio Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//html/body/div[3]/div[2]/div/div/div[2]/div[3]/div/div/table/tbody/tr[1]/td[3]")).click();
	System.out.println("STEP   | Select User From List ");
	common.log("<br><br>STEP   | Select User From List ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"manage_user_tabstrip2\"]/ul/li[3]/span[2]")).click();
	System.out.println("STEP   | Dates tabs is Disable ");
	common.log("<br><br>STEP   | Dates tabs is Disable ");
	common.pause(10);
}

public void Verify_to_View_Stage_Messages_By_Role() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"parameter_tab_section-1\"]/div/div/div[1]/div[1]/label[2]")).click();
	System.out.println("STEP   | Select Trainee Radio Option ");
	common.log("<br><br>STEP   | Select Trainee Radio Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"parameter_tab_section-1\"]/div/div/div[1]/div[1]/label[3]")).click();
	System.out.println("STEP   | Select Academy Radio Option ");
	common.log("<br><br>STEP   | Select Academy Radio Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"parameter_tab_section-1\"]/div/div/div[1]/div[1]/label[4]")).click();
	System.out.println("STEP   | Select Inter Radio Option ");
	common.log("<br><br>STEP   | Select Inter Radio Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"parameter_tab_section-1\"]/div/div/div[1]/div[1]/label[5]")).click();
	System.out.println("STEP   | Select Remedial Radio Option ");
	common.log("<br><br>STEP   | Select Remedial Radio Option ");
	common.pause(10);
}

public void Verify_to_Add_New_Row_than_Make_eactivate_it() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"utilities_tab-1\"]/div[3]/div[2]/div[3]/a")).click();
	System.out.println("STEP   | Click on Add New Row Button ");
	common.log("<br><br>STEP   | Click on Add New Row Button ");
	common.pause(10);

	driver.findElement(By.xpath("//*[@id=\"feedbackvideos\"]/table/tbody/tr[1]/td[1]/span/span")).click();
	common.pause(10);
	driver.findElement(By.xpath("//li[text()='Critical Care RBs']")).click();
	System.out.println("STEP   | Select Widget Group Dropdown ");
	common.log("<br><br>STEP   | Select Widget Group Dropdown ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"feedbackvideos\"]/table/tbody/tr[1]/td[2]/input")).sendKeys("Testing Data Here");
	System.out.println("STEP   | Click on Add New Row Button ");
	common.log("<br><br>STEP   | Click on Add New Row Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"feedbackvideos\"]/table/tbody/tr[1]/td[4]/a[1]")).click();
	System.out.println("STEP   | Click on Upload Button ");
	common.log("<br><br>STEP   | Click on Upload Button ");
	common.pause(20);
	
}

public void Verify_to_Create_a_Test_5_of_user() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("qa");
	System.out.println("STEP   | Enter Email Address ");
	common.log("<br><br>STEP   | Enter Email Address ");
	common.pause(10);

	driver.findElement(By.xpath("//html/body/div[3]/div[2]/div/div/div[2]/div[3]/div/div/table/tbody/tr[1]/td[4]")).click();
	System.out.println("STEP   | Select User From List ");
	common.log("<br><br>STEP   | Select User From List ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"manage_user_tabstrip2\"]/ul/li[2]/span[2]")).click();
	System.out.println("STEP   | Click on Test Tab ");
	common.log("<br><br>STEP   | Click on Test Tab ");
	common.pause(10);
}

public void Verify_to_download_User_Progress() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"downloadanswer\"]")).click();
	System.out.println("STEP   | Click on Download Button ");
	common.log("<br><br>STEP   | Click on Download Button ");
	common.pause(20);
}

public void Verify_to_Add_an_Allow_Answer_Change_radio_groups() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"manage_user_tabstrip2\"]/ul/li[4]/span[2]")).click();
	System.out.println("STEP  | Click on PanelBar Tab ");
	common.log("<br><br>STEP  | Click on PanelBar Tab ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"manage_user_tabstrip2-4\"]/div[1]/div[2]/div/label[1]")).click();
	System.out.println("STEP  | Select Yes Radio Option ");
	common.log("<br><br>STEP  | Select Yes Radio Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"showhidetabstrip-1\"]/div[1]/div[1]/div[2]/div/label[2]")).click();
	System.out.println("STEP  | Select Basic Infromation Option ");
	common.log("<br><br>STEP  | Select Basic Infromation Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"showhidetabstrip-1\"]/div[1]/div[4]/div[2]/div/label[2]")).click();
	System.out.println("STEP  | Select OverAll Riks Option ");
	common.log("<br><br>STEP  | Select OverAll Riks Option ");
	common.pause(10);
}

public void Verify_to_Search_Chart_By_ADDENDA_ATTESTATION() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"AAPanel_FIND\"]/span")).click();
	System.out.println("STEP  | Click on ADDENDA_ATTESTATION ");
	common.log("<br><br>STEP  | Click on ADDENDA_ATTESTATION ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"AAPanel_FIND\"]/div/div/div/div[1]/div/div/label[2]")).click();
	System.out.println("STEP  | Click on Is there an addenda ");
	common.log("<br><br>STEP  | Click on Is there an addenda ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"AAPanel_FIND\"]/div/div/div/div[2]/div/div/label[2]")).click();
	System.out.println("STEP  | Click on Is this a split/shared visit ");
	common.log("<br><br>STEP  | Click on Is this a split/shared visit ");
	common.pause(10);
	
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

public void Verify_To_Find_Chart_by_Answer_Key() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"WRPPanel_FIND\"]/span")).click();
	System.out.println("STEP  | Click on Answer Key ");
	common.log("<br><br>STEP  | Click on Answer Key ");
	common.pause(10);


	driver.findElement(By.xpath("//*[@id=\"cpt_find\"]")).sendKeys("99222");
	System.out.println("STEP  | Click on CPT ");
	common.log("<br><br>STEP  | Click on CPT ");
	common.pause(10);
}

public void Verify_to_display_error_message_when_text_boxes_are_blank() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"panel2\"]/span")).click();
	System.out.println("STEP   | Click on Add Key ");
	common.log("<br><br>STEP   | Click on Add Key ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"add_Chart\"]")).sendKeys("234");
	System.out.println("STEP   | Enter Chart Number ");
	common.log("<br><br>STEP   | Enter Chart Number ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"clear_user\"]")).click();
	System.out.println("STEP   | Click on Clear Button ");
	common.log("<br><br>STEP   | Click on Clear Button ");
	common.pause(10);
}

public void Verify_to_Display_Error_Message_when_fields_are_blank() throws InterruptedException, IOException{
	driver.findElement(By.xpath("//*[@id=\"btn_add_provider\"]")).click();
	System.out.println("STEP   | Click on Submit Button ");
	common.log("<br><br>STEP   | Click on Submit Button ");
	common.pause(10);
}

public void Verify_to_Edit_Parameters_and_Submit_changes_to_save() throws InterruptedException, IOException{
	
	driver.findElement(By.xpath("//*[@id=\"APPLICANT_stage5_values\"]/div[1]/div[2]/div/label[1]")).click();
	System.out.println("STEP   | Select Basic Information Radio Option ");
	common.log("<br><br>STEP   | Select Basic Information Radio Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"APPLICANT_stage5_values\"]/div[2]/div[2]/div/label[1]")).click();
	System.out.println("STEP   | Select Diagnosis And Management Radio Option ");
	common.log("<br><br>STEP   | Select Diagnosis And Management Radio Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"APPLICANT_stage5_values\"]/div[3]/div[2]/div/label[1]")).click();
	System.out.println("STEP   | Select Amount And Complexity Of Data Radio Option ");
	common.log("<br><br>STEP   | Select Amount And Complexity Of Data Radio Option ");
	common.pause(10);
}

public void Verify_to_Display_in_Sequence_like_Test_and_Stage_in_test_tab() throws InterruptedException, IOException{
	
	driver.findElement(By.xpath("//*[@id=\"manage_user_tabstrip\"]/ul/li[2]/span[2]")).click();
	System.out.println("STEP   | Click on Test Tab ");
	common.log("<br><br>STEP   | Click on Test Tab ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"find_dynamic\"]/div[1]/div[2]/span/span/span[1]")).click();
	common.pause(5);
	driver.findElement(By.xpath("//li[text()='TRAINEE']")).click();
	System.out.println("STEP   | Click on Test TYPE ");
	common.log("<br><br>STEP   | Click on Test TYPE ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"manage_user_grid\"]/table/tbody/tr/td[4]")).click();
	System.out.println("STEP   | Select Any User from List ");
	common.log("<br><br>STEP   | Select Any User from List ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"manage_user_tabstrip2\"]/ul/li[2]/span[2]")).click();
	System.out.println("STEP   | Click on Test Tab ");
	common.log("<br><br>STEP   | Click on Test Tab ");
	common.pause(10);
}

public void Verify_to_display_Other_Messages_tab() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"squretabstrip\"]/ul/li[4]/span[2]")).click();
	System.out.println("STEP   | Click on Other Message Tab ");
	common.log("<br><br>STEP   | Click on Other Message Tab ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"squretabstrip\"]/ul/li[1]/span[2]")).click();
	System.out.println("STEP   | Click on Stage Message Tab ");
	common.log("<br><br>STEP   | Click on Stage Message Tab ");
	common.pause(10);
}

public void Verify_to_add_hyperlink_into_EM_Summary_for_coders() throws InterruptedException, IOException{
	
	driver.findElement(By.xpath("//*[@id=\"utilities_tab-1\"]/div[1]/div[1]/span/span")).click();
	common.pause(5);
	driver.findElement(By.xpath("//li[text()='E/M Summary for Coders']")).click();
	System.out.println("STEP   | Select EM Summary for Coders ");
	common.log("<br><br>STEP   | Select EM Summary for Coders ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"EM-summary\"]/ul/li[4]/span[2]")).click();
	System.out.println("STEP   | Click on PE Tab");
	common.log("<br><br>STEP   | Click on PE Tab");
	common.pause(10);
}

public void Verify_to_write_response_in_User_Progress() throws InterruptedException, IOException{
	
	driver.findElement(By.xpath("//*[@id=\"question\"]/table/tbody/tr[1]/td[18]/a")).click();
	System.out.println("STEP   | Click on Edit Button");
	common.log("<br><br>STEP   | Click on Edit Button");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"response\"]")).click();
	System.out.println("STEP   | Enter Some Data in Response");
	common.log("<br><br>STEP   | Enter Some Data in Response");
	common.pause(10);
}

public void Verify_to_Apply_multiple_filter() throws InterruptedException, IOException{
	
	driver.findElement(By.xpath("//*[@id=\"overview\"]/div[1]/div[2]/span/span/span[1]")).click();
	common.pause(5);
	driver.findElement(By.xpath("//li[text()='TRAINEE']")).click();
	System.out.println("STEP   | Select User Type");
	common.log("<br><br>STEP   | Select User Type");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"overview\"]/div[1]/div[4]/div/label[3]")).click();
	System.out.println("STEP   | Click on Test Type");
	common.log("<br><br>STEP   | Click on Test Type");
	common.pause(10);
}

public void Verify_to_display_data_like_6_in_Must_Start_By_Business_Days() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"paramform\"]/div/div[1]/fieldset[3]/div/div/div[1]/div/div/div[1]/label")).isDisplayed();
	System.out.println("STEP   | Verify It Display Must Start By (Business Days) ");
	common.log("<br><br>STEP   | Verify It Display Must Start By (Business Days) ");
	common.pause(10);
}

public void Verify_to_view_user_Progress_PreHire() throws InterruptedException, IOException{
    
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"menu_student_progress\"]/span")).click();
	System.out.println("STEP  | Click on Student Progress ");
	common.log("<br><br>STEP  | Click on Student Progress ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"panel1\"]/span")).isDisplayed();
	System.out.println("STEP  | Verify It display Student Progress!!! ");
	common.log("<br><br>STEP  | Verify It display Student Progress!!! ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"overview\"]/div[1]/div[5]/div/label[5]")).click();
	System.out.println("STEP   | Click on All Time Raio Button ");
	common.log("<br><br>STEP   | Click on All Time Raio Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"overview\"]/div[1]/div[2]/span/span/span[1]")).click();
	common.pause(5);
	driver.findElement(By.xpath("//li[text()='PREHIRE']")).click();
	System.out.println("STEP   | Select PreHire User Type ");
	common.log("<br><br>STEP   | Select PreHire User Type ");
	common.pause(30);
	
	driver.findElement(By.xpath("//*[@id=\"studentgrid\"]/table/tbody/tr[3]/td[3]")).click();
	System.out.println("STEP  | Select User from List ");
	common.log("<br><br>STEP  | Select User from List ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"testhistory\"]/table/tbody/tr/td[2]")).click();
	System.out.println("STEP  | Click on Test History By Day ");
	common.log("<br><br>STEP  | Click on Test History By Day ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"question\"]/table/tbody/tr[1]/td[3]")).isDisplayed();
	System.out.println("STEP  | Verify It Display User Progress ");
	common.log("<br><br>STEP  | Verify It Display User Progress ");
	common.pause(10);
}
public void Verify_to_view_By_Last_Student_Update_and_Last_Admin_Update_and_also_in_time_0_shouldnt_display() throws InterruptedException, IOException{
	 
	driver.findElement(By.xpath("//*[@id=\"panel5\"]/span")).click();
	System.out.println("STEP  | Click on Static Test Ovreview ");
	common.log("<br><br>STEP  | Click on Static Test Ovreview ");
	common.pause(10);
		
	driver.findElement(By.xpath("//*[@id=\"testhistory\"]/table/tbody/tr/td[2]")).click();
	System.out.println("STEP  | Click on Test History By Day ");
	common.log("<br><br>STEP  | Click on Test History By Day ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"question\"]/table/tbody/tr[1]/td[3]")).isDisplayed();
	System.out.println("STEP  | Verify It Display User Progress ");
	common.log("<br><br>STEP  | Verify It Display User Progress ");
	common.pause(10);
}

public void Verify_to_download_User_Progress_and_view_data() throws InterruptedException, IOException{
	driver.findElement(By.xpath("//*[@id=\"downloadanswer\"]")).click();
	System.out.println("STEP  | Click on Dowload Button ");
	common.log("<br><br>STEP  | Click on Dowload Button ");
	common.pause(10);
}

public void Verify_to_Promoting_a_student_from_PREHIRE_to_TRAINEE_is_only_available_if_there_is_a_Finalized_and_Passed_test() throws InterruptedException, IOException{
	
	driver.findElement(By.xpath("//*[@id=\"manage_user_grid\"]/table/tbody/tr[2]/td[4]")).click();
	System.out.println("STEP  | Select User from list ");
	common.log("<br><br>STEP  | Select User from list ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"add_user\"]")).click();
	System.out.println("STEP  | Click on Submit Button ");
	common.log("<br><br>STEP  | Click on Submit Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"done_user\"]")).click();
	System.out.println("STEP  | Click on Done Edit Button ");
	common.log("<br><br>STEP  | Click on Done Edit Button ");
	common.pause(10);
}
public void Verify_to_Add_Other_radio_button_into_User_Progress() throws InterruptedException, IOException{
	
	driver.findElement(By.xpath("//*[@id=\"panel3\"]/div/div/div[1]/div[5]/div/label[3]")).click();
	System.out.println("STEP  | Click on Other Radio Button ");
	common.log("<br><br>STEP  | Click on Other Radio Button ");
	common.pause(10);
	
}

public void Verify_to_view_Test_of_Student_which_has_Not_Started() throws InterruptedException, IOException{
    
	verify_login_details_of_admin();
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"menu_student_progress\"]/span")).click();
	System.out.println("STEP  | Click on Student Progress ");
	common.log("<br><br>STEP  | Click on Student Progress ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"panel1\"]/span")).isDisplayed();
	System.out.println("STEP  | Verify It display Student Progress!!! ");
	common.log("<br><br>STEP  | Verify It display Student Progress!!! ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"overview\"]/div[1]/div[5]/div/label[5]")).click();
	System.out.println("STEP   | Click on All Time Raio Button ");
	common.log("<br><br>STEP   | Click on All Time Raio Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"studentgrid\"]/table/tbody/tr[4]/td[3]")).click();
	System.out.println("STEP  | Select User from List ");
	common.log("<br><br>STEP  | Select User from List ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"second\"]/label")).click();
	System.out.println("STEP  | Click on Show Started Checkbox ");
	common.log("<br><br>STEP  | Click on Show Started Checkbox ");
	common.pause(10);
}

public void Verify_to_view_Invalid_User_in_Student_Progress_and_Manage_User() throws InterruptedException, IOException{
    
	driver.findElement(By.xpath("//*[@id=\"menu_student_progress\"]/span")).click();
	System.out.println("STEP 07 | Click on Student Progress ");
	common.log("<br><br>STEP 07 | Click on Student Progress ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"panel1\"]/span")).isDisplayed();
	System.out.println("STEP 08 | Verify It display Student Progress!!! ");
	common.log("<br><br>STEP 08 | Verify It display Student Progress!!! ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"overview\"]/div[1]/div[5]/div/label[5]")).click();
	System.out.println("STEP   | Click on All Time Raio Button ");
	common.log("<br><br>STEP   | Click on All Time Raio Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"invalid_user\"]/label")).click();
	System.out.println("STEP   | Select Invalid Checkbox ");
	common.log("<br><br>STEP   | Select Invalid Checkbox ");
	common.pause(10);
}

public void Verify_to_view_Invalid_Manage_User() throws InterruptedException, IOException{
	driver.findElement(By.xpath("//*[@id=\"find_invalid_user\"]/label")).click();
	System.out.println("STEP   | Select Invalid Checkbox ");
	common.log("<br><br>STEP   | Select Invalid Checkbox ");
	common.pause(10);
}

public void Verify_to_Edit_Role_and_Save_details() throws InterruptedException, IOException{
    
	common.pause(20);
	verify_login_details_of_admin();
	common.pause(20);
	
	WebElement ManageUsers_button = driver.findElement(By.xpath("//*[@id='menu_manage_users']/span"));
	ManageUsers_button.click();
	System.out.println("STEP  | Click on Manage Users button ");
	common.log("<br><br>STEP  | Click on Manage Users button ");
	common.pause(40);
	
	driver.findElement(By.xpath("//*[@id=\"manage_user_grid\"]/table/tbody/tr[1]/td[4]")).click();
	System.out.println("STEP  | Select User From List ");
	common.log("<br><br>STEP  | Select User From List ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"panelbar-other-all-add\"]/li[1]/div/div/div[2]/div[1]/div/label[5]")).click();
	System.out.println("STEP  | Edit Role ");
	common.log("<br><br>STEP  | Edit Role ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"done_user\"]")).click();
	System.out.println("STEP  | Click on Done Edit Button ");
	common.log("<br><br>STEP  | Edit Done Edit Button ");
	common.pause(10);
}

public void Verify_to_edit_Downloaded_in_any_chart() throws InterruptedException, IOException{
    common.pause(20);
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[1]/div[2]/div[1]/div[1]/label/span")).click();
	System.out.println("STEP  | Click on Complete Checkbox ");
	common.log("<br><br>STEP  | Click on Complete Checkbox ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"MDForm\"]/div[2]/div[2]/div/div[2]/div/div/div/label[1]/span")).click();
	System.out.println("STEP  | Click on Downcoded Other Option ");
	common.log("<br><br>STEP  | Click on Downcoded Other Option ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"common_submit_btn\"]")).click();
	System.out.println("STEP  | Click on Submit Button ");
	common.log("<br><br>STEP  | Click on Submit Button ");
	common.pause(10);
}

public void Verify_to_View_text_Fever_PE_tab() throws InterruptedException, IOException{
	
	//driver.findElement(By.xpath("//*[@id=\"utilities_tab-1\"]/div[1]/div[1]/span/span/span[1]")).click();
	common.pause(5);
	driver.findElement(By.xpath("//li[text()='E/M Summary for Coders']")).click();
	System.out.println("STEP  | Click on Submit Button ");
	common.log("<br><br>STEP  | Click on Submit Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"EM-summary\"]/ul/li[4]/span[2]")).click();
	System.out.println("STEP  | Click on PE Tab ");
	common.log("<br><br>STEP  | Click on PE Tab ");
	common.pause(10);
}

public void Verify_to_download_excel_file_of_Active_User_and_Coded_chart() throws InterruptedException, IOException{
	driver.findElement(By.xpath("//*[@id=\"download_codedlist\"]")).click();
	System.out.println("STEP  | Click on Dowload Button ");
	common.log("<br><br>STEP  | Click on Dowload Button ");
	common.pause(10);
}

public void Verify_to_view_Login_details_of_Particular_user() throws InterruptedException, IOException{
	common.pause(10);
//	driver.findElement(By.xpath("//label[text()='All Time']")).click();
//	System.out.println("STEP  | Click on All Time Radio ");
//	common.log("<br><br>STEP  | Click on All Time Radio ");
//	common.pause(10);
//	
//	driver.findElement(By.xpath("//*[@id=\"timesheet_overview\"]/table/tbody/tr[2]/td[3]")).click();
	System.out.println("STEP  | Verify First Login Date ");
	common.log("<br><br>STEP  | Verify First Login Date ");
	common.pause(10);
}

public void Verify_to_Modifications_to_Supervisor_Role() throws InterruptedException, IOException{
	driver.findElement(By.xpath("//*[@id=\"panelbar-other-all\"]/li[1]/div/div/div[2]/div/div/label[3]")).click();
	System.out.println("STEP  | Select Supervisor ");
	common.log("<br><br>STEP  | Select Supervisor ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"manage_user_grid\"]/table/tbody/tr[1]/td[3]")).click();
	common.pause(5);
	driver.findElement(By.xpath("//*[@id=\"panelbar-other-all-add\"]/li[1]/div/div/div[2]/div[1]/div/label[4]")).click();
	System.out.println("STEP  | Select Trainer ");
	common.log("<br><br>STEP  | Select Trainer ");
	common.pause(10);
}

public void Verify_to_display_error_message_when_all_fields_are_blank_and_also_already_used_email_address() throws InterruptedException, IOException{
	driver.findElement(By.xpath("//*[@id=\"add_email\"]")).sendKeys("qa2@mailiator.com");
	System.out.println("STEP  | Enter Email Address ");
	common.log("<br><br>STEP  | Enter Email Address ");
	common.pause(10);

	driver.findElement(By.xpath("//input[@id='add_user']")).click();
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"message_box\"]/span")).isDisplayed();
	System.out.println("STEP  |  Hmmm, this email already exists. Please try a different one. ");
	common.log("<br><br>STEP  |  Hmmm, this email already exists. Please try a different one. ");
	common.pause(10);
}

public void Verify_to_View_Summary_of_any_User() throws InterruptedException, IOException{
	driver.findElement(By.xpath("//*[@id=\"manage_user_grid\"]/table/tbody/tr[1]/td[16]/a")).click();
	System.out.println("STEP  | Click on Show Summary ");
	common.log("<br><br>STEP  | Click on Show Summary ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"summary_template_container_wnd_title\"]")).isDisplayed();
	System.out.println("STEP  | Verify User Summary Displayed!!! ");
	common.log("<br><br>STEP  | Verify User Summary Displayed!!! ");
	common.pause(10);
}

public void Verify_to_view_Additional_Analytics_Charts() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"dashboard_panel2\"]/span")).click();
	System.out.println("STEP   | Click on Daily Time Per Chart ");
	common.log("<br><br>STEP   | Click on Daily Time Per Chart ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"dashboard_panel3\"]/span")).click();
	System.out.println("STEP   | Click on Daily Accuracy ");
	common.log("<br><br>STEP   | Click on Daily Accuracy ");
	common.pause(20);
}

public void Verify_sto_Display_Error_Message_when_fields_are_blank() throws InterruptedException, IOException{
	
	driver.findElement(By.xpath("//*[@id=\"email_grid\"]/table/tbody/tr[1]/td[7]/a[1]")).click();
	System.out.println("STEP   | Click on Edit Button ");
	common.log("<br><br>STEP   | Click on Edit Button ");
	common.pause(10);

	driver.findElement(By.xpath("//*[@id=\"edit_subject\"]")).clear();
	System.out.println("STEP   | Click on Clear Subject ");
	common.log("<br><br>STEP   | Click on Clear Subject ");
	common.pause(10);
}

public void Verify_to_view_Active_and_Inactive_in_Charts() throws InterruptedException, IOException{
	
	driver.findElement(By.xpath("//*[@id=\"TopRightBarChart_controller\"]/div[1]/div[3]/div/div/label[2]")).click();
	System.out.println("STEP   | Click on Active Radio ");
	common.log("<br><br>STEP   | Click on Active Radio ");
	common.pause(30);
	
	driver.findElement(By.xpath("//*[@id=\"TopRightBarChart_controller\"]/div[1]/div[3]/div/div/label[3]")).click();
	System.out.println("STEP   | Click on InActive Radio ");
	common.log("<br><br>STEP   | Click on InActive Radio ");
	common.pause(10);
}

public void Verify_sto_Select_All_Time_and_also_Select_Academy() throws InterruptedException, IOException{
	
	driver.findElement(By.xpath("//*[@id=\"TopRightBarChart_controller2\"]/div[2]/div[1]/label[7]")).click();
	System.out.println("STEP   | Click on Academy Radio ");
	common.log("<br><br>STEP   | Click on Academy Radio ");
	common.pause(10);
}

public void Verify_to_view_10_option_in_dropdown_and_Select_it_so_User_can_see_more_list() throws InterruptedException, IOException{
		
	driver.findElement(By.xpath("//*[@id=\"studentgrid\"]/div/span[1]/span/span/span[1]")).click();
	common.pause(5);
	driver.findElement(By.xpath("//li[text()='10']")).click();
	System.out.println("STEP   | Click on Academy Radio ");
	common.log("<br><br>STEP   | Click on Academy Radio ");
	common.pause(10);
}

public void Verify_to_view_Student_DAILY() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"student_tab\"]/span[2]")).click();
	System.out.println("STEP   | Click on Student Tab ");
	common.log("<br><br>STEP   | Click on Student Tab ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"students_grid\"]/table/tbody/tr[3]/td[2]")).click();
	System.out.println("STEP   | Click on Any Student ");
	common.log("<br><br>STEP   | Click on Any Student ");
	common.pause(10);
}

public void Verify_to_view_Chart_tab() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"chart_tab\"]/span[2]")).click();
	System.out.println("STEP   | Click on Chart Tab ");
	common.log("<br><br>STEP   | Click on Chart Tab ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"legend_switch\"]/span/span[2]/span/span[2]")).click();
	System.out.println("STEP   | Click on None Button ");
	common.log("<br><br>STEP   | Click on None Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"clear_barchartfilter\"]")).click();
	System.out.println("STEP   | Click on Reset Button ");
	common.log("<br><br>STEP   | Click on Reset Button ");
	common.pause(10);
}


public void Verify_to_show_error_message_when_fields_are_blank() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"panel2\"]/span")).click();
	System.out.println("STEP   | Click on Add Key ");
	common.log("<br><br>STEP   | Click on Add Key ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"add_user\"]")).click();
	System.out.println("STEP   | Click on Submit Button ");
	common.log("<br><br>STEP   | Click on Submit Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"panel1\"]/div[3]/div[1]/div/div/span")).isDisplayed();
	System.out.println("STEP   | Error Message Display !!!! ");
	common.log("<br><br>STEP   | Error Message Display !!!! ");
	common.pause(10);
}

public void Verify_to_view_Pie_Chart_as_per_selected_option_of_Date_of_Last_Update() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"TopLeftPieChart_controller\"]/div/div/div/label[3]")).click();
	System.out.println("STEP   | Click on Last 3 days ");
	common.log("<br><br>STEP   | Click on Last 3 days ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"TopLeftPieChart_controller\"]/div/div/div/label[4]")).click();
	System.out.println("STEP   | Click on Last 7 days ");
	common.log("<br><br>STEP   | Click on Last 7 days ");
	common.pause(10);
}

public void Verify_to_Chart_Number_Start_with_75_percentage_in_Data_Accuracy_option() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"dashboard_panel3\"]/span")).click();
	System.out.println("STEP   | Click on Daily Accuracy ");
	common.log("<br><br>STEP   | Click on Daily Accuracy ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"BottomRightBarChart_controller\"]/div[1]/div[1]/div/div/label[5]")).click();
	System.out.println("STEP   | Click on All Time ");
	common.log("<br><br>STEP   | Click on All Time ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"BottomRightBarChart\"]")).isDisplayed();
	System.out.println("STEP   | Verify It Display Chart");
	common.log("<br><br>STEP   | Verify It Display Chart ");
	common.pause(10);
}


public void Verify_to_display_error_message_when_user_try_to_add_existing_data() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"namefirst\"]")).sendKeys("aaron");
	System.out.println("STEP   | Enter First Name ");
	common.log("<br><br>STEP   | Enter First Name ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"namelast\"]")).sendKeys("Snyderd");
	System.out.println("STEP   | Enter Last Name ");
	common.log("<br><br>STEP   | Enter Last Name ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"panelbar-add\"]/li/div/div/div/div[4]/span/span/span[1]")).click();
	common.pause(5);
	driver.findElement(By.xpath("//li[text()='MD']")).click();
	System.out.println("STEP   | Select MD from Dropdown ");
	common.log("<br><br>STEP   | Select MD from Dropdown ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"btn_add_provider\"]")).click();
	System.out.println("STEP   | Click on Submit Button ");
	common.log("<br><br>STEP   | Click on Submit Button ");
	common.pause(10);
}

public void Verify_to_Select_PFSH_option_in_Downcoded() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//li[text()='PFSH']")).click();
	common.pause(5);
}

public void Verify_to_display_all_data_as_per_selected_data_last_updated_option() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"TopRightBarChart_controller\"]/div[1]/div[1]/div/div/label[3]")).click();
	System.out.println("STEP   | Click on Last 3 days ");
	common.log("<br><br>STEP   | Click on Last 3 days ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"TopRightBarChart_controller\"]/div[1]/div[1]/div/div/label[4]")).click();
	System.out.println("STEP   | Click on Last 7 days ");
	common.log("<br><br>STEP   | Click on Last 7 days ");
	common.pause(10);
}

public void Verify_to_Send_Admin_Template_Name() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"panelbar-other-all-add\"]/li[1]/div/div/div[2]/div[2]/div/span/span/span[1]")).click();
	common.pause(5);
	driver.findElement(By.xpath("//li[text()='Admin Template Name']")).click();
	System.out.println("STEP   | Select Admin Template Name ");
	common.log("<br><br>STEP   | Select Admin Template Name ");
	common.pause(20);
	
	driver.findElement(By.xpath("//html/body/div[64]/div[1]")).isDisplayed();
	System.out.println("STEP   | Verify Send Email Template Display!!! ");
	common.log("<br><br>STEP   | Verify Send Email Template Display!!! ");
	common.pause(20);
}

public void Verify_to_view_logs_in_logs_tab() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"downloademaillist\"]")).click();
	System.out.println("STEP   | Click on Download Button ");
	common.log("<br><br>STEP   | Click on Download Button ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"jslogs\"]/span[2]")).click();
	System.out.println("STEP   | Click on JS Logs Tab ");
	common.log("<br><br>STEP   | Click on JS Logs Tab ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"logs_tab-2\"]/div[3]/div[4]/div/span/span/span[1]")).click();
	common.pause(5);
	driver.findElement(By.xpath("//li[text()='Chrome']")).click();
	System.out.println("STEP   | Select Browser Type ");
	common.log("<br><br>STEP   | Select Browser Type ");
	common.pause(10);
}

public void Verify_to_display_Chart_Analytics_type_in_Chart_option() throws InterruptedException, IOException{
	
	driver.findElement(By.xpath("//*[@id=\"chart_tab\"]/span[2]")).click();
	System.out.println("STEP   | Click on Chart tab ");
	common.log("<br><br>STEP   | Click on Chart tab ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"barchart_controller1\"]/div[1]/div/label[2]")).click();
	System.out.println("STEP   | Click on UC Checkbox ");
	common.log("<br><br>STEP   | Click on UC Checkbox ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"barchart_controller1\"]/div[1]/div/label[3]")).click();
	System.out.println("STEP   | Click on PRC Checkbox ");
	common.log("<br><br>STEP   | Click on PRC Checkbox ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"barchart_controller1\"]/div[1]/div/label[4]")).click();
	System.out.println("STEP   | Click on PRV Checkbox ");
	common.log("<br><br>STEP   | Click on PRV Checkbox ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"barchart_controller1\"]/div[1]/div/label[5]")).click();
	System.out.println("STEP   | Click on ICD Checkbox ");
	common.log("<br><br>STEP   | Click on ICD Checkbox ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"barchart_controller1\"]/div[1]/div/label[6]")).click();
	System.out.println("STEP   | Click on MOD Checkbox ");
	common.log("<br><br>STEP   | Click on MOD Checkbox ");
	common.pause(10);
}

public void Verify_to_display_label_to_x_and_y_axis_into_chart_and_also_display_Same_days_as_in_student_Progress_test() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"menu_student_progress\"]/span")).click();
	System.out.println("STEP  | Click on Student Progress ");
	common.log("<br><br>STEP  | Click on Student Progress ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"panel1\"]/span")).isDisplayed();
	System.out.println("STEP  | Verify It display Student Progress!!! ");
	common.log("<br><br>STEP  | Verify It display Student Progress!!! ");
	common.pause(20);
	
	driver.findElement(By.xpath("//*[@id=\"overview\"]/div[1]/div[5]/div/label[5]")).click();
	System.out.println("STEP   | Click on All Time Raio Button ");
	common.log("<br><br>STEP   | Click on All Time Raio Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"studentgrid\"]/table/tbody/tr[4]/td[3]")).click();
	System.out.println("STEP  | Select User from List ");
	common.log("<br><br>STEP  | Select User from List ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"testhistory\"]/table/tbody/tr/td[2]")).click();
	System.out.println("STEP  | Click on Test History By Day ");
	common.log("<br><br>STEP  | Click on Test History By Day ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"question\"]/table/tbody/tr[1]/td[3]")).isDisplayed();
	System.out.println("STEP  | Verify It Display User Progress ");
	common.log("<br><br>STEP  | Verify It Display User Progress ");
	common.pause(10);
}

public void Verify_to_view_when_user_click_on_chart_in_Error_Chart() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"student_panel3\"]/span")).click();
	System.out.println("STEP   | Click on Chart tab ");
	common.log("<br><br>STEP   | Click on Chart tab ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"studentChart3_title\"]")).isDisplayed();
	System.out.println("STEP   | Verify Error by Chart Display!!! ");
	common.log("<br><br>STEP   | Verify Error by Chart Display!!! ");
	common.pause(10);
}

public void Verify_to_not_display_status_dropdown_option_in_Test_History_By_Week() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"panel4\"]/span")).click();
	System.out.println("STEP   | Click on Test History By Week ");
	common.log("<br><br>STEP   | Click on Test History By Week ");
	common.pause(10);
}


public void Verify_to_display_Send_Email_logs_in_Email_logs() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"emailsloggrid\"]/table/tbody/tr[1]/td[2]")).click();
	System.out.println("STEP   | Verify Email Logs Displays!!! ");
	common.log("<br><br>STEP   | Verify Email Logs Displays!!! ");
	common.pause(10);
}

public void Verify_to_view_test_history_by_week() throws InterruptedException, IOException{
	
	driver.findElement(By.xpath("//*[@id=\"panel4\"]/span")).click();
	System.out.println("STEP   | Click on Test History By Week ");
	common.log("<br><br>STEP   | Click on Test History By Week ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"testhistoryweek\"]/table/tbody/tr/td[1]")).isDisplayed();
	System.out.println("STEP   | Verify Test History By Week ");
	common.log("<br><br>STEP   | Verify on Test History By Week ");
	common.pause(10);
}

public void Verify_to_apply_filter_basic_information() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"chart_tab\"]/span[2]")).click();
	System.out.println("STEP   | Click on Chart Tab ");
	common.log("<br><br>STEP   | Click on Chart Tab ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"chart_left_panelbar\"]/li[2]/span")).click();
	System.out.println("STEP   | Click on Basic Information ");
	common.log("<br><br>STEP   | Click on Basic Information ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"BI_FINDForm\"]/div/div/div[2]/div[2]/div/div[1]/label/span")).click();
	System.out.println("STEP   | Click on Yes Radio Button ");
	common.log("<br><br>STEP   | Click on Yes Radio Button ");
	common.pause(10);
	
	driver.findElement(By.xpath("//*[@id=\"barchart_controller1\"]/div[1]/div/label[2]")).click();
	System.out.println("STEP   | Click on UC Checkbox ");
	common.log("<br><br>STEP   | Click on UC Checkbox ");
	common.pause(10);
	
}

public void Verify_to_Enable_Submit_when_user_edit_any_data_in_Applicant_form() throws InterruptedException, IOException{

	driver.findElement(By.xpath("//*[@id=\"applicantalertfinalpercentage\"]")).click();
	System.out.println("STEP   | Click on Alert Final Textbox ");
	common.log("<br><br>STEP   | Click on Alert Final Textbox ");
	common.pause(10);
	
}








}
