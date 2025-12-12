#include<iostream>
using namespace std;
int main(){
int first,second,third,fourth,fifth,sum,average;
cout<<"Input the first number: ";	
cin>>first;
cout<<endl<<"Input the second number: ";	
cin>>second;
cout<<endl<<"Input the third number: ";	
cin>>third;
cout<<endl<<"Input the fourth number: ";	
cin>>fourth;
cout<<endl<<"Input the fifth number: ";	
cin>>fifth;
sum=first+second+third+fourth+fifth;
cout<<endl<<"Sum of the numbers is: "<<sum;
average=first+second+third+fourth+fifth/5;
cout<<endl<<endl<<"Average of the numbers is: "<<average;
return 0;
}
