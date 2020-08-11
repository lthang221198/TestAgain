package bai1;

public class maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int numbers[] = new int[]{3, 2, 7, 1, 4, 9, 5};
	      int max = numbers[0];
	      int min = numbers[0];
	      
	      for(int i = 1; i < numbers.length; i++) {
	         if(numbers[i] > max)
	        	 max = numbers[i];
	         else if (numbers[i] < min)
	        	 min = numbers[i];
	      } 
	      System.out.println("Max : " + max);
	      System.out.println("Min : " + min);
	}

}
