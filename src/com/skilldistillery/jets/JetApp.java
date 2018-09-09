package com.skilldistillery.jets;

import java.util.Scanner;

public class JetApp {
	AirField field = new AirField();

	public static void main(String[] args) {
		JetApp jetapp = new JetApp();
		jetapp.run();
		
		
		
		
	}
	
	public void run () {
		
		
		Jet [] jets = new Jet[20];
		
		Jet jet2 = new FighterJet("Nuclear Bombs","XB-70 Valkyrie", 2056, 4287,750_000_000 );
		Jet jet1 = new FighterJet("GBU-12 Laser-Guided bombs","F-15 Eagle", 1875, 3450,28_000_000 );
		Jet jet3 = new FighterJet("GBU-10 Paveway 2","F-117 Nighthawk", 617, 1067,111_000_000 );
		Jet jet4 = new CargoCarrier(92,"C-130J Super Hercules", 417, 2071,167_000_000 );
		Jet jet5 = new CargoCarrier(33,"Dornier 328", 385, 1150,9_750_000 );
		Jet jet6 = new CargoCarrier(10, "pow", 5.0, 5.0, 5);
		
		
		jets[0] = jet1;
		jets[1] = jet2;
		jets[2] = jet3;
		jets[3] = jet4;
		jets[4] = jet5;
		
		
		
		
		field.setJets(jets);
		field.addJet(jet6);
		field.displayAirField();
		field.displayFly();
		
		
		
	}
	
	public void  menu () {
		Scanner kb = new Scanner(System.in);
		System.out.println("1: List Fleet");
		System.out.println("2: Fly all Jets");
		System.out.println("3: View fastest jet");
		System.out.println("4: View jet with longest range");
		System.out.println("5: Load all Cargo Jets");
		System.out.println("6: Dogfight!");
		System.out.println("7: Add new Jet");
		System.out.println("8: Exit");
		int choice = kb.nextInt();
		kb.close();
	
		
	
		switch ( choice ) {
		case 1 : field.displayAirField();
			break;
		case 2 : field.displayFly();
			break;
		
		}
	}
	
	
	public Jet findFastest (Jet [] jets) {
		for (Jet jet : jets) {
			if ( jet.getSpeed() >  10 ) {
				
			}
		}
		
		
		
		
		return null;
	}
	
	public Jet longestRange ( Jet [] jets) {
		
		
		
		
		
		return null;
	
	

}
	
}
