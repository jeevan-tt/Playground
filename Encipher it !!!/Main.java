#include <iostream>
#include<stdio.h>
using namespace std;

int main()
{
	char ch,encipher;
    int key;
cin>>ch>>key;
  
	if(islower(ch))
    {
       	encipher=((ch-97)+key)%26;
       	
cout<<(char)(encipher+97);
    }
  	else
    {
       	encipher=((ch-65)+key)%26;
       	
       	cout<<(char)(encipher+65);
    }
 	return 0; 
}