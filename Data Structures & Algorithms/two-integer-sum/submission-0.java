class Solution {
    public int[] twoSum(int[] nums, int target) {
           Map<Integer, Integer> map = new HashMap();
            for (int i = 0; i < nums.length; i++) {
                int crnt = nums[i];
                if (map.containsKey(crnt)) {
                    return new int[]{map.get(crnt), i};
                } else {
                    map.put(target - crnt, i);
                }
            }
            return new int[2];  
    }
}
