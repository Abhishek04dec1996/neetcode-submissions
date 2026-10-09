class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    
    // HashMap<Integer,Integer> map= new HashMap<>();

    // for (int i : nums) {
    //     map.put(i, map.getOrDefault(i, 0) + 1);
    // }
    // return map.entrySet().stream()
    //         .sorted((a, b) -> b.getValue().compareTo(a.getValue())) 
    //         .limit(k)                                              
    //         .mapToInt(Map.Entry::getKey)                           
    //         .toArray();             
        // Step 1: Count frequency
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create buckets
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for (int key : freqMap.keySet()) {
            int freq = freqMap.get(key);

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(key);
        }

        // Step 3: Collect top k frequent elements
        int[] result = new int[k];
        int index = 0;

        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    result[index++] = num;

                    if (index == k) {
                        break;
                    }
                }
            }
        }

        return result;
}

}
