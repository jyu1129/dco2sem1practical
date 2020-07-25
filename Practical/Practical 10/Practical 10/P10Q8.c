//#include <stdio.h>
//#include <stdlib.h>
//#pragma warning (disable:4996)
//
//int main()
//{
//	int arrayData[2][5] = { {2,4,6,8,10},{1,3,5,7,9} };
//	int row, column;
//	int rowTotal[2][1] = { 0 };
//	int columnTotal[1][5] = { 0 };
//
//	for (row = 0; row < 2; row++) {
//		for (column = 0; column < 5; column++) {
//			rowTotal[row][0] += arrayData[row][column];
//		}
//	}
//
//	for (column = 0; column < 5; column++) {
//		for (row = 0; row < 2; row++) {
//			columnTotal[0][column] += arrayData[row][column];
//		}
//	}
//
//	system("pause");
//	return 0;
//}