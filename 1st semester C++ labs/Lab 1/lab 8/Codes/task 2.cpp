#include <iostream>
using namespace std;
int main () {
	int n;
		cout<<"Enter the size of array: "; cin>>n;
	int table[n];

	for(int i =0; i<n; i++) {
		cout<<"Enter the value "<<i+1<<" :  ";
		 cin>>table[i]; 
	}
	cout<<"The numbers are: ";
	int largest=table[0];
	for(int i = 0; i<n; i++) {
	cout<<table[i]<<",";
	if(table[i]>largest){
	largest=table[i];
	}
	}
	cout<<"\nLargest number is: "<<largest;
	return 0;
}