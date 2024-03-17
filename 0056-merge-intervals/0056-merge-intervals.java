class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[] > al = new ArrayList<>();
        for(int[] curr:intervals)
        {
            if(al.size()==0)
            {
                al.add(curr);
            }
            else
            {
                int[] last_a=al.get(al.size()-1);
                if(curr[0]<=last_a[1])
                {
                    last_a[1]=Math.max(curr[1],last_a[1]);
                }
                else
                {
                    al.add(curr);
                }
            }
        }
        return al.toArray(new int[al.size()][]);
    }
}