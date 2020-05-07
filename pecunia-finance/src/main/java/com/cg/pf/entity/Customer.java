package com.cg.pf.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



public class Customer {
	
	  
	   @Id
	   @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
	   
	   @Column(name = "Name")
    private String name;
	   
	   @Column(name = "Contact-Number")
    private int contactNumber;
	   
	   @Column(name = "Aadhar_Number")
    private int aadharNumber;
	   
	   @Column(name = "PAN_Number")
    private char panNumber;
    
	   @Column(name = "Date_Of_Birth")
    private Date dateOfBirth;
	   
	   @Column(name = "Gender")
    private String gender;
	   
	   @Column(name = "Address")
	   private String address;
	   
	   @Column(name = "City")
    private String city;
	   
	   @Column(name = "Zip_Code")
    private int zipCode;
    
	   @Column(name = "State")
    private String state;
	   
	   @Column(name = "Country")
    private String country;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public int getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(int aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public char getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(char panNumber) {
		this.panNumber = panNumber;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	   

}
