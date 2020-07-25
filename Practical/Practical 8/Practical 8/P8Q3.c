//#include <stdio.h>
//#include <stdlib.h>
//#pragma warning (disable:4996)
//
//int main()
//{
//	int region, state;
//
//	do {
//		printf("Please select a region of Malaysia.\n");
//		printf("(1)Northen Region\n"
//			   "(2)East Coast Region\n"
//			   "(3)Central Region\n"
//			   "(4)Southern Region\n");
//		scanf("%d", &region);
//		(region < 1 || region>4) ? printf("You have entered an invalid choice.") : 0;
//	} while (region < 1 || region>4);
//
//	switch (region) {
//	case 1:
//	case 2:
//	case 4:
//	case 3:
//		do {
//			printf("Central Region selected.\n"
//				"Please select a state in Central Region.\n"
//				"(1)Selangor\n"
//				"(2)federal territories of Kuala Lumpur\n"
//				"(3)Putrajaya\n");
//			scanf("%d", &state);
//			(state < 1 || state>3) ? printf("You have entered an invalid choice") : 0;
//		} while (state < 1 || state>3);
//		break;
//	}
//
//	switch (state) {
//	case 1:
//	case 3:
//	case 2:
//			printf("federal territories of Kuala Lumpur selected.\n");
//			printf("Kuala Lumpur is capital of federal territories of Kuala Lumpur.\n");
//	}
//
//	system("pause");
//}