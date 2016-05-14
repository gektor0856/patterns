package ru.edu.asu.state;

public class SoldState implements State {

	@Override
	public void insertCoin(VendingMachine machine) {
		System.out.println("���������, ����� ��������");
		
	}

	@Override
	public void ejectCoin(VendingMachine machine) {
		System.out.println("�� ��� ������� �����, ������ ����������");
		
	}

	@Override
	public void pushSelectButton(VendingMachine machine) {
		System.out.println("������� �������");
		
	}

	@Override
	public void dispense(VendingMachine machine) {
		System.out.println("����� ��������...");
		machine.setCount(machine.getCount() - 1);
		if (machine.getCount() == 0) {
			System.out.println("������ �����������!");
			machine.setState(new SoldOutState());
		} else {
			machine.setState(new NoCoinState());
		}
	}

	@Override
	public String status() {
		return "����� ��������";
	}


}
