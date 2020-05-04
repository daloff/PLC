#include <stdio.h>
// Solution 1 - Nested If
int main()

{

	int first = 25;

	int second = 45;

	int third = 15;

	int max;

	int mid;

	int min;


	if (first < second)

	{

		if (first < third)

		{

			min = first;

			if (third < second)

			{

				mid = third;

				max = second;

			}

			else

			{

				mid = second;

				max = third;

			}

		}

		else

		{

			min = third;

			mid = first;

			max = second;

		}

	}

	else

	{

		if (second < third)

		{

			min = second;

			if (third < first)

			{

				mid = third;

				max = first;

			}

			else

			{

				mid = first;

				max = third;

			}

		}

		else

		{

			min = third;

			mid = second;

			max = first;

		}

	}

	printf("first= %d\n", first);

	printf("second= %d\n", second);

	printf("third =%d\n", third);


	printf("\nmax= %d\n", max);

	printf("mid= %d\n", mid);

	printf("min =%d\n", min);

	return 0;

}

