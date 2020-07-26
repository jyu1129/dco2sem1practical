public class test {

    public static void main (String[] args) {
    	CurrentAccount acc1 = new CurrentAccount("1001", 90.00, 0.00, 0);
    	SavingsAccount acc11 = new SavingsAccount("1003",100.00);
    	SavingsAccount acc2 = new SavingsAccount("1002", 100.00);
    	
    	if(acc1.equals(acc11)){
    		System.out.println("Equal");
    	}else{
    		System.out.println("Not Equal");
    	}
    }
    
    
}