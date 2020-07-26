class Student{
	public static void main(String[] args){
		Students stud2 = new Students("02", "John");
		
		stud2.addQuiz(8);
		stud2.addQuiz(7);
		stud2.addQuiz(9);
		
		System.out.print("Name: ");
		System.out.println(stud2.getName());
		
		System.out.print("Total Score: ");
		System.out.println(stud2.getTotalScore());
		
		System.out.print("Average: ");
		System.out.println(stud2.getAverageScore());
			
		System.out.print("Total marks obtained from quiz: ");
		System.out.println(stud2.getAverageScore()/10 * stud2.getContributionMarks());	
	}
}