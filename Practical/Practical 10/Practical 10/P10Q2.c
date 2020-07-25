//#include <stdio.h>
//#include <stdlib.h>
//#include <ctype.h>
//#pragma warning (disable:4996)
//
//int main()
//{
//	char surname[15], firstName[15], secondName[15], fullName[45], abbrName[45] = "";
//
//	printf("Enter your surname: ");
//	scanf("%s", surname);
//
//	printf("Enter your first name: ");
//	scanf("%s", firstName);
//
//	printf("Enter your second name: ");
//	scanf("%s", secondName);
//
//	surname[0] = toupper(surname[0]);
//	firstName[0] = toupper(firstName[0]);
//	secondName[0] = toupper(secondName[0]);
//
//	strcpy(fullName, firstName);
//	strcat(fullName, " ");
//	strcat(fullName, secondName);
//	strcat(fullName, " ");
//	strcat(fullName, surname);
//
//	printf("Your full name is       : %s", fullName);
//
//	strncat(abbrName, firstName , 1);
//	strncat(abbrName, secondName , 1);
//	strcat(abbrName, " ");
//	strcat(abbrName, surname);
//
//	printf("\nYour Abbreviated Name is: %s\n", abbrName);
//
//
//	system("pause");
//}