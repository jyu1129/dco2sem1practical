//#include <stdio.h>
//#include <stdlib.h>
//#pragma warning (disable:4996)
//
//int main()
//{
//	int i, response, totalResponse[6] = { 0 }, totalMark = 0;
//
//	printf("Please enter the survey marks below:\n");
//	printf("Question   Response(0-4)\n");
//	for (i = 1; i <= 10; i++) {
//		printf("   Q%2d   : ", i);
//		scanf("%d", &response);
//		switch (response) {
//		case 0:
//			totalResponse[0]++;
//			break;
//		case 1:
//			totalResponse[1]++;
//			break;
//		case 2:
//			totalResponse[2]++;
//			break;
//		case 3:
//			totalResponse[3]++;
//			break;
//		case 4:
//			totalResponse[4]++;
//			break;
//		default:
//			totalResponse[5]++;
//		}
//	}
//	for (i = 0; i <= 4; i++) {
//		totalMark += totalResponse[i];
//	}
//
//	printf("RESULTS\n"
//		   "Response     frequency\n"
//		   "--------     ---------\n"
//		   "0-Very Bad        %d  \n", totalResponse[0]);
//	printf("1-Bad             %d  \n", totalResponse[1]);
//	printf("2-Good            %d  \n", totalResponse[2]);
//	printf("3-Very Good       %d  \n", totalResponse[3]);
//	printf("4-Excenllent      %d  \n", totalResponse[4]);
//	printf("\nTotal mark = %d\n", totalMark);
//	printf("Invalid response = %d\n", totalResponse[5]);
//
//	system("pause");
//}