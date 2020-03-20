package poly;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Liquid l = new Liquid();
		Coffee c = new Coffee();
		Car ca = new Car();
		Tea t = new Tea();
		CoffeeMug cm = new CoffeeMug();
		cm.addLiquid(c);
       cm.wash();
       cm.paint();
       ca.wash();
       ca.paint();
	}

}
