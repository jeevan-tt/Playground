#include<iostream>
#include<stdio.h>
#include<math.h>
using namespace std;

int main()
{  
	int i,x,flag;
	cin>>x;
	for(i=2;i<=x/2;i++)
	{
		flag=1;
		if(x%i==0) 
		{
			flag=0;
			break;
		}
	}
      if(flag==1)
		printf("%.2f",sqrt(x));
      else 
		printf("0.00");
      
      return 0;
}
