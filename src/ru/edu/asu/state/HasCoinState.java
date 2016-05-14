package ru.edu.asu.state;

public class HasCoinState implements State {

	@Override
	public void insertCoin(VendingMachine machine) {
		System.out.println("������ ��������� ������ ����� ������");
	}

	@Override
	public void ejectCoin(VendingMachine machine) {
		machine.setState(new NoCoinState());
		System.out.println("������ ����������");
		
	}

	@Override
	public void pushSelectButton(VendingMachine machine) {
		System.out.println("����� ������...");
		machine.setState(new SoldState());
		machine.dispense();
	}

	@Override
	public void dispense(VendingMachine machine) {
		System.out.println("����� �� �����");
		
	}

	@Override
	public String status() {
		return "�������� ������ ������";
	}


}
