package inheritence;

public class Employee extends Person implements Promotable {
	public int empid;

	
	  public Employee() { System.out.println("emplpoyee constructor"); }
	 
	public Employee(String name, int age, int empid) {
		super(name, age);
		this.empid = empid;
	}
	public void doSomething()
	{
		System.out.println("enployee works to earn for his living");
	}
	public void promote()
	{
		System.out.println("employee gets promotion");
	}

}
