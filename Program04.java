/*Hunter Patterson
 * COSC 1315.001
 * Purpose: To create a blank application (Program04)
 * 19April2021
 */



package blankApp;

import java.text.NumberFormat;
import java.util.Scanner;

public class Program04
{

	public static void main(String[] args)
	{

		
		//Create Scanner called scan
		Scanner scan = new Scanner(System.in);
		
		//Ask for current balance & transaction amount
		displayPrompt();
		double currentBalance = scan.nextDouble();
		double transactionAmount = scan.nextDouble();
		
		//Compute New Balance
		computeNewBalance(currentBalance, transactionAmount);
		double newBalance = computeNewBalance(currentBalance, transactionAmount);
		
		//Display Output
		displayOutput(currentBalance, transactionAmount, newBalance);
		scan.close();

	}//end main
	

	//a method to prompt the user named displayPrompt 
	public static void displayPrompt()
	{
		System.out.println("Please type current balance and press the enter key. Then type transaction"
				+ " ammount and press the enter key: ");
	}
	//a method to compute the new balance named computeNewBalance
	public static double computeNewBalance(double currentBalance,double transactionAmount)
	{
		double newBalance = currentBalance + transactionAmount;
		
		if (newBalance < 0)
		{
			//Overdraft Fee = $25
			newBalance = newBalance - 25;
		}
		return newBalance; 
	}	
	//a method to handle all of the output (except the prompt) named displayOutput 	
	public static void displayOutput(double currentBalance, double transactionAmount, double newBalance)
	{
		if (transactionAmount < 0)
		{		
			System.out.println("The transaction was a WITHDRAW.");
		}
		else 
		{
			System.out.println("The transaction was a DEPOSIT.");
		}
		if (newBalance < 0)
			System.out.println("An over draft fee was applied");
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		System.out.println("Your new balance is "+ nf.format(newBalance));
	}	
		
}


				