
public class Vehicle {

	private String type;
	private float price;

	
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", wheels=" + wheels + ", make=" + make + "]";
	}

	private int wheels;
	private String make;

	public Vehicle(String type, int wheels, String make, float price) {
		super();
		this.type = type;
		this.wheels = wheels;
		this.make = make;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

}
