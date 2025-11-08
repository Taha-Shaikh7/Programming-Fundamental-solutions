#include<iostream>
using namespace std;
int main(){
int i,j=1;
float num1,num2;
do{
cout<<"\n-----Simple Calculator-----\n";
cout<<"\n1. Addition\n";
cout<<"2. Subtraction\n";
cout<<"3. Multiplication\n";
cout<<"4. Division\n";
cout<<"5. Exit\n";
cout<<"Enter your choice: ";
cin>>i;
if(i==5){
cout<<"\nExit";
break;
}
j++;
if(i>=1 && i<=4){
cout<<"Enter number 1: ";
cin>>num1;
cout<<"Enter number 2: ";
cin>>num2;
}
switch(i){
case 1:
if(i==1){
cout<<"\nAddition of "<<num1<<" + "<<num2<<" = "<<num1+num2<<endl;
}
break;
case 2:
if(i==2){
cout<<"\nSubtraction of "<<num1<<" - "<<num2<<" = "<<num1-num2<<endl;
}	
break;
case 3:
if(i==3){
cout<<"\nMultiplication of "<<num1<<" * "<<num2<<" = "<<num1*num2<<endl;
}
break;
case 4:
if(i==4){
cout<<"\nDivision of "<<num1<<" / "<<num2<<" = "<<num1/num2<<endl;
}
break;
default:
	cout<<"\nInvalid choice Try again";
} 	
}
while(true);	
return 0;
}