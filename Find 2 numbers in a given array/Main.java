#include<iostream>
#include<stdio.h>

using namespace std;

int main()
{
	int n,i,num1,num2,num1_index=-1,num2_index=-1;
cin>>n;
	int a[n];
	for(i=0;i<n;i++)
	{
		cin>>a[i];
	}
	cin>>num1>>num2;
	for(i=0;i<n;i++)
	{
		if(num1==a[i] && num1_index==-1)
		{
			num1_index=i;
		}
		if(num2==a[i] && num2_index==-1)
		{
			num2_index=i;
		}
	}
	cout<<"Element 1 index = "<<num1_index<<"\nElement 2 index = "<<num2_index;
}