#include <iostream>
using namespace std;
int main () {
int n,pos=0,neg=0,zero=0;
int arr[8];
for(int i=0;i<8;i++){
cout<<"Enter the number of value "<<i+1<<" : ";
cin>>arr[i];}
for(int i=0;i<8;i++){
if(arr[i]>0){
pos++;
}
else if(arr[i]<0){
neg++;}
else { 
zero++;
}
}
cout<<"Positive number are: "<<pos<<endl;
cout<<"Negative number are: "<<neg<<endl;
cout<<"Zero number are: "<<zero<<endl;	
	
	
	
	
	
	
	
	return 0;
}