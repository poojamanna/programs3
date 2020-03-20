package inheritence;

public abstract class Person {
	public String name;
	public int age;

	
	  public Person() { System.out.println("Person constructor"); }
	  public abstract void doSomething();
	 
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
