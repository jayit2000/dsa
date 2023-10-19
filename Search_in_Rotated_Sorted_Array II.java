

class Solution {
    public boolean search(int[] nums, int target) {
        int l =0, h = nums.length-1;
        
        while (l <= h) {
            int mid = (l + h) / 2;
            if (nums[mid] == target) return true;
            
            if (nums[mid] < nums[l]) {
                if (nums[mid] < target && nums[h] >= target) l = mid + 1;
                else h = mid - 1;
            } else if (nums[mid] > nums[l]) {
                if (nums[mid] > target && nums[l] <= target) h = mid - 1;
                else l = mid + 1;
            } else {
                l++;
            }
        }
        
        return false;
        
    }
}