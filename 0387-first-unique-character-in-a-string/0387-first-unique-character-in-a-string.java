class Solution {
    public int firstUniqChar(String s) 
    {
        int[] alp=new int[26];
        for(int i=0;i<s.length();i++)
        {  
            char ch =s.charAt(i);
            alp[ch-'a']+=1;
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(alp[ch-'a']==1)
            {
                return i;
            }
        }
        return -1;
    }
}