package com.Duva.Sawko;
import java.awt.AWTException;
import java.io.IOException;

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
    	 basePage.enterURL();
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
    
//  Test Case 261 ::    
    @Test 
    public void Verify_to_Edit_feedback_CPT() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Answer_Key();
    	 basePage.Student_Answer_Key();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Find_Chart_Edit_Chart();
    }
    
//  Test Case 262 ::    
    @Test 
    public void Verify_to_display_NULL_value_if_student_doesnt_give_answer() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 263 ::    
    @Test 
    public void Verify_to_If_chart_is_not_loaded_then_In_Progress_not_display() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Verify_Chart_loader_load_Chart_unlock_chart();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_load_charts_and_when_user_add_more_it_increase_chat_number_load_it();
    }
    
//  Test Case 264 ::    
    @Test 
    public void Verify_to_Clear_search_fields() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Answer_Key();
    	 basePage.Manage_Provider();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_load_charts_and_when_user_add_more_it_increase_chat_number_load_it();
    }
    
//  Test Case 265 ::    
    @Test 
    public void Verify_to_Finalize_Student_Score() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Finalize_Student_Score();
    }
    
//  Test Case 266 ::    
    @Test 
    public void Verify_to_load_Question_when_any_student_in_progress() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 267 ::    
    @Test 
    public void Verify_to_Display_test_by_Test() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Answer_Key();
    	 basePage.Student_Answer_Key();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Display_test_by_Test();
    }
    
//  Test Case 268 ::    
    @Test 
    public void Verify_to_rearrange_Grid_Dragging() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_Manage_Stage();
    }
    
//  Test Case 269 ::    
    @Test 
    public void Verify_to_Find_Chart_and_Edit_that_chart() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
	   	 basePage.verify_login_details_of_admin();
	   	 basePage.Answer_Key();
	   	 basePage.Student_Answer_Key();
	   	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
	   	 mainmenupage.Verify_to_Find_Chart_Edit_Chart();
    }
    
//  Test Case 270 ::    
    @Test 
    public void Verify_to_give_Score_so_user_can_finalize() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Finalize_Student_Score();
    }
    
//  Test Case 271 ::    
    @Test 
    public void Verify_to_view_2_row_option_display_in_dropdown() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Answer_Key();
    	 basePage.Student_Answer_Key();
    	 basePage.Verify_to_Utilities();
    	 basePage.Verify_to_Utilities_Manage_Email();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_view_2_row_option_display_in_dropdown();
    }
    
//  Test Case 272 ::    
    @Test 
    public void Verify_to_Change_Page_number() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_load_multiple_chart_and_When_user_click_on_next_button_it_should_also_change_chart_number();
    }
    
//  Test Case 273 ::    
    @Test 
    public void Verify_to_Updating_Chart() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_New_Chart_button();
    }
    
//  Test Case 274 ::    
    @Test 
    public void Verify_to_Enter_only_String_not_Number() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Answer_Key();
    	 basePage.Student_Answer_Key();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Enter_only_String_not_Number();
    }
    
//  Test Case 275 ::    
    @Test 
    public void Verify_to_display_Proper_message_when_user_has_Incomplete() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 276 ::    
    @Test 
    public void Verify_to_delete_chart() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_Delete_Selected_Chart();
    }
    
//  Test Case 277 ::    
    @Test 
    public void Verify_to_display_Proper_message_when_user_has_IncompleteOne() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 278 ::    
    @Test
    public void Verify_to_Change_Application_to_Pre_Hire_of_Student() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_edited_data_should_save();
    }
    
//  Test Case 279 ::    
    @Test
    public void Verify_to_display_Score_and_display_correct_and_wrong_Answer() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 280 ::    
    @Test
    public void Verify_that_if_Student_has_not_started_it_shouldnt_display_Failed_message() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 281 ::    
    @Test
    public void Verify_to_Final_score_problem() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 282 ::    
    @Test
    public void Verify_to_load_all_questions_in_list() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_load_all_questions_in_list();
    }
    
//  Test Case 283 ::    
    @Test
    public void Verify_to_that_if_user_add_score_it_should_jump_to_top() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_load_all_questions_in_list();
    	 mainmenupage.Verify_to_Finalize_Student_Score();
    }
    
//  Test Case 284 ::    
    @Test
    public void Verify_that_when_user_hover_it_change_message() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 285 ::    
    @Test
    public void Verify_to_View_Last_Submission_full_date_time() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 286 ::    
    @Test
    public void Verify_to_view_Pre_Score_and_Final_Score() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 287 ::    
    @Test
    public void Verify_that_By_Default_Last_3_days_should_selected() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_Student_Progress();
    }
    
//  Test Case 288 ::    
    @Test
    public void Verify_to_check_HPI_Filter_to_search() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Chart_Finder_History_Of_Present_Illness();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_find_chart_by_History_of_Present_illness();
    }
    
//  Test Case 289 ::    
    @Test
    public void Verify_to_Add_Key_two_times() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Answer_Key();
    	 basePage.Student_Answer_Key();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Add_Key_two_times();
    }
    
//  Test Case 290 ::    
    @Test
    public void Verify_to_Add_Long_ICD_String() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Answer_Key();
    	 basePage.Student_Answer_Key();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Add_Key_two_times();
    }
    
//  Test Case 291 ::    
    @Test
    public void Verify_to_apply_different_filters() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Answer_Key();
    	 basePage.Student_Answer_Key();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_apply_different_filters();
    }
    
//  Test Case 292 ::    
    @Test
    public void Verify_to_View_Auto_Promotion_when_Student_Score_Finalize() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 Verify_to_view_user_Progress();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_View_Auto_Promotion_when_Student_Score_Finalize();
    }
    
//  Test Case 293 ::    
    @Test
    public void Verify_to_if_Student_Score_is_than_it_should_display_as_Passed() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 Verify_to_view_user_Progress();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_View_Auto_Promotion_when_Student_Score_Finalize();
    }
    
