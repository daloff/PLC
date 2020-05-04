#include<stdio.h>

//Solution 2 - non-nested
int main()

{

	int first = 25;

	int second = 45;
	
	int third = 15;


	int max;

	int mid;

	int min;



	if (first < second && first < third)

		min = first;

	if (second < first && second < third)

		min = second;

	if (third < first && third < second)

		min = third;



	if (first > second && first > third)

		max = first;

	if (second > first && second > third)

		max = second;

	if (third > second && third >> first)

		max = third;



	if ((first > second && first < third) || (first > third && first < second))

		mid = first;

	if ((second > third && second < first) || (second > first && second < third))

		mid = second;

	if ((third > second && third < first) || (third<second && third> first))

		mid = third;



	printf("first= %d\n", first);

	printf("second= %d\n", second);

	printf("third =%d\n", third);


	printf("\nmax= %d\n", max);

	printf("mid= %d\n", mid);

	printf("min =%d\n", min);


	return 0;

}