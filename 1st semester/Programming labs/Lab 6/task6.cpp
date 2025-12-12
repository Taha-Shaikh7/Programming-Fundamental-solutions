#include<iostream>
using namespace std;
int main(){
int n;
cout<<"Enter The Number: ";
cin>>n;
for(int i=n;i>=1;i--){
if(i%2!=0){
cout<<i<<"  ";
}
}
	return 0;
}