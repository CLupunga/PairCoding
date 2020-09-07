import java.util.List;
import java.util.ArrayList;

public class People extends Person {

	List<Person> People = new ArrayList<>();

	public void addName(Person person) {
		People.add(person);

	}

	public People() {
		setName("Josh");
		setJobTitle("Driver");
		setAge(24);

	}

	public People(String name, String jobTitle, int age) {
		setName(name);
		setJobTitle(jobTitle);
		setAge(age);

	}

	public void printName() {
		for (int i = 0; i < People.size(); i++)
			;
		System.out.println(People.toString());
	}

	public void printName(String name) {
		for (int i = 0; i < People.size(); i++)
			if (People.get(i).getName().equals(name)) {
				System.out.println(People.get(i));
		}

	}
}
