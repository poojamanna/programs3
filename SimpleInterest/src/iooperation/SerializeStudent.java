package iooperation;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeStudent {
	public static void main(String[] args) {
		try
		{
			Student s1= new Student (101,"pooja");
			FileOutputStream fout = new FileOutputStream("C:\\pooja\\p.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();
			out.close();
			System.out.println("done....");
		}catch (Exception e)
		{
			System.out.println("invalid");
		}
	}

}
