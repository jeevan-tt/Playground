#include <iostream>
#include<stdio.h>
#include<stdlib.h>
using namespace std;
char isVowel(char c,int n)
{
	if((c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')&&n==1)
	{
		return '$';
	}
	else if((c!='A'&&c!='E'&&c!='I'&&c!='O'&&c!='U'&&c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u')&&n==2)
	{
		return '#';
	}
	else if((c>='a'&&c<='z')&&n==3)
	{
		return c-32;
	}
	return c;
}
int main()
{
	int i,j;
	char string[3][100];
	for(i=0;i<3;i++)
	{
		scanf("%s",string[i]);
	}
	for(i=0;i<3;i++)
	{
		for(j=0;string[i][j]!='\0';j++)
		{
			cout<<isVowel(string[i][j],i+1);
		}
	}
}
