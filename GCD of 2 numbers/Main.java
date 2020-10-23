#include <iostream>

using namespace std;

int main()
{
  int a, b, c;
  cin>>a>>b;
  while ( a != 0 ) 
  {
     c = a; 
    a = b%a;  
    b = c;
  }
  cout<<b;
  return 0;
}
