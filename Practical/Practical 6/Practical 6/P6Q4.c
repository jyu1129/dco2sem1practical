//#include <stdio.h>
//#include <stdlib.h>
//#pragma warning (disable:4996)
//
//int main()
//{
//	int hours;
//
//	printf("Please enter the number of hours worked per week.");
//	scanf("%d", &hours);
//
//	float totalLessThan = (float)hours * 6.00;
//	float equalTo = 40.00 * 6.00;
//	float total = equalTo + ((float)hours - 40.00)*9.00;
//
//	if (hours < 40) {
//		printf("Your wages are RM%.2f.", totalLessThan);
//	}
//	if (hours == 40) {
//		printf("Your wages are RM%.2f.", equalTo);
//	}
//	if (hours > 40) {
//		printf("Your wages are RM%.2f.", total);
//	}
//
//	system("pause");
//}