#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
	char *encrypted = "dEsxDI^I";
	int i, j;

	for (i = 0; i <= 99; i++) {
		printf("%d : ",i);
		for (j = 0; j < strlen(encrypted); j++) {
			putchar(encrypted[j] ^ i);
		}
		printf("\n");
	}

	system("pause");
	return 0;
}