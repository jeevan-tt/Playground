#include<iostream>
#include <stdio.h>
using namespace std;
int main()
{
    char s[1000], i;
    scanf("%[^\n]s", s);
    for(i = 0; s[i] != '\0'; ++i);
    printf("%d", i);
    return 0;
}