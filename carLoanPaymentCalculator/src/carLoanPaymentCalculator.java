
    /*A program that calculates a monthly payments for a car loan 
-The program checks first if the Loan length or car loan not equall to null */

public class carLoanPaymentCalculator {
	public static void main(String[] args) {

	int carLoan = 10000;
  int loanLength = 3; //in years
  int interestRate = 5;
  int downPayment = 2000;

  if(loanLength <=0 || carLoan <= 0){
    System.out.println("Error! You must take out a valid car loan.");
  } else if(downPayment >= carLoan){
    System.out.println("The car can be paid in full.");
  }else{
    int remainingBalance = carLoan - downPayment;
    int months = loanLength*12;
    int monthlyBalance = remainingBalance/months;
    int interest = (monthlyBalance*interestRate)/100;
    int monthlyPayment = monthlyBalance + interest;
    
    System.out.println(monthlyPayment);

  }

	}
}
    

