class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length-1;
        if(nums[low] < nums[high] || high == 0)
        {
            return nums[low];
        }
        while(low < high)
        {
            int mid = (low + high)/2;
            if(nums[mid] > nums[low])
            {
                low = mid;
            }
            else
            {
                high = mid;  
            }
        }
        return nums[low+1];
    }
}