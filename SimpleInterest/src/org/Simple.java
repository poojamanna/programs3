package org;

public class Simple {

	public double p;
	public double r;
	public double t;
	public double si;
	public void calculate()
	{
		si=(p*t*r)/100;
		
		System.out.println("the simple interest is "+si);

	}
	public void display()
	
	{
	System.out.println("this program calculates simple_interest");
	calculate();
	}

}
