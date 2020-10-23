#include<iostream>
#include<stdio.h>
using namespace std;
int main() 
{  
int dia;
float r, area;
cin>>dia;
r=(float)dia/2;
area=3.14*r*r;
printf("%0.2f",area);
return 0;
}