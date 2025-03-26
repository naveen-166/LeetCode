class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                list.add(i);
            }
        }
        if(k<=list.size())
            return list.get(k-1);
        return -1;
        
    }
}