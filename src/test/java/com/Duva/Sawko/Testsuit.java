package com.Duva.Sawko;
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
    
    
    
}
