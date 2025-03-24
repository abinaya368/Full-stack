package session5;

public class person {
	
	private String name;
	private int age;
	
	//Regular constructor
	public person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//Copy constructor
	
	public person(person other) {
		this.name = other.name;
		this.age = other.age;
	}

	//getter method
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	//Method to display person details
	public void displayInfo() {
		System.out.println("Name: "+name+",Age: "+age);
	}
}
