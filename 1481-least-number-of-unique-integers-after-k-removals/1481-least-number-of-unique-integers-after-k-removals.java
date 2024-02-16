class Solution {
   
    public int findLeastNumOfUniqueInts(int[] arr, int k) 
    {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        List<Integer> al = new ArrayList<>();
        al.addAll(mp.values());
        Collections.sort(al,Collections.reverseOrder());
        while(!al.isEmpty()&&k>=0)
        {
            int val=al.get(al.size()-1);
            if(k>=val)
            {
                k-=val;
                al.remove(al.size()-1);
            }
            else
            {
                return al.size();
            }
        }
        return al.size();
        
        
    }
}