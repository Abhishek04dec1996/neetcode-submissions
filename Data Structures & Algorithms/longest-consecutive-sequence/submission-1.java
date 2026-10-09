class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> inc = new HashSet<>();
        int maxCount=0;
        for(int num : nums){
            inc.add(num);
        }

        for(int num: nums){

            if(!inc.contains(num-1)){
               int count=0;
                while(inc.contains(num+1)){
                    num = num +1;
                    count++;
                }
                if (count+1>maxCount){
                    maxCount=count+1;
                }

            }

        }

        return maxCount;

    }
}
