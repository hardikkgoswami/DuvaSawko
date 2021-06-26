package com.Duva.Sawko;
import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;



public class Testsuit {

    BasePage basePage;
   
    @BeforeClass
    public void onBefore() {
        basePage = new BasePage();
    }

    @AfterClass
    public void tearDown() throws Exception {
        basePage.close();
    }

//  Test Case 01 ::
    @Test
    public void Verify_Login_Details_of_Student() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.verify_loing_details();
    }
 
//  Test Case 02 ::    
    @Test
    public void Verify_Wrong_Password() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.verify_wrong_password();
    }
 
//  Test Case 03 ::    
    @Test
    public void Verify_Wrong_Email() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.verify_wrong_email();
    }
    
//  Test Case 04 ::    
    @Test
    public void Verify_To_View_Applicant_Introduction_Video() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.verify_to_view_applicant_introduction_video();
    }
    
//  Test Case 05 ::    
    @Test
    public void Verify_To_View_Medical_Decision_Making_Tools_Video() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.verify_to_view_medical_decision_making_tools_video();
    }
    
//  Test Case 06 ::    
    @Test
    public void Verify_To_View_Medical_Decision_Making_Tools_DSGCC_Video() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.verify_to_view_medical_decision_making_tools_DSGCC_video();
    }

//  Test Case 07 ::    
    @Test
    public void Verify_To_View_Medical_Decision_Making_Tools_Scenario_Video() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.verify_to_view_medical_decision_making_tools_scenario_video();
    }
    
//  Test Case 08 ::    
    @Test
    public void Verify_To_View_Applicant_Tutorial_Video() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.verify_to_view_applicant_tutorial_video();
    }
    
//  Test Case 09 ::    
    @Test
    public void Verify_Login_Details_of_Admin() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.verify_login_details_of_admin();
    }
    
//  Test Case 10 ::    
    @Test
    public void Verify_To_Add_New_Applicant_as_Student() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.verify_to_add_new_applicant_as_student();
    }
    
//  Test Case 11 ::    
    @Test
    public void Verify_to_check_dates_functionality() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_check_dates_functionality();
    }
    
//  Test Case 12 ::     
    @Test
    public void Verify_to_check_My_Profile_and_Logout_options() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_check_My_Profile_and_Logout_options();
    }
 
//  Test Case 13 :: 
    @Test
    public void Verify_to_Reset_Password() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Reset_Password();
    }
 
//  Test Case 14 :: 
    @Test
    public void Verify_to_fill_My_Profile() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_fill_My_Profile();
    }
  
//  Test Case 15 :: 
    @Test
    public void Verify_to_Search_User() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Search_User();
    }
    
//  Test Case 16 :: 
    @Test
    public void Verify_to_display_Chart_Properly_after_refresh_page() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_display_Chart_Properly_after_refresh_page();
    }
    
//  Test Case 17 :: 
    @Test
    public void Verify_to_view_Manage_ICD_10() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_view_Manage_ICD_10();
    }
    
//  Test Case 18 :: 
    @Test 
    public void Verify_to_view_Manage_CPT() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_view_Manage_CPT();
    }
    
//  Test Case 19 ::     
    @Test 
    public void Verify_to_view_Average_Daily_Logins() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_check_dates_functionality();
    }
    
//  Test Case 20 :: 
    @Test 
    public void Verify_to_Select_Date_In_Calendar() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Select_Date_In_Calendar();
    }

//  Test Case 21 ::     
    @Test 
    public void Verify_to_display_valid_error_message_when_user_didnt_enter_Email_Address() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_display_valid_error_message_when_user_didnt_enter_Email_Address();
    }
    
//  Test Case 22 ::     
    @Test 
    public void Verify_to_display_valid_error_message_when_user_didnt_enter_Email_Address1() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_display_valid_error_message_when_user_didnt_enter_Email_Address();
    }
    
//  Test Case 23 ::     
    @Test 
    public void Verify_to_Find_by_data_First_Name() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Find_by_data_First_Name();
    }
    
//  Test Case 24 ::     
    @Test 
    public void Verify_to_View_Chart_Loader() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_View_Chart_Loader();
    }
    
//  Test Case 25 ::     
    @Test 
    public void Verify_to_Find_data_By_CPT() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Find_data_By_CPT();
    }
    
//  Test Case 26 ::     
    @Test 
    public void Verify_to_Update_CPT() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Update_CPT();
    }
    
//  Test Case 27 ::     
    @Test 
    public void Verify_to_Add_DSGCC() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Add_DSGCC();
    }
    
//  Test Case 28 ::     
    @Test 
    public void Verify_to_Find_by_Risk_level_DSGCC() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Add_DSGCC();
    }
    
//  Test Case 29 ::     
    @Test 
    public void Verify_to_Find_Manage_ICD_10_by_Diagnosis_Code() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Find_Manage_ICD_10_by_Diagnosis_Code();
    }
    
//  Test Case 30 ::     
    @Test 
    public void Verify_to_delete_DSGCC() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_delete_DSGCC();
    }
 
//  Test Case 31 :: 
    @Test 
    public void Verify_to_Find_by_Text_1_DSGCC() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Find_by_Text_1_DSGCC();
    }
    
//  Test Case 32 :: 
    @Test 
    public void Verify_to_View_Item_per_page() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_View_Item_per_page();
    }
    
//  Test Case 33 :: 
    @Test 
    public void Verify_to_View_Sequence() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_View_Sequence();
    }
    
//  Test Case 34 :: 
    @Test 
    public void Verify_to_Clear_All() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Clear_All();
    }
    
//  Test Case 35 ::   
    @Test 
    public void Verify_to_View_Panel_Bars() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_View_Panel_Bars();
    }
    
