package loops;

public class LoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//do while
		/*int x=11;
		do {
			System.out.println("the value of x is "+x);
			x=x+1;
		}while(x<=10);
		int y=11;
		while(y<=10)
		{
			System.out.println("the value of y is "+y);
			y=y+1;
		}*/
		int n=10,t1=0,t2=1;
		for (int i=0;i<=n;++i)
		{
			System.out.println(t1);
			int sum = t1+t2;
			t1=t2;
			t2=sum;
		}

	}

}
