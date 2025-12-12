#include <iostream>
using namespace std;

string merge_text(string s1, string s2){
    return s1 + s2;   // join the two strings
}

int main(){
    string a = "Hello ";
    string b = "World!";

    string result = merge_text(a, b);

    cout << result;   

    return 0;
}
