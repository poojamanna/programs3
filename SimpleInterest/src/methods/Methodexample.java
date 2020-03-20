package methods;

public class Methodexample {
	public int x;
	public int y;
	public int sum()
	{
		return(x+y);
	}
	public int sum(int x, int y)
	{
		return(x+y);
	}
	public float sum(int x, float y)
	{
		return(x+y);
	}
	public float sum(float x,int y)
	{
		return(x+y);
	}
	public int sum( int x,int y, int z)
	{
		return(x+y+z);
	}
	public String sum (String f,String l)
	{
		return(f+l);
	}
	public int sum (int...x)
	{
		int y=0;
		for(int i:x)
		{
			y=y+i;
		}
		return y;
	}
	public String sum (String...names)
	{
		String temp="";
		for(String i:names)
		{
			temp = temp+i+" ";
		}
		return temp;
	}
	
	
	
	
	
	
	
	/*public void sum()
	 {
		int z=x+y;
		 System.out.println("the sum is "+z);
	 }
	 public int sum1()
	 {
		int z=x+y;
		 return z;
	 }
	
	 public int sum3(int a,int b)
	 {
		 int c=a+b;
		 return c;
	 }
	 public float sum4(int a, float b)
	 {
		 float c=a+b;
		 return c;
	 }*/

}
