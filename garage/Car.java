
public class Car extends Vehicle {

	int doors;
	

	@Override
	public String toString() {
		return "Car [doors=" + doors + ", Price=" + getPrice() + ", Type=" + getType() + ", Wheels="
				+ getWheels() + ", Make=" + getMake() + "]";
	}

	public Car(String type, int wheels, String make, float price, int doors) {
		super(type, wheels, make, price);
		this.doors = doors;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}
	
	
}
