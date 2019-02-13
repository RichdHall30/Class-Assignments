#include <iostream>

using namespace std;

int main ()
{
    int even = 0;   //DECLARE VARIABLES
    int odd = 0;
    int input;


    cout << "This program will show you the sum of entered"             //DECLARE THE PURPOSE
            " even and odd numbers respectively" << endl;
    cout << "When finished, enter a '0' (ZERO) for results" << endl;    //Termination instructions
            cout << endl;


    while (input != 0)                              //CONTROL THE LOOP
    {
        cout << "Please enter a number: ";          //PROMPT THE USER
        cin >> input;                               //ACCEPT INPUT

        if (input % 2 == 0)                         //DECIDES EVEN VS. ODD
        {
            even = even + input;                    //EVEN NUMBERS ADD UP HERE
        }
        else
        {
            odd = odd + input;                      //ODD NUMBERS ADD UP HERE
        }
    }
            cout << endl;
    cout << "The sum of even numbers entered is: " << even << "." << endl; //OUTPUT SUM OF EVEN NUMBERS
    cout << "The sum of odd numbers entered is: " << odd << "." <<endl; //OUTPUT SUM OF ODD NUMBERS

	return 0;
}
