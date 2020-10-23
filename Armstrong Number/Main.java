#include<iostream> 
#include <cmath>
using namespace std; 

int order(int x) 
{ 
	int n = 0; 
	while (x) 
	{ 
		n++; 
		x = x/10; 
	} 
	return n; 
} 

bool isArmstrong(int x) 
{ 
	int n = order(x); 
	int temp = x, sum = 0; 
	while (temp) 
	{ 
		int r = temp%10; 
		sum += pow(r, n); 
		temp = temp/10; 
	} 

	return (sum == x); 
} 

int main() 
{ 
	int x;
	cin>>x;
	if(isArmstrong(x))
	cout << "ARMSTRONG";
	else
	cout<< "NOT AN ARMSTRONG";
	return 0; 
} 
