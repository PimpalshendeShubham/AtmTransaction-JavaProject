package javaatmproject;

import java.util.HashMap;
import java.util.Map;

public class AtmServices implements AtmServicesInterface {

	AtmFunctions atmFunctions = new AtmFunctions();
	Map<Double, String> miniStatement = new HashMap<>();

	@Override
	public void viewBalance() {
		System.out.println("Available Balance is : " + atmFunctions.getBalance());

	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if (withdrawAmount % 100 == 0) {
			if (withdrawAmount <= atmFunctions.getBalance()) {
				miniStatement.put(withdrawAmount, " Amount Withdrawn");
				System.out.println("Collect the Cash " + withdrawAmount);
				atmFunctions.setBalance(atmFunctions.getBalance() - withdrawAmount);
				viewBalance();
			} else {
				System.out.println("Insufficient Balance !!");
				System.out.println("You can only Withdraw upto : " + atmFunctions.getBalance());
			}
		} else {
			System.out.println("Please enter the amount in multiple of 100");
		}

	}

	@Override
	public void depositAmount(double depositAmount) {
		miniStatement.put(depositAmount, " Amount Deposited");
		System.out.println(depositAmount + " Deposited Successfully !!");
		atmFunctions.setBalance(atmFunctions.getBalance() + depositAmount);
		viewBalance();

	}

	@Override
	public void viewMiniStatement() {
		for (Map.Entry<Double, String> map : miniStatement.entrySet()) {
			System.out.println(map.getKey() + "" + map.getValue());
		}

	}

}
