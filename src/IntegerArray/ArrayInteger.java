package IntegerArray;
/**
 * Write a program in Java to create an integer array of 10 elements and copy the
 * values from first array into the second integer array of size 9. 
 * If exception occurs while copying, then handle then exception and print the exception message.
 * @author Hp
 *
 */

public class ArrayInteger { //Creates an array class 

		public static void main(String[] args) { //main class
			
			try {  // try block to check the exception 
				
				int a[] = {0,1,2,3,4,5,6,7,8,9,10}; //Declaring two array a & b of length 10 & 9 respectively
				
				int b[] = new int[9]; //array b can take elements up to 9 elements
	                                                  
				System.out.println( "Elements copied in Array b[] are");
				for (int i = 0; i < a.length; i++) { 	//Applying the for loop for copying all elements of array
					
					b[i] = a[i];   //coping the element 
	
					
					System.out.println(+b[i]); //Printing the copied array
				}
			} 
			
			catch (ArrayIndexOutOfBoundsException aioobe) { //Applying catch block to catch the exception
				
				System.err.println("Error occured"); //Error Message
			}
		}

	}


