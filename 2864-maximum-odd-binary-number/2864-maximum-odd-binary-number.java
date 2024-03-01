class Solution {
    public String maximumOddBinaryNumber(String s) 
    {
        int ct=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='1')
                ct+=1;
        }
        int n =s.length();
        String ch1="1";
        String ch2="0";
        String ans="";
        ans=ans+ch1.repeat(ct-1);
        ans=ans+ch2.repeat(n-ct);
        ans=ans+ch1;
        return ans;
        
        
        
    }
}