//  Test Case 294 ::    
    @Test
    public void Verify_if_user_enter_valid_ICD_String_it_should_display_any_error_message() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Answer_Key();
    	 basePage.Student_Answer_Key();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_if_user_enter_valid_ICD_String_it_should_display_any_error_message();
    }
    
//  Test Case 295 ::    
    @Test
    public void Verify_if_user_enter_existing_email_it_should_show_error_message() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_Manage_Stage();
    }
    
//  Test Case 296 ::    
    @Test
    public void Verify_that_Finalize_button_shouldnt_display_if_Student_Exam_is_In_Progress() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 Verify_to_view_user_Progress();
    }
    
//  Test Case 297 ::    
    @Test
    public void Verify_to_Display_Exact_data_when_Student_gives_Test() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 Verify_to_view_user_Progress();
    }
    
//  Test Case 298 ::    
    @Test
    public void Verify_to_Add_and_Edit_Video_and_PDF() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_Manage_Stage();
    }
    
//  Test Case 299 ::    
    @Test
    public void Verify_to_Update_EMail_Template() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_functionality_of_Email();
    }
    
//  Test Case 300 ::    
    @Test
    public void Verify_to_Edit_ICD_String() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Answer_Key();
    	 basePage.Student_Answer_Key();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_if_user_enter_valid_ICD_String_it_should_display_any_error_message();
    }
    
//  Test Case 301 ::    
    @Test
    public void Verify_to_Reload_and_Refresh_HPI_when_user_load_multiple_chart() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_preview_of_HPI_Parser_data_for_current_selected_chart();
    }
    
//  Test Case 302 ::    
    @Test
    public void Verify_to_Check_ICD_String_of_Particular_Chart() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Answer_Key();
    	 basePage.Student_Answer_Key();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Check_ICD_String_of_Particular_Chart();
    }
    
//  Test Case 303 ::    
    @Test 
    public void Verify_to_Edit_all_Student_Answer_Key() throws InterruptedException, IOException, AWTException{
        basePage.enterURL();
        basePage.Verify_to_Edit_Student_Answer_Key();
    }
    
//  Test Case 304 ::    
    @Test 
    public void Verify_to_Edit_Final_Score_so_It_enable_Finalize_button_and_Also_display_Message() throws InterruptedException, IOException, AWTException{
         basePage.enterURL();
         basePage.Verify_to_view_user_Progress();
       	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
       	 mainmenupage.Verify_to_Finalize_Student_Score();
    }
    
//  Test Case 305 ::    
    @Test 
    public void Verify_to_Auto_Promote_Student_when_Test_Passed() throws InterruptedException, IOException, AWTException{
         basePage.enterURL();
         basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 306 ::    
    @Test 
    public void Verify_to_Display_User_Progress_and_The_Test_History_for_Stage_2_to_3() throws InterruptedException, IOException, AWTException{
         basePage.enterURL();
         basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 307 ::    
    @Test
    public void Verify_to_refresh_grid_quickly_when_User_Add_and_Delete() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Answer_Key();
    	 basePage.Student_Answer_Key();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Add_Key_two_times();
    }
    
//  Test Case 308 ::    
    @Test
    public void Verify_to_View_By_Select_Data_By_Date_of_Last_Update() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_Student_Progress();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_View_By_Select_Data_By_Date_of_Last_Update ();
    }
    
//  Test Case 309 ::    
    @Test
    public void Verify_to_display_Error_Message_When_user_not_fill_email() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Manage_Users();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_display_Error_Message_When_user_not_fill_email();
    }
    
//  Test Case 310 ::    
    @Test
    public void Verify_Display_Notes_option() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Manage_Users();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_Display_Notes_option();
    }
    
//  Test Case 311 ::    
    @Test
    public void Verify_to_Student_Move_Applicant_to_PreHire() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_apply_filter_from_first_letter();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Student_Move_Applicant_to_PreHire();
    }
    
//  Test Case 312 ::    
    @Test
    public void Verify_to_View_Total_Chart_Coded() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_Student_Progress();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_View_Total_Chart_Coded();
    }
    
//  Test Case 313 ::    
    @Test
    public void Verify_to_Not_Hide_History_PI_DATA_when_BI_option_selected() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Verify_Chart_loader_load_Chart_unlock_chart();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Not_Hide_History_PI_DATA_when_BI_option_selected();
    }
    
//  Test Case 314 ::    
    @Test
    public void Verify_to_Calculate_Score_on_basics_of_select_option() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Verify_Chart_loader_load_Chart_unlock_chart();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Calculate_Score_on_basics_of_select_option();
    }
    
//  Test Case 315 ::    
    @Test
    public void Verify_to_view_Student_Overall_Status() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 316 ::    
    @Test
    public void Verify_to_View_Remedial_Progress() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_apply_filter_from_first_letter();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Student_Move_Applicant_to_PreHire();
    }
    
//  Test Case 317 ::    
    @Test
    public void Verify_to_Finalize_Button_should_Enable() throws InterruptedException, IOException, AWTException{
    	  basePage.enterURL();
          basePage.Verify_to_view_user_Progress();
          MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
       	  mainmenupage.Verify_to_Finalize_Student_Score();
    }
    
//  Test Case 318 ::    
    @Test
    public void Verify_to_Select_Provider_2_and_Clear_it() throws InterruptedException, IOException, AWTException{
    	  basePage.enterURL();
    	  basePage.verify_login_details_of_admin();
    	  basePage.Answer_Key();
    	  basePage.Student_Answer_Key();
          MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
       	  mainmenupage.Verify_to_Select_Provider_2_and_Clear_it();
    }
    
//  Test Case 319 ::    
    @Test
    public void Verify_to_Edit_Feedback_ICD() throws InterruptedException, IOException, AWTException{
    	  basePage.enterURL();
    	  basePage.Verify_to_Edit_Feedback_CPT_Provider();
    }
    
//  Test Case 320 ::    
    @Test
    public void Verify_to_view_Guideline_in_PanelBar_Override() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_apply_filter_from_first_letter();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_view_Guideline_in_PanelBar_Override();
    }
    
