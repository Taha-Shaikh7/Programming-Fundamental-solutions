#include<iostream>
using namespace std;
int main(){
int arr[3][3];
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
cout<<"Enter the number of matrix according to given row and column "<<i<<" "<<j<<" : ";
cin>>arr[i][j];
}
}
cout<<"The 3X3 matrix is: \n";
int csum=0,csum1=0,csum2=0;
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
cout<<arr[i][j]<<",";}
cout<<endl;
}
for(int j=0;j<3;j++){
csum+=arr[j][0];
csum1+=arr[j][1];
csum2+=arr[j][2];
}
cout<<endl;

cout<<"The sum of 1st column is: "<<csum<<endl;
cout<<"The sum of 2nd column is: "<<csum1<<endl;
cout<<"The sum of 3rd column is: "<<csum2<<endl;
return 0;
}
