#include<iostream>
using namespace std;
int main(){
int n,num=0;
cout<<"Enter the number to print the table: ";
cin>>n;
for(int i=1;i<=10;i++){
num=n*i;
cout<<endl<<n<<" * "<<i<<" = "<<num<<endl;
}
	return 0;
}