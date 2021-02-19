package com.bae.garage;

public class Runner {

	public static void main(String[] args) {

		Bike bike1 = new Bike(34, "Ford", 2, true, true, true);
		Bike bike2 = new Bike(45, "Hyundai", 2, false, true, true);

		Car car1 = new Car(534, "Vauxhall", 4, true, false);
		Car car2 = new Car(65, "Vauxhall", 6, true, false);

		Lorry lorry1 = new Lorry(654, "Stobart", 8, 65, true);
		Lorry lorry2 = new Lorry(3, "Eddie", 6, 45, false);

		Garage garage = new Garage();

		garage.addVehicle(bike1);
		garage.addVehicle(bike2);
		garage.addVehicle(car1);
		garage.addVehicle(car2);
		garage.addVehicle(lorry1);
		garage.addVehicle(lorry2);

		System.out.println(garage.calculateBill());

		garage.removeID(65);

		garage.printGarage();

	}

}
