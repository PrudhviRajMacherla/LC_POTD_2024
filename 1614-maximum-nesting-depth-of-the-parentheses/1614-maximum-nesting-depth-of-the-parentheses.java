class Solution {
    public int maxDepth(String s) 
    {
        int ans=0,oc=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                oc++;
            else if(s.charAt(i)==')')
                oc--;
            ans=Math.max(ans,oc);
        }
        return ans;
    }
}