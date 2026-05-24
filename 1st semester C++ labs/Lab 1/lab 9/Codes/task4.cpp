#include<iostream>
using namespace std;
int fact_func(int n){
int fact=1;
for(int i=1;i<=n;i++){
fact*=i;
}
return fact;
}
int main(){
int n;
cout<<"Enter the non negative number: ";
cin>>n;
int result=fact_func(n);

cout<<"The factorial of "<<n<<" is: "<<result;





return 0;
}
