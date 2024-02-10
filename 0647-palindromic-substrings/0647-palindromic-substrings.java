class Solution {
    public void check(int i,int j,int[] ct,String s,int n)
    {
        while(i>=0 && j<n && s.charAt(i)==s.charAt(j))
        {
            ct[0]+=1;
            i--;
            j++;
        }
    }
    public int countSubstrings(String s) 
    {
        int n=s.length();
        int[] ct = new int[1];
        for(int i=0;i<n;i++)
        {
            check(i,i,ct,s,n);
            check(i,i+1,ct,s,n);
        }
        return ct[0];
        
    }
    
}