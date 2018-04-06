//a static recursive function called
//twos that takes a single integer as //
//its argument and returns the number of //
//factors of 2 in the number. For example: 
//twos(12) should return a 2 and twos(32) should 
//return a 5. (Recall that if n is an int or a long,
//(n/2)*2 != n, if and only if the value of n contains no factors of 2.
public class Recursive5 {
static int num=0;
	
	public static void main(String[] args) {	
	System.out.println("Number of factors of 2 are:  " + factorOf2(45));
		
	}

	private static int factorOf2 (int number) {
		
		// if number isn't further divisible by 2, then return the numerb of factors.
		if(number %2 == 1) return num;
				
		
		if (number % 2 == 0) 	
			++num;
				
		return factorOf2(number/2);
			
				
	}
}
