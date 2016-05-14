package ru.edu.asu.cars;

public class SalableCar extends SalableVehicle  {

	Car car;
	
	public SalableCar(String vin, int mileage, int price,String make, String model, String color, int year) {
		super(vin, mileage, price);
		car = new Car(make, model, color, year);
	}

	@Override
	public String getMakeAndModel() {
		return car.getMake()+" "+car.getModel();
	}

	@Override
	public String getColor() {
		return car.getColor();
	}

	@Override
	public int getYear() {
		return car.getYear();
	}

	@Override
	public String toString() {
		return "SalableCar [car=" + car + ", vin=" + vin + ", mileage=" + mileage + ", price=" + price + "]";
	}

}
