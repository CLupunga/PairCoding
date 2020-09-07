
public class Motorbike extends Vehicle {

	int helmet;


	@Override
	public String toString() {
		return "Motorbike [helmet=" + helmet + ", Price=" + getPrice() + ", TYpe=" + getType()
				+ ", Wheels=" + getWheels() + ", Make=" + getMake() + "]";
	}

	public Motorbike(String colour, int wheels, String make, float price, int helmet) {
		super(colour, wheels, make, price);
		this.helmet = helmet;
	}

	public int getHelmet() {
		return helmet;
	}

	public void setHelmet(int helmet) {
		this.helmet = helmet;
	}
	
}
