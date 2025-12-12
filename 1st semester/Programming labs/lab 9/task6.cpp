#include <iostream>
using namespace std;
int power_func(int base, int exponent) {
    int result = 1;

    for(int i = 1; i <= exponent; i++) {
        result = result * base;
    }

    return result;
}

int main() {
    int base, exponent;

    cout << "Enter base: ";
    cin >> base;

    cout << "Enter exponent: ";
    cin >> exponent;
    int ans = power_func(base, exponent);

    cout << "Result = " << ans;

    return 0;
}
