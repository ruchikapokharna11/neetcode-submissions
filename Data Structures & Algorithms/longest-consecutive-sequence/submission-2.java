class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longestSeq = 1;
        if(nums.length == 0)
        {
            return 0;
        }
        for(int i: nums)
        {
            set.add(i);
        }
        for(int i: nums)
        {
            if(set.contains(i-1))
            {
                continue;
            }
            else
            {
                int j = i;
                int count = 1;
                while(set.contains(++j))
                {
                    longestSeq = Math.max(longestSeq,++count);
                }
            }
        }
        return longestSeq;
    }
}
