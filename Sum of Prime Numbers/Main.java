
#include <iostream> 
using namespace std; 

int main() 
{ 
	int a, b, sum=0,i, j, flag; 

	cin >> a; // Take input 

	cin >> b; // Take input 

	for (i = a; i <= b; i++) { 
		if (i == 1 || i == 0 || i==a || i==b) 
			continue; 
		flag = 1; 

		for (j = 2; j <= i / 2; ++j) { 
			if (i % j == 0) { 
				flag = 0; 
				break; 
			} 
		} 
		if (flag == 1)
		sum=sum+i; 
	} 
	cout<< sum;

	return 0; 
} 
