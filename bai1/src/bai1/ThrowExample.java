package bai1;

public class ThrowExample {
	
	void checkAge(int age){
			if(age<18) {
				throw new ArithmeticException("Not Eligible for voting"); 
			}
			else {
				System.out.println("Eligible for voting"); 
			}
	   } 

	public static void main(String[] args) {
		ThrowExample obj = new ThrowExample();
		try{
			obj.checkAge(131);  
			System.out.println("Not Eligible for voting");  
		}
		catch(ArithmeticException e) {
			System.out.println("Eligible for voting"); 
		}
	}
}