//  Test Case 36 :: 
    @Test 
    public void Verify_to_edit_Notes() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_edit_Notes();
    }
    
//  Test Case 37 :: 
    @Test 
    public void Verify_to_Add_MetaData_in_Chart_Loader() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Add_MetaData_in_Chart_Loader();
    }
    
//  Test Case 38 :: 
    @Test 
    public void Verify_to_Completed_New_Chart_Loader() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Completed_New_Chart_Loader();
    }
    
//  Test Case 39 :: 
    @Test 
    public void Verify_to_Complete_Checkbox_on_each_section() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Completed_New_Chart_Loader();
    }
    
//  Test Case 40 :: 
    @Test 
    public void Verify_to_view_HPI_Parser_tab() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_view_HPI_Parser_tab();
    }
    
//  Test Case 41 :: 
    @Test 
    public void Verify_to_Upload_Image_for_Mockups() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Upload_Image_for_Mockups();
    }
    
//  Test Case 42 :: 
    @Test 
    public void Verify_to_view_Datagrid_Per_Page() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_view_Datagrid_Per_Page();
    }
    
//  Test Case 43 :: 
    @Test 
    public void Verify_to_Show_Error_Message_In_Red_Color() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Show_Error_Message_In_Red_Color();
    }
    
//  Test Case 44 :: 
    @Test 
    public void Verify_to_Remember_Chart_number() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Remember_Chart_number();
    }
    
//  Test Case 45 :: 
    @Test 
    public void Verify_that_if_checkbox_is_checked_then_it_should_disable_dropdown() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_that_if_checkbox_is_checked_then_it_should_disable_dropdown();
    }
    
//  Test Case 46 :: 
    @Test 
    public void Verify_when_user_submit_metadata_it_move_to_chart_finder_message_should_disappear() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_that_if_checkbox_is_checked_then_it_should_disable_dropdown();
    }
    
//  Test Case 47 :: 
    @Test 
    public void Verify_to_select_Tickers_button_in_Metadata() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_that_if_checkbox_is_checked_then_it_should_disable_dropdown();
    }
    
//  Test Case 48 :: 
    @Test 
    public void Verify_to_tickers_button_on_Metadata() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_tickers_button_on_Metadata();
    }
    
//  Test Case 49 :: 
    @Test 
    public void Verify_to_reset_data_in_Chart_Finder_MetaData() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_reset_data_in_Chart_Finder_MetaData();
    }

//  Test Case 50 ::    
    @Test 
    public void Verify_to_dont_load_chart_data_when_no_data_selected() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_dont_load_chart_data_when_no_data_selected();
    }
 
//  Test Case 51 ::    
    @Test 
    public void Verify_to_Refresh_page_and_it_Reset_Chart() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Refresh_page_and_it_Reset_Chart();
    }
 
//  Test Case 52 ::    
    @Test 
    public void Verify_to_select_Visit_type_Classification_and_EMR_filter_to_search_Chart_list() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_select_Visit_type_Classification_and_EMR_filter_to_search_Chart_list();
    }
 
//  Test Case 53 ::    
    @Test 
    public void Verify_to_Asterisks_shouldnt_display_if_complete_checkbox_is_checked() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Asterisks_shouldnt_display_if_complete_checkbox_is_checked();
    }
   
//  Test Case 54 ::    
    @Test 
    public void Verify_to_view_New_Chart_button() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_view_New_Chart_button();
    }
 
//  Test Case 55 ::    
    @Test 
    public void Verify_to_Delete_Selected_Chart() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Delete_Selected_Chart();
    }
    
//    Test Case 56 ::
    @Test 
    public void Verify_to_load_selected_chart_in_Chart_Loader() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_load_selected_chart_in_Chart_Loader();
    }
    
//  Test Case 57 ::
    @Test 
    public void Veriy_to_Find_Chart_and_Display_Basic_Information_Correctly() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Veriy_to_Find_Chart_and_Display_Basic_Information_Correctly();
    }
    
//  Test Case 58 ::
    @Test 
    public void Verify_to_Find_Chart_and_Display_HPI_Parser() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Find_Chart_and_Display_HPI_Parser();
    }
    
//  Test Case 59 ::
    @Test 
    public void Verify_that_if_Complete_checkbox_is_checked_then_it_should_disable_all_the_things() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_that_if_Complete_checkbox_is_checked_then_it_should_disable_all_the_things();
    }
    
//  Test Case 60 ::
    @Test 
    public void Veriy_to_display_Message_for_Submit_button() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Veriy_to_display_Message_for_Submit_button();
    }
    
//  Test Case 61 ::
    @Test 
    public void Verify_to_Success_Message_when_user_submit_MetaData() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Add_MetaData_in_Chart_Loader();
    }
    
//  Test Case 62 ::
    @Test 
    public void Verify_When_user_Create_New_Chart_it_display_Asterisks() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_When_user_Create_New_Chart_it_display_Asterisks();
    }
    
//  Test Case 63 ::
    @Test 
    public void Verify_that_when_user_click_on_New_Chart_button_it_clear_fields() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_that_when_user_click_on_New_Chart_button_it_clear_fields();
    }    

//  Test Case 64 ::
    @Test 
    public void Verify_to_deselect_chart_from_selected_charts() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_deselect_chart_from_selected_charts();
    }  
    
//  Test Case 65 ::
    @Test 
    public void Verify_to_display_error_message_when_required_fields_are_empty() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_display_error_message_when_required_fields_are_empty();
    } 
    
//  Test Case 66 ::
    @Test 
    public void Verify_to_redirect_HPI_Parser_tab_when_user_click_on_HPI_Parser_button() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_redirect_HPI_Parser_tab_when_user_click_on_HPI_Parser_button();
    } 
    
//  Test Case 67 ::
    @Test 
    public void Verify_to_add_multiple_HPI_Parser() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_add_multiple_HPI_Parser();
    } 
    
