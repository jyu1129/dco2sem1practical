class CurrentAccount extends Account{
    private double transAmount;
    private int transactionCount;
    private static int freeTransactionCount = 3;
    
    public CurrentAccount(String accNo, double balance, double transAmount, int transactionCount) {    	
    	super(accNo, balance);
    	dateCreated = new Date();
    	this.transAmount = transAmount;
    	this.transactionCount = transactionCount;
    	
    }   
    	
    public void calculateTransAmount(double transAmount){
    	if(transactionCount > freeTransactionCount){
    		transAmount = transAmount * 0.1;
    		balance -= transAmount;
    		transactionCount++;
    	}
    }
    	
	public String toString(){
    	return "Balance = RM " + balance +
    		   "\nTransaction fee = RM " + transAmount;
    }
}