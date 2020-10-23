#include <iostream>
#include<math.h>
using namespace std; 
  
bool isPerfectSquare(long double x) 
{   
  long double sr = sqrt(x); 
  return ((sr - floor(sr)) == 0); 
} 
  
int main() { 
  long double x;
  cin>>x;
  if (isPerfectSquare(x)) 
    cout << "YES"; 
  else
    cout << "NO"; 
  return 0; 
} 