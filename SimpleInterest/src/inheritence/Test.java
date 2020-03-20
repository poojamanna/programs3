package inheritence;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.doSomething();
		e.promote();
		Student s = new Student();
		s.doSomething();
		
		
		Manager m = new Manager("pooja", 22, 1095, "developer");
		System.out.println(m.name + " " + m.age + " " + m.empid + " " + m.dept);
		
		

	}

}
