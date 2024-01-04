class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        StringBuilder sb= new StringBuilder();
        int carry=0;
        while(i>=0 ||j>=0||carry!=0)
        {
            int val1=i>=0?a.charAt(i)-'0':0;
            int val2=j>=0?b.charAt(j)-'0':0;
            int sum=val1+val2+carry;
            //case sum=3
            if(sum==2)
            {
                sb.insert(0,'0');
                carry=1;
            }
            else if(sum==3)
            {
                sb.insert(0,'1');
                carry=1;
            }
            else if(sum==1)
            {
                sb.insert(0,'1');
                carry=0;
            }
            else if(sum==0)
            {
                sb.insert(0,'0');
                carry=0;
            }     
            i--;
            j--;
        }
        return sb.toString();
    }
}