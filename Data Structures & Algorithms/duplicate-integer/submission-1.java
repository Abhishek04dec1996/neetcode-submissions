class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> se=new HashSet<>();

        for(int num : nums){
            if(se.contains(num)){
                return true;
            }
            se.add(num);
        }

        return false;
    }
}