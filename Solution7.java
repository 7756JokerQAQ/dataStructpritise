package pri;


class Solution7 {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int temp[] = new int[2];
        for (int i = 0; i < n; i++) {
            int tas = target - numbers[i];
            int k = search(numbers, 0, n - 1, tas);
            if (k != -1 && k != i) {
                if (i < k) {
                    temp[0] = i + 1;
                    temp[1] = k + 1;
                } else {
                    temp[0] = k + 1;
                    temp[1] = i + 1;
                }

                return temp;
            }
        }
        return temp;
    }

    private int search(int[] nums, int l, int r, int target) {
        if (l > r) return -1;
        int mid = l + (r - l) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            return search(nums, mid + 1, r, target);
        } else {
            return search(nums, l, mid - 1, target);
        }
    }

    /* 解法2
    *    public int[] twoSum(int[] numbers, int target) {
      int pre=0,cur=numbers.length-1;
      for(int i=0;i<numbers.length;i++){
          if(numbers[pre]+numbers[cur]==target){
              return new int[]{pre+1,cur+1};
          }else if(numbers[pre]+numbers[cur]>target){
              cur--;
          }else {
            pre++;
          }
      }
      return new  int []{0,0};
    }*/
}