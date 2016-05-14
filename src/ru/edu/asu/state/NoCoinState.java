package ru.edu.asu.state;

public class NoCoinState implements State {

	@Override
	public void insertCoin(VendingMachine machine) {
		machine.setState(new HasCoinState());
		System.out.println("�� ��������� ������");
		
	}

	@Override
	public void ejectCoin(VendingMachine machine) {
		System.out.println("�� �� ��������� ������");
	}

	@Override
	public void pushSelectButton(VendingMachine machine) {
		System.out.println("�� ��������� ������� �����, �� �������� ������");
		
	}

	@Override
	public void dispense(VendingMachine machine) {
		System.out.println("������ ���������� ���������� ������");
		
	}

	@Override
	public String status() {
		return "�������� ������";
	}



}
