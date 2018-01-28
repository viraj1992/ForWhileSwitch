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

		String nameString = "Animal Name";

		switch(nameString) {
		case "Animal Name" : 
			System.out.println("Animal Name");
			break;

		case "Animal Cat" :
			System.out.println("Animal Cat");
			break;

		case "Animal Dog" :
			System.out.println("Animal Dog");
			break;

		case "Animal Elephant" :
			System.out.println("Animal Elephant");
			break;

		default :
			System.out.println("No animal!!!");
			break;

		}

		System.out.println("------------ break statement----------");
		// break statement

		for(int x = 0; x < 30; x++) {
			if(x == 10){
				break;
			}
			System.out.println(x);
		}
		
		System.out.println("------------ continue statement----------");
		// continue statement

		for(int x = 0; x < 30; x++) {
			if(x == 5){
				continue;
			}
			System.out.println(x);
		}
		
		
		
		
		

	}

}
