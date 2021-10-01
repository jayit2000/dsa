class Solution {
public:
    bool isPalindrome(int x) {
        if (x < 0) return false;
        
        int temp = x;
        int result = 0;

        do {
            if (result > (std::numeric_limits<int>::max() / 10) || (result < std::numeric_limits<int>::min() / 10)) {
                return 0;
            }

            result = result * 10 + temp % 10;
        } while (temp /= 10);
        
        return result == x;
    }
};
