#include <stdio.h>
#include <stdlib.h>
#pragma warning (disable:4996)

int main()
{
	int i = 1, n = 0, a;
	for (a = 1; a <= 4; a++) {
		for (i; i <= 4; i++) {
			printf("%d", i - n);
			n++;
		}
		printf("\n");
	}
	system("pause");
}