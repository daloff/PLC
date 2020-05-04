#include<stdio.h>

int main()
{
	int j = -3, i = 0;
	do
	{
		if ((j + 2) == 3 || (j + 2) == 2)
			j--;
		else if ((j + 2) == 0)
			j += 2;
		else
			j = 0;
		if (j <= 0)
			j = 3 - i;
		printf("%d %d\n", i, j);
		i++;
	} while (i < 3);
	return 0;
}
