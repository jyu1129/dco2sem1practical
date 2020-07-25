//#include <stdio.h>
//#include <stdlib.h>
//#pragma warning (disable:4996)
//#define SALES_TAX 1.0825
//
//int main()
//{
//	int p1;
//	int p2;
//	int p3;
//	int p4;
//	int p5;
//
//	float subtotal;
//	float total;
//
//	printf("Enter number of items sold:\n");
//	printf("Keyboard > ");
//	scanf("%d", &p1);
//	printf("Mouse    > ");
//	rewind(stdin);
//	scanf("%d", &p2);
//	printf("Monitor  > ");
//	rewind(stdin);
//	scanf("%d", &p3);
//	printf("Printer  > ");
//	rewind(stdin);
//	scanf("%d", &p4);
//	printf("Speaker  > ");
//	rewind(stdin);
//	scanf("%d", &p5);
//
//	subtotal = (p1*35.50) + (p2*12.90) + (p3*600.00) + (p4*168.00) + (p5*120.00);
//	total = subtotal * SALES_TAX;
//
//	printf("Your total without tax is %.2f.\n", subtotal);
//	printf("Your total with tax is %.2f.\n", total);
//
//	system("pause");
//}