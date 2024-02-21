class Solution 
{
    public int rangeBitwiseAnd(int left, int right) 
    {
      int sc=0;//shift count
      while(left!=right)
      {
          left>>=1;
          right>>=1;
          sc++;
      }
      return right<<sc;
    }
}