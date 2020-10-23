#include<iostream>
#include <math.h>
using namespace std;
int main()
{
  int n;
  cin>>n;
  if(n % 2 == 1)
  {
     int a = 1;
     int r = 2;
     int terms= (n+1)/2;
     int res = a * pow(2, terms - 1);
     cout<<res;
  } 
  else 
  {	
     int a = 1;
     int r = 3; 
     int terms = n/2;
     int res = a * pow(3, terms - 1);
     cout<<res;
  	} 
   return 0;
}