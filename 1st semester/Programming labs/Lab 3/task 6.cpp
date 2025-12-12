#include<iostream>
using namespace std;
int main(){
float height,weight,BMI;
cout<<endl<<"Enter your weight: ";
cin>>weight;
cout<<endl<<"Enter your height in meters: ";
cin>>height;
BMI=weight/height*height;
cout<<endl<<"Your BMI is: "<<BMI;
return 0;
}
