package methods;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodexample me = new Methodexample();
		me.x=10;
		me.y=40;
		System.out.println(me.sum());
		System.out.println(me.sum(10,20));
		System.out.println(me.sum(10,20.25f));
		System.out.println(me.sum(10.55f,20));
		System.out.println(me.sum(10,20,30));
		System.out.println(me.sum("pooja ","manna"));
		int result = me.sum(10,20,30,40,50);
		System.out.println(result);
		String result2 = me.sum("Pooja","Tri","Edna","Hema");
		System.out.println(result2); 




		
		
		
		
		
		
		
		/*me.sum();
		System.out.println(me.sum1());
		int result=me.sum1();
		System.out.println(result);
		int result2=me.sum3(100,200);
		System.out.println(result2);
		float result3=me.sum4(100, 50.62f);
		System.out.println(result3);*/

	}

}