//  Test Case 321 ::    
    @Test
    public void Verify_to_Dates_tab_enabled_by_clicking_on_the_Done_Edit_button() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Manage_Users();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Dates_tab_enabled_by_clicking_on_the_Done_Edit_button();
    }
    
//  Test Case 322 ::    
    @Test
    public void Verify_to_View_Stage_Messages_By_Role() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Verify_to_Utilities();
    	 basePage.Verify_to_Parameters();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_View_Stage_Messages_By_Role();
    }
    
//  Test Case 323 ::    
    @Test
    public void Verify_to_display_Failed_Min_display_when_student_failed() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 324 ::    
    @Test
    public void Verify_to_Add_New_Row_than_Make_eactivate_it() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Verify_to_Utilities();
    	 basePage.Verify_to_Utilities_Utilities();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Add_New_Row_than_Make_eactivate_it();
    }
    
//  Test Case 325 ::    
    @Test
    public void Verify_to_Create_a_Test_5_of_user() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_View_Panel_Bars();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Create_a_Test_5_of_user();
    }
    
//  Test Case 326 ::    
    @Test
    public void Verify_to_download_User_Progress() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_download_User_Progress();
    }
    
//  Test Case 327 ::    
    @Test
    public void Verify_to_upload_video_and_it_should_not_hanged() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_Manage_Stage();
    	
    }
    
//  Test Case 328 ::    
    @Test
    public void Verify_to_Add_an_Allow_Answer_Change_radio_groups() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_View_Panel_Bars();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Create_a_Test_5_of_user();
    	 mainmenupage.Verify_to_Add_an_Allow_Answer_Change_radio_groups();
    }
    
//  Test Case 330 ::    
    @Test
    public void Verify_to_Search_Chart_By_ADDENDA_ATTESTATION() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Search_Chart_By_ADDENDA_ATTESTATION();
    }
    
//  Test Case 329 ::    
    @Test
    public void Verify_To_Find_Chart_by_Answer_Key() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Search_Chart_By_ADDENDA_ATTESTATION();
    }
    
//  Test Case 331 ::    
    @Test
    public void Verify_to_display_error_message_when_text_boxes_are_blank() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Answer_Key();
    	 basePage.Student_Answer_Key();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_display_error_message_when_text_boxes_are_blank();
    }
    
//  Test Case 332 ::    
    @Test
    public void Verify_to_Finalize_Score_of_Student() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Finalize_Student_Score();
    }
    
//  Test Case 333 ::    
    @Test
    public void Verify_to_delete_chart_and_User_cant_use_delete_chart_ID() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
    	basePage.Verify_to_Delete_Selected_Chart();
    }
    
//  Test Case 334 ::    
    @Test
    public void Verify_to_Display_Error_Message_when_fields_are_blank() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
	   	basePage.verify_login_details_of_admin();
	 	basePage.Answer_Key();
	    basePage.Manage_Provider();
	    MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
	    mainmenupage.Verify_to_Display_Error_Message_when_fields_are_blank();
    }
    
//  Test Case 335 ::    
    @Test
    public void Verify_to_Edit_Parameters_and_Submit_changes_to_save() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
	   	basePage.verify_login_details_of_admin();
	 	basePage.Manage_Users();
	    MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
	    mainmenupage.Verify_to_Edit_Parameters_and_Submit_changes_to_save();
    }
    
//  Test Case 336 ::    
    @Test
    public void Verify_to_Display_in_Sequence_like_Test_and_Stage_in_test_tab() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
	   	basePage.verify_login_details_of_admin();
	 	basePage.Manage_Users();
	    MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
	    mainmenupage.Verify_to_Display_in_Sequence_like_Test_and_Stage_in_test_tab();
    }
    
//  Test Case 337 ::    
    @Test
    public void Verify_to_display_Upload_video_button_in_General_Feedback() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
	   	basePage.verify_login_details_of_admin();
	 	basePage.Verify_to_Utilities();
	 	basePage.Verify_to_Utilities_Utilities();
    }
    
//  Test Case 338 ::    
    @Test
    public void Verify_to_Test_and_Test_History_display_data_is_date_in_descending_order() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
	   	basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 339 ::    
    @Test
    public void Verify_to_display_Text_below_Sign_IN_button() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
    	basePage.verify_login_details_of_admin();
    }
    
//  Test Case 340 ::    
    @Test
    public void Verify_to_display_Current_Status_of_Student() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
    	basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 341 ::    
    @Test
    public void Verify_to_Shows_all_as_editable_and_had_to_refresh() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
    	basePage.Verify_to_view_user_Progress();
    	MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
	    mainmenupage.Verify_to_Finalize_Student_Score();
    }
    
//  Test Case 342 ::    
    @Test
    public void Verify_to_display_Other_Messages_tab() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
    	basePage.Verify_to_view_Stage_Messages();
    	MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
	    mainmenupage.Verify_to_display_Other_Messages_tab();
    }
    
//  Test Case 343 ::    
    @Test
    public void Verify_to_display_Same_Status_in_Student_Progress_and_Edit_data_in_Manage_Users() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
    	basePage.Verify_to_view_user_Progress();
    	MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
	    mainmenupage.Verify_to_Finalize_Student_Score();
    }
    
//  Test Case 344 ::    
    @Test
    public void Verify_to_Search_Student_by_Name() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
    	basePage.Verify_to_search_Student_by_name_and_no_record_found_display_message();
    }
    
//  Test Case 345 ::    
    @Test
    public void Verify_to_Search_by_name_and_also_Select_user_type() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
    	basePage.Verify_to_search_Student_by_name_and_no_record_found_display_message();
    }
    
//  Test Case 346 ::    
    @Test
    public void Verify_to_Load_chart_and_make_changes_in_IMPRESSION_PLAN() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
    	basePage.Verify_to_edit_Impression_Plan();
    }
    
//  Test Case 347 ::    
    @Test
    public void Verify_to_delete_video() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
    	basePage.Verify_to_view_Manage_Stage();
    }
    
