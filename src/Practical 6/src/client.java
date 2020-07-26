class client {

    public static void main(String[] args) {
    	Object[] empArray = {new Employee("Alice", 2012, 7000), new CommissionEmployee("Amy", 2016, 5000, 3000, 0.1), new Clerk("John", 2017, 6000, 2000, 2, 0.05)};
    	printElements(empArray);
    }
    
    private static void printElements(Object[] empArray){
    	System.out.println(empArray[1]);
    }
    
}