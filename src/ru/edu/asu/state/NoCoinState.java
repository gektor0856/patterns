package ru.edu.asu.state;

public class NoCoinState implements State {

	@Override
	public void insertCoin(VendingMachine machine) {
		machine.setState(new HasCoinState());
		System.out.println("Вы поместили монету");
		
	}

	@Override
	public void ejectCoin(VendingMachine machine) {
		System.out.println("Вы не поместили монету");
	}

	@Override
	public void pushSelectButton(VendingMachine machine) {
		System.out.println("Вы пытаетесь выбрать товар, не поместив монету");
		
	}

	@Override
	public void dispense(VendingMachine machine) {
		System.out.println("Сперва необходимо произвести оплату");
		
	}

	@Override
	public String status() {
		return "ожидание монеты";
	}



}
