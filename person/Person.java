

public class Person {

	private String name;
	private String jobTitle;
	
	
	int age;

	@Override
	public String toString() {
		return "person [name=" + name + ", jobTitle=" + jobTitle + ", age=" + age + "]";
	}
	
	public Person() {
		this.name="Josh";
		this.jobTitle="Driver";
		this.age=24;
		
	}
	public Person(String name, String jobTitle, int age) {
		this.name=name;
		this.jobTitle=jobTitle;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
