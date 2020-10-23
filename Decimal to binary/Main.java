#include<iostream>
#include<stdlib.h>
using namespace std;

int main()
{
	int n, cnt=0,i;
	int b[32];
	cin>>n;
	while(n!=0)
	{
		b[cnt]=n%2;
		n=n/2;
		cnt++;
	}
	for(i=(cnt-1);i>=0;i--)
	cout<<b[i];
	return 0;
}