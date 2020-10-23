#include <iostream>
using namespace std;

 int main()
 { 
	int array[100], maximum, size, c, location = 1;
cin>>size;
 	for (c = 0; c < size; c++)
    		cin>>array[c];
 	maximum = array[0];
	for (c = 1; c < size; c++)
  	{
    		if (array[c] > maximum)
    		{
       		maximum  = array[c];
       		location = c+1;
    		}
  	}
 	cout<<maximum;
  return 0;
}