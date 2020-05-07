package com.cg.pf.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
	
	   
	      private long id;
	   
	 
       private String name;
	   
	  
       private int contactNumber;
	   
	 
       private int aadharNumber;
	   
	 
       private char panNumber;
       
       private Date dateOfBirth;
	   
      private String gender;
	   
   	   private String address;
	   
       private String city;
	   
       private int zipCode;
       
       private String state;
	   
       private String country;
	   
       
       
       public Customer(String name, int contactNumber, int aadharNumber, char panNumber,
			Date dateOfBirth, String gender, String address, String city, String state, String country, int zipCode) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.aadharNumber = aadharNumber;
		this.panNumber = panNumber;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
	}



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
