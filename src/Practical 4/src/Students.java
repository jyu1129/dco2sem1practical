public class Students{
	private String id;
	private String name;
	private int noOfQuiz;
	private double totalQuizScore;
	private static double contribution;
	
	public Students(){
		this.id = "";
		this.name = "";
		this.noOfQuiz = 0;
		this.totalQuizScore = 0;
	}
	public Students(String id, String name){
		this.id = id;
		this.name = name;
		this.noOfQuiz = 0;
		this.totalQuizScore = 0;
	}	
	public Students(String id, String name, int noOfQuiz, int totalQuizScore){
		this.id = id;
		this.name = name;
		this.noOfQuiz = noOfQuiz;
		this.totalQuizScore = totalQuizScore;
	}	

	public String getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public int getNoOfQuiz(){
		return this.noOfQuiz;
	}	
	public double getTotalQuizScore(){
		return this.totalQuizScore;
	}			
	public void setId(String id){
		this.id = id;
	}	
	public void setName(String name){
		this.name = name;
	}
	
	public void addQuiz(int score){
		this.totalQuizScore += score;
		this.noOfQuiz ++;
	}
	
	public double getTotalScore(){
		return this.totalQuizScore;
	}
	
	public double getAverageScore(){
		return this.totalQuizScore/this.noOfQuiz;
	}
	
	public static double getContributionMarks(){
		return Students.contribution;
	}
	
	public static void setContributionMarks(double contribution){
		Students.contribution = contribution;
	}
}