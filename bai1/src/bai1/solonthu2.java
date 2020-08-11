package bai1;

public class solonthu2 {
	public static void main(String[] args) {
		int numbers[] = new int[]{3, 2, 7, 1, 4, 9, 5};
	      int max = 0;
	      int max2 = 0;
	      
	      for(int i = 0; i < numbers.length; i++) {
	         if(numbers[i] > max)
	        	 max = numbers[i];
	         else if (numbers[i] > max2)
	        	 max2 = numbers[i];
	      } 
	      System.out.println("Max : " + max);
	      System.out.println("Max2 : " + max2);
	}
}
