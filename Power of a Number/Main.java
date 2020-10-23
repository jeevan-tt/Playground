
#include <iostream>
using namespace std;
int main()
{    
    int base, exponent;
    long long result = 1;
    cin>>base;
    cin>>exponent;
    if(base!=0 && exponent>=0)
    {
        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }
        cout<<result;
    }
    else
        cout<<"Wrong input";
    return 0;
}