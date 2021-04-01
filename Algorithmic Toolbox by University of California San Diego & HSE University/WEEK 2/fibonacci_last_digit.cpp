#include<bits/stdc++.h>
using namespace std;
#define ll long long int
ll dega(int n)
{
	vector<ll> vvv(n + 1);
	vvv[0] = 0;
	vvv[1] = 1;
	for (int i = 2; i <= n; i++)
		vvv[i] = (vvv[i - 1]%10 + vvv[i - 2]%10)%10;
	return vvv[n];
}

int main()
{
	int n;
	cin >> n;
	cout << dega(n) << endl;
}
