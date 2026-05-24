#include<iostream>
using namespace std;
int main(){
char value;
cout<<"Enter The Grade E, V, G, A, F:  ";
cin>>value;
switch(value){
case 'E':
case 'e':
cout<<"Excelent";
break;
case 'V':
case 'v':
cout<<"Very good";
break;
case 'G':
case 'g':
cout<<"Good";
break;
case 'A':
case 'a':
cout<<"Average";
break;
case 'F':
case 'f':
cout<<"Fail";
break;
}
return 0;
}