#include<iostream>
using namespace std;
int main(){
int i=1;
while(i<=100){
if(i%5==0){
i++;
continue;
}
cout<<i<<",";
i++;
}
return 0;
}