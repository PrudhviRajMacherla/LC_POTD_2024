class Solution {
    public boolean isCheck(String word)
    {
        int i=0;
        int j=word.length()-1;
        while(i<=j)
        {
            if(word.charAt(i)!=word.charAt(j))
                return false;            
            i++;
            j--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) 
    {
       for(int i=0;i<words.length;i++)
       {
           if(isCheck(words[i]))
               return words[i];
       }
       return "";
    }
}