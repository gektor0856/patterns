package ru.edu.asu.state;

public class SoldOutState implements State {

	@Override
	public void insertCoin(VendingMachine machine) {
		System.out.println("Нельзя поместить монету, все товары распроданы");
		
	}

	@Override
	public void ejectCoin(VendingMachine machine) {
		System.out.println("Невозможно вернуть, монета еще не помещена");
		
	}

	@Override
	public void pushSelectButton(VendingMachine machine) {
		System.out.println("Выбранные товары отстутсвуют");
		
	}

	@Override
	public void dispense(VendingMachine machine) {
		System.out.println("Товар не выдан");
		
	}

	@Override
	public String status() {
		return "товары распроданы";
	}


}
