package com.bridgelabz.Stock;

import java.util.Scanner;

public class Account {
	
	private double balance = 5000;
	private int password;
	
	public void debitMoney(double money) {
		System.out.println("Enter Password : ");
		Scanner input = new Scanner(System.in);
		password = input.nextInt();
		if(password == 123) {
			balance = balance + money;
			System.out.println("Deposite Money : "+money);
			System.out.println("Total Balance : "+balance);
		}
		else
			System.out.println("Incorrect Password");
	}
	
	public void withdrowMoney(double money) {
		System.out.println("Enter Password : ");
		Scanner input = new Scanner(System.in);
		password = input.nextInt();
		if(password == 123) {
			balance = balance - money;
			System.out.println("Deposite Money : "+money);
			System.out.println("Total Balance : "+balance);
		}
		else
			System.out.println("Incorrect Password");
	}
	
	public void checkBalance() {
		System.out.println("Enter Password : ");
		Scanner input = new Scanner(System.in);
		password = input.nextInt();
		if(password == 123) 
			System.out.println("Total Balance : "+balance);
		else
			System.out.println("Incorrect password");
		
	}
	public static void main(String[] args) {
		
		Account bank = new Account();
		
		System.out.println("1. Debit");
		System.out.println("2. Withdrow");
		System.out.println("3. Check Balance");
		
		System.out.println("Enter your choice");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		switch(choice) {
		case 1 : 
				bank.debitMoney(1000);
				break;
		case 2 : 
				bank.withdrowMoney(1000);
				break;		
		case 3 : 
				bank.checkBalance();
				break;
		default :
				System.out.println("Invalid Choice");
		}

	}

}
