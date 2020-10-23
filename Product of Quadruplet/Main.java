#include<iostream>
using namespace std;
int quadruplet(int arr[], int n)
{
    
    if(n < 4)
        return 0;
    int p, q, r, s, temp, max = 0;
    for(p =0;p<(n-3);p++)
        for(q=p+1;q<n-2;q++)
            for(r=q+1;r<n-1;r++)
              	for(s=r+1;s<n;s++)
                {
                  	temp = arr[p] * arr[q] * arr[r] * arr[s];
            		if(max < temp)
                		max = temp;
                }
    return max;
}
int main()
{
    int n;
    cin >> n;
    int arr[n];
    for(int i = 0; i < n; i++)
        cin >> arr[i];
    int x = quadruplet(arr, n);
        
    if(x == 0)
        cout <<"Invalid Input";
    else
        cout << x;
}