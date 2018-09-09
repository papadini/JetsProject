package com.skilldistillery.jets;

import java.util.Arrays;

public class AirField {
	private Jet[] jets;
	private final int MAX_JETS = 20;
	private int numJet = 5;
	
	
	
	
	
	
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
