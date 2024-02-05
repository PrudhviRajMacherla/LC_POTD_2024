class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            if(mp.containsKey(ch)){
                mp.put(ch,mp.get(ch)+1);
            }
            else
            {
                mp.put(ch,1);
            }
        }
        for(int i=0;i<s.length();i++)
        {
            if(mp.get(s.charAt(i))==1)
            {
                return i;
            }
        }
        return -1;
            
    }
} 