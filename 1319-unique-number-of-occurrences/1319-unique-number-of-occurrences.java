class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        Set<Integer> set=new HashSet<>();
        for(int val : map.values())
        {
            if(!set.add(val))
                return false;
        }        
        return true;
    }
}