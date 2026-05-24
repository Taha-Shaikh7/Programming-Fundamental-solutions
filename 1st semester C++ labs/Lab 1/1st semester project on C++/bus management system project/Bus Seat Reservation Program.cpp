#include <iostream>
#include <fstream>
using namespace std;

int main() {
const int rows = 10;
const int cols = 4;
int seats[rows][cols];


//Load from file 
ifstream fin("seats.txt");  
if (fin.is_open()) {  
    for (int i = 0; i < rows; i++) {  
        for (int j = 0; j < cols; j++) {  
            fin >> seats[i][j];  
        }  
    }  
    fin.close();  
} else {  
    //initialize all seats empty  
    for (int i = 0; i < rows; i++)  
        for (int j = 0; j < cols; j++)  
            seats[i][j] = 0;  
}  

int choice;  
do {  
    cout << "\n========== BUS SEAT RESERVATION ==========\n";  
    cout << "1. View Seat Map\n2. Book a Seat\n3. Cancel a Seat\n4. Exit\n";  
    cout << "Enter option: ";  
    cin >> choice;  

    if (choice == 1) {  
        cout << "\n       BUS SEAT MAP\n";  
        cout << "  (0=Empty, 1=Booked)\n\n";  
        cout << "        LEFT     RIGHT\n        1  2    3  4\n\n";  
        for (int i = 0; i < rows; i++) {  
            cout << "Row " << i + 1;  
            if (i + 1 < 10) cout << " ";  
            cout << "  ";  
            cout << seats[i][0] << "  " << seats[i][1] << "    ";  
            cout << seats[i][2] << "  " << seats[i][3] << endl;  
        }  
    } else if (choice == 2) {  
        int r, c;  
        cout << "\nEnter row (1-10): "; cin >> r;  
        cout << "Enter column (1-4): "; cin >> c;  
        r--; c--;  
        if (r >= 0 && r < rows && c >= 0 && c < cols) {  
            if (seats[r][c] == 0) {  
                seats[r][c] = 1;  
                cout << "Seat booked successfully!\n";  
            } else {  
                cout << "Seat already booked!\n";  
            }  
        } else {  
            cout << "Invalid seat number!\n";  
        }  
    } else if (choice == 3) {  
        int r, c;  
        cout << "\nEnter row (1-10): "; cin >> r;  
        cout << "Enter column (1-4): "; cin >> c;  
        r--; c--;  
        if (r >= 0 && r < rows && c >= 0 && c < cols) {  
            if (seats[r][c] == 1) {  
                seats[r][c] = 0;  
                cout << "Seat cancelled successfully!\n";  
            } else {  
                cout << "Seat is already empty!\n";  
            }  
        } else {  
            cout << "Invalid seat number!\n";  
        }  
    } else if (choice == 4) {  
        ofstream fout("seats.txt");  
        for (int i = 0; i < rows; i++) {  
            for (int j = 0; j < cols; j++) {  
                fout << seats[i][j] << " ";  
            }  
            fout << "\n";  
        }  
        fout.close();  
        cout << "\nData saved. Exiting...\n";  
    } else {  
        cout << "Invalid option. Try again.\n";  
    }  
} 
while (choice != 4);
 
return 0;
}
