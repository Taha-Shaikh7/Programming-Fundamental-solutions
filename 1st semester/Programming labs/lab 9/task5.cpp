#include <iostream>
using namespace std;
void swap_val(int &a, int &b) {
    int temp = a;   
    a = b;          
	    b = temp;      }

int main() {
    int x, y;

    cout << "Enter value of x: ";
    cin >> x;

    cout << "Enter value of y: ";
    cin >> y;

    cout << "\nBefore swapping:\n";
    cout << "x = " << x << ", y = " << y << endl;

    swap_val(x, y);

    cout << "\nAfter swapping:\n";
    cout << "x = " << x << ", y = " << y << endl;

    return 0;
}
