//#include <stdio.h>
//#include <stdlib.h>
//#pragma warning (disable:4996)
//
//int main()
//{
//	int monthlySales;
//	float basicPay;
//	float commissionRate;
//	float income;
//
//	printf("Please enter the monthly sales.");
//	scanf("%d", &monthlySales);
//
//	if (monthlySales >= 50000) {
//		basicPay = 375.00;
//		commissionRate = 0.16;
//		income = basicPay + commissionRate * (float)monthlySales;
//		printf("Income = RM%.2f", income);
//	}
//	else if (monthlySales >= 40000) {
//		basicPay = 350.00;
//		commissionRate = 0.14;
//		income = basicPay + commissionRate * (float)monthlySales;
//		printf("Income = RM%.2f", income);
//	}
//	else if (monthlySales >= 30000) {
//		basicPay = 325.00;
//		commissionRate = 0.12;
//		income = basicPay + commissionRate * (float)monthlySales;
//		printf("Income = RM%.2f", income);
//	}
//	else if (monthlySales >= 20000) {
//		basicPay = 300.00;
//		commissionRate = 0.09;
//		income = basicPay + commissionRate * (float)monthlySales;
//		printf("Income = RM%.2f", income);
//	}
//	else if (monthlySales >= 10000) {
//		basicPay = 250.00;
//		commissionRate = 0.05;
//		income = basicPay + commissionRate * (float)monthlySales;
//		printf("Income = RM%.2f", income);
//	}
//	else{
//		basicPay = 200.00;
//		commissionRate = 0.03;
//		income = basicPay + commissionRate * (float)monthlySales;
//		printf("Income = RM%.2f", income);
//	}
//	
//	system("pause");
//}