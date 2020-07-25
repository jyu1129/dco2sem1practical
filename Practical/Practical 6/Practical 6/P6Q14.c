#include <stdio.h>
#include <stdlib.h>
#pragma warning (disable:4996)

int main()
{
	int year, month, leapYear, day, feb, totalDay = 0;

	printf("Please enter the (day) (month) (year).");
	scanf("%d %d %d", &day, &month, &year);
	
	leapYear = year % 4;
	
	if (leapYear != 0) {
		feb = 28;
	}
	else
	{
		feb = 29;
	}

		switch (month) {
		case 12:
			totalDay += 30;
		case 11:
			totalDay += 31;
		case 10:
			totalDay += 30;
		case 9:
			totalDay += 31;
		case 8:
			totalDay += 31;
		case 7:
			totalDay += 30;
		case 6:
			totalDay += 31;
		case 5:
			totalDay += 30;
		case 4:
			totalDay += 31;
		case 3:
			totalDay += feb;
		case 2:
			totalDay += 31;
		case 1:
			totalDay += 0;
			break;
		}

	int total = totalDay + day;

	printf("The total of days is %d", total);

	system("pause");

}