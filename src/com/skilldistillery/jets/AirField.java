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
		double range = jets[0].getRange();
		double price = jets[0].getPrice();
		
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
		System.out.println("Its range is " + range + " and costs $" + price + " million");

	}
	
	public  void longestRange () {
		double longest = jets[0].getRange();
		String longestRange = jets[0].getModel();
		double speed = jets[0].getSpeed();
		double price = jets[0].getPrice();
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
		System.out.println("Its speed is " + speed + " and costs " + price + " million ");
		
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
	
	public int addJet () {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter jet model(no spaces): ");
		String jName = kb.next();
		System.out.println("Enter your jets speed(in mph): ");
		double speed = kb.nextDouble();
		System.out.println("Enter your jets range(in miles): ");
		double range = kb.nextDouble();
		System.out.println("Enter your jets price(in millions): ");
		double price = kb.nextDouble();
		price = price * 000001;
		menu();
		System.out.println("*--------------------*");
		System.out.println("Make another selection");
		int input = kb.nextInt();
		
		for ( int i = 6; i < jets.length ; i ++) {
			if ( jets[i] == null ) {
				jets[i] = new JetImpl( jName, speed, range, price );
				return input;
			}
		}
		
	
			
		kb.close();
		return 0;
		
		
		
	}
	public void displayMach () {
		for (Jet jet : jets) {
			if ( jet != null ) {
				System.out.print("The " + jet.getModel());
				jet.machSpeed( jet.getSpeed() );
			}
		}
	}
	
	public void menu() {
		System.out.println("1: List Fleet");
		System.out.println("2: Fly all Jets");
		System.out.println("3: View fastest jet");
		System.out.println("4: View jet with longest range");
		System.out.println("5: Load all Cargo Jets");
		System.out.println("6: Dogfight!");
		System.out.println("7: Add new Jet");
		System.out.println("8: View Mach speed of jets");
		System.out.println("9: Exit");
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
