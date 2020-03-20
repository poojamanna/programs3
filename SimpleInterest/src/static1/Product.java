package static1;

public class Product {
	public String name;
	public int num = 0;
	public static int counter = 0;
	public static float counter2=0;
	public static final String brandname = "Amul";

	public Product() {
		counter++;
		num++;
		counter2++;
		
	}

	public static int statmethod() {
		counter = counter + 2;
	
		return counter;
	}
	public static float statmethod2() {
		counter2 = counter2 + 2;
	
		return counter2;
	}

}