//  Test Case 68 ::
    @Test 
    public void Verify_to_select_only_one_option_in_History_of_Present_illness_option() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_select_only_one_option_in_History_of_Present_illness_option();
    } 
    
//  Test Case 69 ::
    @Test 
    public void Verify_to_upload_bulk_images() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_upload_bulk_images();
    } 
    
//  Test Case 70 ::
    @Test 
    public void Verify_to_remove_error_message_when_radio_button_selected() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_remove_error_message_when_radio_button_selected();
    } 
    
//  Test Case 71 ::
    @Test 
    public void Verify_to_view_all_tabs() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_view_all_tabs();
    } 
    
//  Test Case 72 ::
    @Test 
    public void Verify_to_select_dropdown_list_in_MetaData() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_select_dropdown_list_in_MetaData();
    } 
    
//  Test Case 73 ::
    @Test 
    public void Verify_that_when_user_select_New_option_is_shouldnt_select_radio_button_in_HPI() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_that_when_user_select_New_option_is_shouldnt_select_radio_button_in_HPI();
    } 
    
//  Test Case 74 ::
    @Test 
    public void Verify_to_display_Message_when_user_make_change_in_MetaData_Pages() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_display_Message_when_user_make_change_in_MetaData_Pages();
    } 
    
//  Test Case 75 ::
    @Test 
    public void Verify_to_Click_on_all_Complete_check_box_in_all_options() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Click_on_all_Complete_check_box_in_all_options();
    } 
    
//  Test Case 76 ::
    @Test 
    public void Verify_to_Reset_all_apply_filters_IN_Metadata() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Reset_all_apply_filters_IN_Metadata();
    } 
    
//  Test Case 77 ::
    @Test 
    public void Verify_to_find_chart_by_Apply_History_of_Present_illness_option() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_find_chart_by_Apply_History_of_Present_illness_option();
    } 
    
//  Test Case 78 ::
    @Test 
    public void Verify_to_Delete_Chart() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_delete_DSGCC();
    } 
    
//  Test Case 79 ::
    @Test 
    public void Verify_to_load_and_retrieve_all_data_of_chart() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_load_and_retrieve_all_data_of_chart();
    } 
    
//  Test Case 80 ::
    @Test 
    public void Verify_to_display_error_message_chart_number_is_blank() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Show_Error_Message_In_Red_Color();
    } 
    
//  Test Case 81 ::    
    @Test 
    public void Verify_to_delete_multiple_charts_from_list() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Delete_Selected_Chart();
    }
    
//  Test Case 82 ::    
    @Test 
    public void Verify_to_display_next_and_previous_chart() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_display_next_and_previous_chart();
    }
    
//  Test Case 83 ::    
    @Test 
    public void Verify_to_status_as_complete() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Completed_New_Chart_Loader();
    }
    
//  Test Case 84 ::    
    @Test 
    public void Verify_to_Select_checkbox_in_Review_of_Systems() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Select_checkbox_in_Review_of_Systems();
    }

//  Test Case 85 ::    
    @Test 
    public void Verify_to_History_of_Present_illness_text_it_HPI_tab() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_History_of_Present_illness_text_it_HPI_tab();
    }
    
//  Test Case 86 ::    
    @Test 
    public void Verify_to_Show_Error_Message_In_Red_Color1() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Show_Error_Message_In_Red_Color();
    }
    
//  Test Case 87 ::    
    @Test 
    public void Verify_to_status_as_In_Progress() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_status_as_In_Progress();
    }
    
//  Test Case 88 ::    
    @Test 
    public void Verify_to_user_checked_mark_Complete_checkbox() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_user_checked_mark_Complete_checkbox();
    }
    
//  Test Case 89 ::    
    @Test 
    public void Verify_to_See_Success_message_when_user_enter_HPI_Parser() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_See_Success_message_when_user_enter_HPI_Parser();
    }
    
//  Test Case 90 ::    
    @Test 
    public void Verify_to_select_EMR_radio_options() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_select_EMR_radio_options();
    }
    
//  Test Case 91 ::    
    @Test 
    public void Verify_Edited_data_in_MetaData() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_Edited_data_in_MetaData();
    }
    
//  Test Case 92 ::    
    @Test 
    public void Verify_to_disable_Chart_number_once_it_completed() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_disable_Chart_number_once_it_completed();
    }
    
//  Test Case 93 ::    
    @Test 
    public void Verify_that_if_user_enter_duplicate_chart_number_it_shouldnt_allow_to_enter_data() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_that_if_user_enter_duplicate_chart_number_it_shouldnt_allow_to_enter_data();
    }
    
//  Test Case 94 ::    
    @Test 
    public void Verify_to_Enlarge_Chart_Image() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Enlarge_Chart_Image();
    }
    
//  Test Case 95 ::    
    @Test 
    public void Verify_that_if_chart_is_locked_then_HPI_Parser_tab_should_be_disabled() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_that_if_chart_is_locked_then_HPI_Parser_tab_should_be_disabled();
    }
    
//  Test Case 96 ::    
    @Test 
    public void Verify_to_complete_History_of_Present_illness() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_complete_History_of_Present_illness();
    }
    
//  Test Case 97 ::    
    @Test 
    public void Verify_to_default_0_radio_button_selected_in_Special_Studies() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_default_0_radio_button_selected_in_Special_Studies();
    }
    
//  Test Case 98 ::    
    @Test 
    public void Verify_to_Error_message_when_user_submit_button() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Error_message_when_user_submit_button();
    }
    
//  Test Case 99 ::    
    @Test 
    public void Verify_to_check_filter_of_History_of_Present_illness() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_check_filter_of_History_of_Present_illness();
    }
    
