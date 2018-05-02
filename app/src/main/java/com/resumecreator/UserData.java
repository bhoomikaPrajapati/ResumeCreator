package com.resumecreator;

/**
 * Created by inx-android on 27/4/18.
 */

public class UserData {

    /**
     * Personal info
     */
    private String firstName = "";
    private String lastName = "";
    private String addressline1 = "";
    private String addressline2 = "";
    private String addressline3 = "";
    private String addressline4 = "";
    private String designation = "";
    private String phoneNumber = "";
    private String emailId = "";

    /**
     * Education
     */

    private String master_degree_marks = "";
    // private String hsc_school_name="";
    private String hsc_passing_time = "";


    /**
     * Work Experience,internship
     */
    private String exp_organization = "";
    private String exp_designation = "";
    private String exp_from_time = "";
    private String exp_to_time = "";
    private String exp_role = "";



    /**
     * Project Detail
     * */
    private String project_title;
    private String project_description;
    private String project_duration;
    private String project_role;


    /**
     * Technical Skills
     * */
    private String skill;

    /**
     * Interests,Strength,& Hobby
     * */

    private String interests;

    /**
     * Industrial Exposure
     * */

    private String industrial_expoure;

    /**
     * Achievements & Awards
     * */

    private String achievements_and_awards;

    /**
     * Activities
     */

    private String activity;

    /**
     * Reference
     */

    private String refetrnce_name;
    private String refetrnce_designation;
    private String refetrnce_organation;
    private String refetrnce_email;
    private String refetrnce_phone;


    /**
     * Objective,Declaration,Date
     */


    private String objective;
    private String objective_date;
    private String objective_place;
    private String objective_declaration;


    /**
     * Photo & Signature
     */

    private String photo;
    private String signature;  //also we add signature using canvas

    /**
     * HSC
     */

    private String hsc_marks = "";
    private String hsc_school_name = "";
    private String hsc_passing_year = "";


    /**
     * SSC
     */

    private String ssc_marks = "";
    private String ssc_school_name = "";
    private String ssc_passing_time = "";


}
