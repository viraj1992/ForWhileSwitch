package com.viraj.ForWhileSwitch;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for loop
		
		System.out.println("--------- for loop -------------");
		for(int i = 0; i <= 10; i++){
			System.out.println(i);
		}
		
		System.out.println("\n------- while loop -----------");
		
		// While loop
		int i = 0;		
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("\nThe value of i after while loop is executed : " + i);
		
		System.out.println("\n------- do while loop --------");
		
		int y = 40;
		
		do {
			System.out.println(y);
			y++;
		} while (y <= 15);
		
		System.out.println("\nThe value of y after do while loop is executed : " + y);
		
		System.out.println("\n------- switch statement --------");
	
		
	}

}
