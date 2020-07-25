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
//	switch (monthlySales / 10000) {
//	case 5:
//				basicPay = 375.00;
//				commissionRate = 0.16;
//				income = basicPay + commissionRate * (float)monthlySales;
//				printf("Income = RM%.2f", income);
//				break;
//	case 4:
//				basicPay = 350.00;
//				commissionRate = 0.14;
//				income = basicPay + commissionRate * (float)monthlySales;
//				printf("Income = RM%.2f", income);
//				break;
//	case 3:
//				basicPay = 325.00;
//				commissionRate = 0.12;
//				income = basicPay + commissionRate * (float)monthlySales;
//				printf("Income = RM%.2f", income);
//				break;
//	case 2:
//				basicPay = 300.00;
//				commissionRate = 0.09;
//				income = basicPay + commissionRate * (float)monthlySales;
//				printf("Income = RM%.2f", income);
//				break;
//	case 1:
//				basicPay = 250.00;
//				commissionRate = 0.05;
//				income = basicPay + commissionRate * (float)monthlySales;
//				printf("Income = RM%.2f", income);
//				break;
//	default:
//				basicPay = 200.00;
//				commissionRate = 0.03;
//				income = basicPay + commissionRate * (float)monthlySales;
//				printf("Income = RM%.2f", income);
//				break;
//	}
//	system("pause");
//}