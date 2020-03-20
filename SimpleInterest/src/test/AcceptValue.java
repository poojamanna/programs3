package test;

import java.util.Scanner;

public class AcceptValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your name: ");
    String name = sc.next();
    System.out.println("enter your age: ");
    int age = sc.nextInt();
    System.out.println("enter your GPA: ");
    float gpa = sc.nextFloat();
    System.out.println("I met with "+name+" who is "+age+" got GPA of "+gpa);

	}

}
