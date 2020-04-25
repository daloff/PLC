#include <iostream>
#include <math.h>
#include<conio.h>


//static array 
int static array() { 
	static int arr[1000];
	int i;
	for (i = 0; i < 1000; i++) {
		//Random function is used 
		arr[i] = rand() % 1000 + 1;
	}
}
//stack array 
int stack_array() {
	int arr1[1000];
	int i;
	for (i = 0; i < 1000; i++) {
		arr1[i] = rand() % 1000 + 1;
	}
}
//heap array 
int heap_array() {
	//An array declaration from the heap. It is done at run time by malloc keyword 
	int * arr2 = (int*)malloc(sizeof(int) * 1000);
	int i;
	for (i = 0; i < 1000; i++) {
		arr2[i] = rand() % 1000 + 1;
	}
}
main() {
	int j;
	//clock_t stores time date values 
	clock_t t;
	//clock() is a function that shows the current time of the system 
	t = clock();
	//calling of the method static_array 100000 times 
	for (j = 0; j < 100000; j++)
		int static_array();
	//Difference between two times to get the time required 
	t = clock() - t;
	printf("\n Time consumed in Processing static array %f", ((float)t) / CLOCKS_PER_SEC);
	printf(" sec");
	t = clock();
	//calling of the method stack_array 100000 times 
	for (j = 0; j < 100000; j++)
		int stack_array();
	t = clock() - t;
	printf("\n Time consumed in Processing stack array %f", ((float)t) / CLOCKS_PER_SEC);
	printf(" sec");
	t = clock();
	//calling of the method heap_array 100000 times 
	for (j = 0; j < 100000; j++)
		heap_array();
	t = clock() - t;
	printf("\n Time consumed in Processing heap array %f", ((float)t) / CLOCKS_PER_SEC);
	printf(" sec");
	getch();
}
