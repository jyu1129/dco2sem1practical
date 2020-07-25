//////#include <stdio.h>
//////#include <stdlib.h>
//////#pragma warning (disable:4996)
//////
//////int main()
//////{
//////	int enrolData[4][5] = { {50,80,100,60,35},{60,120,90,70,50},{70,100,110,60,60},{60,85,80,75,55} };
//////	int totalCampus[1][5] = { 0 };
//////	int totalProgramme[4][1] = { 0 };
//////	int row, column;
//////	char alp = 65;
//////
//////	for (column = 0; column < 5; column++) {
//////		for (row = 0; row < 4; row++) {
//////			totalCampus[0][column] += enrolData[row][column];
//////		}
//////		printf("Total students in Campus %c: %d\n", alp, totalCampus[0][column]);
//////		alp++;
//////	}
//////
//////	system("pause");
//////}
////
////
////#include <stdio.h>
////#include <stdlib.h>
////#pragma warning (disable:4996)
////
////int main()
////{
////	int enrolData[4][5] = { {50,80,100,60,35},{60,120,90,70,50},{70,100,110,60,60},{60,85,80,75,55} };
////	int totalCampus[1][5] = { 0 };
////	int totalProgramme[4][1] = { 0 };
////	int row, column;
////
////
////	for (row = 0; row < 4; row++) {
////		for (column = 0; column < 5; column++) {
////			totalProgramme[row][0] += enrolData[row][column];
////		}
////		printf("Total students in Programme %d: %d\n", row + 1, totalProgramme[row][0]);
////	}
////
////	system("pause");
////}
//
//#include <stdio.h>
//#include <stdlib.h>
//#pragma warning (disable:4996)
//
//int main()
//{
//	int enrolData[4][5] = { {50,80,100,60,35},{60,120,90,70,50},{70,100,110,60,60},{60,85,80,75,55} };
//	int grandTotal = 0;
//	int row, column;
//
//
//	for (row = 0; row < 4; row++) {
//		for (column = 0; column < 5; column++) {
//			grandTotal += enrolData[row][column];
//		}
//	}
//
//	printf("Grand Total(Total Students in the university): %d\n", grandTotal);
//
//	system("pause");
//}
