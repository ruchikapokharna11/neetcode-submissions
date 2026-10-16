class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> resultSet = new HashSet();
        for(int i= 0; i < nums.length-2; i++)
        {
            Set<Integer> seen = new HashSet<>();
            for(int j= i+1; j< nums.length; j++)
            {
                int find = -(nums[i] + nums[j]); 
                if(seen.contains(find))
                {
                    List<Integer> tempList = new ArrayList<>(Arrays.asList(nums[i],nums[j],find));
                Collections.sort(tempList);
                resultSet.add(tempList);
                }
                seen.add(nums[j]);
            } 
        }
        return new ArrayList<>(resultSet);
    }
}
