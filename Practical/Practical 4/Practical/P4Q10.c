#include <stdio.h>
#include <stdlib.h>
#pragma warning (disable:4996)
#define SALES_TAX 1.0825

int main()
{
	int qtyKeyboard;
	int qtyMouse;
	int qtyMonitor;
	int qtyPrinter;
	int qtySpeaker;

	float priceKeyboard= 35.50;
	float priceMouse   = 12.90;
	float priceMonitor = 600.00;
	float pricePrinter = 168.00;
	float priceSpeaker = 120.00;

	float subtotal;
	float total;

	printf("Enter number of items sold(Keyboard) (Mouse) (Monitor) (Printer) (Speaker): ");
	scanf("%d %d %d %d %d", &qtyKeyboard, &qtyMouse, &qtyMonitor, &qtyPrinter, &qtySpeaker);

	subtotal = (qtyKeyboard*priceKeyboard) + (qtyMouse*priceMouse) + (qtyMonitor*priceMonitor) + (qtyPrinter*pricePrinter) + (qtySpeaker*priceSpeaker);
	total = subtotal * SALES_TAX;

	printf("QTY   DESCRIPTION   UNIT PRICE   TOTAL PRICE\n");
	printf("---   -----------   ----------   -----------\n");
	printf("%3d   %-11s   %10.2f   %11.2f\n", qtyKeyboard, "KEYBOARD",priceKeyboard, qtyKeyboard*priceKeyboard);
	printf("%3d   %-11s   %10.2f   %11.2f\n", qtyMouse, "MOUSE",   priceMouse, qtyKeyboard*priceMouse);
	printf("%3d   %-11s   %10.2f   %11.2f\n", qtyMonitor, "MONITOR", priceMonitor, qtyKeyboard*priceMonitor);
	printf("%3d   %-11s   %10.2f   %11.2f\n", qtyPrinter, "PRINTER", pricePrinter, qtyKeyboard*pricePrinter);
	printf("%3d   %-11s   %10.2f   %11.2f\n", qtySpeaker, "SPEAKER", priceSpeaker, qtyKeyboard*priceSpeaker);
	printf("%31s   %10.2f\n", "SUBTOTAL", subtotal);
	printf("%31s   %10.2f\n", "TAX (8.25%)", total-subtotal);
	printf("%31s   %10.2f\n", "TOTAL", total);

	system("pause");
}