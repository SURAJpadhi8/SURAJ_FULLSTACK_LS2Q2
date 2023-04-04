package com.greatlearning.driver;
import java.util.Scanner;

import com.greatlearning.mergesort.MergeSort;
import com.greatlearning.notecount.NoteCount;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Currency Denomination :-");
		int size=sc.nextInt();


		int currency[]=new int[size];

		System.out.println("Enter the Denominations Value :-");		
		for(int i=0;i<size;i++)
			currency[i]=sc.nextInt();

	//	System.out.println("Before Sorting "+ Arrays.toString(currency));
		MergeSort ms=new MergeSort();
		ms.sort(currency, 0, size-1);
	//	System.out.println("After Sorting "+ Arrays.toString(currency));

		System.out.println("Enter the Amount You Want to Pay :-");
		int amount=sc.nextInt();
		System.out.println("Your Payent Approch in Order to give Minimum Number of Notes will Be  :-");
		NoteCount nc=new NoteCount();
		nc.counting(currency,amount);
		
		sc.close();

	}
}