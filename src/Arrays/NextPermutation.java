package Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {2,1,5,4,3,0,0};
        int[] ans = nextPermutation(nums);
        for(int num: ans) System.out.print(num+" ");

    }
    public static int[] nextPermutation(int[] nums){
        int n = nums.length;
        int index = -1;
        for (int i = n-2; i >=0; i--) {
            if(nums[i] < nums[i+1]){
                index=1;
                break;
            }
        }
        if (index==-1){
            reverse(0,n-1,nums);
            return nums;
        }

        for(int i = n-1; i>=0;i--){
            if(nums[i]>nums[index])
            {
                int t = nums[i];
                nums[i] = nums[index];
                nums[index] = t;
                break;
            }
        }
        reverse(index+1,n-1,nums);


        return nums;
    }
    public static void reverse(int start,int end,int[] nums){


        while(start<=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

}
