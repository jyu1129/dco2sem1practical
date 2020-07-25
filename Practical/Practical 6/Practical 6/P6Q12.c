//#include <stdio.h>
//#include <stdlib.h>
//#pragma warning (disable:4996)
//
//int main()
//{
//	char vehicleCode;
//	int numberofHours;
//	float total;
//
//	printf("Please enter the vehicle code.");
//	scanf("%c", &vehicleCode);
//	printf("Please enter the number of hours of car parked.");
//	scanf("%d", &numberofHours);
//	
//	switch (vehicleCode) {
//	case 'c':
//		total = (float)numberofHours * 1.00;
//		break;
//	case 'b':
//		total = (float)numberofHours * 2.00;
//		break;
//	case 't':
//		total = (float)numberofHours * 3.00;
//		break;
//	default:
//		total = (float)numberofHours * 0.00;
//		break;
//	}
//
//
//	printf("Vehicle code   Vehicle type   Parking Rate\n"
//		"      C             Car       $1.00 per hour\n"
//		"      B             Bus       $2.00 per hour\n"
//		"      T             Truck     $3.00 per hour\n"
//		"\n Your parking charge is RM%.2f.\n", total);
//
//	system("pause");
//}