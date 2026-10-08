class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> count = new HashMap<>();
        if(s.length() == t.length()) {
            for (int i = 0; i < s.length(); i++) {
                char sChar = s.charAt(i);
                char tChar = t.charAt(i);
                if(!count.containsKey(sChar)) {
                    count.put(sChar, 1);
                } else {
                    count.put(sChar, count.get(sChar)+1);
                }
                if(!count.containsKey(tChar)) {
                    count.put(tChar, -1);
                } else {
                    count.put(tChar, count.get(tChar)-1);
                }
            }
            return count.values().stream().allMatch(value -> value == 0);
        } else {
            return false;
        }
    }
}
