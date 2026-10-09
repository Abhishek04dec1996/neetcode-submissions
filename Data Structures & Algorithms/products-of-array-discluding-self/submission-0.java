class Solution {
    public int[] productExceptSelf(int[] nums) {
    int count =0;
    int product=1;
    for(int i : nums){
        if(i==0){
        count++;
        }else{
        product *= i;
        }
    }

    if(count>1){
        for(int i =0 ;i<nums.length ; i++){
           nums[i]=0; 
        }

    }
    else if (count == 1){
        for(int i =0 ;i<nums.length ; i++){
            if(nums[i]==0){
                nums[i]=product;
            }
            else{
                 nums[i]=0;
            }
    
        }
    }else{
        for(int i =0 ;i<nums.length ; i++){
            nums[i]=product/nums[i];
        }
    }

return nums ;

}  
}