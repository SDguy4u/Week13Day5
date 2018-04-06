//a static recursive function that finds and returns 
//the smallest element in an integer array, where a 
//reference to the array and the size of the array 
//are provided as two parameters to the function.
public class Recursive1 {
	public static int getSmallest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[0];  
		}  
		public static void main(String args[]){  
		int a[]={5,7,9,1,4,6};  
		int b[]={33,99,11,45,18,25,93};  
		System.out.println("Smallest: "+getSmallest(a,6));  
		System.out.println("Smallest: "+getSmallest(b,7));  
		}}  

