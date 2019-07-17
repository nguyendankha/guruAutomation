package com.demo.banking.objects;

public class User {
	public static String userID;
	public static String userPassword;
	
	public static String getUserID() {
		return userID;
	}
	public static void setUserID(String userID) {
		User.userID = userID;
	}
	public static String getUserPassword() {
		return userPassword;
	}
	public static void setUserPassword(String userPassword) {
		User.userPassword = userPassword;
	}
	
}
