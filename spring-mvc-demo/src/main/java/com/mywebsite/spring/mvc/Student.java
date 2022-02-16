package com.mywebsite.spring.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String favouriteLang;
	private String[] os;
	private LinkedHashMap<String, String> countryOptions;

	public Student() {

		// populate country options: used ISO country code
		countryOptions = new LinkedHashMap<>();

		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States of America");

	}

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavouriteLang() {
		return favouriteLang;
	}

	public void setFavouriteLang(String favouriteLang) {
		this.favouriteLang = favouriteLang;
	}

	public String[] getOs() {
		return os;
	}

	public void setOs(String[] os) {
		this.os = os;
	}
}
