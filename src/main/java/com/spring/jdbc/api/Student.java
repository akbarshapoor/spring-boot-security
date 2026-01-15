package com.spring.jdbc.api;

public class Student {
	private int Roll_No;
	private String Name;
	private String Address;
	public int getRoll_No() {
		return Roll_No;
	}
	public void setRoll_No(int roll_No) {
		Roll_No = roll_No;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Student [Roll_No=" + Roll_No + ", Name=" + Name + ", Address=" + Address + "]";
	}
	
	

}
