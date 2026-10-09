class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    
    HashMap<Integer,Integer> map= new HashMap<>();

    for (int i : nums) {
        map.put(i, map.getOrDefault(i, 0) + 1);
    }

    // Extract top K elements using Stream
    return map.entrySet().stream()
            .sorted((a, b) -> b.getValue().compareTo(a.getValue())) 
            .limit(k)                                              
            .mapToInt(Map.Entry::getKey)                           
            .toArray();             

}

}
