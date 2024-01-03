class Solution {
    public int numberOfBeams(String[] bank) 
    {
        int ans=0;
        int prev=0;
        for(int i=0;i<bank.length;i++)
        {
            int curr=0;
            for(char ch: bank[i].toCharArray())
            {
                if(ch=='1')
                {
                    curr++;
                }
            }
            ans=ans+(prev*curr);
            if(curr!=0)
            {
                prev=curr;
            }
        }
        return ans;
    }
}