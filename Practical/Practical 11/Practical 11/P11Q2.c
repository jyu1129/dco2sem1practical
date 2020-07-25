//#include <stdio.h>
//#include <stdlib.h>
//#pragma warning(disable:4996)
//
//void binary(int num)
//{
//	int a, temp;
//	printf("number              : ");
//	for (a = 7; a >= 0; a--) {
//		temp = num >> a;	//move required bit to extreme right
//		if (temp & 1)	//determine if the bit is 1 or 0
//			printf("1");
//		else
//			printf("0");
//	}
//}
//
//void leftShifted(int num, int shifted)
//{
//	int a, temp;
//	printf("\nLeft Shifted        : ");
//	for (a = 7; a >= 0; a--) {
//		temp = num << shifted >> a;	//move required bit to extreme right and (shifted)
//		if (temp & 1)	//determine if the bit is 1 or 0
//			printf("1");
//		else
//			printf("0");
//	}
//}
//
//void rightShifted(int num, int shifted)
//{
//	int a, temp;
//	printf("\nRight Shifted       : ");
//	for (a = 7; a >= 0; a--) {
//		temp = num >> a >> shifted;	//move required bit to extreme right and (shifted)
//		if (temp & 1)	//determine if the bit is 1 or 0
//			printf("1");
//		else
//			printf("0");
//	}
//}
//
//int main()
//{
//	int num,shifted;
//
//	printf("Enter a decimal number: ");
//	scanf("%d", &num);
//	printf("\nEnter number of places to shift bit: ");
//	scanf("%d", &shifted);
//
//	binary(num);
//	leftShifted(num, shifted);
//	rightShifted(num, shifted);
//
//	printf("\n");
//
//	system("pause");
//}