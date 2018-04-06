//a static recursive function that computes and returns 
//the sum of the elements in an integer array, where a reference 
//to the array and the size of the array are provided as two parameters to the function.
public class Recursive2 {

	public static void main(String args[]){
	      int[] array = {25, 33, 45, 18, 18, 93};
	      int sum = 0;
	      //Advanced for loop
	      for( int num : array) {
	          sum = sum+num;
	      }
	      System.out.println("Sum of array elements is:"+sum);
	   }
	}