//  Test Case 348 ::    
    @Test
    public void Verify_to_upload_video_on_low_internet_speed() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
    	basePage.Verify_to_view_Manage_Stage();
    }
    
//  Test Case 349 ::    
    @Test
    public void Verify_to_Search_Student_by_Status() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
    	basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 350 ::    
    @Test
    public void Verify_to_display_Student_list_as_per_selected_Date_of_Last_updated() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_Student_Progress();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_View_By_Select_Data_By_Date_of_Last_Update ();
    }
    
//  Test Case 351 ::    
    @Test
    public void Verify_to_add_hyperlink_into_EM_Summary_for_coders() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
 	 	 basePage.Verify_to_Utilities();
 	 	 basePage.Verify_to_Utilities_Utilities();
 	 	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_add_hyperlink_into_EM_Summary_for_coders();
    }
    
//  Test Case 352 ::    
    @Test
    public void Verify_to_write_response_in_User_Progress() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_write_response_in_User_Progress();
    }
    
//  Test Case 353 ::    
    @Test
    public void Verify_to_Apply_multiple_filter() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_Select_Next_and_Back_button_for_Data_Grid();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Apply_multiple_filter();
    }
    
//  Test Case 354 ::    
    @Test
    public void Verify_that_Status_should_display_Something() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_Select_Next_and_Back_button_for_Data_Grid();
    }
    
//  Test Case 355 ::    
    @Test
    public void Verify_to_edit_Score_and_it_also_display_last_admin_update_of_particular_student() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Finalize_Student_Score();
    }
    
//  Test Case 356 ::    
    @Test
    public void Verify_to_Edit_Mobile_number_and_Role() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_Edit_Manage_Users();
    }
    
//  Test Case 357 ::    
    @Test
    public void Verify_to_that_when_user_hover_mouse_it_should_display_highlighted() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 358 ::    
    @Test
    public void Verify_to_edit_Must_Start_by_Date_of_student() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_View_Panel_Bars();
    }
    
//  Test Case 359 ::    
    @Test
    public void Verify_to_Last_Student_update_and_MR_Finalized_Time_Per_Chart() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 360 ::    
    @Test
    public void Verify_to_update_Score_perfectly_when_student_score_edited() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Finalize_Student_Score();
    }
    
//  Test Case 361 ::    
    @Test
    public void Verify_to_Apply_Date_Filter_to_view_Student_Progress() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    }

//  Test Case 362 ::    
    @Test
    public void Verify_to_that_If_student_score_more_than_then_it_passed_below_failed_display() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 363 ::    
    @Test
    public void Verify_to_Edit_Feedback_CPT_Provider_one() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_Edit_Feedback_CPT_Provider();
    }
    
//  Test Case 364 ::    
    @Test
    public void Verify_to_Apply_Date_Filter_to_view_Student_Progress_and_verify_data_display_into_list() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 365 ::    
    @Test
    public void Verify_to_display_data_like_6_in_Must_Start_By_Business_Days() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_Parameter();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_display_data_like_6_in_Must_Start_By_Business_Days();
    }
    
//  Test Case 366 ::    
    @Test
    public void Verify_that_if_student_dont_test_history_by_day_than_in_User_progress_Finalize_button_should_display_disable() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 367 ::    
    @Test
    public void Verify_to_view_Progress_of_PreHire_User() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_view_user_Progress_PreHire();
    }
    
//  Test Case 368  ::    
    @Test
    public void Verify_to_view_By_Last_Student_Update_and_Last_Admin_Update_and_also_in_time_0_shouldnt_display() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_view_By_Last_Student_Update_and_Last_Admin_Update_and_also_in_time_0_shouldnt_display();
    }
    
//  Test Case 369  ::    
    @Test
    public void Verify_to_edit_ADDENDA_ATTESTATION_and_save_changes() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_edit_dropdown_in_Addenda_Attestation();
    }
    
//  Test Case 370  ::    
    @Test
    public void Verify_to_that_edit_final_score_and_No_error_message_display() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Finalize_Student_Score();
    }
    
//  Test Case 371  ::    
    @Test
    public void Verify_to_display_data_by_Sorting_in_Student_Progress() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 372  ::    
    @Test
    public void Verify_to_set_password_for_new_Users() throws InterruptedException, IOException, AWTException{
    	  basePage.enterURL();
          basePage.verify_to_add_new_applicant_as_student();
    }
    
//  Test Case 373  ::    
    @Test
    public void Verify_to_display_Last_Student_Update_and_Last_Admin_Update() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 374  ::    
    @Test
    public void Verify_to_Click_on_Create_Password_link_and_it_should_open() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	  basePage.verify_to_add_new_applicant_as_student();
    }
    
//  Test Case 375  ::    
    @Test
    public void Verify_to_view_MR_Finalize_same_in_for_date_Test_History_by_Day() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 376  ::    
    @Test
    public void Verify_to_download_User_Progress_and_view_data() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_download_User_Progress_and_view_data();
    }
    
//  Test Case 377  ::    
    @Test
    public void Verify_to_apply_filter_and_view_Student() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL(); 
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_view_user_Progress_PreHire();
    }
    
//  Test Case 378  ::    
    @Test
    public void Verify_to_Edit_Final_Score_and_also_edit_Final_score_in_another_page() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Finalize_Student_Score();
    }
    
//  Test Case 379  ::    
    @Test
    public void Verify_to_Login_with_Admin_Users() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_loing_details();
    }
    
//  Test Case 380  ::    
    @Test
    public void Verify_to_Promoting_a_student_from_PREHIRE_to_TRAINEE_is_only_available_if_there_is_a_Finalized_and_Passed_test() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Manage_Users();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Promoting_a_student_from_PREHIRE_to_TRAINEE_is_only_available_if_there_is_a_Finalized_and_Passed_test();
    }
    
//  Test Case 381  ::    
    @Test
    public void Verify_to_Add_Other_radio_button_into_User_Progress() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Add_Other_radio_button_into_User_Progress();
    }
    
