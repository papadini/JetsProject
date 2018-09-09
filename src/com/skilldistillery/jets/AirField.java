package com.skilldistillery.jets;

import java.util.Arrays;
import java.util.Scanner;

public class AirField {
	private Jet[] jets;
	private final int MAX_JETS = 20;
	private int numJet = 5;
	
	CargoCarrier cc = new CargoCarrier();
	FighterJet fj = new FighterJet();
	
	
	
	
	
	
	public Jet[] getJets() {
		return jets;
	}

	public void setJets(Jet[] jets) {
		this.jets = jets;
	}

	public AirField() {
		jets = new Jet[MAX_JETS];
	}

	public AirField(Jet[] jets) {
		this.jets = jets;
	}

	public void displayAirField() {
		for (Jet jet : jets) {
			if (jet != null) {
				System.out.println(jet.toString());

			}

		}

	}
	public void addJet (Jet j) {
		jets [numJet] = j;
		numJet ++;
	}
	
	public void displayFly () {
		for (Jet jet : jets) {
			if ( jet != null ) {
				jet.fly();
			}
		}
	}

	public void findFastest() {
		double largest = jets[0].getSpeed();
		String fastest = jets[0].getModel();
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				if (jets[i].getSpeed() > largest) {
					largest = jets[i].getSpeed();
					fastest = jets[i].getModel();
				}

			}
		}

		System.out.println("The fastest Jet we have is " + fastest +
				". It can go " + largest + "mph!");

	}
	
	public  void longestRange () {
		double longest = jets[0].getRange();
		String longestRange = jets[0].getModel();
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				if (jets[i].getRange() > longest) {
					longest = jets[i].getRange();
					longestRange = jets[i].getModel();
				}

			}
		}
		
		System.out.println("The Jet with the longest range is " + longestRange 
				+ " and it can go " + longest + " miles!" );
		
}
	public void callCargo () {
		for (Jet jet : jets) {
			if ( jet != null ) {
				if ( jet instanceof  CargoCarrier ) {
					System.out.println( jet.getModel() );
					 cc.loadCargo();
				}
			}
		}
	}
	
	public void dogFight () {
		for (Jet jet : jets) {
			if ( jet != null ) {
				if ( jet instanceof FighterJet ) {
					System.out.println( jet.getModel() );
					fj.fight();
				}
			}
		}
	}
	
	public void addJet () {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter jet model: ");
		String jName = kb.next();
		System.out.print("Enter your jets speed: ");
		double speed = kb.nextDouble();
		System.out.print("Enter your jets range: ");
		double range = kb.nextDouble();
		System.out.print("Enter your jets range: ");
		double price = kb.nextDouble();
		
		for ( int i = 6; i < jets.length ; i ++) {
			if ( jets[i] == null ) {
				jets[i] = new JetImpl( jName, speed, range, price );
				break;
			}
		}
			
		kb.close();
		
		
		
	}
	public void displayMach () {
		for (Jet jet : jets) {
			if ( jet != null ) {
				jet.machSpeed( jet.getSpeed() );
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + MAX_JETS;
		result = prime * result + Arrays.hashCode(jets);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AirField other = (AirField) obj;
		if (MAX_JETS != other.MAX_JETS)
			return false;
		if (!Arrays.equals(jets, other.jets))
			return false;
		return true;
	}

}
