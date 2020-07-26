class Car {
	private String plateNum;
	private String color;
	private int year;
	private CarType CarType;
	public Car(String plateNum, String color, int year, CarType CarType){
		this.plateNum = plateNum;
		this.color = color;
		this.year = year;
		this.CarType = CarType;
	}
	public String toString(){
		return "\nPlate Number: " + this.plateNum + "\nColor: " + this.color + "\nYear Manufactured: " + this.year + this.CarType.toString();
	}
}
