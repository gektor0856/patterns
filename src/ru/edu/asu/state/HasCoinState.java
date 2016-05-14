package ru.edu.asu.state;

public class HasCoinState implements State {

	@Override
	public void insertCoin(VendingMachine machine) {
		System.out.println("Нельзя поместить больше одной монеты");
	}

	@Override
	public void ejectCoin(VendingMachine machine) {
		machine.setState(new NoCoinState());
		System.out.println("Монета возвращена");
		
	}

	@Override
	public void pushSelectButton(VendingMachine machine) {
		System.out.println("Товар выбран...");
		machine.setState(new SoldState());
		machine.dispense();
	}

	@Override
	public void dispense(VendingMachine machine) {
		System.out.println("ТОвар не выдан");
		
	}

	@Override
	public String status() {
		return "ожидание выбора товара";
	}


}
