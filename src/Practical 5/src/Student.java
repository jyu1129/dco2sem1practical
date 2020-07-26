
public class Student {
	private String studentID;
	private String name;
	private String school;
	
	public Student(String studentID, String name, String school){
		this.studentID = studentID;
		this.name = name;
		this.school = school;
	}
	
	public boolean validateStudentID(){
		boolean iDFormat = false;
		boolean iDCode = false;
		String regex = "\\d+";
		if(Character.isLetter(studentID.charAt(0)) && studentID.substring(1,5).matches(regex)){
			iDFormat = true;
		}
		
		if(school.equals("FASC")){
			if(studentID.charAt(0) == 'A'){
				iDCode = true;
			}
		}else if(school.equals("FAFB")){
			if(studentID.charAt(0) == 'B'){
				iDCode = true;
			}
		}else{
			iDCode = false;
		}
		
		return iDFormat && iDCode;
	}    
}