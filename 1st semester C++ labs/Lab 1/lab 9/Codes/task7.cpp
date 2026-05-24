#include <iostream>
using namespace std;
int max_array(int arr[], int size) {
    int maxVal = arr[0];
    for(int i = 1; i < size; i++) {
        if(arr[i] > maxVal) {
            maxVal = arr[i];
        }
    }
    return maxVal;
}
int min_array(int arr[], int size) {
    int minVal = arr[0];
    for(int i = 1; i < size; i++) {
        if(arr[i] < minVal) {
            minVal = arr[i];
        }
    }
    return minVal;
}
int sum_max_min(int arr[], int size) {
    int maxVal = max_array(arr, size);
    int minVal = min_array(arr, size);
    return maxVal + minVal;
}

int main() {
    int arr[5];

    cout << "Enter 5 numbers:\n";
    for(int i = 0; i < 5; i++) {
        cin >> arr[i];
    }

    int result = sum_max_min(arr, 5);

    cout << "Sum of maximum and minimum = " << result;

    return 0;
}
