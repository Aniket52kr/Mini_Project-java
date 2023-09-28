package oopmproject;

import java.util.Scanner;

public class bankingapplication {

	public static void main(String[] args) {
		
		Bankaccount obj= new Bankaccount("Aniket Bawankar","40906535984");
		obj.showmenu();
	
    }
}

class Bankaccount{

	float Balance;
	float previousTransaction;
	String customerName;
	String customerId;
	
	
	Bankaccount(String cname,String cid){
		customerName = cname;
		customerId = cid;
		
	}
	
	void deposit(float amount) {
		if(amount != 0) {
			Balance = Balance + amount;
			previousTransaction = amount;
		}
	}
	
	void withdraw(float amount) {
		if(amount !=0) {
			Balance = Balance - amount;
			previousTransaction = -amount;
	   	
		}
	}
	
	void getpreviousTransaction() {
		if(previousTransaction > 0) {
			System.out.println("Deposited:" + previousTransaction);
		}
		else if(previousTransaction < 0) {
			System.out.println("Withdraw:" +Math.abs(previousTransaction));		
		}
		else {
			System.out.println("No Transaction Occured");	
		}
		
	}
	
	
	void showmenu() {
		char option ='\0';
		Scanner Scanner=new Scanner(System.in);
		
		System.out.println("=====================================================================");
		int pwd;
		System.out.println("enter password: ");
		Scanner obj=new Scanner(System.in);
		pwd=obj.nextInt();
		if(pwd==928470) {
		
		System.out.println("Welcome: " +customerName);
		System.out.println("Your ID : " +customerId);
		System.out.println("\n");
		
		System.out.println("A: Cheak your Balance ");
		System.out.println("B: Deposited");
		System.out.println("C: Withdraw");
		System.out.println("D: previousTransaction");
		System.out.println("E: Exit the System");
		
		
			
		
			
		do {
			System.out.println("===========================================================================================");
			System.out.println("Enter your Option");
			System.out.println("===========================================================================================");
			
			option = Scanner.next().charAt(0);
			System.out.println("\n");
			
			switch(option) {
			
			case'A':
			    System.out.println("---------------------------------------------------------------------------------------");
			    System.out.println("Balance = " +Balance);
			    System.out.println("-----------------------------------------------------------------");
		     	System.out.println("\n");
		    	break;
			
			
			case'B':
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Enter an amount to deposited");
				System.out.println("-----------------------------------------------------------------");
				
				int amount = Scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
				
			case'C':
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Enter an amount to withdraw");
				System.out.println("-----------------------------------------------------------------");
				
				int amount2 = Scanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
				
				
			case'D':
				System.out.println("----------------------------------------------------------------");
				getpreviousTransaction();
				System.out.println("----------------------------------------------------------------");				
				System.out.println("\n");
				break;
				
				
		    case'E':
		    	System.out.println("================================================================");
		    	break;
		    	
		    	
		    default:
		    	System.out.println("Invalid option!! please Enter correct option....");
		    	break;
		    	
			}
			
		}
		while(option!='E'); 
			System.out.println("Thank You For Using Our Services.....!!!");
		
	}
		
		
	else {
		
		System.out.println("Invalid password");
	}
		
  }
	
}

	