//  Test Case 100 ::    
    @Test 
    public void Verify_to_view_DSGCC_Current_Guideline() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_view_DSGCC_Current_Guideline();
    }
    
//  Test Case 101 ::    
    @Test 
    public void Verify_to_view_DSGCC_data_should_be_preload() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_view_DSGCC_data_should_be_preload();
    }
    
//  Test Case 102 ::    
    @Test 
    public void Verify_to_view_Chart_finder_sort_by_chart_number() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_view_Chart_finder_sort_by_chart_number();
    }
    
//  Test Case 103 ::    
    @Test 
    public void Verify_to_preview_of_HPI_Parser_data_for_current_selected_chart() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_preview_of_HPI_Parser_data_for_current_selected_chart();
    }
    
//  Test Case 104 ::    
    @Test 
    public void Verify_to_Select_No_radio_button_in_Medication_tab() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Select_No_radio_button_in_Medication_tab();
    }
    
//  Test Case 105 ::    
    @Test 
    public void Verify_to_Select_radio_button_in_MDM_tab() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Select_radio_button_in_MDM_tab();
    }
    
//  Test Case 106 ::    
    @Test 
    public void Verify_to_Select_No_radio_button() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Select_No_radio_button();
    }
    
//  Test Case 107 ::    
    @Test 
    public void Verify_to_count_total_in_MDM() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_count_total_in_MDM();
    }
    
//  Test Case 108 ::    
    @Test 
    public void Verify_to_fill_Special_Studies_Ancillary_Studies_Medication_and_save_data() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_fill_Special_Studies_Ancillary_Studies_Medication_and_save_data();
    }
    

//  Test Case 109 ::    
    @Test 
    public void Verify_to_Asterisks_Should_remove_when_user_select_complete_checkbox() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_fill_Special_Studies_Ancillary_Studies_Medication_and_save_data();
    }
    
//  Test Case 110 ::    
    @Test 
    public void Verify_to_select_incorrect_chart_and_that_chart_shouldnt_save() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_select_incorrect_chart_and_that_chart_shouldnt_save();
    }
    
//  Test Case 112 ::    
    @Test 
    public void Verify_to_Asterisks_Should_remove_when_user_select_complete_checkbox1() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Asterisks_Should_remove_when_user_select_complete_checkbox1();
    }
    
    
//  Test Case 111 ::    
    @Test 
    public void Verify_to_Asterisks_Should_remove_when_user_select_complete_checkbox2() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Asterisks_Should_remove_when_user_select_complete_checkbox1();
    }
    
//  Test Case 113 ::    
    @Test 
    public void Verify_to_view_Physical_Examination_chart() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_view_Physical_Examination_chart();
    }
    
//  Test Case 114 ::    
    @Test 
    public void Verify_to_See_Success_message_when_user_enter_HPI_Parser1() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_See_Success_message_when_user_enter_HPI_Parser();
    }
    
//  Test Case 115 ::    
    @Test 
    public void Verify_to_select_checkbox_in_Review_of_System() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_select_checkbox_in_Review_of_System();
    }
    
//  Test Case 116 ::    
    @Test 
    public void Verify_to_select_page_it_should_find_and_display_into_list() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_select_page_it_should_find_and_display_into_list();
    }
    
//  Test Case 117 ::    
    @Test 
    public void Verify_to_view_DSGCC_Current_Guideline1() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_view_DSGCC_Current_Guideline();
    }
    
//  Test Case 118 ::    
    @Test 
    public void Verify_to_select_radio_button_and_submit_data() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_select_radio_button_and_submit_data();
    }
    
//  Test Case 119 ::    
    @Test 
    public void Verify_to_select_radio_button_and_drop_down_list_and_submit_data() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_select_radio_button_and_drop_down_list_and_submit_data();
    }
    
//  Test Case 120 ::    
    @Test 
    public void Verify_to_Edit_Pages_and_no_unwanted_flash_message_display() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Edit_Pages_and_no_unwanted_flash_message_display();
    }
    
//  Test Case 121 ::    
    @Test 
    public void Verify_to_load_multiple_chart_and_When_user_click_on_next_button_it_should_also_change_chart_number() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_load_multiple_chart_and_When_user_click_on_next_button_it_should_also_change_chart_number();
    }
    
//  Test Case 122 ::    
    @Test 
    public void Verify_to_view_DSGCC_option() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_view_DSGCC_option();
    }
    
//  Test Case 123 ::    
    @Test 
    public void Verify_to_view_Impression_Plan_option() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_view_Impression_Plan_option();
    }
    
//  Test Case 124 ::    
    @Test 
    public void Verify_to_search_Supervising_physician_and_display_into_list() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_search_Supervising_physician_and_display_into_list();
    }
    
//  Test Case 125 ::    
    @Test 
    public void Verify_to_Search_keywords_in_DSGCC_Current_Guideline() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Search_keywords_in_DSGCC_Current_Guideline();
    }
    
//  Test Case 126 ::    
    @Test 
    public void Verify_to_View_Answer_Key_option() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_View_Answer_Key_option();
    }
    
//  Test Case 127 ::    
    @Test 
    public void Verify_to_view_DSGCC_data_grid_in_right_side() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_view_DSGCC_data_grid_in_right_side();
    }
    
//  Test Case 128 ::    
    @Test 
    public void Verify_to_view_Notes() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_view_Notes();
    }
    
//  Test Case 129 ::    
    @Test 
    public void Verify_to_Edit_Manage_Users() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Edit_Manage_Users();
    }
    
//  Test Case 130 ::    
    @Test 
    public void Verify_to_reset_all_fields_and_Status_should_be_blank() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_reset_all_fields_and_Status_should_be_blank();
    }
    
//  Test Case 131 ::    
    @Test 
    public void Verify_to_view_My_Profile() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_view_My_Profile();
    }
    
