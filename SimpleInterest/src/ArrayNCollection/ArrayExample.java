package ArrayNCollection;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int[] num1; num1=new int[5]; num1[0]=10; num1[1]=20; num1[2]=30;
		 * num1[3]=40; num1[4]=50; for(int i:num1) { System.out.println(i); }
		 * String[] names= {"poo","tri","edna","hema"}; for(String i:names) {
		 * System.out.println(i); }
		 */
		int[][] matrix;
		matrix = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values for matrix");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("the matrix values are");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(" "+matrix[i][j]);
			}
			System.out.println();
		}
		
		

	}

}
