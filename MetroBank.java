class Tester {
	public static void main(String[] args) {
		int accountNumber = 1251;
		long salary = 85000;
		long accountBalance = 250000;
		String loanType = "Business";
		long loanAmountExpected = 7000000;
		int emiExpected = 70;
		boolean valid = false;
		boolean valid2 = false;
		int count = 0;
		while(accountNumber>0){
		    accountNumber = accountNumber/10;
		    count++;
		}
		if(count == 4){
		    valid = true;
		    System.out.println("Valid AccountNumber");
		}
		else{
		    valid = false;
		    System.out.println("Invalid AccountNumber");
		}
		if(accountBalance > 1000){
		    valid2 = true;
		    System.out.println("Valid AccountBalance");
		}
		else{
		       valid2 = false;
		    System.out.println("Invalid AccountBalance");
		}
		
if(valid == true && valid2 == true){
    if(loanType == "Car"){
        long eligibleLoanAmount = 500000;
        int eligibleEmis = 36;
        if(salary > 25000 && loanAmountExpected < eligibleLoanAmount && emiExpected < eligibleEmis){
            System.out.println("Eligible Loan Amount " + eligibleLoanAmount + ", Eligible EMIs " + eligibleEmis);
        }
        else{
            System.out.println("The Given detail of bank account does not fall into eligibility criteria for Car Loan ");
        }
    }
    
    else if(loanType == "House"){
        long eligibleLoanAmount = 6000000;
        int eligibleEmis = 60;
        if(salary > 50000 && loanAmountExpected < eligibleLoanAmount && emiExpected < eligibleEmis){
            System.out.println("Eligible Loan Amount " + eligibleLoanAmount + ", Eligible EMIs " + eligibleEmis);
        }
        else{
            System.out.println("The Given detail of bank account does not fall into eligibility criteria for House Loan ");
        }
    }
    
    else if(loanType == "Business"){
        long eligibleLoanAmount = 7500000;
        int eligibleEmis = 84;
        if(salary > 75000 && loanAmountExpected < eligibleLoanAmount && emiExpected < eligibleEmis){
            System.out.println("Eligible Loan Amount " + eligibleLoanAmount + ", Eligible EMIs " + eligibleEmis);
        }
        else{
            System.out.println("The Given detail of bank account does not fall into eligibility criteria for Business Loan ");
        }
    }
}
else{
    System.out.println("There is an Error in Account No. or in Account Balance");
}	
		
		
	}
}

