//#include <stdio.h>
//#include <stdlib.h>
//#pragma warning (disable:4996)
//
//int main()
//{
//	int month;
//	int year;
//	int leapYear;
//
//	printf("Please enter the year.");
//	scanf("%d", &year);
//
//	printf("Please input month based on an integer.(1-12)");
//	scanf("%d", &month);
//
//	leapYear = year / 4;
//
//	if (leapYear != 0) {
//		printf("In a leap year, ");
//		switch (month) {
//		case 1:
//			printf("January has 31 days.\n");
//			break;
//		case 2:
//			printf("February has 29 days.\n");
//			break;
//		case 3:
//			printf("March has 31 days.\n");
//			break;
//		case 4:
//			printf("April has 30 days.\n");
//			break;
//		case 5:
//			printf("May has 31 days.\n");
//			break;
//		case 6:
//			printf("June has 30 days.\n");
//			break;
//		case 7:
//			printf("July has 31 days.\n");
//			break;
//		case 8:
//			printf("August has 31 days.\n");
//			break;
//		case 9:
//			printf("September has 30 days.\n");
//			break;
//		case 10:
//			printf("October has 31 days.\n");
//			break;
//		case 11:
//			printf("November has 30 days.\n");
//			break;
//		case 12:
//			printf("December has 31 days.\n");
//			break;
//		default:
//			printf("No Such Month!!");
//		}
//	}
//	system("pause");
//}