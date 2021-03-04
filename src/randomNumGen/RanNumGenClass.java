package randomNumGen;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RanNumGenClass {

	public static void main(String[] args) {

		// creating Random object
		Random rand = new Random();

		// creating ArrayofSize 500
		int[] RanNumArray = new int[500];

		for (int i = 0; i < RanNumArray.length; i++) {

			// storing random integers (from 0 to 1000) in an array using their indexes
			RanNumArray[i] = rand.nextInt(999);

			// printing each array element horizontally
			System.out.print(RanNumArray[i] + "," + " ");

		}
		// Using the sort function to rearrange the array's member into ascending
		// order
		Arrays.sort(RanNumArray);

		// int FirstNumber = RanNumArray[0];
		// int LastNumber = RanNumArray[499];

		// LineSeparator
		System.out.print(System.lineSeparator());

		// smallest number will be RanNumArray[0] since array is sorted into ascending
		// order
		System.out.println("smallest random number is ::" + RanNumArray[0]);

		// largest number will be RanNumArray[499] since array is sorted into ascending
		// order
		System.out.println("largest random number is ::" + RanNumArray[499]);

		// System.out.println("largest number is ::"+ RanNumArray[499] );

		Scanner userinput = new Scanner(System.in);

		System.out.println("Please enter the smallest number given: ");
		int smallestNum = userinput.nextInt();
		System.out.println("Smallest number is:" + smallestNum);
		
		//If and Else statements for verification purposes
		if (RanNumArray[0] == smallestNum) {
			System.out.println("Correct input!!");

		}

		else {
			System.out.println("Incorrect input!!");
		}

	}
}
