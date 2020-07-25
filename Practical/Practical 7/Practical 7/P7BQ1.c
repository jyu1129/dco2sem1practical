//#include <stdio.h>
//#include <stdlib.h>
//#pragma warning (disable:4996)
//
//int main()
//{
//	int i, num, val1 = 0, val2 = 0, val3 = 0, val4 = 0, invalid = 0;
//
//	for (i = 1; i <= 10; i++) {
//		printf("Please enter a number.\n");
//		scanf("%d", &num);
//		if (num >= 1 && num <= 50) {
//			val1 = val1++;
//		}
//		else if (num <= 100) {
//			val2 = val2++;
//		}
//		else if (num <= 150) {
//			val3 = val3++;
//		}
//		else if (num <= 200)
//		{
//			val4 = val4++;
//		}
//		else {
//			invalid = invalid++;
//		}
//	}
//	printf("Range 1-50   : %d\n", val1);
//	printf("Range 51-100 : %d\n", val2);
//	printf("Range 101-150: %d\n", val3);
//	printf("Range 151-200: %d\n", val4);
//	printf("Invalid input: %d\n", invalid);
//
//	system("pause");
//}