//  Test Case 382  ::    
    @Test
    public void Verify_to_view_Stage_and_For_Date_in_Test_History_By_Day() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 383  ::    
    @Test
    public void Verify_to_view_Test_of_Student_which_has_Not_Started() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_view_Test_of_Student_which_has_Not_Started();
    }
    
//  Test Case 384  ::    
    @Test
    public void Verify_that_when_user_Add_User_it_should_received_only_one_Email() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_view_Test_of_Student_which_has_Not_Started();
    }
    
//  Test Case 385  ::    
    @Test
    public void Verify_to_Add_Answer_key_with_same_Chart_ID() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Answer_Key();
    	 basePage.Student_Answer_Key();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Add_Key_two_times();
    }
    
//  Test Case 386  ::    
    @Test
    public void Verify_sto_view_Chart_Coded_Today_to_display_todays_chart_number() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
         basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 387  ::    
    @Test
    public void Verify_to_View_Total_Test_Time_column_to_display_total_time() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
         basePage.Verify_to_view_user_Progress();
    }

//  Test Case 388  ::    
    @Test
    public void Verify_to_view_Test_of_Student_which_has_Not_Started_One() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_view_Test_of_Student_which_has_Not_Started();
    }
    
//  Test Case 389  ::    
    @Test
    public void Verify_to_View_Upload_Video_and_PDF_files() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_Manage_Stage();
    }
    
//  Test Case 390  ::    
    @Test
    public void Verify_to_view_Analytics() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
         basePage.Verify_to_Utilities();
         basePage.Verify_to_Analytiics();
    }
    
//  Test Case 391  ::    
    @Test
    public void Verify_to_Display_Finalize_button_when_student_status_display_complete() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
         basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 392  ::    
    @Test
    public void Verify_to_Search_for_particular_Users() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
         basePage.Verify_to_Find_by_data_First_Name();
    }
    
//  Test Case 393  ::    
    @Test
    public void Verify_to_view_DUVASAWKO_CODE_text() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
         basePage.verify_login_details_of_admin();
    }
    
//  Test Case 394  ::    
    @Test
    public void Verify_to_view_Total_Record_in_User_Progress() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
         basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 395  ::    
    @Test
    public void Verify_to_view_Invalid_User_in_Student_Progress_and_Manage_User() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
         basePage.verify_login_details_of_admin();
         MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_view_Invalid_User_in_Student_Progress_and_Manage_User();
    	 basePage.Manage_Users();
    	 mainmenupage.Verify_to_view_Invalid_Manage_User();
    }
    
//  Test Case 396  ::    
    @Test
    public void Verify_to_Update_Email_and_Phone_Number() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
         basePage.Verify_to_Edit_Manage_Users();
    }
    
//  Test Case 397  ::    
    @Test
    public void Verify_to_view_Notification() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
         basePage.verify_login_details_of_admin();
    }

//  Test Case 398 ::    
    @Test
    public void Verify_to_Add_Response_when_user_select_Other_option() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_write_response_in_User_Progress();
    }
    
//  Test Case 399 ::    
    @Test
    public void Verify_to_Edit_Role_and_Save_details() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Edit_Role_and_Save_details();
    }
    
//  Test Case 400 ::    
    @Test
    public void Verify_to_Edit_Response_and_It_should_Retain_page_state() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_write_response_in_User_Progress();
    }
    
//  Test Case 401 ::    
    @Test
    public void Verify_to_Role_Promotion_Prevention() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_apply_filter_from_first_letter();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_Student_Move_Applicant_to_PreHire();
    }
    
//  Test Case 402 ::    
    @Test
    public void Verify_to_view_Percentage_of_Student_and_it_should_passed() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
        basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 403 ::    
    @Test
    public void Verify_to_edit_Downloaded_in_any_chart() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
        basePage.Verify_to_load_charts();
        MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
        mainmenupage.Verify_to_edit_Downloaded_in_any_chart();
    }
    
//  Test Case 404 ::    
    @Test
    public void Verify_to_view_Total_number_of_Valid_and_Invalid_Users_list() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
         basePage.verify_login_details_of_admin();
         basePage.Manage_Users();
         MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
         mainmenupage.Verify_to_view_Invalid_Manage_User();
    }
    
//  Test Case 405 ::    
    @Test
    public void Verify_to_view_Stage_Charts_Test_Time_OC_UC_Other_and_Status_in_Test_History_By_Day() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
        basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 406 ::    
    @Test
    public void Verify_to_View_text_Fever_PE_tab() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
         basePage.verify_login_details_of_admin();
         basePage.Verify_to_Utilities();
         basePage.Verify_to_Utilities_Utilities();
         MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
         mainmenupage.Verify_to_View_text_Fever_PE_tab();
    }
    
//  Test Case 407 ::    
    @Test
    public void Verify_to_download_excel_file_of_Active_User_and_Coded_chart() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
         basePage.verify_login_details_of_admin();
         basePage.Verify_to_Utilities();
         basePage.Verify_to_Analytiics();
         MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
         mainmenupage.Verify_to_View_text_Fever_PE_tab();
    }
    
//  Test Case 408 ::    
    @Test
    public void Verify_to_view_Login_details_of_Particular_user() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
         basePage.Verify_to_check_dates_functionality();
         MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
         mainmenupage.Verify_to_view_Login_details_of_Particular_user();
    }
    
//  Test Case 409 ::    
    @Test
    public void Verify_to_Modifications_to_Supervisor_Role() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
         basePage.Manage_Users();
         MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
         mainmenupage.Verify_to_view_Login_details_of_Particular_user();
    }

//  Test Case 410 ::    
    @Test
    public void Verify_to_display_error_message_when_all_fields_are_blank_and_also_already_used_email_address() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
         basePage.Manage_Users();
         MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
         mainmenupage.Verify_to_display_error_message_when_all_fields_are_blank_and_also_already_used_email_address();
    }
    
//  Test Case 411 ::    
    @Test
    public void Verify_to_View_Summary_of_any_User() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
         basePage.Manage_Users();
         MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
         mainmenupage.Verify_to_View_Summary_of_any_User();
    }
    
