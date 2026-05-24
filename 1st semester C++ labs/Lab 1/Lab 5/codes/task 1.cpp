#include<iostream>
using namespace std;
int main(){
float units,amount,totalbill;
cout<<"Input the total electricity bill units used: ";
cin>>units;
if(units<=50){
amount=0.50*units;
cout<<endl<<"total bill is: "<<amount<<endl;
}
else if(units<=150){
amount=(0.50*50)+((units-50)*0.75);
cout<<endl<<"total bill is: "<<amount<<endl;
}
else if(units<=250){
amount=(0.50*50)+(100*0.75)+((units-150)*1.20);
cout<<endl<<"total bill is: "<<amount<<endl;
}	
else if(units>250){
amount=(0.50*50)+(100*0.75)+(100*1.20)+((units-250)*1.50);
cout<<endl<<"total bill is: "<<amount<<endl;
}
totalbill = amount + (amount*0.20);
cout<<endl<<"total bill after surcharge of 20% is: "<<totalbill<<endl;
return 0;
}