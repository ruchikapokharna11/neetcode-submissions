class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        for(int i=0,j =0;j < s.length();j++)
        {
            while(set.contains(s.charAt(j)))
            {
                set.remove(s.charAt(i));
                i++;   
            }
            set.add(s.charAt(j));
            count = Math.max(count, j-i+1);
        }
        return count;
    }
}
