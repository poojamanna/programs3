package inheritence;

public class Manager extends Employee {
	public String dept;

	/*
	 * public Manager() { System.out.println("manager constructor"); }
	 */
	public Manager(String name, int age, int empid, String dept) {
		super(name, age, empid);
		this.dept = dept;
	}
}