//  Test Case 412 ::    
    @Test
    public void Verify_to_download_Excel_file_and_view_data_of_Student_Progress() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_view_user_Progress();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_download_User_Progress();
    }
    
//  Test Case 413 ::    
    @Test
    public void Verify_to_view_Additional_Analytics_Charts() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
         basePage.verify_login_details_of_admin();
         basePage.Verify_to_Utilities();
         basePage.Verify_to_Analytiics();
         MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_view_Additional_Analytics_Charts();
    }
    
//  Test Case 414 ::    
    @Test
    public void Verify_sto_Display_Error_Message_when_fields_are_blank() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
         basePage.verify_login_details_of_admin();
         basePage.Verify_to_Utilities();
         basePage.Verify_to_Utilities_Manage_Email();
         MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_sto_Display_Error_Message_when_fields_are_blank();
    }
    
    
//  Test Case 415 ::    
    @Test
    public void Verify_to_Edit_Addenda_Attestation_for_two_charts_and_save_changes() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
         basePage.Verify_to_Select_Mid_Level();
    }
    
//  Test Case 416 ::    
    @Test
    public void Verify_to_create_a_Invalid_User_and_Find_that_user_into_list() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
         basePage.verify_to_add_new_applicant_as_student();
    }
    
//  Test Case 417 ::    
    @Test
    public void Verify_to_view_Active_and_Inactive_in_Charts() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
         basePage.verify_login_details_of_admin();
         basePage.Verify_to_Utilities();
         basePage.Verify_to_Analytiics();
         MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_view_Active_and_Inactive_in_Charts();
    }

    
//  Test Case 418 ::    
    @Test
    public void Verify_sto_Select_All_Time_and_also_Select_Academy() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
         basePage.verify_login_details_of_admin();
         basePage.Verify_to_Utilities();
         basePage.Verify_to_Analytiics();
         MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_sto_Select_All_Time_and_also_Select_Academy();
    }
    
//  Test Case 419 ::    
    @Test
    public void Verify_to_Student_received_Test_Email_on_enter_Email_Address() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
         basePage.verify_to_add_new_applicant_as_student();
    }
    
//  Test Case 420 ::    
    @Test
    public void Verify_to_view_Average_line_on_Active_User_only_Daily_Time_Per_Chart_Daily_Accuracy() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Verify_to_Utilities();
         basePage.Verify_to_Analytiics();
         MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_view_Active_and_Inactive_in_Charts();
    	 mainmenupage.Verify_to_view_Additional_Analytics_Charts();
    }
    
//  Test Case 421 ::    
    @Test
    public void Verify_to_view_10_option_in_dropdown_and_Select_it_so_User_can_see_more_list() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
        basePage.Verify_to_view_Student_Progress();
    }
    
//  Test Case 422 ::    
    @Test
    public void Verify_to_view_Student_DAILY() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
   	 	basePage.verify_login_details_of_admin();
   	 	basePage.Verify_to_Utilities();
        basePage.Verify_to_Analytiics();
        MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
   	 	mainmenupage.Verify_to_view_Student_DAILY();
    }
    
//  Test Case 423 ::    
    @Test 
    public void Verify_to_Deactivate_Provider_and_also_reactivate_Provider() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Answer_Key();
    	 basePage.Manage_Providers();
    }
    
//  Test Case 424 ::    
    @Test 
    public void Verify_to_send_Email_of_Academy_Email_and_Applicant_Email_to_InActive_users() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
         basePage.Manage_Users();
         MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
         mainmenupage.Verify_to_View_Summary_of_any_User();
    }
    
//  Test Case 425 ::    
    @Test 
    public void Verify_to_view_Student_Charts_like_Daily_Error_Statistics() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
   	 	basePage.verify_login_details_of_admin();
   	 	basePage.Verify_to_Utilities();
        basePage.Verify_to_Analytiics();
         MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
         mainmenupage.Verify_to_view_Student_DAILY();
    }
    
//  Test Case 426 ::    
    @Test 
    public void Verify_to_show_error_message_when_fields_are_blank() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
	   	 basePage.verify_login_details_of_admin();
	   	 basePage.Answer_Key();
	   	 basePage.Student_Answer_Key();
	   	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
         mainmenupage.Verify_to_show_error_message_when_fields_are_blank();
    }
    
//  Test Case 427 ::    
    @Test 
    public void Verify_to_view_Pie_Chart_as_per_selected_option_of_Date_of_Last_Update() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
   	 	basePage.verify_login_details_of_admin();
   	 	basePage.Verify_to_Utilities();
        basePage.Verify_to_Analytiics();
	   	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
         mainmenupage.Verify_to_view_Pie_Chart_as_per_selected_option_of_Date_of_Last_Update();
    }
    
//  Test Case 428 ::    
    @Test 
    public void Verify_to_Chart_Number_Start_with_75_percentage_in_Data_Accuracy_option() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
   	 	basePage.verify_login_details_of_admin();
   	 	basePage.Verify_to_Utilities();
        basePage.Verify_to_Analytiics();
	   	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
         mainmenupage.Verify_to_Chart_Number_Start_with_75_percentage_in_Data_Accuracy_option();
    }

//  Test Case 429 ::    
    @Test 
    public void Verify_to_display_error_message_when_user_try_to_add_existing_data() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Answer_Key();
    	 basePage.Manage_Providers();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
         mainmenupage.Verify_to_display_error_message_when_user_try_to_add_existing_data();
    }
    
//  Test Case 430 ::    
    @Test 
    public void Verify_to_Select_PFSH_option_in_Downcoded() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.Verify_to_select_dropdown_list_in_MetaData();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
         mainmenupage.Verify_to_Select_PFSH_option_in_Downcoded();
    }
    
//  Test Case 431 ::    
    @Test 
    public void Verify_to_display_Same_Chart_shows_same_question_number() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
        basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 432 ::    
    @Test 
    public void Verify_to_display_all_data_as_per_selected_data_last_updated_option() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
   	 	basePage.verify_login_details_of_admin();
   	 	basePage.Verify_to_Utilities();
        basePage.Verify_to_Analytiics();
        MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
        mainmenupage.Verify_to_display_all_data_as_per_selected_data_last_updated_option();
    }
    