//  Test Case 132 ::    
    @Test 
    public void Verify_to_view_Parameter() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_view_Parameter();
    }
    
//  Test Case 133 ::    
    @Test 
    public void Verify_to_edit_Answer_Key() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_edit_Answer_Key();
    }
    
//  Test Case 134 ::    
    @Test 
    public void Verify_after_login_display_chart_finder() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_after_login_display_chart_finder();
    }
    
//  Test Case 135 ::    
    @Test 
    public void Verify_to_edit_Impression_Plan() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_edit_Impression_Plan();
    }
    
//  Test Case 136 ::    
    @Test 
    public void Verify_to_add_all_selected_charts() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_add_all_selected_charts();
    }
    
//  Test Case 137 ::    
    @Test 
    public void Verify_to_edit_dropdown_in_Addenda_Attestation() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_edit_dropdown_in_Addenda_Attestation();
    }
    
//  Test Case 138 ::    
    @Test 
    public void Verify_to_edit_Manage_DSGCC() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_edit_Manage_DSGCC();
    }
    
//  Test Case 139 ::    
    @Test 
    public void Verify_to_add_Manage_Users() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.verify_to_add_new_applicant_as_student();
    }
    
//  Test Case 140 ::    
    @Test 
    public void Verify_to_load_chart_no_128_and_129() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.verify_to_add_new_applicant_as_student();
    }
    
//  Test Case 141 ::    
    @Test 
    public void Verify_to_add_user_and_linking_data() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_add_user_and_linking_data();
    }
    
//  Test Case 142 ::    
    @Test 
    public void Verify_to_add_multiple_HPI_Parser1() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_add_multiple_HPI_Parser1();
    }
    
//  Test Case 143 ::    
    @Test 
    public void Verify_to_Student_grid_in_Answer_Key() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Student_grid_in_Answer_Key();
    }
    
//  Test Case 144 ::    
    @Test 
    public void Verify_to_upload_correct_file() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_upload_correct_file();
    }
    
//  Test Case 145 ::    
    @Test 
    public void Verify_to_Export_selected_data() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Export_selected_data();
    }
    
//  Test Case 146 ::    
    @Test 
    public void Verify_to_Edit_Answer_Key_with_multiple_charts() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Edit_Answer_Key_with_multiple_charts();
    }
    
//  Test Case 147 ::    
    @Test 
    public void Verify_to_select_PE_and_display_todays_data() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_select_PE_and_display_todays_data();
    }
    
//  Test Case 148 ::    
    @Test 
    public void Verify_to_Load_In_Progress_Chart() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Load_In_Progress_Chart();
    }
    
//  Test Case 149 ::    
    @Test 
    public void Verify_to_display_error_message_when_user_wrong_CPT() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_display_error_message_when_user_wrong_CPT();
    }
    
//  Test Case 150 ::    
    @Test 
    public void Verify_to_Enrollment_enhancement() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Enrollment_enhancement();
    }
    
//  Test Case 151 ::    
    @Test 
    public void Verify_to_view_Student_Progress() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_view_Student_Progress();
    }
    
//  Test Case 152 ::    
    @Test 
    public void Verify_to_edited_data_should_save() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_edited_data_should_save();
    }
    
//  Test Case 153 ::    
    @Test 
    public void Verify_to_load_Chart_finder_page() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_load_multiple_chart_and_When_user_click_on_next_button_it_should_also_change_chart_number();
    }
    
//  Test Case 154 ::    
    @Test 
    public void Verify_to_clear_all_fields() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_clear_all_fields();
    }
    
//  Test Case 155 ::    
    @Test 
    public void Verify_to_display_error_message_when_other_fields_are_blank() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_display_error_message_when_other_fields_are_blank();
    }
    
//  Test Case 156 ::    
    @Test 
    public void Verify_when_user_enter_all_values_it_should_display_blank_fields() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_when_user_enter_all_values_it_should_display_blank_fields();
    }
    
//  Test Case 157 ::    
    @Test 
    public void Verify_to_make_data_grid_per_page() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_make_data_grid_per_page();
    }
    
//  Test Case 158 ::    
    @Test 
    public void Verify_to_apply_filter_from_first_letter() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_apply_filter_from_first_letter();
    }
    
//  Test Case 159 ::    
    @Test 
    public void Verify_to_Search_by_Mobile_Phone() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Search_by_Mobile_Phone();
    }
    
//  Test Case 160 ::    
    @Test 
    public void Verify_that_Other_phone_is_optional() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_that_Other_phone_is_optional();
    }
    
//  Test Case 161 ::    
    @Test 
    public void Verify_to_search_user() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_search_user();
    }
    
//  Test Case 162 ::    
    @Test 
    public void Verify_to_add_Middle_Initial_and_verify_into_list() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.verify_to_add_new_applicant_as_student();
    }
    
//  Test Case 163 ::    
    @Test 
    public void Verify_to_reset_filter_when_user_go_to_next_chart_in_DSGCC_tab() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_reset_filter_when_user_go_to_next_chart_in_DSGCC_tab();
    }
    
//  Test Case 164 ::    
    @Test 
    public void Verify_to_delete_DSGCC1() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_delete_DSGCC();
    }
    
//  Test Case 165 ::    
    @Test 
    public void Verify_to_Edit_User_Details() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Edit_Manage_Users();
    }
    
//  Test Case 166 ::    
    @Test 
    public void Verify_functionality_when_user_left_blank_fields() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_functionality_when_user_left_blank_fields();
    }
    
//  Test Case 167 ::   
    @Test 
    public void Verify_that_submit_button_is_disable() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_that_submit_button_is_disable();
    }
    
//  Test Case 168 ::    
    @Test 
    public void Verify_to_change_In_Progress_status_to_Complete() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_change_In_Progress_status_to_Complete();
    }

