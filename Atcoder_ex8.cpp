#include <iostream>
using namespace std;

int main() {
  int p;
  cin >> p;

  // ƒpƒ^[ƒ“2
  if (p == 2) {
    string text;
    int price;
    cin >> text >> price;
	cout << text << "!" << endl;
  }

  int price,N;
  cin >> price >> N;
  cout << price * N << endl;
}
