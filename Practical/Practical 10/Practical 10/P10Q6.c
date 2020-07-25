//#include <stdio.h>
//#include <stdlib.h>
//#pragma warning(disable:4996)
//#define SIZE 10
//
//int main()
//{
//	int myArray[10] = { 5,1,2,5,2,7,0,3,6,7 };
//	int pass, i, temp;
//	
//	printf("Unsorted:");
//	for (i = 0; i < 10; i++) {
//		printf(" %d ", myArray[i]);
//	}
//
//	printf("\nSorted: ");
//
//	for (pass = 0; pass < SIZE - 1; pass++) {
//		for (i = pass + 1; i < SIZE; ++i) {
//			if (myArray[i] > myArray[pass]) {
//				temp = myArray[pass];
//				myArray[pass] = myArray[i];
//				myArray[i] = temp;
//			}
//		}
//		printf("%d ", myArray[pass]);
//	}
//
//	printf("\n");
//
//	system("pause");
//}