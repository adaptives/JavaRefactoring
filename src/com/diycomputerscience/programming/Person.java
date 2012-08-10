package com.diycomputerscience.programming;

/**
 * This class encapculates too much information and is complex, violates DRY
 * and violates Single Responsibility Principle. 
 * 
 * This class is a good candidate for the extract class refactoring.
 * 
 * @author pshah
 *
 */
public class Person {
	
	private String firstName;
	private String mi;
	private String lastName;
	private String telephoneNumber;
	private String email;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String country;
	private String pin;
	
	private Person(String firstName,
				   String mi,
				   String lastName,
				   String telephoneNumber,
				   String email,
				   String addressLine1,
				   String addressLine2,
				   String city,
				   String country,
				   String pin) {
		
		this.firstName = firstName;
		this.mi = mi;
		this.lastName = lastName;
		this.telephoneNumber = telephoneNumber;
		this.email = email;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.country = country;
		this.pin = pin;
	}
	
}
