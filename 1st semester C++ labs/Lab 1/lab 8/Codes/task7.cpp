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
int sum=0,sum2=0,sum3=0;
for(int i=0;i<3;i++){
sum+=arr[0][i];
sum2+=arr[1][i];
sum3+=arr[2][i];

for(int j=0;j<3;j++){
cout<<arr[i][j]<<",";

}
cout<<endl;
}
cout<<"The sum of 1st row is: "<<sum<<endl;
cout<<"The sum of 2nd row is: "<<sum2<<endl;
cout<<"The sum of 3rd row is: "<<sum3<<endl;



return 0;
}
