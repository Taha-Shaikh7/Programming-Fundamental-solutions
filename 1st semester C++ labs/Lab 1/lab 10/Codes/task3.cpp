#include<iostream>
using namespace std;
int pow(int base,int exp){
if(exp==0){
return 1;
}
return base*pow(base,exp-1);
}
int main(){
cout<<pow(3,2);
return 0;
}
