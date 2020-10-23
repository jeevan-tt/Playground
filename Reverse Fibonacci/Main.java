#include<iostream>
using namespace std;
void revfib(int arr[], int num)
{
    int i;
    arr[0] = 0;
    arr[1] = 1;
    for(i=2; i<num; i++)
    {
        arr[i] = arr[i-2]+arr[i-1];
    }
    for(i=num-1; i>=0; i--)
    {
        cout<<arr[i]<<" ";
    }   
}

int main()
{
    int num, arr[100];
    cin>>num;
    revfib(arr, num);
  return 0;
}
