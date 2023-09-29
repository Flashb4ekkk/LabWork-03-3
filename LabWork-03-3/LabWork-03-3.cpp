// LabWork-03-3
// Левків Роман
// Лабораторна робота № 3.3
// Розгалуження, задане графіком функції.
// Варіант 13
#include <iostream>
#include <cmath>

using namespace std;
int main()
{
	double x; // вхідний аргумент
	double R; // вхідний параметр
	double y; // результат обчислення виразу
	cout << "R = "; cin >> R;
	cout << "x = "; cin >> x;

	// розгалуження в повній формі
    if (x <= -1 - R) {
        y = x + 1 + R;
    }
    else {
        if (-1 - R < x && x <= -1) {
            y = abs(pow(R, 2) - pow(x + 1, 2));
        }
        else {
            if (-1 < x && x <= 1) {
                y = R;
            }
            else {
                if (1 < x && x <= 2) {
                    y = R + (-1 - R) / (2 - 1) * (x - 1);
                }
                else {
                    y = -1;
                }
            }
        }
    }
	cout << endl;
	cout << "y = " << y << endl;
	cin.get();
	return 0;
}