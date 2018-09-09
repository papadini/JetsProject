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
		System.out.println("Jet : TOP SECRET Speed: TOP SECRET Range: TOP SECRET Price: TOP SECRET Time: TOP SECRET ");
	}
	@Override
	public void machSpeed ( double speed) {
		System.out.println(" is TOP SECRET!!");
	}

	@Override
	public String toString() {
		return "Secret Jet- " + super.toString();
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
