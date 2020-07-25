#include <stdio.h>
#include <stdlib.h>
#pragma warning (disable:4996)

int main()
{
	int i, a, n = 1;
	for (a = 1; a <= 4; a++) {
		for (i = 1; i <= 4; i++) {
			printf("%d", n);
		}
		n++;
		printf("\n");
	}
	system("pause");
}