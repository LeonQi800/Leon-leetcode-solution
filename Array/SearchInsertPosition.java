class Solution {
    public int searchInsertPosition(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        while (left <= right){
            // too avoid overflow
            int mid = (left + (right - left))/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) right = mid - 1; 
            else left = mid + 1;
        }
        return left;
    }
}