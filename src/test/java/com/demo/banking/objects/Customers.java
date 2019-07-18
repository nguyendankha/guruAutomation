package com.demo.banking.objects;

import java.util.Date;
import java.util.Random;

import org.joda.time.DateTime;

public class Customers {
	// *********Customer information*********
	private String name;
	private String gender;
	private String dateOfBirth;
	private String address;
	private String city;
	private String state;
	private String pin;
	private String mobileNumber;
	private String email;
	private String password;

	// *********Customer getters/setters*********
	public String getCustomerName() {
		return name;
	}

	public void setCustomerName(String customerName) {
		this.name = customerName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// **************Methods***************
	// Random generator
	private String[] genders = new String[] { "male", "female" };
	private String[] names = new String[] { "Frank", "Marcos", "Cris", "Daniel", "Sandy", "Lora" };
	private String[] addresses = new String[] { "Nguyen Trong Tuyen str.", "Le Van Luong str.", "Nguyen Van Troi str.",
			"Nguyen Van Linh str." };
	private String[] states = new String[] { "North", "East", "South", "West", "South-East", "North-West" };
	private String[] cities = new String[] { "Ho Chi Minh", "Ha Noi", "Vung Tau", "Gia Lai", "Tuyen Quang" };
	private String[] DOBs = new String[] { "01-01-1970", "30-04-1970", "01-03-1971", "01-01-1969", "01-02-1970",
			"01-02-1971", "31-12-1970", "31-12-1969", "01-09-1950", "01-08-2000", "29-02-2004" };
	private String[] mobilePhones = new String[] { "1234509876", "0987612345", "1234567890" };
	private String[] pins = new String[] { "100", "250", "369", "859", "716" };

	// Generate customer information
	public void createCustomerInformation() {
		DateTime now = new DateTime();
		Random rand = new Random(now.getMillis());

		// Generate customer name
		this.setCustomerName(names[rand.nextInt(names.length - 1)]);
		// Generate customer gender
		this.setGender(genders[rand.nextInt(genders.length - 1)]);
		// Generate DOB
		String dobDate = DOBs[rand.nextInt(DOBs.length - 1)];
		String[] customerDOBDate = dobDate.split("-");
		this.setDateOfBirth(customerDOBDate[0] + customerDOBDate[1] + customerDOBDate[2]);
		// Generate address
		this.setAddress(addresses[rand.nextInt(addresses.length - 1)]);
		// Generate city
		this.setCity(cities[rand.nextInt(cities.length - 1)]);
		// Generate state
		this.setState(states[rand.nextInt(states.length - 1)]);
		// Generate pin
		this.setPin(pins[rand.nextInt(pins.length - 1)]);
		// Generate mobile phone
		this.setMobileNumber(mobilePhones[rand.nextInt(mobilePhones.length - 1)]);
		// Generate email
		getRandomEmail();
		// Generate password
		getRandomPassword();
	}

	// Get random password with format "passwordXXX"
	public void getRandomPassword() {
		DateTime now = new DateTime();
		Random rand = new Random(now.getMillis());
		int randomNum = rand.nextInt(999);
		String randomPassword = "password" + String.valueOf(randomNum);
		this.setPassword(randomPassword);
	}

	// Set password to password reset default
	public void getRandomEmail() {
		this.setEmail(randomEmailAddress(5));
	}

	// Generate a random string
	public String randomAlphaNumeric(int count) {
		String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ._0123456789";
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}

	// Generate a random email base on the random string and current time
	public String randomEmailAddress(int count) {
		String newEmail = randomAlphaNumeric(count);
		long currentTime = getCurrentTime();
		newEmail = newEmail + currentTime + "@gmail.com";
		return newEmail.toString();
	}

	// Get Current Time of System
	public long getCurrentTime() {
		Date date = new Date();
		long time = date.getTime();
		return time;
	}

}