//  Test Case 433 ::    
    @Test 
    public void Verify_to_Send_Admin_Template_Name() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
   	 	basePage.Verify_to_Enrollment_enhancement();
   	 	MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
   	 	mainmenupage.Verify_to_Send_Admin_Template_Name();
    }
    
//  Test Case 434 ::    
    @Test 
    public void Verify_to_Remember_Me_option_should_work_perfectly() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
   	 	basePage.verify_login_details_of_admin();
    }
    
//  Test Case 435 ::    
    @Test 
    public void Verify_to_view_logs_in_logs_tab() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
   	 	basePage.verify_login_details_of_admin();
   	 	basePage.Verify_to_Utilities();
        basePage.Verify_to_Logs();
    }
    
//  Test Case 436 ::    
    @Test 
    public void Verify_to_download_email_logs_and_logs_by_different_apply_filters() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
   	 	basePage.verify_login_details_of_admin();
   	 	basePage.Verify_to_Utilities();
        basePage.Verify_to_Logs();
        MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
   	 	mainmenupage.Verify_to_view_logs_in_logs_tab();
    }
    
//  Test Case 437 ::    
    @Test 
    public void Verify_view_Final_Score_and_percentage_for_date() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
        basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 438 ::    
    @Test 
    public void Verify_to_display_all_answer_given_by_student() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
        basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 439 ::    
    @Test 
    public void Verify_to_not_display_blank_data_when_Student_Pause_exam() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
        basePage.Verify_to_view_user_Progress();
    }
    
//  Test Case 440 ::    
    @Test 
    public void Verify_to_display_Question_ID_not_chart_ID_in_User_Progress() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
        basePage.Verify_to_view_user_Progress();
        MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
   	   mainmenupage.Verify_to_write_response_in_User_Progress();
    }
    
//  Test Case 441 ::    
    @Test 
    public void Verify_to_display_Chart_Analytics_type_in_Chart_option() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
   	 	basePage.verify_login_details_of_admin();
   	 	basePage.Verify_to_Utilities();
        basePage.Verify_to_Analytiics();
        MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
   	    mainmenupage.Verify_to_display_Chart_Analytics_type_in_Chart_option();
    }
    
//  Test Case 442 ::    
    @Test 
    public void Verify_to_display_label_to_x_and_y_axis_into_chart_and_also_display_Same_days_as_in_student_Progress_test() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
   	 	basePage.verify_login_details_of_admin();
   	 	basePage.Verify_to_Utilities();
        basePage.Verify_to_Analytiics();
        MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
   	 	mainmenupage.Verify_to_view_Student_DAILY();
   	    mainmenupage.Verify_to_display_label_to_x_and_y_axis_into_chart_and_also_display_Same_days_as_in_student_Progress_test();
    }
    
//  Test Case 443 ::    
    @Test 
    public void Verify_to_view_Daily_Errors_and_Statistics_on_Student() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
   	 	basePage.verify_login_details_of_admin();
   	 	basePage.Verify_to_Utilities();
        basePage.Verify_to_Analytiics();
        MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
   	 	mainmenupage.Verify_to_view_Student_DAILY();
    }
    
//  Test Case 444 ::    
    @Test 
    public void Verify_to_display_Student_name_on_below_of_charts() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
   	 	basePage.verify_login_details_of_admin();
   	 	basePage.Verify_to_Utilities();
        basePage.Verify_to_Analytiics();
        MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
   	 	mainmenupage.Verify_to_view_Student_DAILY();
    }
    
//  Test Case 445 ::    
    @Test 
    public void Verify_to_view_when_user_click_on_chart_in_Error_Chart() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
   	 	basePage.verify_login_details_of_admin();
   	 	basePage.Verify_to_Utilities();
        basePage.Verify_to_Analytiics();
        MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
   	 	mainmenupage.Verify_to_view_Student_DAILY();
   	    mainmenupage.Verify_to_view_when_user_click_on_chart_in_Error_Chart();
    }
    
//  Test Case 446 ::    
    @Test 
    public void Verify_to_Error_charts_max_value_changed_dynamically() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
   	 	basePage.verify_login_details_of_admin();
   	 	basePage.Verify_to_Utilities();
        basePage.Verify_to_Analytiics();
        MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
   	 	mainmenupage.Verify_to_view_Student_DAILY();
   	    mainmenupage.Verify_to_view_when_user_click_on_chart_in_Error_Chart();
    }
    
//  Test Case 447 ::    
    @Test 
    public void Verify_to_not_display_status_dropdown_option_in_Test_History_By_Week() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
        basePage.Verify_to_view_user_Progress();
        MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
   	 	mainmenupage.Verify_to_not_display_status_dropdown_option_in_Test_History_By_Week();
    }
    
//  Test Case 448 ::    
    @Test 
    public void Verify_to_view_statistics_time_and_Percentage_for_Error_Chart() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
   	 	basePage.verify_login_details_of_admin();
   	 	basePage.Verify_to_Utilities();
        basePage.Verify_to_Analytiics();
        MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
   	 	mainmenupage.Verify_to_view_Student_DAILY();
    }
    
//  Test Case 449 ::    
    @Test 
    public void Verify_to_display_UC_OC_PRC_PRV_ICD_and_MOD_in_Error_type() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
   	 	basePage.verify_login_details_of_admin();
   	 	basePage.Verify_to_Utilities();
        basePage.Verify_to_Analytiics();
        MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
   	 	mainmenupage.Verify_to_view_Student_DAILY();
   	 	mainmenupage.Verify_to_display_label_to_x_and_y_axis_into_chart_and_also_display_Same_days_as_in_student_Progress_test();
    }
    
