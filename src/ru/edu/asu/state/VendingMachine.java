package ru.edu.asu.state;

public class VendingMachine {
 
	State currentState;
	int count = 0;

  
	public VendingMachine(int count) {
		this.count = count;
		if (count > 0) {
			currentState = new NoCoinState();
		}
	}
  
	public void setState(State s){
		this.currentState = s;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void insertCoin() {
		currentState.insertCoin(this);
	}

	public void ejectCoin() {
		currentState.ejectCoin(this);
	}
 
	public void pushSelectButton() {
		currentState.pushSelectButton(this);
	}
 
	public void dispense() {
		currentState.dispense(this);
	}
 
	

	public void refill(int numOfProducts) {
		this.count = numOfProducts;
		currentState = new NoCoinState();
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nТоварный автомат");
		result.append("\nВ наличии: " + count + " товаров");
		result.append("\nСостояние: ");
		result.append("\n"+currentState.status());
		result.append("\n");
		return result.toString();
	}
}


