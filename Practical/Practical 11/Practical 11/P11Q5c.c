//#include <stdio.h>
//#include <stdlib.h>
//#include <string.h>
//#pragma warning (disable:4996)
//
//void encryptWord()
//{
//	char password[9];
//	int encryptKey;
//
//	printf("Please enter a password.(Maximum : 8) :");
//	gets(password);
//	printf("Enter the 2-digit KEY                 :");
//	scanf("%d", &encryptKey);
//
//	printf("\nThe string '%s' is encrypted to     :", password);
//
//	for (int i = 0; i < strlen(password); i++) {
//		putchar(encryptKey ^ password[i]);
//	}
//
//}
//
//void decryptWord()
//{
//	char encrypted[9];
//	int decryptKey;
//
//	printf("\nPlease enter the 8-character string to be decrypted :");
//	rewind(stdin);
//	gets(encrypted);
//	printf("Enter the 2-digit KEY                 :");
//	scanf("%d", &decryptKey);
//
//	printf("\nThe string '%s' is decrypted to     :", encrypted);
//
//	for (int i = 0; i < strlen(encrypted); i++) {
//		putchar(encrypted[i] ^ decryptKey);
//	}
//}
//
//int main()
//{
//	encryptWord();
//	decryptWord();
//
//	printf("\n");
//
//	system("pause");
//	return 0;
//}