//  Test Case 169 ::    
    @Test 
    public void Verify_to_upload_video_file_and_it_show_error_message() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_upload_video_file_and_it_show_error_message();
    }
    
//  Test Case 170 ::    
    @Test 
    public void Verify_to_HPI_Parser_select_New_by_default_in_Is_this_a_new_or_established_problem() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_redirect_HPI_Parser_tab_when_user_click_on_HPI_Parser_button();
    }
    
//  Test Case 171 ::    
    @Test 
    public void Verify_to_Select_Mid_Level() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Select_Mid_Level();
    }
    
//  Test Case 172 ::    
    @Test 
    public void Verify_to_delete_and_add_DSGCC() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_delete_and_add_DSGCC();
    }
    
//  Test Case 173 ::    
    @Test 
    public void Verify_to_create_new_chart_once_existing_chart_complete() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_create_new_chart_once_existing_chart_complete();
    }
    
//  Test Case 174 ::    
    @Test 
    public void Verify_to_View_HPI_Parser_tab() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_View_HPI_Parser_tab();
    }
    
//  Test Case 175 ::    
    @Test 
    public void Verify_to_Load_Chart_no_168_for_HPI_Parser_tab() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Load_Chart_no_168_for_HPI_Parser_tab();
    }
    
//  Test Case 176 ::    
    @Test 
    public void Verify_to_change_score_based_on_CPT() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_change_score_based_on_CPT();
    }
    
//  Test Case 177 ::    
    @Test 
    public void Verify_to_view_user_Progress() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 178 ::    
    @Test 
    public void Verify_to_search_Student_by_name_and_no_record_found_display_message() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_search_Student_by_name_and_no_record_found_display_message();
    }
    
//  Test Case 179 ::    
    @Test 
    public void Verify_to_view_Manage_Stage() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_view_Manage_Stage();
    }
    
//  Test Case 180 ::    
    @Test 
    public void Verify_to_Load_Chart_no_524_to_Load_all_data() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Load_Chart_no_524_to_Load_all_data();
    }
    
//  Test Case 181 ::    
    @Test 
    public void Verify_to_load_charts() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_load_charts();
    }
    
//  Test Case 182 ::    
    @Test 
    public void Verify_to_functionality_of_Email() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_functionality_of_Email();
    }
    
//  Test Case 183 ::    
    @Test 
    public void Verify_to_check_Risk_Level() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_check_Risk_Level();
    }
    
//  Test Case 184 ::    
    @Test 
    public void Verify_to_refresh_page_and_charts_list() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_refresh_page_and_charts_list();
    }
    
//  Test Case 185 ::    
    @Test 
    public void Verify_to_search_chart_by_Page_Range() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_search_chart_by_Page_Range();
    }
    
//  Test Case 186 ::    
    @Test 
    public void Verify_to_create_new_user_and_login_with_new_user() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.verify_to_add_new_applicant_as_student();
    }
    
//  Test Case 187 ::    
    @Test 
    public void Verify_to_Display_Message_when_user_add_or_delete_DSGCC() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_delete_and_add_DSGCC();
    }
    
//  Test Case 188 ::    
    @Test 
    public void Verify_to_display_error_message_when_user_upload_any_other_format_file() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_display_error_message_when_user_upload_any_other_format_file();
    }
    
//  Test Case 189 ::    
    @Test 
    public void Verify_to_Add_or_to_or_in_ICD_Strings() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_display_error_message_when_user_wrong_CPT();
    }
    
//  Test Case 190 ::    
    @Test 
    public void Verify_to_display_data_as_per_Select_Data_Grid() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_display_data_as_per_Select_Data_Grid();
    }
    
//  Test Case 191 ::    
    @Test 
    public void Verify_to_Clear_Filters() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_Clear_Filters();
    }
    
//  Test Case 192 ::    
    @Test 
    public void Verify_to_apply_Classification_filter() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_apply_Classification_filter();
    }
    
//  Test Case 193 ::    
    @Test 
    public void Verify_to_Select_First_Provider() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_Select_First_Provider();
    }
    
//  Test Case 194 ::    
    @Test 
    public void Verify_to_Select_Next_and_Back_button_for_Data_Grid() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_Select_Next_and_Back_button_for_Data_Grid();
    }
    
//  Test Case 195 ::    
    @Test 
    public void Verify_to_Clear_data() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_Clear_data();
    }
    
//  Test Case 196 ::    
    @Test 
    public void Verify_to_click_on_Statistics() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_click_on_Statistics();
    }
    
//  Test Case 197 ::    
    @Test 
    public void Verify_to_Add_New_Row() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_Add_New_Row();
    }
    
//  Test Case 198 ::    
    @Test 
    public void Verify_to_check_Stage_and_Role_filter() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_check_Stage_and_Role_filter();
    }
    
//  Test Case 199 ::    
    @Test 
    public void Verify_to_Change_values_in_Parameters() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_Change_values_in_Parameters();
    }
    
//  Test Case 200 ::    
    @Test 
    public void Verify_to_Check_Sorting() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_Check_Sorting();
    }
    
//  Test Case 201 ::    
    @Test 
    public void Verify_to_check_filter_like_Type_Text1_Text2() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_check_filter_like_Type_Text1_Text2();
    }
    
//  Test Case 202 ::    
    @Test 
    public void Verify_to_Check_Sorting_ManageCPT() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_Check_Sorting_ManageCPT();
    }
    
//  Test Case 203 ::    
    @Test 
    public void Verify_to_Search_CPT_By_Text1_and_Text2() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_Search_CPT_By_Text1_and_Text2();
    }
    
//  Test Case 204 ::    
    @Test 
    public void Verify_to_Check_Sorting_in_First_and_Last_Name() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_Check_Sorting_in_First_and_Last_Name();
    }
    
