class q3client {

    public static void main(String[] args) {
    	q3Employee[] empArray = {new q3Employee("Alice", 2012, 7000), new q3CommissionEmployee("Amy", 2016, 5000, 3000, 0.1), new q3Clerk("Amy", 2017, 6000, 2000, 2, 0.05)};
    	printElements(empArray);
    	
    	if(empArray[1].equals(empArray[2])){
    		System.out.println("\n\n\n\nEqual");
    	}else{
    		System.out.println("\n\n\n\nNot Equal");
    	}
    }
    
    private static void printElements(Object[] empArray){
    	System.out.println(empArray[1]);
    }
    
}