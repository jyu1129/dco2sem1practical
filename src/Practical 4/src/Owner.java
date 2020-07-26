
class Owner {
	private String name;
	private String icNum;
	public Owner(String name, String icNum){
		this.name = name;
		this.icNum = icNum;
	}
	public String getName(){
		return this.name;
	}
	public String getIcNum(){
		return this.icNum;
	}
	public String toString(){
		return "\nName: " + this.name + "\nIC Number: " + this.icNum;
	}
}
