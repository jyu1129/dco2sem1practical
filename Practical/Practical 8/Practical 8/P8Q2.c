//#include <stdio.h>
//#include <stdlib.h>
//#pragma warning (disable:4996)
//
//int main()
//{
//	int bday, bmonth, byear, cday, cmonth, cyear, salary;
//	char name[15], gender;
//
//		printf("Enter your first name. ");
//		scanf("%s", name);
//
//	do {
//		printf("Enter your date of birth (dd-mm-yyyy(w/o the dash)): ");
//		scanf("%d %d %d", &bday, &bmonth, &byear);
//		(bday < 1 || bday>31) ? printf("You have entered an invalid day.\n") : 0;
//	    (bmonth < 1 || bmonth>12)?printf("You have entered an invalid month.\n"):0;
//		(byear < 0) ? printf("You have entered an invalid year.\n") : 0;
//	} while (bmonth < 1 || bmonth > 12 || bday < 1 || bday > 31 || byear < 0);
//
//	do {
//		printf("Enter the date of application (dd-mm-yyyy(w/o the dash)): ");
//		scanf("%d %d %d", &cday, &cmonth, &cyear);
//		(cday < 1 || cday>31) ? printf("You have entered an invalid day.\n") : 0;
//		(cmonth < 1 || cmonth>12) ? printf("You have entered an invalid month.\n") : 0;
//		(cyear < 0) ? printf("You have entered an invalid year.\n") : 0;
//	} while (cmonth < 1 || cmonth > 12 || cday < 1 || cday > 31 || cyear < 0);
//
//	do {
//		printf("Enter your gender (M/F): ");
//		rewind(stdin);
//		scanf("%c", &gender);
//		(gender != 'm' && gender != 'M' && gender != 'f' && gender != 'F') ? printf("You have entered an invalid gender.\n") : 0;
//	} while (gender != 'm' && gender != 'M' && gender != 'f' && gender != 'F');
//
//	do {
//		printf("Please enter the starting salary: ");
//		scanf("%d", &salary);
//		(salary < 0) ? printf("You have entered an invalid starting salary\n") : 0;
//	} while (salary < 0);
//
//	printf("Birth date:          %d-%d-%d.\n", bday, bmonth, byear);
//	printf("Date of application: %d-%d-%d.\n", cday, cmonth, cyear);
//	printf("Sex: %c\n", gender);
//	printf("Starting salary: %d\n", salary);
//
//	system("pause");
//}
