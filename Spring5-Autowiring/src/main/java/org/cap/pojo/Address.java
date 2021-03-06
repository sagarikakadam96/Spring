package org.cap.pojo;

public class Address {
	private String streetName;
	private String city;
	
	
	public Address() {
		super();
		System.out.println("address default constructor");
	}
	public Address(String streetName, String city) {
		super();
		this.streetName = streetName;
		this.city = city;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", city=" + city + "]";
	}
	
	

}
