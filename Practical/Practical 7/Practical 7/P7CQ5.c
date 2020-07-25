//#include <stdio.h>
//#include <stdlib.h>
//#pragma warning (disable:4996)
//
//int main()
//{
//	int student, subject, total = 0, sub1, n, maxMark = 0, topStudent, minMark = 999;
//	float average;
//	printf("==============================================\n"
//		   "           MARKS PROCESSING SYSTEM            \n"
//		   "==============================================\n");
//	printf("Please enter the number of student.");
//	scanf("%d", &n);
//
//	for (student = 1; student <= n; student++)
//	{
//		printf("Student : %d\n", student);
//		for (subject = 1; subject <= 3; subject++)
//		{
//			printf("Please enter your subject marks.");
//			scanf("%d", &sub1);
//			total += sub1;
//			if (maxMark < total) {
//				maxMark = total;
//				topStudent = student;
//			}
//			if (minMark > total) {
//				minMark = total;
//			}
//		}
//		average = (float)total / 3;
//
//		printf("The total of your subject marks is %d.\n", total);
//		printf("The average of your subject marks is %.2f.\n", average);
//		total = 0;
//	}
//	printf("The highest total mark is %d\n", maxMark);
//	printf("The top student is student no.%d\n", topStudent);
//	printf("===============================================\n"
//		   "      THANK YOU FOR USING THIS SYSTEM!!        \n"
//		   "===============================================\n");
//	printf("Minimum : %d", minMark);
//
//	system("pause");
//}