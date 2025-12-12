#include<iostream>
using namespace std;
int main(){
int arr[6]={1,2,3,4,5,6};
cout<<"The number in array are: ";
for(int i=0;i<6;i++){
cout<<arr[i]<<" ";
}
cout<<"\nThe reverse number in array are: ";
for(int i=5;i>=0;i--){
cout<<arr[i]<<" ";
}
return 0;
}
