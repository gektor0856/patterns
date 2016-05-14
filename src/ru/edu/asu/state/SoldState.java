package ru.edu.asu.state;

public class SoldState implements State {

	@Override
	public void insertCoin(VendingMachine machine) {
		System.out.println("Подождите, товар выдается");
		
	}

	@Override
	public void ejectCoin(VendingMachine machine) {
		System.out.println("Вы уже выбрали товар, отмена невозможна");
		
	}

	@Override
	public void pushSelectButton(VendingMachine machine) {
		System.out.println("Двойное нажатие");
		
	}

	@Override
	public void dispense(VendingMachine machine) {
		System.out.println("Товар выдается...");
		machine.setCount(machine.getCount() - 1);
		if (machine.getCount() == 0) {
			System.out.println("Товары закончились!");
			machine.setState(new SoldOutState());
		} else {
			machine.setState(new NoCoinState());
		}
	}

	@Override
	public String status() {
		return "товар выдается";
	}


}
