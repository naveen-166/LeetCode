class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        int max=0;
        for(int num : nums)
            map.put(num,map.getOrDefault(num,0)+1);
        for(int num : map.keySet())
        {
            if(map.containsKey(num+1))
            {
                int length=map.get(num)+map.get(num+1);
                max=Math.max(max,length);

            }
        }
        return max;
        
    }
}