package com.diycomputerscience.programming;

import java.util.Date;

public class DeliveryPerson {
	
	private String name;
	private Date dob;
	private int lateDeliveries;
	
	public DeliveryPerson(String name, Date dob) {
		this.name = name;
		this.dob = dob;
		this.lateDeliveries = 0;
	}
	
	public void lateDelivery() {
		this.lateDeliveries++;
	}
	
	/**
	 * This method should be refactored to use inlining
	 * @return
	 */
	public boolean getRating() {
		return moreThanFiveDelLate() ? true : false;
	}

	private boolean moreThanFiveDelLate() {
		return this.lateDeliveries > 5 ? true : false;
	}
}
