#include<iostream>
using namespace std;
int main(){
int base,exponent,result=1,i=1;
cout<<"Enter the base: ";
cin>>base;
cout<<"Enter the exponent: ";
cin>>exponent;
while(i<=exponent){
	result=result*base;
	i++;
}
	cout<<"The anwer is: "<<result;
return 0;
}