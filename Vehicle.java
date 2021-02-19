package com.bae.garage;

public class Vehicle {

	private int ID;
	private String model;
	private int wheels;

	public Vehicle(int ID, String model, int wheels) {
		this.ID = ID;
		this.model = model;
		this.wheels = wheels;

	}

	public int getID() {
		return ID;
	}

	public String getModel() {
		return model;
	}

	public int getWheels() {
		return wheels;
	}

	public void startEngine() {
		System.out.println("Vroooom!");
	}

	public void horn() {
		System.out.println("Honk");
	}

}
