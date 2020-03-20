package iooperation;

import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileOutputStream fout = new FileOutputStream("C:\\pooja\\pooh.txt");
			String s = "welcome to my anime world and fall in love with the UZUMAKI NARUTO";
			byte b[]=s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("done..");
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
