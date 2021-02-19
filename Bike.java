package com.bae.garage;

public class Bike extends Vehicle {

	private boolean seatStorage;
	private boolean sideCar;
	private boolean handleBars;

	public Bike(int ID, String model, int wheels, boolean seatStorage, boolean sideCar, boolean handleBars) {
		super(ID, model, 2);
		this.seatStorage = seatStorage;
		this.sideCar = sideCar;
		this.handleBars = handleBars;
	}

	public boolean hasSeatStorage() {
		return seatStorage;
	}

	public boolean hasSideCar() {
		return sideCar;
	}

	public boolean hasHandleBars() {
		return handleBars;
	}

}
