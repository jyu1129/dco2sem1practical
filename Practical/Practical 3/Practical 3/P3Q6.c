#include <stdio.h>
#include <stdlib.h>
#pragma warning (disable:4996)

void main()
{
	int n;

	printf("Enter an integer > ");
	scanf("%d", &n);

	printf("\n");

	printf("Decimal      :%d\n", n);
	printf("Octal        :%o\n", n);
	printf("Hexadecimal  :%x\n", n);
	printf("Hexadecimal  :%X\n", n);

	system("pause");

}