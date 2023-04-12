package javaatmproject;

import java.util.Scanner;

public class AtmOptionMenu {
	final static int ATM_PIN = 9595;

	AtmServicesInterface op = new AtmServices();

	public void displayServices()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("**********Welcome to ATM Machine!!************\n");

		System.out.print("Enter your 4 digit Pin: ");
		int pin = in.nextInt();
		if ((ATM_PIN == pin)) 
		{
			while (true) {
				System.out.println(
						"1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
				System.out.println("Enter Choice : ");
				int choice = in.nextInt();
				switch(choice)
				{
				case 1:
					op.viewBalance();
					break;
				case 2:
					System.out.println("Enter Amount to Withdraw : ");
					double withdrawAmount = in.nextDouble();
					op.withdrawAmount(withdrawAmount);
					break;
				case 3:
					System.out.println("Enter Amount to Deposit :");
					double depositAmount = in.nextDouble();
					op.depositAmount(depositAmount);
					break;
				case 4:
					op.viewMiniStatement();
					break;
				case 5:
					System.out.println("Collect your ATM Card\nThank you for using ATM Machine!!");
					System.exit(0);
					break;
				default:
					System.out.println("Please enter correct choice");

				}
				
			}
		}
					
		else {
			System.out.println("Incorrect Atm PIN");
			System.exit(0);
			}

	}
}
