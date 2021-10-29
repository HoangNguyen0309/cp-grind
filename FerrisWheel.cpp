#include <bits/stdc++.h>

using namespace std;

int main() {
	int n, x, count;
	cin >> n >> x;
	int p[n];
	bool track[n];
	for (int i=0;i<n;++i) cin >> p[i];
	sort(p,p+n);
	int i=0;
	int j=n-1;
	while (i<j) {
		if (p[i] + p[j] > x){
			j = j -1;
		} else {
			track[j] = true;
			track[i] = true;
			count++;
			i++;
			j = j -1;
		}
	}
	for (int a = 0; a < n; a++) {
		if (track[a] == false) {
			count++;
		}
	}
	cout << count << "\n";
	return 0;
}
