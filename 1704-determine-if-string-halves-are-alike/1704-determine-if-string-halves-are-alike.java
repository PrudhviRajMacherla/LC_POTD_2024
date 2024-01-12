class Solution {
    public boolean isVowel(char ch)
    {
        ch=Character.toLowerCase(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
           {
               return true;
           }
         return false;
    }
    public boolean halvesAreAlike(String s) 
    {
        int ct=0;
        for(int i=0;i<s.length();i++)
        {
            if(i<s.length()/2)
            {
                if(isVowel(s.charAt(i)))
                   {
                       ct+=1;
                   }
            }
            else
            {
                 if(isVowel(s.charAt(i)))
                   {
                       ct-=1;
                   }
            }
        }
        if(ct==0)
        {
            return true;
        }
        return false;
        
    }
}