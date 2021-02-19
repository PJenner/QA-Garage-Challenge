package com.bae.garage;

public class Car extends Vehicle {

	private boolean hasBoot;
	private boolean MOT;

	public Car(int ID, String model, int wheels, boolean hasBoot, boolean MOT) {
		super(ID, model, 4);
		this.hasBoot = hasBoot;
		this.MOT = MOT;
	}

	public boolean hasBoot() {
		return hasBoot;
	}

	public boolean hasMOT() {
		return MOT;
	}
}
