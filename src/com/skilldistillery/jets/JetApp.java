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
		
		Jet jet2 = new FighterJet("Nuclear Bombs","XB-70 Valkyrie", 2056, 4287,75 );
		Jet jet1 = new FighterJet("GBU-12 Laser-Guided bombs","F-15 Eagle", 1875, 3450,28 );
		Jet jet3 = new FighterJet("GBU-10 Paveway 2","F-117 Nighthawk", 617, 1067,1110 );
		Jet jet4 = new CargoCarrier(92,"C-130J Super Hercules", 417, 2071,1670 );
		Jet jet5 = new CargoCarrier(33,"Dornier 328", 385, 1150,9.75 );
		Jet jet6 = new Secret("Top Secret", 0.0, 0.0, 0.0);
		
		
		jets[0] = jet1;
		jets[1] = jet2;
		jets[2] = jet3;
		jets[3] = jet4;
		jets[4] = jet5;
		jets[5] = jet6;
		field.setJets(jets);
		
		
		field.displayAirField();
		System.out.println("Make a selection: ");
		menu();
		//field.addJet();
		
		
		
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
		System.out.println("8: View Mach speed of jets");
		System.out.println("9: Exit");
		
		int choice = kb.nextInt();
		
	while( choice != 9 ) {
		switch ( choice ) {
		case 1 : field.displayAirField();
				System.out.println("Make another selection");
				choice = kb.nextInt();
			break;
		case 2 : field.displayFly();
				System.out.println("Make another selection");
				choice = kb.nextInt();
			break;
		case 3 : field.findFastest();
				System.out.println("Make another selection");
				choice = kb.nextInt();
			break;
		case 4 : field.longestRange();
				System.out.println("Make another selection");
				choice = kb.nextInt();
			break;
		case 5 : field.callCargo();
				System.out.println("Make another selection");
				choice = kb.nextInt();
			break;
		case 6 : field.dogFight();
				System.out.println("Make another selection");
				choice = kb.nextInt();
			break;
		case 7 : choice = field.addJet();
				//System.out.println("Make another selection");
				break;
			
		case 8 : field.displayMach();
				System.out.println("Make another selection");
				choice = kb.nextInt();
			break;
		case 9 : break;
		default: System.out.println("Enter 1-9 please");
		
		
			System.out.println("Make another selection");
			choice = kb.nextInt();
		
		
		}
	}
	
	}
	
	
}
