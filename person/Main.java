
public class Main {

	public static void main(String[] args) {

		People i=new People();
		People j=new People("James","plumber", 23);
		People k=new People("Chris","officer", 30);
	    
		i.addName(i);
		i.addName(j);
		i.addName(k);
		
//		System.out.println(i.toString());
//	    System.out.println(j.toString());
//	    System.out.println(k.toString());
//		i.printName();
		i.printName(k.getName());

	}

}

