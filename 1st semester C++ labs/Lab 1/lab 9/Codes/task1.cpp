#include <iostream>
using namespace std;

int count_occurences(int arr[], int size, int value){
    int count = 0;
    for(int i = 0; i < size; i++){
        if(arr[i] == value){
            count++;
        }
    }
    return count;
}

int main(){
    int arr[5] = {1, 2, 3, 2, 4};

    int result = count_occurences(arr, 5, 2);

    cout << "2 occurs " << result << " times";

    return 0;
}
