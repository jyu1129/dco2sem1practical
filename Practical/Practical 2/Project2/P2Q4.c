#include <stdio.h>
#include <stdlib.h>
#pragma warning (disable:4996)

void main(void)
{
	//Variable declarations
	char firstName[11], lastName[21];
	int heightCM;
	int ageInYears, ageInDays;
	double heightIN;

	//Input
	printf("Enter your first name    : ");
	gets(firstName);

	printf("Enter your last name     : ");
	gets(lastName);

	printf("Enter your height in \"cm\" : ");
	scanf("%d", &heightCM);

	printf("Enter your age in \"years\" : ");
	scanf("%d", &ageInYears);

	//Process
	heightIN = heightCM / 2.54;
	ageInDays = ageInYears * 365;

	//Output
	printf("\n%s %s, ", firstName, lastName);
	printf("your height is %f inches. \n", heightIN);
	printf("Your age is %d days!!!\n", ageInDays);

	system("pause");

}