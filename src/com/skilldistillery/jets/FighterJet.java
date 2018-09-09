package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady, Stealth{
	private String weapon; // type of missle 

	public FighterJet() {
	}

	public FighterJet(String weapon, String model, double speed, double range, double price) {
		super(model, speed, range, price);
		this.weapon = weapon;
	}
	@Override
	public void fight () {
		System.out.println("Only Mavrick can handle these boys!");
		System.out.println("target is locked, FIRE!!!");
	}
	public void stealthMode() {
		System.out.println("shhhh, stealh mode activated");
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return  "Fighter Jet- weapon: " + weapon + " " + super.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((weapon == null) ? 0 : weapon.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FighterJet other = (FighterJet) obj;
		if (weapon == null) {
			if (other.weapon != null)
				return false;
		} else if (!weapon.equals(other.weapon))
			return false;
		return true;
	}
	
	

}
