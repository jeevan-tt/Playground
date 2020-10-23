#include <iostream> 
using namespace std; 
  
int search(int arr[], int n, int x) 
{ 
    int i; 
    for (i = 0; i < n; i++) 
        if (arr[i] == x) 
            return i; 
    return -1; 
} 
  
int main(void) 
{ 
    int arr[50],x,n;
    cin>>n; 
  for(int i=0;i<n;i++)
  cin>>arr[i];
  cin>>x;
    int result = search(arr, n, x); 
   (result == -1)? cout<<x<<" isn't present in the array.":cout<<result+1; 
   return 0; 
} 