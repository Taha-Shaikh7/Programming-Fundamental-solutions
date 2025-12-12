#include<iostream>
using namespace std;
void even(int start,int end){
if(start>end){
return;
}
if(start%2==0){
cout<<start<<" ";
}
even(start+1,end);
}
int main(){
int start,end;
cout<<"Enter the start number: ";
cin>>start;
cout<<"Enter the end number: ";
cin>>end;
cout<<"Even number from "<<start<<" to "<<end<<" is: ";
even(start,end);
return 0;
}
