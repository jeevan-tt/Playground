#include <iostream>
#include<stdio.h>
using namespace std;

 int main()
 {    
 	float celsius, fahrenheit;
cin>>celsius;
	fahrenheit = (celsius * 9 / 5) + 32;
	printf("%0.2f", fahrenheit);
	return 0;
 }