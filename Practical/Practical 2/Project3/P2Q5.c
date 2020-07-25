//#include <stdio.h>
//#include <stdlib.h>
//#pragma warning (disable:4996)
//#define MAXIMUM_LOAN_PERIOD 14
//#define FINE_RATE 0.20
//
//void main(void)
//{
//	//declare variables
//	double amountFined;
//	int numberOfBooks, daysBorrowed, daysOverdue;
//
//	//input
//	printf("----------------\n");
//	printf("BOOK LOAN SYSTEM\n");
//	printf("----------------\n");
//	printf("Enter the number of books   : ");
//	scanf("%d", &numberOfBooks);
//	printf("Enter the days of the loan  : ");
//	scanf("%d", &daysBorrowed);
//	printf("-------------------------------\n");
//
//	//Process
//	daysOverdue = daysBorrowed - MAXIMUM_LOAN_PERIOD;
//	amountFined = daysOverdue * FINE_RATE * numberOfBooks;
//
//	//Output
//	printf("Days overdue                : %d\n", daysOverdue);
//	printf("Fine                        : %.2f\n", amountFined);
//
//	system("pause");
//}