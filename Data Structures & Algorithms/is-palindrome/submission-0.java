class Solution {
    public boolean isPalindrome(String s) {
        char []arr = s.toCharArray();
        for(int i=0, j = arr.length-1; i<j;)
        {
            if(!isAlphaNumeric(arr[i]))
            {
                i++;
            }
            else if(!isAlphaNumeric(arr[j]))
            {
                j--;
            }
            else if(Character.toLowerCase(arr[i]) != Character.toLowerCase(arr[j]))
            {
                return false;
            }
            else{
                i++; j--;
            }
        }
        return true;  
    }
    static boolean isAlphaNumeric(char c)
    {
        return (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9');
    }
}
