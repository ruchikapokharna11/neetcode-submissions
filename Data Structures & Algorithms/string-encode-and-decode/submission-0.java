

public class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedStr = new StringBuilder();
        for(int i=0 ;i< strs.size();i++)
        {
            encodedStr = encodedStr.append(strs.get(i).length() +"#"+strs.get(i));
        }
        return encodedStr.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < str.length();) {
            int index = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, index));
            result.add(str.substring(index + 1, index + 1 + length));
            i = index + 1 + length;
        }
            return result;
        }

}
