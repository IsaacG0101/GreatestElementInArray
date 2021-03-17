package TestArray;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] myGPA = {90, 100, 65, 83};	
		
		// Print all the array elements 
		
		for (int i = 0; i < myGPA.length; i++) {
			
			System.out.println(myGPA[i] + " ");
			
		}
		
			//Summing all elements 
		double total = 0;
		for (int i = 0; i < myGPA.length; i++) {
			total += myGPA[i];
			
		}
			
		System.out.println("Total is " + total);
		
		
		//finding the largest element
		
		double max = myGPA[0];
		for (int i = 1; i < myGPA.length; i++) {
			if  (myGPA[i] > max) max = myGPA[i];
			
		}
		System.out.println("Max is " + max);
			double average = myGPA[0];
			System.out.println("Average is " + average);
	}
	

}