//  Test Case 205 ::    
    @Test 
    public void Verify_to_Find_Chart_by_Answer_Key() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_Find_Chart_by_Answer_Key();
    }
    
//  Test Case 206 ::    
    @Test 
    public void Verify_to_Upload_Image_in_HPI_Parser_Review_of_System_and_DSGCC() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_Upload_Image_in_HPI_Parser_Review_of_System_and_DSGCC();
    }
    
//  Test Case 207 ::    
    @Test 
    public void Verify_to_Change_Stage_Advancement() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_Change_Stage_Advancement();
    }
    
//  Test Case 208 ::    
    @Test 
    public void Verify_to_delete() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_delete();
    }
    
//  Test Case 209 ::    
    @Test 
    public void Verify_to_see_User_Progress() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_see_User_Progress();
    }
    
//  Test Case 210 ::    
    @Test 
    public void Verify_to_display_Provider1_and_Provider2() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_display_Provider1_and_Provider2();
    }
    
//  Test Case 211 ::    
    @Test 
    public void Verify_to_view_Test_History_By_Day() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_see_User_Progress();
    }
    
//  Test Case 212 ::    
    @Test 
    public void Verify_that_Submit_button_should_work_in_Add_and_Edit_Users() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_when_user_enter_all_values_it_should_display_blank_fields();
    }
    
//  Test Case 213 ::    
    @Test 
    public void Verify_to_Find_Chart_By_Status() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_Find_Chart_By_Status();
    }
    
//  Test Case 214 ::    
    @Test 
    public void Verify_to_Edit_Feedback() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_Edit_Feedback();
    }
    
//  Test Case 215 ::    
    @Test 
    public void Verify_to_Edit_Student_Answer_Key() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_Edit_Student_Answer_Key();
    }

//  Test Case 216 ::    
    @Test 
    public void Verify_to_view_CPT_in_Student_Progress() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_view_CPT_in_Student_Progress();
    }
    
//  Test Case 217 ::    
    @Test 
    public void Verify_to_Calculate_final_Score_Perfectly() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_Calculate_final_Score_Perfectly();
    }
    
//  Test Case 218 ::    
    @Test 
    public void Verify_to_final_score_shouldnt_more_than_Poss_score() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_Calculate_final_Score_Perfectly();
    }
    
//  Test Case 219 ::    
    @Test 
    public void Verify_to_Edit_points_after_finalization() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_Calculate_final_Score_Perfectly();
    }
    
//  Test Case 220 ::    
    @Test 
    public void Verify_to_Display_any_message_in_extra_space_area() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_Calculate_final_Score_Perfectly();
    }
    
//  Test Case 221 ::    
    @Test 
    public void Verify_to_Edit_Feedback_CPT_Provider() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_Edit_Feedback_CPT_Provider();
    }
    
//  Test Case 222 ::    
    @Test 
    public void Verify_to_status_default_select_by_All() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_status_default_select_by_All();
    }
    
//  Test Case 223 ::    
    @Test 
    public void Verify_to_view_Stage_Messages() throws InterruptedException, IOException, AWTException{ 
        basePage.enterURL();
        basePage.Verify_to_view_Stage_Messages();
    }
    
//  Test Case 224 ::    
    @Test 
    public void Verify_to_Edit_FeedbackICD_Feedback_CPT_Provider() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_Edit_FeedbackICD_Feedback_CPT_Provider();
    }
    
//  Test Case 225 ::    
    @Test 
    public void Verify_to_select_radio_buttons() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 basePage.verify_login_details_of_admin();
    	 basePage.Manage_Users();
    	 basePage.Manage_Users_PanelBar_OverRide();
    	 mainmenupage.Verify_to_select_radio_buttons();
    }
    
//  Test Case 226 ::    
    @Test 
    public void Verify_to_Edit_Classification() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Answer_Key();
    	 basePage.Student_Answer_Key();
    	 basePage.Student_Answer_Key_Classification();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Edit_Classification();
    }
    
//  Test Case 227 ::    
    @Test 
    public void Verify_to_select_all_radio_button_in_Add_User() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Manage_Users();
    	 basePage.Manage_Users_TestTab();
    	 basePage.Manage_Users_DatesTab();
    	 basePage.Manage_Users_PanelBar_OverRide();
    	 basePage.Manage_Users_DataTab();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_select_all_radio_button_in_Add_User();
    }
    
//  Test Case 228 ::    
    @Test 
    public void Verify_to_Add_DSGCC_and_verify_once_it_added() throws InterruptedException, IOException, AWTException{
    	basePage.Verify_to_reset_filter_when_user_go_to_next_chart_in_DSGCC_tab();
    }
    
//  Test Case 229 ::    
    @Test 
    public void Verify_lock_and_Unlock_button() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Verify_Chart_loader_load_Chart_unlock_chart();
    }
    
//  Test Case 230 ::    
    @Test 
    public void Verify_to_reset_fill_data_in_chart_finder() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_reset_fill_data_in_chart_finder();
    }
    
//  Test Case 231 ::    
    @Test 
    public void Verify_to_load_charts_and_when_user_add_more_it_increase_chat_number_load_it() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_load_multiple_chart_and_When_user_click_on_next_button_it_should_also_change_chart_number();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_load_charts_and_when_user_add_more_it_increase_chat_number_load_it();
    }
    
//  Test Case 232 ::    
    @Test 
    public void Verify_to_view_Test_time() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 233 ::    
    @Test 
    public void Verify_to_view_Manage_Email() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Verify_to_Utilities();
    	 basePage.Verify_to_Utilities_Manage_Email();
    }
    
//  Test Case 234 ::    
    @Test 
    public void Verify_to_select_all_Date_of_Last_Updates() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_Student_Progress();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_select_all_Date_of_Last_Updates();
    }
    
