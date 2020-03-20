package exception1;

public class MyClass {
	public void method1()
	{
		try{
	 int x=10;
	 int y=0;
	 int z =10/2;
	 int[] x1 = new int[5];
	 x1[4] = 20;
	}catch(ArithmeticException e)
		{
		System.out.println("invalid input");
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("invalid number for the array position");
		}
		finally
		{
			System.out.println("execute the remaining program");
		}
	}
	public void method2() throws Exception

	{
		 int x=10;
		 int y=0;
		 int z =10/0;
	}
}
