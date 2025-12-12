#include<iostream>
using namespace std;
int main(){
int i,j;
int arr[3][3];
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
cout<<"Enter the number of matrix according to given row and column "<<i<<" "<<j<<" : ";
cin>>arr[i][j];
}
}
cout<<"The 3X3 matrix is: \n";
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
cout<<arr[i][j]<<" ";}
cout<<endl;
}
int max=arr[0][0];
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
if(arr[i][j]>max){
max=arr[i][j];
}

}

cout<<endl;
}
cout<<"Maximum number are: "<<max;
return 0;
}
