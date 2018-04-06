// a static recursive function that searches a sorted
//array of integers for a specific integer value using
//a recursive binary search given parameters of the 
//array, the starting index of the array, the
//final index of the array, and the value to be found.
public class Recursive4 {
static int search;
	
	public static void main(String[] args) {
		int container[] = {50,70,-25,0,07,45,33,-100,93,10,228};	
		System.out.println("Elements in array are: ");
		for(int ndx = 0; ndx<= container.length-1;ndx++)
			{System.out.print(container[ndx] + "\t");}
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Number found at index: " + search(container,0, container.length-1, 0));
		
	}

	private static int search(int numbers[], int start, int end, int number) {
		
     int mid = (start+end)/2;   
     
     if (numbers[mid]> number)    
    	 end=mid;
    	  
     else if(numbers[mid]<number)   
    	 start = mid;               
     
     else                          
    	 return mid;               
     
		return search(numbers, start, end, number);			
	}
}

