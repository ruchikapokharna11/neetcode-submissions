class Solution {
    public boolean isValid(String str) {
        if(str.length()%2 == 1)
        {
            return false;
        }
        Stack<Character> s = new Stack();
        char []c = str.toCharArray();
        for(int i=0; i< c.length; i++)
        {
            if(c[i]=='(' || c[i]=='{' || c[i]=='[')
            {
                s.push(c[i]);
            }
            else
            {
                if(!s.empty())
                {
                    char latest = s.peek();
                    switch(latest)
                    {
                        case '(':
                            if(c[i]!=')')
                                return false;
                            break;
                        case '{':
                            if(c[i]!='}')
                                return false;
                            break;
                        case '[':
                            if(c[i]!=']')
                                return false;
                            break;
                    }
                    s.pop();
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
