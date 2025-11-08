#include<iostream>
using namespace std;
int main(){
char mychar;
mychar = 'A';
short myshort;
myshort= 1238;
int myint;
myint= 2396;
long double mylong;
mylong= 2.378784453;
string mystring;
mystring= "Taha";
char name[20]="shaikh";    //char → means characters,name[20] → means we are making space for 20 characters.
cout<< "character: " << mychar<<" "<< "|Size of variable: "<< sizeof(mychar)<<" Bytes" << endl<< endl;	
cout<< "short: "<<myshort << " "<<"|Size of variable: "<< sizeof(myshort)<<" Bytes"<<endl<< endl;
cout<< "int: "<< myint<<" "<< "|Size of variable: "<<sizeof(myint)<<" Bytes"<< endl<< endl;
cout<< "long double: "<< mylong<< " "<< "|Size of variable: "<<sizeof(mylong)<< " Bytes"<< endl<<endl;
cout<< "string: "<< mystring<< " "<< "|Size of variable: "<< sizeof(mystring) << " Bytes"<< endl<<endl; 
cout<< "string second method: "<<name<<" "<< "|Size of variable: "<< sizeof(name) << " Bytes";
return 0;
}
