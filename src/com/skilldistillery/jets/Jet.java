package com.skilldistillery.jets;

import java.text.DecimalFormat;

public abstract class Jet {
private String model;
private double speed; // in mph
private double range;
private double price;

DecimalFormat df = new DecimalFormat("0.00");


public Jet () {}

public Jet (String model, double speed, double range, double price ) {
	this.model = model;
	this.speed = speed;
	this.range = range;
	this.price = price;
}


public void fly () {
	System.out.println("SHHOOOOOOOOOSHHHHHHHH!!!!!!!!!!!");
	double time = range / speed;
	System.out.println("Jet : " + model + " Speed: " + speed + " Range: " + range + " Price: " + price + " Time: " + df.format(time) + " hours");
}
public void machSpeed (double speed ) {
	double mach = speed / 760.5583392985;
	if (mach < 1.0 ) {
		System.out.println(" This jet is Subsonic");
	}
	else if ( mach == 1.0 ) {
		System.out.println(" This jet is Transonic");
	}
	else if (mach > 1.0 ) {
		System.out.println("This jet is Supersonic");
	}
	else {
		System.out.println("This jet is Hypersonic");
	}
}
public String getModel() {
	return model;
}


public void setModel(String model) {
	this.model = model;
}


public double getSpeed() {
	return speed;
}


public void setSpeed(double speed) {
	this.speed = speed;
}


public double getRange() {
	return range;
}


public void setRange(double range) {
	this.range = range;
}



public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	result = prime * result + ((model == null) ? 0 : model.hashCode());
	temp = Double.doubleToLongBits(price);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(range);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(speed);
	result = prime * result + (int) (temp ^ (temp >>> 32));
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
	Jet other = (Jet) obj;
	if (model == null) {
		if (other.model != null)
			return false;
	} else if (!model.equals(other.model))
		return false;
	if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
		return false;
	if (Double.doubleToLongBits(range) != Double.doubleToLongBits(other.range))
		return false;
	if (Double.doubleToLongBits(speed) != Double.doubleToLongBits(other.speed))
		return false;
	return true;
}



@Override
public String toString() {
	return "model=" + model + ", speed=" + speed + ", range=" + range  + ", price=" + price + " million" ;
			
}




}
