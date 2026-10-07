class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> cache = new HashSet<>();
        for (int num : nums) {
            if(cache.contains(num))
                return true;
            else
                cache.add(num);
        }
        return false;
    }
}