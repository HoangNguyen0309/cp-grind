#include <bits/stdc++.h>

using namespace std;

int main() {
	int s;
	cin >> s;
	int arr[s];
	for (int i = 0; i < s; i++) {
		cin >> arr[i];
	}
	int n = sizeof(arr)/sizeof(arr[0]);
	sort(arr, arr+n);
	int count = 1;
	for (int i = 1; i < s; i++) {
		if (arr[i-1] != arr[i]) {
			count++;
		}
	}
	cout << count;
}
