#include <iostream>
#include <iomanip>

using namespace std;

int main ()
{
    float bill;
    float tipPercent;
    float tipMoney;
    float totalBill;
    int age;

    cout << "Please enter your bill amount: ";
    cin >> bill;
    cout << "Please enter your desired tip percentage: ";
    cin >> tipPercent;
    cout << "Please enter your age: ";
    cin >> age;

    if (age >= 65)
    {
        bill = bill * .9;
    }

    tipMoney = bill * (tipPercent / 100);
    totalBill = tipMoney + bill;

    cout << setw(8) << "Bill: $" << fixed << setprecision(2) << setw(6) << bill << endl;
    cout << setw(8) << "Tip: $" << setw(6) << tipMoney << endl;
    cout << setw(14) << setfill('-') << "" << endl;
    cout << setw(8) << setfill(' ')  << "Total: $" <<setw(6) << totalBill << endl;

	return 0;
}