//  Test Case 450 ::    
    @Test 
    public void Verify_to_display_Send_Email_logs_in_Email_logs() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
   	 	basePage.verify_login_details_of_admin();
   	 	basePage.Manage_Users();
   	 	basePage.Verify_to_Utilities();
   	 	basePage.Verify_to_Logs();
   	    MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
 	 	mainmenupage.Verify_to_display_Send_Email_logs_in_Email_logs();
    }
    
    
//  Test Case 451 ::    
    @Test 
    public void Verify_to_view_Chart_number_with_OC_UC_PRC_PRV_ICD_and_MOD() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
   	 	basePage.verify_login_details_of_admin();
   	 	basePage.Verify_to_Utilities();
        basePage.Verify_to_Analytiics();
        MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
   	 	mainmenupage.Verify_to_view_Student_DAILY();
    }

//  Test Case 452 ::    
    @Test 
    public void Verify_to_Select_all_chart_type_and_also_unselect_all_chart_type() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
   	 	basePage.verify_login_details_of_admin();
   	 	basePage.Verify_to_Utilities();
        basePage.Verify_to_Analytiics();
        MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
   	 	mainmenupage.Verify_to_view_Chart_tab();
    }
    
//  Test Case 453 ::    
    @Test 
    public void Verify_sto_display_number_when_user_hover_mouse_on_charts() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
   	 	basePage.verify_login_details_of_admin();
   	 	basePage.Verify_to_Utilities();
        basePage.Verify_to_Analytiics();
        MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
   	 	mainmenupage.Verify_to_view_Chart_tab();
    }
    
//  Test Case 454 ::    
    @Test 
    public void Verify_to_Test_history_by_Week() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
   	 	basePage.Verify_to_view_user_Progress();
   	    MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
 	 	mainmenupage.Verify_to_view_test_history_by_week();
    }
    
//  Test Case 455 ::    
    @Test 
    public void Verify_to_view_OC_UC_PRC_PRV_ICD_and_MOD_of_particular_student() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
   	 	basePage.verify_login_details_of_admin();
   	 	basePage.Verify_to_Utilities();
        basePage.Verify_to_Analytiics();
        MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
        mainmenupage.Verify_to_view_Student_DAILY();
   	 	mainmenupage.Verify_to_display_label_to_x_and_y_axis_into_chart_and_also_display_Same_days_as_in_student_Progress_test();
    }
    
    
//  Test Case 456 ::    
    @Test
    public void Verify_to_Final_Score_Pre_Score_and_also_count_in_User_progress() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
   	 	basePage.Verify_to_view_user_Progress();
   	    MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
 	 	mainmenupage.Verify_to_view_test_history_by_week();
    }
    
    
//  Test Case 457 ::    
    @Test
    public void Verify_to_view_User_Summary_in_that_display_OC_UC_PRC_PRV_ICD_MOD() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
         basePage.Manage_Users();
         MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
         mainmenupage.Verify_to_View_Summary_of_any_User();
    }
    
//  Test Case 458 ::    
    @Test
    public void Verify_to_Count_final_score_of_student() throws InterruptedException, IOException, AWTException{
    	basePage.enterURL();
   	 	basePage.Verify_to_view_user_Progress();
   	    MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
 	 	mainmenupage.Verify_to_view_test_history_by_week();
    }
    
//  Test Case 459 ::    
    @Test
    public void Verify_to_Find_chart_by_HPI_Is_this_new_or_established_problem_option() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
         basePage.Verify_to_find_chart_by_Apply_History_of_Present_illness_option();
    }
    
    
//  Test Case 460 ::    
    @Test
    public void Verify_to_login_with_Provider() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    }
    
//  Test Case 461 ::    
    @Test
    public void Verify_to_display_Copyright_Notice_below_logs() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Verify_to_display_Copyright_Notice_below_logs();
    }
    
//  Test Case 462 ::    
    @Test
    public void Verify_to_apply_filter_basic_information() throws InterruptedException, IOException, AWTException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Verify_to_Utilities();
    	 basePage.Verify_to_Analytiics();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
   	 	 mainmenupage.Verify_to_apply_filter_basic_information();
      }
    
    
//  Test Case 463 :: 
    @Test
    public void Verify_to_reset_password_link_and_set_new_password() throws InterruptedException, IOException{
        basePage.enterURL();
        basePage.Verify_to_Reset_Password();
    }
    
//  Test Case 464 :: 
    @Test
    public void Verify_to_Enable_Submit_when_user_edit_any_data_in_Applicant_form() throws InterruptedException, IOException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Verify_to_Utilities();
    	 basePage.Verify_to_Parameters();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
   	 	 mainmenupage.Verify_to_Enable_Submit_when_user_edit_any_data_in_Applicant_form();
    }
    
//  Test Case 465 :: 
    @Test
    public void Verify_to_display_data_in_sorting_order_in_Datagrid_and_Error_Chart() throws InterruptedException, IOException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Verify_to_Utilities();
    	 basePage.Verify_to_Analytiics();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
   	 	 mainmenupage.Verify_to_apply_filter_basic_information();
    }
 
//  Test Case 466 :: 
    @Test
    public void Verify_to_view_application_list() throws InterruptedException, IOException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Verify_to_Utilities();
    	 basePage.Verify_to_Analytiics();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
   	 	 mainmenupage.Verify_to_view_application_list();
    }
    
//  Test Case 467 :: 
    @Test
    public void Verify_to_display_Provider_name_in_Capital() throws InterruptedException, IOException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Verify_Chart_loader_load_Chart_unlock_chart();
    	 basePage.Chart_Loader_Answer_Key();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_enter_CPT_and_Provider1();
    }
    
//  Test Case 468 :: 
    @Test
    public void Verify_to_search_for_charts_by_enter_chart_number_and_display_result() throws InterruptedException, IOException{
    	 basePage.enterURL();
    	 basePage.verify_login_details_of_admin();
    	 basePage.Verify_to_Utilities();
    	 basePage.Verify_to_Analytiics();
    	 MainMenuPage mainmenupage = new MainMenuPage(basePage.getDriver());
    	 mainmenupage.Verify_to_search_for_charts_by_enter_chart_number_and_display_result();
    }
    
    
    
    
    
    
    
    
}
