//#include <stdio.h>
//#include <stdlib.h>
//#pragma warning (disable:4996)
//
//int main()
//{
//	int i, n[10], nTotal = 0;
//	float percent[10], percentTotal = 0.00;
//
//	for (i = 0; i <= 9; i++)
//	{
//		printf("Please enter a value.");
//		scanf("%d", &n[i]);
//		nTotal += n[i];
//	}
//	for (i = 0; i <= 9; i++)
//	{
//		percent[i] = (float)n[i] / (float)nTotal * 100.00;
//		percentTotal += percent[i];
//	}
//
//	printf("         n   %% of total\n");
//	printf("        ---  ------------\n");
//	for (i = 0; i <= 9; i++)
//	{
//		printf("        %2d         %4.2f %%\n", n[i], percent[i]);
//	}
//
//	printf("        ---  ------------\n");
//	printf("Total = %3d  %6.2f %%\n", nTotal, percentTotal);
//
//	system("pause");
//}