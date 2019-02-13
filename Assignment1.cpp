#include <iostream>

using namespace std;

int main ()
{
    int capacity;
    float MPG;     // Declare Variables
    float DriveMiles;

    cout << "How big is your tank in gallons? "; // Prompt tank size
    cin >> capacity; // Record tank size

    cout << "What is your vehicle's MPG? "; // Prompt MPG
    cin >> MPG; // Record MPG

    DriveMiles = capacity * MPG; // Calculate miles to empty

    cout << "Based on these numbers you can drive " << DriveMiles << " miles on a full tank." << endl; // Output miles to empty




	return 0;
}
