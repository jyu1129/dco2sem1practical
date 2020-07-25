//#include <stdio.h>
//#include <stdlib.h>
//#pragma warning(disable:4996)
//
//void binary(int num)
//{
//	int i, temp, yes = 0;
//	printf("number %d: ",num);
//	for (i = 8; i >= 1; i--) {
//		temp = num >> i;
//		if (temp & 1)
//			printf("1");
//		else
//			printf("0");
//	}
//}
//
//int main()
//{
//	int num, yes;
//
//	printf("Please enter a number.");
//	scanf("%d", &num);
//	
//	if (num & 1) {
//		num--;
//		binary(num);
//	}
//	else
//		binary(num);
//
//	printf("\n");
//
//	system("pause");
//	return 0;
//}