#include <iostream>
using namespace std;

int main() {
    int m, a;
    cout << "Enter the marks: ";
    cin >> m;
    cout << "Enter the attendance in percentage: ";
    cin >> a;

    if (m > 60 && a > 75) {
        cout << "Congratulations, you are passed!";
    }
    else if (m <= 60 && a <= 75) {
        cout << "You failed.";
    }
    else if (m <= 60 && a > 75) {
        cout << "You failed due to low marks.";
    }
    else if (m > 60 && a <= 75) {
        cout << "You failed due to low attendance.";
    }

    return 0;
}

