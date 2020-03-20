package poly;

public class CoffeeMug extends Mug implements Washable,Paintable{
	public void addLiquid(Liquid l) {
		//l.swirl();
		 if(l instanceof Coffee)
		 {
			 l.swirl();
			 System.out.println("you got coffee this time");
		 }
		 else if (l instanceof Tea)
		 {
			 l.swirl();
			 System.out.println("you got tea this time");
		 }
		 else 
		 {
			 System.out.println("you got dsome generic liquid");
		 }
	}
	public void wash()
	{
		System.out.println("the coffee mug is washable");
	}
	public void paint()
	{
		System.out.println("paint the mug beautifully");
	}
}
