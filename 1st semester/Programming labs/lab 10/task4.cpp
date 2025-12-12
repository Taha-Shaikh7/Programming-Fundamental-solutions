#include<iostream>
using namespace std;
int fab(int n){
if(n==0) return 0;
if(n==1) return 1;
return fab(n-1)+fab(n-2);
}
int main(){
int n;
cout<<"Enter the number of terms: ";
cin>>n;
cout<<"Fibonacci series of "<<n<<" numbers is: ";
for(int i=0;i<n;i++){
cout<<fab(i)<<" ";
}
return 0;
}
