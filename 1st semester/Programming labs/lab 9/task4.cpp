#include <iostream>
using namespace std;


int fact_func(int n) {
    int fact = 1;

    for(int i = 1; i <= n; i++) {
        fact = fact * i;
    }

    return fact;
}

int main() {
    int num;

    cout << "Enter a non-negative number: ";
    cin >> num;

    int result = fact_func(num);

    cout << "Factorial = " << result;

    return 0;
}