//  Test Case 235 ::    
    @Test 
    public void Verify_to_view_two_different_section_like_Video_and_Document() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_Student_Progress();
    	 basePage.Verify_to_view_Manage_Stage();
    }
    
//  Test Case 236 ::    
    @Test 
    public void Verify_to_View_Applicant() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Verify_to_Utilities();
    	 basePage.Verify_to_Parameters();
    }
    
//  Test Case 237 ::    
    @Test 
    public void Verify_to_apply_datagrid() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Manage_Users();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_apply_datagrid();
    }
    
//  Test Case 238 ::    
    @Test 
    public void Verify_to_display_Chart_Lock_message() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Verify_Chart_loader_load_Chart_unlock_chart();
    }
    
//  Test Case 239 ::    
    @Test 
    public void Verify_to_display_Message_when_user_student_status_is_in_progress() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 240 ::    
    @Test 
    public void Verify_to_delete_lock_chart() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_Delete_Selected_Chart();
    }
    
//  Test Case 241 ::    
    @Test 
    public void Verify_to_load_all_charts_when_user_select_one_Chart_from_In_Progress_and_one_Chart_from_Complete_status() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_load_all_charts_when_user_select_one_Chart_from_In_Progress_and_one_Chart_from_Complete_status();
    }
    
//  Test Case 242 ::    
    @Test 
    public void Verify_to_enter_CPT_and_Provider1() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Verify_Chart_loader_load_Chart_unlock_chart();
    	 basePage.Chart_Loader_Answer_Key();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_enter_CPT_and_Provider1();
    }
    
//  Test Case 243 ::    
    @Test 
    public void Verify_to_Lock_Message_not_display_on_Chart_Finder() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Verify_Chart_loader_load_Chart_unlock_chart();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Lock_Message_not_display_on_Chart_Finder();
    }
    
//  Test Case 244 ::    
    @Test 
    public void Verify_both_tabs_like_Chart_Loader_and_Chart_Finder() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_View_Chart_Loader();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Lock_Message_not_display_on_Chart_Finder();
    }
    
//  Test Case 245 ::    
    @Test 
    public void Verify_that_unlock_button_should_not_display_if_chart_is_not_display() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_View_Chart_Loader();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Lock_Message_not_display_on_Chart_Finder();
    }
    
//  Test Case 246 ::    
    @Test 
    public void Verify_to_load_Medical_Decision_Making_when_chart_selected() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Verify_Chart_loader_load_Chart_unlock_chart();
    	 basePage.Chart_Loader_Medical_Decision_Making();
    }
    
//  Test Case 247 ::    
    @Test 
    public void Verify_to_view_Manage_Provider() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Answer_Key();
    	 basePage.Manage_Providers();
    }
    
//  Test Case 248 ::    
    @Test 
    public void Verify_to_Search_Chart_By_Status_and_History_source() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_status_default_select_by_All();
    	 
    }
    
//  Test Case 249 ::    
    @Test 
    public void Verify_to_find_chart_by_History_of_Present_illness() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Chart_Finder_History_Of_Present_Illness();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_find_chart_by_History_of_Present_illness();
    }

//  Test Case 250 ::    
    @Test 
    public void Verify_to_Find_chart_by_Review_of_System() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Chart_Finder_ReviewOf_System();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_find_chart_by_Review_of_System();
    }
    
//  Test Case 251 ::    
    @Test 
    public void Verify_to_Find_Chart_by_Past_Medical_Family_Social_History_and_Impression_Plan() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Chart_Finder_Past_Medical_Family();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_find_chart_by_Past_Medical_Family();
    }
    
//  Test Case 252 ::    
    @Test 
    public void Verify_to_FInd_Chart_by_Physical_Examination() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Chart_Finder_Physical_Examination();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_find_chart_by_Pysical_Examination();
    }
    
//  Test Case 253 ::    
    @Test 
    public void Verify_to_FInd_Chart_by_Orders() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Chart_Finder_Orders();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_find_chart_by_Orders();
    }
    
//  Test Case 254 ::    
    @Test 
    public void Verify_to_Find_Chart_by_Medical_Decision_Making_MCT() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Chart_Finder_MDM();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_find_chart_by_MDM();
    }
    
//  Test Case 255 ::    
    @Test 
    public void Verify_to_Find_Chart_by_Duvasawko_Guidelines_for_Coding_Consistency() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Chart_Finder_Duvasawko_Guideline();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_find_chart_by_Duvasawko_Guideline();
    }
    
//  Test Case 256 ::    
    @Test 
    public void Verify_to_Find_Chart_By_Addenda_Attestation() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Chart_Finder_ADDENDA_ATTESTATION();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_find_chart_by_Duvasawko_Guideline();
    }
    
//  Test Case 257 ::    
    @Test 
    public void Verify_to_Select_Stage_radio_buttons() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Verify_to_view_Manage_Stage();
    }
    
//  Test Case 258 ::    
    @Test 
    public void Verify_to_Reset_all_apply_Find_data() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Chart_Finder_History_Of_Present_Illness();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_find_chart_by_History_of_Present_illness();
    	 basePage.Chart_Finder_Orders();
    	 mainmenupage.Verify_to_find_chart_by_Orders();
    	 
    }
    
//  Test Case 259 ::    
    @Test 
    public void Verify_to_Select_Show_Hide_Left_and_Right_Panel_Bars() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Verify_to_view_Parameter();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_find_chart_by_History_of_Present_illness();
    }
    
//  Test Case 260 ::    
    @Test 
    public void Verify_to_NewChart_Bulk_Upload_and_Submit_button() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Verify_Chart_loader_load_Chart_unlock_chart();
    }
    

    
    
    
    
    
    
    

    
    
}
