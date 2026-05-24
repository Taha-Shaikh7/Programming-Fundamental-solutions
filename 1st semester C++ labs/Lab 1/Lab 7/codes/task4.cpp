#include<iostream>
#include<ctime>
using namespace std;
int main(){
	srand(time(0));
int number=rand() %100;
//cout<<number;
int guess,i;
while(true){
cout<<"Guess the number between 100: ";
cin>>guess;
if(guess==number){
	cout<<"Correct Congratulation You Win"<<endl<<endl;
	break;
} 
if(guess>number) {
	cout<<"Wrong Try again with lower number."<<endl<<endl;
}
if(guess<number){
	cout<<"Wrong Try again with higher number."<<endl<<endl;
}
i++;
}
return 0;
}
