package ru.edu.asu.state;

interface State {
	void insertCoin(VendingMachine machine);

	void ejectCoin(VendingMachine machine);
	
	void pushSelectButton(VendingMachine machine);

	void dispense(VendingMachine machine);
	
	String status();


}
