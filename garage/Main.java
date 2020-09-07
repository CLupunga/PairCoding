import java.util.*;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		Car car=new Car("red",4,"mazda",1000f,5);
		Motorbike moto=new Motorbike("blue",2,"harley",750f,2);
		
		Car car1=new Car("gray",4,"fiat",2100f,5);
		Motorbike moto1=new Motorbike("black",2,"suzuki",1150f,2);
		
	List<Vehicle> garage=new ArrayList<>();
		garage.add(car);
		garage.add(moto);
		garage.add(car1);
		garage.add(moto1);
		
		for(int i=0;i<garage.size();i++) {
			if garage.get(i).equals
		}
		
		System.out.println(garage.toString());
	}

}
