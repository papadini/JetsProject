package com.skilldistillery.jets;

public class CargoCarrier extends Jet implements Cargo {
	private int size;

	public CargoCarrier() {
	}

	public CargoCarrier(int size, String model, double speed, double range, double price) {
		super(model, speed, range, price);
		this.size = size;
		
	}@Override
	public void loadCargo() {
		
		System.out.println("Load em up");
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "CargoCarrier-size=" + size + " " + super.toString() ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + size;
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
		CargoCarrier other = (CargoCarrier) obj;
		if (size != other.size)
			return false;
		return true;
	}
	

}
