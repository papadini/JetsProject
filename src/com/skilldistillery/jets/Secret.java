package com.skilldistillery.jets;

public class Secret extends Jet implements CombatReady, Stealth{

	public Secret() {
	}

	public Secret(String model, double speed, double range, double price) {
		super(model, speed, range, price);
	}
	@Override
	public void fly () {
		System.out.println("SHHHHHHHHHHHHHHHH......TOP SECRET");
	}

	@Override
	public String toString() {
		return "Secret [getModel()=" + getModel() + ", getSpeed()=" + getSpeed() + ", getRange()=" + getRange()
				 + ", getPrice()=" + getPrice() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + "]";
	}

	@Override
	public void stealthMode() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		
	}
	

}
