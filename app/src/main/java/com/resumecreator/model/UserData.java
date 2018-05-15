package com.resumecreator.model;

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
    private String birth_date="";
    private String marital_status="";
    private String known_language="";
    private String nationality="";

    /**
     * Education
     */

    private String qualification="";
    private String course="";
    private String institute="";
    private String CGPA_or_percentage="";
    private String year_of_passing="";

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
    private String project_title="";
    private String project_description="";
    private String project_duration="";
    private String project_role="";


    /**
     * Technical Skills
     * */
    private String skill="";

    /**
     * Interests,Strength,& Hobby
     * */

    private String interests="";

    /**
     * Industrial Exposure
     * */

    private String industrial_expoure="";

    /**
     * Achievements & Awards
     * */

    private String achievements_and_awards="";

    /**
     * Activities
     */

    private String activity="";

    /**
     * Reference
     */

    private String refetrnce_name="";
    private String refetrnce_designation="";
    private String refetrnce_organation="";
    private String refetrnce_email="";
    private String refetrnce_phone="";


    /**
     * Objective,Declaration,Date
     */


    private String objective="";
    private String objective_date="";
    private String objective_place="";
    private String objective_declaration="";


    /**
     * Photo & Signature
     */

    private String photo="";
    private String signature=""; //also we add signature using canvas






    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddressline1() {
        return addressline1;
    }

    public void setAddressline1(String addressline1) {
        this.addressline1 = addressline1;
    }

    public String getAddressline2() {
        return addressline2;
    }

    public void setAddressline2(String addressline2) {
        this.addressline2 = addressline2;
    }

    public String getAddressline3() {
        return addressline3;
    }

    public void setAddressline3(String addressline3) {
        this.addressline3 = addressline3;
    }

    public String getAddressline4() {
        return addressline4;
    }

    public void setAddressline4(String addressline4) {
        this.addressline4 = addressline4;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getMarital_status() {
        return marital_status;
    }

    public void setMarital_status(String marital_status) {
        this.marital_status = marital_status;
    }

    public String getKnown_language() {
        return known_language;
    }

    public void setKnown_language(String known_language) {
        this.known_language = known_language;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getCGPA_or_percentage() {
        return CGPA_or_percentage;
    }

    public void setCGPA_or_percentage(String CGPA_or_percentage) {
        this.CGPA_or_percentage = CGPA_or_percentage;
    }

    public String getYear_of_passing() {
        return year_of_passing;
    }

    public void setYear_of_passing(String year_of_passing) {
        this.year_of_passing = year_of_passing;
    }

    public String getExp_organization() {
        return exp_organization;
    }

    public void setExp_organization(String exp_organization) {
        this.exp_organization = exp_organization;
    }

    public String getExp_designation() {
        return exp_designation;
    }

    public void setExp_designation(String exp_designation) {
        this.exp_designation = exp_designation;
    }

    public String getExp_from_time() {
        return exp_from_time;
    }

    public void setExp_from_time(String exp_from_time) {
        this.exp_from_time = exp_from_time;
    }

    public String getExp_to_time() {
        return exp_to_time;
    }

    public void setExp_to_time(String exp_to_time) {
        this.exp_to_time = exp_to_time;
    }

    public String getExp_role() {
        return exp_role;
    }

    public void setExp_role(String exp_role) {
        this.exp_role = exp_role;
    }

    public String getProject_title() {
        return project_title;
    }

    public void setProject_title(String project_title) {
        this.project_title = project_title;
    }

    public String getProject_description() {
        return project_description;
    }

    public void setProject_description(String project_description) {
        this.project_description = project_description;
    }

    public String getProject_duration() {
        return project_duration;
    }

    public void setProject_duration(String project_duration) {
        this.project_duration = project_duration;
    }

    public String getProject_role() {
        return project_role;
    }

    public void setProject_role(String project_role) {
        this.project_role = project_role;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public String getIndustrial_expoure() {
        return industrial_expoure;
    }

    public void setIndustrial_expoure(String industrial_expoure) {
        this.industrial_expoure = industrial_expoure;
    }

    public String getAchievements_and_awards() {
        return achievements_and_awards;
    }

    public void setAchievements_and_awards(String achievements_and_awards) {
        this.achievements_and_awards = achievements_and_awards;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getRefetrnce_name() {
        return refetrnce_name;
    }

    public void setRefetrnce_name(String refetrnce_name) {
        this.refetrnce_name = refetrnce_name;
    }

    public String getRefetrnce_designation() {
        return refetrnce_designation;
    }

    public void setRefetrnce_designation(String refetrnce_designation) {
        this.refetrnce_designation = refetrnce_designation;
    }

    public String getRefetrnce_organation() {
        return refetrnce_organation;
    }

    public void setRefetrnce_organation(String refetrnce_organation) {
        this.refetrnce_organation = refetrnce_organation;
    }

    public String getRefetrnce_email() {
        return refetrnce_email;
    }

    public void setRefetrnce_email(String refetrnce_email) {
        this.refetrnce_email = refetrnce_email;
    }

    public String getRefetrnce_phone() {
        return refetrnce_phone;
    }

    public void setRefetrnce_phone(String refetrnce_phone) {
        this.refetrnce_phone = refetrnce_phone;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public String getObjective_date() {
        return objective_date;
    }

    public void setObjective_date(String objective_date) {
        this.objective_date = objective_date;
    }

    public String getObjective_place() {
        return objective_place;
    }

    public void setObjective_place(String objective_place) {
        this.objective_place = objective_place;
    }

    public String getObjective_declaration() {
        return objective_declaration;
    }

    public void setObjective_declaration(String objective_declaration) {
        this.objective_declaration = objective_declaration;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }




    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
