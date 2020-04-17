package project4;

import java.util.Scanner;

public class StrictlyIdentical {
	
	public static void main(String[] args) {
		
		/*====================SAMPLE TEST RUN=======================
		int[] list1 = {1,2,3,4,5};
		int[] list2 = {1,2,3,4,5};
		
		boolean equal = equals(list1,list2);
		
		if(equal)
		{
			System.out.println("Two lists are strictly identical");
		} else {
			System.out.println("Two lists are not strictly identical");
		}
		*/

		int[] list1 = new int[5]; // defining first array for first list
		int[] list2 = new int[5]; // defining second array for second list
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 5 elements of list 1: ");
		
		for(int i = 0; i < 5; i++) // loop to populate first list with user input
		{
			list1[i] = input.nextInt();
		}
		
		System.out.println("Enter 5 elements of list 2: ");
		
		for(int i = 0; i < 5; i++) // loop to populate second list with user input
		{
			list2[i] = input.nextInt();
		}
		
		boolean equal = equals(list1,list2); // calls method equals and assigns returned value to the boolean equal
		
		if(equal) // if equals returns true
		{
			System.out.println("Two lists are strictly identical");
		} else { // if equals returns false
			System.out.println("Two lists are not strictly identical");
		}
		
		input.close();
	}

	//equals method
	public static boolean equals(int[] array1, int[] array2) {
	
		boolean boolValue = true; // assigns true to boolValue 
	
		for(int i = 0; i < 5; i++) // loop to compare the two lists in each element
			{
				if(array1[i] != array2[i]) // if the two lists are not equal at element i
				{
					boolValue = false; // assigns false to boolValue if lists are not equal
				}
			}
		return boolValue;
	}

}