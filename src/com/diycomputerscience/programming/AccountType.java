package com.diycomputerscience.programming;

public class AccountType {

	private boolean premium;
	
	public AccountType(boolean premium) {
		this.premium = premium;
	}
	
	public boolean isPremium() {
		return this.premium;
	}
}
