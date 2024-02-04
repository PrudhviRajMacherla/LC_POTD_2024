class Solution
 {
    public int strStr(String haystack, String needle) 
    {
        String text=needle+"#"+haystack;
        int n=text.length();
        int val=needle.length();
        int[] lps = new int[n];
        
        for(int i=1;i<n;i++)
        {
            int x=lps[i-1];
            while(text.charAt(i)!=text.charAt(x))
            {
                if(x==0)
                {   
                    x=-1;
                    break;
                }
                x=lps[x-1];
            }
            lps[i]=x+1;
            if(lps[i]==val)
            {
                return i-(2*val);
            }
        }
        return -1;
    }
}