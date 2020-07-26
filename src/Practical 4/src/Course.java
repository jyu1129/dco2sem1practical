public class Course {
	private String courseTitle;
	private double feesPerStudent;
	private int noOfStudents;
	private String[] studentNames = new String[100];
	private static int courseCount;
	
	public Course(String courseTitle, double feesPerStudent){
		this.courseTitle = courseTitle;
		this.feesPerStudent = feesPerStudent;
		courseCount++;
	}
	public void setCourseTitle(String courseTitle){
		this.courseTitle = courseTitle;
	}
	public void setFeesPerStudent(double feesPerStudent){
		this.feesPerStudent = feesPerStudent;
	}
	public void setNoOfStudents(int noOfStudents){
		this.noOfStudents = noOfStudents;
	}
	public void setStudentNames(String studName){
		studentNames[this.noOfStudents] = studName;
	}
	public void setCourseCount(int noOfCourse){
		courseCount = noOfCourse;
	}
	public String getCourseTitle(){
		return this.courseTitle;
	}
	public double getFeesPerStudent(){
		return this.feesPerStudent;
	}
	public int getNoOfStudents(){
		return this.noOfStudents;
	}
	public String[] getStudentNames(){
		return this.studentNames;
	}
	public static int getCourseCount(){
		return courseCount;
	}
	public double calcFeesCollected(){
		return feesPerStudent * noOfStudents;
	}
	public void addStudent(String studName){
		//setStudentNames(studName);
		studentNames[this.noOfStudents] = studName;
		noOfStudents++;
	}
	public String toString(){
		return ("Course Title: " + this.courseTitle + "\nFees Per Student: " + this.feesPerStudent + "\nNumber of Students: " + this.noOfStudents + "\nTotal number of course offered: " + courseCount + "\nFees Collected: " + calcFeesCollected());
	}
}
