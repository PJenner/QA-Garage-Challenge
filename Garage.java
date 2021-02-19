package com.bae.garage;

import java.util.ArrayList;

public class Garage {

	ArrayList<Vehicle> vehicles = new ArrayList<>();

	public void removeType(String type) {
		ArrayList<Vehicle> toRemove = new ArrayList<>();
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getType().contains(type)) {
				toRemove.add(vehicle);
			}
		}
		vehicles.removeAll(toRemove);
	}

	public void removeID(int ID) {
		ArrayList<Vehicle> toRemove = new ArrayList<>();
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getID() == ID) {
				toRemove.add(vehicle);
			}
		}
		vehicles.removeAll(toRemove);
	}

	public double calculateBill() {
		double bill = 0;
		for (Vehicle vehicle : vehicles) {
			if (vehicle instanceof Car) {
				bill += 100;
			} else if (vehicle instanceof Bike) {
				bill += 50;
			} else {
				bill += 200;
			}
		}
		return bill;
	}

	public double fixVehicle(Vehicle vehicle) {
		double cost;
		if (vehicle instanceof Bike) {
			cost = 50;
			return cost;
		} else if (vehicle instanceof Car) {
			cost = 100;
			return cost;
		} else {
			cost = 200;
			return cost;
		}
	}

	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

	public void emptyGarage() {
		vehicles.removeAll(vehicles);
	}

	public void printGarage() {
		for (Vehicle vehicle : vehicles) {
			System.out.println();
		}
	}
}
