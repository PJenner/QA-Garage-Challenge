package com.bae.garage;

public class Lorry extends Vehicle {

	private int cargoSize;

	public Lorry(int ID, String model, int wheels, int cargoSize) {
		super(ID, model, 2);
		this.cargoSize = cargoSize;

	}

	public int getCargo() {
		return cargoSize;
	}
}
