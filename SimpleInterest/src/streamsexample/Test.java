package streamsexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2 = new Student();
		List<Student> sL = new ArrayList<>();
		sL.add(s1);
		sL.add(s2);
		Scanner sc = new Scanner(System.in);
		for (Student s : sL) {
			System.out.println("enter name");
			s.name = sc.next();
			System.out.println("enter age");
			s.age = sc.nextInt();
			System.out.println("enter adaress");
			s.address = sc.next();

		}
		for (Student s : sL) {
			System.out.println(s.name+" "+s.age+" "+s.address);
			

		}
	}

}
