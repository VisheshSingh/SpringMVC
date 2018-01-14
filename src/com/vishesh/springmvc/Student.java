package com.vishesh.springmvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName, lastName, country, favoriteLanguage;

	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> favoriteLanguageOptions;

	public Student() {
		countryOptions = new LinkedHashMap<String, String>();

		countryOptions.put("IN", "India");
		countryOptions.put("US", "USA");
		countryOptions.put("GE", "Germany");
		countryOptions.put("JA", "Japan");

		favoriteLanguageOptions = new LinkedHashMap<String, String>();

		favoriteLanguageOptions.put("Java", "Java");
		favoriteLanguageOptions.put("PHP", "PHP");
		favoriteLanguageOptions.put("C#", "C#");
		favoriteLanguageOptions.put("Python", "Python");

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

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

}
