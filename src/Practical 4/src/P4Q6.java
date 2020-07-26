import java.util.*;

public class P4Q6 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		CakeType cakeFlavours[] = new CakeType[5];
		
		cakeFlavours[0] = new CakeType("Chocolate Moist", 40.00);
		cakeFlavours[1] = new CakeType("Strawberry", 50.00);
		cakeFlavours[2] = new CakeType("Blueberry", 45.00);
		cakeFlavours[3] = new CakeType("American Chocolate", 55.00);
		cakeFlavours[4] = new CakeType("Tiramisu", 30.00);
		
		System.out.println("Mickey Cake House");
		System.out.print("\n\nHow many type of cake you would like to order: ");
		int cakeQuantity = scanner.nextInt();
		
		String line = new String(new char[53]).replace('\0','-');
		
		System.out.printf("%-3s%-20s%-10s%-10s%-10s%n","No", "Flavours","1kg","2kg","3kg");

		System.out.println(line);
		for(int i = 0; i < cakeFlavours.length; i++){
			System.out.printf("%-3d%-20sRM%8.2fRM%8.2fRM%8.2f%n",i+1, 
																cakeFlavours[i].getFlavour(),
																cakeFlavours[i].getPrice(),
																(cakeFlavours[i].getPrice() * 2) - 5.00,
																(cakeFlavours[i].getPrice() * 3) - 15.00);
		}
		
		int flavour, weight, quantity;
		double[] subTotal = new double[cakeQuantity];
		double total = 0;
		CakeType orders[] = new CakeType[cakeQuantity]; 
		
		for(int i = 0; i < cakeQuantity; i++){
			System.out.println("\nCake item " + (i+1));
			System.out.println("-----------");
			System.out.print("Enter your choice of cake flavour (1 - 5): ");
			flavour = scanner.nextInt();
			orders[i] = cakeFlavours[flavour-1];
			
			System.out.print("Enter the weight of the cake (1 - 1kg, 2 - 2kg and 3 - 3kg): ");
			weight = scanner.nextInt();
			orders[i].setWeight(weight);
			
			System.out.print("Enter quantity ordered: ");
			quantity = scanner.nextInt();
			orders[i].setQuantityOrdered(quantity);
			
			subTotal[i] = orders[i].getPrice() * quantity;
			total += subTotal[i];
		}
		
		System.out.println("Order Details:");
		System.out.println("--------------");
		System.out.printf("%-3s %-20s\t%-10s\t%-15s\t%-10s\t%-20s%n","No", "Cake Flavour","Weight","Unit Price(RM)","Quantity","Total Price(RM)");
		System.out.printf("%-3s %-20s\t%-10s\t%-15s\t%-10s\t%-20s%n","--", "------------","------","--------------","--------","---------------");
		for(int i = 0;i < cakeQuantity; i++){
			System.out.printf("%-3d %-20s\t%-10s\t%-15.2f\t%-10d\t%-20.2f%n",i+1, 
																			orders[i].getFlavour(),
																			orders[i].getWeight() + "kg",
																			orders[i].getPrice(),
																			orders[i].getQuantityOrdered(),
																			subTotal[i]);
		}
		line = new String(new char[83]).replace('\0','-');
		System.out.println(line);
		System.out.printf("%83s","Grand Total: " + total);
    }
    
    
}