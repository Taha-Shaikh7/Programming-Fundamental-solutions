#include <iostream>
using namespace std;

void Make_zero(int &num) {
    num = 0;
}
int main() {
    int x = 10;
    cout << "Before: " << x << endl;

    Make_zero(x);  

    cout << "After: " << x << endl;

    return 0;
}
