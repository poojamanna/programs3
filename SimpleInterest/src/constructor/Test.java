package constructor;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		System.out.println(p.name+" "+p.age+" "+p.address);
		Person p2 = new Person("Pooja",22,"Bangalore");
		System.out.println(p2.name+" "+p2.age+" "+p2.address);
		Person p3 = new Person("Triveni.G",22);
		p3.address="Mangalore";
		System.out.println(p3.name+" "+p3.age+" "+p3.address);

		

	}

}
