#include <iostream>
using namespace std;
void print_student_data(string names[], int n) {
    cout << "Student Names:" << endl;
    for (int i = 0; i < n; i++) {
        cout << names[i] << endl;
    }
    cout << endl;
}
void print_student_data(string names[], int ids[], int n) {
    cout << "ID\tName" << endl;
    for (int i = 0; i < n; i++) {
        cout << ids[i] << "\t" << names[i] << endl;
    }
    cout << endl;
}

void print_student_data(int ids[], string names[], float marks[], int n) {
    cout << "ID\tName\tMarks" << endl;
    for (int i = 0; i < n; i++) {
        cout << ids[i] << "\t" << names[i] << "\t" << marks[i] << endl;
    }
    cout << endl;
}

int main() {
    string names[] = {"Ali", "Sara", "Hassan"};
    int ids[] = {101, 102, 103};
    float marks[] = {85.5, 90.0, 78.5};
    int n = 3;

    print_student_data(names, n);                   
    print_student_data(names, ids, n);              
    print_student_data(ids, names, marks, n);       

    return 0;
}
