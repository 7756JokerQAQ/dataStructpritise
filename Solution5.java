package pri;

class Solution5 {
    public void rotate(int[] nums, int k) {
        if(nums.length==1){
            return;
        }
        k%=nums.length;
        int pre=0,cur=nums.length-k;
        int []temp=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[i]=nums[i];
        }
        for(int i=0;i<k;i++){
            nums[i]=temp[cur];
            cur++;
        }
        for(int i=k;i<nums.length;i++){
            nums[i]=temp[pre];
            pre++;
        }

    }
}

