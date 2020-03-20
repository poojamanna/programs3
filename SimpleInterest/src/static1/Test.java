package static1;

public class Test {
	public static void main(String[] args) {
		Product p1 = new Product();
		System.out.println(p1.num);
		Product p2 = new Product();
		System.out.println(p2.num);

		Product p3 = new Product();
		System.out.println(p3.num);

		Product p4 = new Product();
		System.out.println(p4.num);

		System.out.println(Product.counter);
		System.out.println(Product.statmethod2());
		System.out.println(Product.brandname);
		System.out.println(Product.statmethod());

	}

}
