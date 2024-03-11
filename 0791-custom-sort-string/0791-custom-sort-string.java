class Solution 
{
    public String customSortString(String order, String s)
    {
      Integer[] idx = new Integer[26];
      Arrays.fill(idx,-1);//if you want the elements that are not given ordering to appear at first of string fill with -1 else fill with largest number
      for(int i=0;i<order.length();i++)
      {
          idx[order.charAt(i)-'a']=i;
      }
      Comparator<Character> com =new Comparator<Character>()
      {
          @Override
          public int compare(Character ch1,Character ch2)
          {
              return idx[ch1-'a']-idx[ch2-'a'];
          }
      };
      Character[] ans = new Character[s.length()];
      for(int i=0;i<s.length();i++)
      {
          ans[i]=s.charAt(i);
      }
      Arrays.sort(ans,com);
      StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            sb.append(ans[i]);
        }
        return sb.toString();
    }
    
}
