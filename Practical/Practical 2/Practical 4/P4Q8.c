#include <stdio.h>
#include <stdlib.h>
#pragma warning (disable:4996)

void main()
{
	int n;
	int n1, n2, n3, n4;

	printf("Enter a 4-digit integer > ");
	scanf("%d", &n);

	n1 = n - (n % 1000);
	n2 = (n % 1000) - (n % 100);
	n3 = (n % 100) - (n % 10);
	n4 = n % 10;

	printf("\n%d = %d + %d + %d + %d\n", n, n1, n2, n3, n4);

	system("pause");
}