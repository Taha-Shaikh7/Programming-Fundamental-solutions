#include<iostream>
using namespace std;
int main(){
int num1,num2,i,sum=0;
cout<<"Enter number 1: ";
cin>>num1;
cout<<"Enter number 2: ";
cin>>num2;
i=num1;
do{
if(i%2==0){
sum=sum+i;
}
i++;
}
while(i<=num2);	
cout<<endl<<"Sum of even number between "<<num1<<" and "<<num2<<" is: "<<sum;
return 0;
}