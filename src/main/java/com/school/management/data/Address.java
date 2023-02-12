package com.school.management.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Address {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;
	
	private String AddressType;
	private String state;
	private String district;
	private String area;
	private String pincode;
	
	public Address() {}

	public Address(String AddressType, String state, String district, String area, String pincode) {
		this.setAddressType(AddressType);
		this.state = state;
		this.district = district;
		this.area = area;
		this.pincode = pincode;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getAddressType() {
		return AddressType;
	}
	public void setAddressType(String addressType) {
		AddressType = addressType;
	}	
}