#include <stdio.h>
#include <stdlib.h>
#pragma warning (disable:4996)

double menu();
int main()
{
	double cost;

	 cost = menu();

	printf("The cost is RM%.2lf.\n", cost);

	system("pause");
}

double menu()
{
	int quantity1, quantity2, quantity3;
	double cost;
	double food1 = 4.99;
	double food2 = 3.99;
	double food3 = 2.99;

	printf("Menu\n"
		"=====================\n"
		"CheeseBurger = RM4.99\n"
		"French Fries = RM3.99\n"
		"Coke         = RM2.99\n");

	printf("Choice A? (Quantity) ");
	scanf("%d", &quantity1);
	printf("Choice B? (Quantity) ");
	scanf("%d", &quantity2);
	printf("Choice C? (Quantity) ");
	scanf("%d", &quantity3);
	cost = (double)quantity1*food1 + (double)quantity2*food2 + (double)quantity3*food3;
	
	return cost;
}
