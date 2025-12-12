#include <iostream>
using namespace std;
int area(int width,int length){
return width*length;
}
int square(int length){
return length*length;
}
int main() {
cout<<"Rectangle area: "<<area(2,3)<<endl;
cout<<"Square area: "<<square(5);
    return 0;
}
