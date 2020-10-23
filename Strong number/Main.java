#include<iostream>
#include<stdio.h>
using namespace std;
int fact(int n)
{
  	int i,fact=1;
  	for(i=1;i<=n;i++)
    {
      	fact=fact*i;
    }
  	return fact;
}
int main() 
{
  	int num,sum=0,rem,copy;
  	cin>>num;
  	copy=num;
  	while(num!=0)
    {
      	rem = num%10;
      	sum=sum+fact(rem);
      	num=num/10;
    }
  	if(copy==sum)
    {
      	cout<<"Yes";
    }
  	else
    {
      cout<<"No";
    }
}