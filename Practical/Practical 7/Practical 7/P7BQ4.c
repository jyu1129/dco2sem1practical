//#include <stdio.h>
//#include <stdlib.h>
//#pragma warning (disable:4996)
//
//int main()
//{
//	int num1, num2, i, a;
//	int total = 0;
//	int sqrOf = 0;
//
//	printf("Enter 2 numbers (num1 < num2) : ");
//	scanf("%d %d", &num1, &num2);
//
//	while (num1 < num2) {
//		printf("The odd numbers between %d and %d are   : ", num1, num2);
//		for (num1; num1 <= num2;num1++) {
//			if (num1 % 2 != 0) {
//				printf("%d ", num1);
//				sqrOf = sqrOf + num1 * num1;
//			}
//			else {
//				total = total + num1;
//			}
//		}
//		printf("\nThe sum of even numbers are           : %d",total);
//		printf("\nThe sum of squares of odd numbers are : %d\n", sqrOf);
//	}
//
//	system("pause");
//}
//
////1+2*n