#include <iostream>
using namespace std;
void matrix_mul(int A[2][2], int B[2][2]) {
    int result[2][2];

    for(int i = 0; i < 2; i++){
        for(int j = 0; j < 2; j++){
            result[i][j] = 0;

            for(int k = 0; k < 2; k++){
                result[i][j] += A[i][k] * B[k][j];
            }
        }
    }

      cout << "Result of Matrix Multiplication:\n";
    for(int i = 0; i < 2; i++){
        for(int j = 0; j < 2; j++){
            cout << result[i][j] << " ";
        }
        cout << endl;
    }
}

int main() {
    int A[2][2];
    int B[2][2];

    cout << "Enter values for Matrix A (2x2):\n";
    for(int i = 0; i < 2; i++){
        for(int j = 0; j < 2; j++){
            cin >> A[i][j];
        }
    }

    cout << "Enter values for Matrix B (2x2):\n";
    for(int i = 0; i < 2; i++){
        for(int j = 0; j < 2; j++){
            cin >> B[i][j];
        }
    }
    matrix_mul(A, B);

    return 0;
}
