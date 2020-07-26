class P4Q4{
	public static void main(String[] args){
		Course course1 = new Course("Introduction to Computers", 250.00);
		//Course stud2 = new Course("Introduction to Computers", 250.00);
		//Course stud3 = new Course("Introduction to Computers", 250.00);
		
		course1.addStudent("Ali Said");
		course1.addStudent("Wong Ken");
		course1.addStudent("Peter Lim");

		System.out.println(course1.toString());
	}
}