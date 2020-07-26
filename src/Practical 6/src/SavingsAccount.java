class SavingsAccount extends Account{
    private double interestRate = 0.3;
    
    public SavingsAccount(String accNo, double balance) {
    	super(accNo, balance);
    	dateCreated = new Date();
    }
    
    public void calculateInterest(){
    	double interest = balance * interestRate;
    	balance += interest;
    }
    
    public String toString(){
    	return "Balance = RM " + balance;
    }
}