#include <stdio.h>
#include <iostream>
#include<math.h>
using namespace std;
int main()
{
    float hyp, opp, adj;
    cin>>opp>>adj;
    hyp=sqrt((opp*opp) + (adj*adj));
    printf("%0.2f", hyp);
    return 0;
}