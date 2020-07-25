//#include <stdio.h>
//#include <stdlib.h>
//#pragma warning (disable:4996)
//
//int main()
//{
//	int i, a, smallest = 9999 , largest = -9999, sum = 0, choice;
//	float average;
//	char hello, lol;
//	do {
//		for (i = 1; i <= 5; i++) {
//			printf("Please enter a value <x>: ");
//			scanf("%d", &a);
//			smallest = (a < smallest) ? a : smallest;
//			largest = (largest < a) ? a : largest;
//			sum += a;
//		}
//		average = (float)sum / 5;
//		do {
//			do {
//				printf("Please select the answer. \n"
//					"(1)Smallest\n"
//					"(2)Largest\n"
//					"(3)Sum\n"
//					"(4)Average\n");
//				scanf("%d", &choice);
//				switch (choice) {
//				case 1:
//					printf("The smallest value is %d.\n", smallest);
//					break;
//				case 2:
//					printf("The largest value is %d.\n", largest);
//					break;
//				case 3:
//					printf("The sum of the values is %d.\n", sum);
//					break;
//				case 4:
//					printf("The average of the values is %.2f\n", average);
//					break;
//				default:
//					printf("You have entered an invalid choice.\n");
//				}
//			} while (choice < 1 || choice > 4);
//			printf("Do you want to select the answer again? ");
//			rewind(stdin);
//			scanf("%c", &hello);
//		} while (hello == 'y' || hello == 'Y');
//		printf("Again? ");
//		rewind(stdin);
//		scanf("%c", &lol);
//	} while (lol == 'y' || lol == 'Y');
//	
//	system("pause");
//}