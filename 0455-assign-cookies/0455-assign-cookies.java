class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gi=g.length-1;
        int si=s.length-1;
        int ct=0;
        while(gi>=0 && si>=0)
        {
            if(s[si]>=g[gi] && si>=0 && gi>=0)
            {
                ct+=1;
                si--;
                gi--;
            }
            else if(g[gi]>s[si])
            {
                gi--;
            }
            
        }
        return ct;
    }
}