//#include <stdio.h>
//#include <stdlib.h>
//#pragma warning (disable:4996)
//
//int main()
//{
//	double bank,bankwoRate;
//	int numYrs;
//
//	printf("Please enter the value of money in your bank.(with 2 decimal place)");
//	scanf("%lf", &bank);
//	printf("Please enter the number of years your money has been in your bank.");
//	scanf("%d", &numYrs);
//
//	if (numYrs == 0) {
//		printf("Invalid input.");
//	}
//	else if (numYrs >= 5) {
//		bankwoRate = bank * numYrs;
//		bank = bankwoRate * 1.075;
//		printf("Your bank account balance will be RM%.2f included interest rate 7.5%% RM%.2f.\n", bank, bank-bankwoRate);
//	}
//	else if (numYrs < 5) {
//		bankwoRate = bank * numYrs;
//		bank = bankwoRate * 1.054;
//		printf("Your bank account balance will be RM%.2f included interest rate 5.4%% RM%.2f.\n", bank, bank-bankwoRate);
//	}
//	else {
//		printf("Invalid input.");
//	}
//
//	system("pause");
//}