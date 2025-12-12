#include <iostream>
using namespace std;
int* getMultiplesOf5(int arr[], int n, int &size) {
    static int multiples[100]; 
    size = 0;

    for (int i = 0; i < n; i++) {
        if (arr[i] % 5 == 0) {
            multiples[size] = arr[i];
            size++;
        }
    }

    return multiples;
}

int main() {
    int arr[] = {3, 5, 10, 12, 15, 18};
    int n = 6;
    int size;

    int* result = getMultiplesOf5(arr, n, size);

    cout << "Multiples of 5: ";
    for (int i = 0; i < size; i++) {
        cout << result[i] << " ";
    }
    cout << endl;

    return 0;
}
