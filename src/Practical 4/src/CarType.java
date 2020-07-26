public class CarType{
	private String make;
	private String model;
	private double engineCap;
	public CarType(String make, String model, double engineCap){
		this.make = make;
		this.model = model;
		this.engineCap = engineCap;
	} 
	public String toString(){
		return "\nCar make: " + this.make + "\nModel: " + this.model + "\nEngine Capacity: " + this.engineCap;
	}	
}