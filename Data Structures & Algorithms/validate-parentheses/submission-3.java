class Solution {
    public boolean isValid(String str) {
        Stack<Character> s = new Stack();
        char []c = new char[str.length()];
        if(str.length()%2 == 1)
        {
            return false;
        }
        for(int i=0;i< str.length();i++)
        {
            c[i] = str.charAt(i);
        }
        for(int i=0; i< c.length; i++)
        {
            if(c[i]=='(' | c[i]=='{' | c[i]=='[')
            {
                s.push(c[i]);
            }
            else
            {
                if(!s.empty())
                {
                    char latest = s.peek();
                    if(c[i]==')' && latest == '(')
                    {
                        s.pop();
                    }
                    else if(c[i]=='}' && latest == '{')
                    {
                        s.pop();
                    }
                    else if(c[i]==']' && latest == '[')
                    {
                        s.pop();
                    }
                    else
                        return false;
                }
                else
                {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
}
