package bai1;

import java.util.Scanner;

public class ThrowsExample extends Exception {
	
	public ThrowsExample(String message) {
		super(message);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int result = divideInt(10,5);
			System.out.format("10 divided by 5 is %d%n", result);
			divideInt(10,0);
			System.out.format("10 divided by 0 is %d%n", result);
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
//		finally {
//			System.out.println("hello");
//		}
		System.out.println("a");
		
		print("ds");
	}
	public static int divideInt(int i, int j) {
		if(j==0) {
			throw new IllegalArgumentException("Divisor cannot be zero !");
		}
		return i/j;
	}

	public static void print(String string) {
		// TODO Auto-generated method stub
	}

}
