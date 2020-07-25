//#include <stdio.h>
//#include <stdlib.h>
//#pragma warning (disable:4996)
//
//int main()
//{
//	char vehicleCode;
//	int numberofHours;
//	float total,parkingRate;
//
//	printf("Vehicle code (C,B,T)   : ");
//	scanf("%c", &vehicleCode);
//	printf("Number of hours parked : ");
//	scanf("%d", &numberofHours);
//
//	switch (vehicleCode) {
//	case 'C':
//		printf("     Parking Ticket\n"
//			"     ==============\n"
//			"Vehicle Type            :%8s\n", "Car");
//		parkingRate = 1.00;
//		total = (float)numberofHours * parkingRate;
//		break;
//	case 'B':
//		printf("     Parking Ticket\n"
//			"     ==============\n"
//			"Vehicle Type            :%8s\n", "Bus");
//		parkingRate = 2.00;
//		total = (float)numberofHours * parkingRate;
//		break;
//	case 'T':
//		printf("     Parking Ticket\n"
//			"     ==============\n"
//			"Vehicle Type            :%8s\n", "Truck");
//		parkingRate = 3.00;
//		total = (float)numberofHours * parkingRate;
//		break;
//	default:
//		total = (float)numberofHours * 0.00;
//		break;
//	}
//
//	printf("Hours Parked            :%8d\n", numberofHours);
//	printf("Parking Rate / Hr       :$ %6.2f\n", parkingRate);
//	printf("Amount to Pay           :$ %6.2f\n", total);
//
//	system("pause");
//}