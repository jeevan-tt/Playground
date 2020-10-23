#include<iostream>
#include <stdio.h>
using namespace std;

int main() 
{  
float r,angle,len;
cin>>r>>angle;
len=2*3.14*r*(angle/360);
printf("%0.2f",len);
return 0;
}