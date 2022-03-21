package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

			double amountTendered = 0;
			double price = 0;

			int penny = 0;
			int nickel = 0;
			int dime = 0;
			int quarter = 0;

			int one = 0;
			int five = 0;
			int ten = 0;
			int twenty = 0;

			//User Story #1
			// The user is prompted asking for the price of the item.
			Scanner kb = new Scanner(System.in);
			System.out.println("Item Price: ");
			price = kb.nextDouble();
			//User Story #2
			//The user is then prompted asking how much 
			//money was tendered by the customer.
			System.out.println("Amount Tendered: ");
			amountTendered = kb.nextDouble();
			//User Story #3
			//Display an appropriate message if the customer 
			//provided too little money or the exact amount.
			if (amountTendered == price) {

				System.out.println("No Change");
			}

			boolean notEnough = amountTendered < price;

			if (notEnough) {
				System.out.println("Where's the rest of the money? ");
			}
			//User Story #4
			//If the amount tendered is more than the cost of the item, 
			//display the number of bills and coins that should be given to the customer.

			boolean toMuch = amountTendered > price;

			if (toMuch) {
				double change = amountTendered - price;
				System.out.println("Change: " + change);

				while (change >= 20) {
					change -= 20;
					twenty++;
				}
				while (change >= 10) {
					change -= 10;
					ten++;
				}
				while (change >= 5) {
					change -= 5;
					five++;
				}
				while (change >= 1) {
					change -= 1;
					one++;
				}
				while (change >= 0.25) {
					change -= 0.25;
					quarter++;
				}
				while (change >= 0.10) {
					change -= 0.10;
					dime++;
				}
				while (change >= 0.05) {
					change -= 0.05;
					nickel++;
				}
				if (change >= 0.01) {
					change += .005;     
					while (change >= 0.01) {
						change -= 0.01;
						penny++;
					}
				}
				if (twenty > 0) {
					System.out.println(twenty + " twenty dollar bills");
				}
				if (ten > 0) {
					System.out.println(ten + " ten dollar bills");
				}
				if (five > 0) {
					System.out.println(five + " five dollar bills");
				}
				if (one > 0) {
					System.out.println(one + " one dollar bills");
				}

				if (quarter > 0) {
					System.out.println(quarter + " quarters");
				}

				if (dime > 0) {
					System.out.println(dime + " dimes");
				}
				if (nickel > 0) {
					System.out.println(nickel + " nickels");
				}
				if (penny > 0) {
					System.out.println(penny + " pennies");
				}

			}

			kb.close();
		}

	}