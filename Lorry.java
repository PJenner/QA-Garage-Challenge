package com.bae.garage;

public class Lorry extends Vehicle {

	private int cargoSize;
	private boolean licence;

	public Lorry(int ID, String model, int wheels, int cargoSize, boolean licence) {
		super(ID, model, 2);
		this.cargoSize = cargoSize;
		this.licence = licence;

	}

	public int getCargo() {
		return cargoSize;
	}

	public boolean hasLicence() {
		return licence;
	}
}
