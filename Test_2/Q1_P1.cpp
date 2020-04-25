#include <iostream>
using namespace std;
enum food {

	POTATO = 5,
	CHICKEN = 10,
	PASTA = 6,
	POKE = 1

} cook;
enum week { Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday };
int main()
{
	cook = PASTA;
	week W = Friday;
	if (W == Friday && cook == PASTA) {
		cout << "At Friday I will have PASTA for dinner" << endl;
	}
	return 0;
}
