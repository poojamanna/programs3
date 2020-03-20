package constructor;

public class Person {
	public String name;
	public int age;
	public String address;

	public Person() {
		name = "Pooja";
		age = 22;
		address = "bangalore";
	}

	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;

	}

	public Person(String n, int a) {
		name = n;
		age = a;
	}
	

}
