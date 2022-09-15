//package com.parkingmvc;

public class Model {
    
    private String ssn;
	private String firstname;
    private String lastname;
    private String gender;
    private String region;
    private String phone;
    private String dept;
    private String salary;

    public Model(String ssn,String firstname, String lastname, String gender, String region, String phone, String dept, String salary) {
    	this.ssn = ssn;
    	this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.region = region;
        this.phone = phone;
        this.dept = dept;
        this.salary = salary;
    }

    public String getssn() {
        return ssn;
    }
    public void setssn(String ssn) {
        this.ssn = ssn;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getgender() {
        return gender;
    }
    public void setgender(String gender) {
        this.gender = gender;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getdept() {
        return dept;
    }
    public void setdept(String dept) {
        this.dept = dept;
    }
    public String getsalary() {
        return salary;
    }
    public void setsalary(String salary) {
        this.salary = salary;
    }
}

