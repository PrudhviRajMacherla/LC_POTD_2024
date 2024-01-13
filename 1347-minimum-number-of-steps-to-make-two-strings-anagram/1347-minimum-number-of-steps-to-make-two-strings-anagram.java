class Solution {
    public int minSteps(String s, String t) 
    {
        int[] arr = new int[26];
        for(char ch:t.toCharArray())
        {
            arr[ch-'a']+=1;
        }
        int ct=0;
        for(char ch:s.toCharArray())
        {
            if(arr[ch-'a']>0)
            {
                arr[ch-'a']-=1;
            }
            else
            {
                ct+=1;
            }
        }
        return ct;
    }
}