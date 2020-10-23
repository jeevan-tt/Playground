#include <iostream>
#include <cstring>
using namespace std;

void reverse(string a);

int main()
{
    string str;
   getline(cin, str);
    reverse(str);
    return 0;    
}

void reverse(string str)
{
    int n = str.length();
  if(n==1)
    cout<<str;
  else
  {
        cout << str[n-1];
       reverse(str.substr(0, n - 1));
}
}