#include <stdio.h>
#include <string.h>
int main()
{
    char str[200];
    FILE *fptr;
    int i, len, j = 0, k = 0;

    //check if file is empty 
    if ((fptr = fopen("file.txt", "r")) == NULL)
    {
        printf("Error!!!");
        return 0;
    }
    //store the data in file to variable
    fscanf(fptr, "%[^\n]", str);
    printf("Input: %s\n", str);
    len = strlen(str);
    //separate lexemes by whitespace and special characters 
    for (i = 0; i < len; i++)
    {
        if ((str[i] >= 'a' && str[i] <= 'z') || (str[i] >= 'A' && str[i] <= 'Z') || (str[i] >= '0' && str[i] <= '9'))
        {
            printf("%c", str[i]);
        }
        else if (str[i] == ' ')
        {
            printf("\n");
        }
        else
        {
            printf("\n%c\n", str[i]);
        }
    }
    fclose(fptr);
    return 0;
}