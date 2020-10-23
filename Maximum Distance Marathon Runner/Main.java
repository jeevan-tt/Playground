#include<bits/stdc++.h>
using namespace std;
int main()
{
    char str[50];
    double arr[50];
    char s[2] = "q";
    int index = 0;
    while(1)
    {
        cin >> str;
        if(strcmp(str, s) == 0)
            break;
        else
            arr[index++] = atof(str);
    }
    for(int i = 0; i < index - 1; i++)
    {
        for(int j = 0; j < index - i - 1; j++)
        {
            if(arr[j] < arr[j + 1])
            {
                float temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    int count = 0, flag = 1;
    for(int i = index-1; i>0; i--)
    {
        if(arr[i]<0 || arr[i]>42.195)
        {
            cout<<"Invalid Input";
            return 0;
        }
    }
    for(int i = 0; i < index; i++)
    {
        if(arr[i] == 42.195)
            continue;
        else
        {
            if(count < 3)
            {
                cout << arr[i]<<" ";
                count++;
                flag = 0;
            }
        }
    }
    if(flag == 1)
        cout <<"Invalid Input";
    return 0;
}