package com.school.management.data;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	@Id
	private String usn; // University seat number
	
	private String name;
	private String phoneNo;
	private int grade;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Address> addresses = new ArrayList<Address>();
	
	public Student() {}

	public Student(String usn, String name, String phoneNo, int grade, List<Address> addresses) {
		this.usn = usn;
		this.name = name;
		this.phoneNo = phoneNo;
		this.grade = grade;
		this.addresses = addresses;
	}
	
	public String getUsn() {
		return usn;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}

	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddress(List<Address> addresses) {
		this.addresses = addresses;
	}	
}