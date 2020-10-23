#include <iostream>
#include <stdio.h>
using namespace std;

int main()
{
	char c;
	cin>>c;
	if('A' <= c && c <= 'Z')
	    printf("%c",c+32);
	if('a' <= c && c <= 'z')
	    printf("%c",c-32);
	return 0;
}
  