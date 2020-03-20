package conditions;
import java.util.Scanner;

public class TestCondition2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int year=2020;
		if ((year % 4 == 0 && year % 100 != 0)|| (year % 400 == 0 ))
		{
			System.out.println("its a leap year "+year);
			
		}
		else 
		{
			System.out.println("not a leap year "+year);
		}*/
		int a;
		System.out.println("enter the number:");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		if (a%2==0)
		{
			System.out.println(" number is even");
		}
		else 
			System.out.println(" number is odd");
		/*String ops="*";
		int a=20,b=10;
		switch(ops)
		{
		case "+": 
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		case "*":
			System.out.println(a*b);
			break;
		case "/":
			System.out.println(a/b);
			break;
		case "%":
			System.out.println(a%b);
			break;
			default:
				System.out.println("invalid input");
				break;
				
				
		}*/
	}

}
