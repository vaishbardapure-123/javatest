package com.xworkz.core_java.inheritance.heirarchical_inheritance;

public class HeirarchicalInheritanceDemo {
	public static void main(String[] args) {
		Bike bike = new Bike();
		Car car = new Car();
		Truck truck = new Truck();
		bike.speed();
		bike.wheeling();
		car.speed();
		car.dragrace();
		truck.speed();
		truck.carryload();
		
	}

}
