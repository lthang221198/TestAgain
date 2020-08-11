package bai1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		System.out.println("Enter username:");
		Scanner a = new Scanner(System.in);
		
		String string = a.nextLine();
	    String reverse = new StringBuffer(string).reverse().toString();
	    
	    System.out.println("\nBan dau:"+string);
	    System.out.println("Sau khi dao nguoc:"+reverse);
	}

}
