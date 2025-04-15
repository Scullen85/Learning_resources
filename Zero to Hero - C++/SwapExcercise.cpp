#include <iostream>
using namespace std;

int main() {

    int a = 1;
    int b = 2;

    int c =  a;
    a =  b;
    b =  c;

    std::cout << "INT A = " << a << " INT B = " << b << endl; 
    return 0;
}