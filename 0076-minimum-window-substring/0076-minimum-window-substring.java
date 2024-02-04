class Solution {
    public String minWindow(String s, String t)
    {
        int n=s.length();
        if(t.length()>n)
            return "";
        int i=0,j=0,min_start=0,min_win_size=Integer.MAX_VALUE;
        int r_c=t.length();//required count is equal to length of the string we wan't to find
        Map<Character,Integer> mp =new HashMap<>();
        for(int idx=0;idx<t.length();idx++)
        {
            char ch =t.charAt(idx);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }//inserting elements of t in map
        
        while(j<n)
        {
            char ch=s.charAt(j);
            if(mp.getOrDefault(ch,0)>0)
                r_c-=1;
            mp.put(ch,mp.getOrDefault(ch,0)-1);
            while(r_c==0)
            {
                if(min_win_size>(j-i+1))
                {
                    min_win_size=(j-i+1);
                    min_start=i;
                }
                char c=s.charAt(i);
                mp.put(c,mp.getOrDefault(c,0)+1);
                if(mp.get(c)>0)
                    r_c+=1;
               
                i++;
                          
            }
            j++;
        }
    
        return min_win_size==Integer.MAX_VALUE?"":s.substring(min_start,min_start+min_win_size);
    }
}