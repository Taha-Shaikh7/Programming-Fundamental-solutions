#include<iostream>
using namespace std;
int main(){
int intermediate,age,chestmeasurement;
double height;
cout<<"Enter your intermediate percentage: ";
cin>>intermediate;
cout<<endl<<"Enter your age: ";
cin>>age;
cout<<endl<<"Enter your height: ";
cin>>height;
cout<<endl<<"Enter your chest measurement: ";
cin>>chestmeasurement;
if(intermediate >=55 && age >17 && age <=22 && height >=5.4 && chestmeasurement >77 && chestmeasurement<=82){
cout<<endl<<"You are eligible for PakArmy";
}
else{
cout<<endl<<"Sorry, Try Again";
}
return 0;
}