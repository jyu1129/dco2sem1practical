
class Registration {
	private long regNumber;
	private Owner Owner;
	private Car Car;
	private static long nextRegNum = 1000;
	public Registration(Owner Owner, Car Car){
		this.regNumber = ++nextRegNum;
		this.Owner = Owner;
		this.Car = Car;
	}
	public void getNextRegNum(long nextRegNumber){
		nextRegNumber = ++regNumber;
	}
	public String toString(){
		return "Registration number: " + this.regNumber + this.Owner.toString() + this.Car.toString(); 
	} 
}
