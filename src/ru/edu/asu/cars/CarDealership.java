package ru.edu.asu.cars;

import java.util.Scanner;
import java.util.ArrayList;


public class CarDealership {
	private ArrayList<SalableVehicle> carLot;  
	private String name; 

	public CarDealership() {
		carLot = new ArrayList<SalableVehicle>();
		name = null;
	}

	public CarDealership(String name) {
		carLot = new ArrayList<SalableVehicle>();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addCar(SalableVehicle c) {
		carLot.add(c);
	}

	public void showCars() {
		System.out.println("��������� " + name + ", � �������:");
		for (SalableVehicle c : carLot) {
			System.out.println(c);
		}
	}

        public SalableVehicle findCar(String vin) throws NoSuchCarException {
 	    for (SalableVehicle c : carLot) {
	        if (c.getVin().equals(vin)) {
                    return c;
                }
	    }
            throw new NoSuchCarException("������: ��� ���������� � ����� VIN");
        }

        public void sellCar(String vin) throws NoSuchCarException {
 	    for (SalableVehicle c : carLot) {
	        if (c.getVin().equals(vin)) {
                    carLot.remove(c);
                    return;
                }
	    }
 	    	throw new NoSuchCarException("������: ��� ���������� � ����� VIN");
        }

	public static void main(String argv[]) throws NoSuchCarException {
		CarDealership dealship = new CarDealership("���� �� �������");
		SalableCar vaz = new SalableCar("55456165", 2000, 100000 , "������", "2107", "�����", 2015);
		dealship.addCar(vaz);
		SalableCar audi = new SalableCar("78578587", 5000, 10000000 , "��������", "m3", "������", 2012);
		dealship.addCar(audi);
		
		dealship.showCars();
	}
}
