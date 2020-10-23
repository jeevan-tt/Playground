#include<iostream>
#include <stdio.h>
using namespace std;

int main()
{
    int  num, bin, dec = 0, base = 1, rem;
cin>>num; /* maximum five digits */
    bin = num;
    while (num > 0)
    {
        rem = num % 10;
        dec = dec + rem * base;
        num = num / 10 ;
        base = base * 2;
    }
    
    cout<<dec;
  return 0;
}