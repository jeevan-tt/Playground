#include <iostream>
using namespace std;

int main()
{
     int n, num, digit, rev = 0;
     cin >> num;
     n = num;

     do
     {
         digit = num % 10;
         rev = (rev * 10) + digit;
         num = num / 10;
     } while (num != 0);

     if (n == rev)
         cout << "Palindrome";
     else
         cout << "Not a Palindrome";

    return 0;
}