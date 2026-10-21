class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap();
        for(int i : nums)
        {
            freqMap.put(i, freqMap.getOrDefault(i,0) + 1);
        }
        List<Integer> []freqArray = new ArrayList[nums.length+1];
        for(int i = 0;i< freqArray.length; i++)
        {
            freqArray[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet())
        {
            freqArray[entry.getValue()].add(entry.getKey());
        }
        int []res = new int[k];
        int index = 0;
        for(int i = freqArray.length -1 ; i>0 && index <k;i--)
        {
            for(int n:freqArray[i])
            {
                res[index++] = n;
                if(index == k)
                {
                    return res;
                }
            }
        }
        return res;
    }
}
