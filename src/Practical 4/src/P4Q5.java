import java.util.Scanner;
class P4Q5 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		Owner cust1 = new Owner("John Wayne","001129141221");
		Owner cust2 = new Owner("Lol haha","001129141222");
		
		CarType carType1 = new CarType("Toyota","Vios",1.5);
		CarType carType2 = new CarType("Ferrari","LeFerrari",5.0);
		
		Car vios = new Car("ABC123","Blue",2010,carType1);
		Car leFerrari = new Car("WWW6666","Red",2017,carType2);
		
		Registration id1 = new Registration(cust1,vios);
		Registration id2 = new Registration(cust2,leFerrari);
		
		System.out.println(id1.toString() + "\n\n" + id2.toString());
	}
}
