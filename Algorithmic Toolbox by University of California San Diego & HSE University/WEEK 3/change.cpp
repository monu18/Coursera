#include <bits/stdc++.h>
using namespace std;
int get_change(int m)
{

  if (m > 1000)
  {
    exit(0);
  }
  int n = 0;
  int ten_frac = m / 10;
  if (ten_frac >= 1)
  {
    n += ten_frac;
  }
  m = m - (ten_frac * 10);
  int five_frac = m / 5;
  if (five_frac >= 1)
  {
    n += five_frac;
  }
  m = m - (five_frac * 5);
  n += m;
  return n;
}

int main()
{
  int m;
  cin >> m;
  cout << get_change(m) << '\n';
}
