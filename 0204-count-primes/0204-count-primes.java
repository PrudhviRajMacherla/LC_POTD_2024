class Solution {
    
    public int countPrimes(int n) 
    {
        if(n<3)
            return 0;
        int ct=0;
        int[] primes = new int[n];
        for(int i=2;i<n;i++)
        {
            if(primes[i]==0)
            {
                ct+=1;
                for(int j=i*2;j<n;j=j+i)
                    primes[j]=1;
            }
                
        }
        return ct;
        
    }
}