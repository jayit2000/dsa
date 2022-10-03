#include <bits/stdc++.h>
using namespace std;
vector <long long int> vec;

long long int trap(long long int n) {
    long long int ans = 0;
    for (long long int i = 1 ; i < n - 1; i++) {
        long long int left = vec[i];
        for (long long int j = 0 ; j < i ; j++) {
            if (left < vec[j]) {
                left = vec[j];
            }
        }

        long long int right = vec[i];
        for (long long int j = i + 1 ; j < n ; j++) {
            if (right < vec[j]) {
                right = vec[j];
            }
        }

        if (left > right) {
            ans += right - vec[i];
        } else {
            ans += left - vec[i];
        }
    }

    return ans;
}

int main() {
    long long int n;
    cin>>n;
    for(long long int i = 0 ; i < n ; i++) {
        long long int a;
        cin>>a;
        vec.push_back(a);
    }
    cout<<trap(n)<<endl;
}