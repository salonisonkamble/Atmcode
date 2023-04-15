package demo;
import java.util.Scanner;
public class Atmcode {

public static void main(String[] args) {
float balance=0, deposite , withdraw;
		while (true) {
			System.out.println("****Welcome to the ATM****" );
			System.out.println("choose 1 to withdraw");
			System.out.println("choose 2 to deposite");
			System.out.println("choose 3 to balance Inquiry");
			System.out.println("choose 4 to Exit");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
			System.out.println("Enter the amount of withdraw");
			withdraw=sc.nextFloat();
			
			if(balance>=withdraw) {
				balance=balance-withdraw;
				System.out.println("Kindly collect your amount");
			}
			else {
				System.out.println("Insufficient balance");
			}
			break;
			case 2:
				System.out.println("Enter Amount to be deposited");
				deposite =sc.nextFloat();
				balance=balance + deposite;
				System.out.println("Your amount is deposited");
				break;
			case 3:
				System.out.println("Current balance"+balance);
				break;
			case 4:
				System.out.println("exit");
				break;
			case 5:
				System.out.println("Please insert card properly");
				break;
			
			}
			
		}
			}

		}


	


