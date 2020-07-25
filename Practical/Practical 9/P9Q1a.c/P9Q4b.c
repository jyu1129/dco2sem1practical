//#include <stdio.h>
//#include <stdlib.h>
//#pragma warning (disable:4996)
//
//int main()
//{
//	int i, n[20], nTotal = 0, x;
//	float percent[20], percentTotal = 0.00;
//
//
//	printf("Please enter a value for values to be inputted.");
//	scanf("%d", &x);
//
//	for (i = 0; i <= x; i++)
//	{
//		printf("Please enter a value.");
//		scanf("%d", &n[i]);
//		nTotal += n[i];
//	}
//	for (i = 0; i <= x; i++)
//	{
//		percent[i] = (float)n[i] / (float)nTotal * 100.00;
//		percentTotal += percent[i];
//	}
//
//	printf("         n   %% of total\n");
//	printf("        ---  ------------\n");
//	for (i = 0; i <= x; i++)
//	{
//		printf("        %2d ", n[i]);
//		printf("        %4.2f %%\n", percent[i]);
//	}
//
//	printf("        ---  ------------\n");
//	printf("Total = %3d  %6.2f %%\n", nTotal, percentTotal);
//
//	system("pause");
//}