package Arrays;

import java.util.HashSet;

public class LongestConsucative_Optimal {
    public static void main(String[] args) {
        int[] arr = {102,4,100,1,101,3,2,1,1,104,103};
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        int longest = 0;
        int cnt =0;

        for(int num: arr){
            set.add(num);
        }

        for (int num:set){
            System.out.print(num+" ");
        }
//        int res = findLConsucative(arr,n);
//
//        System.out.println(res);
    }
    public static int findLConsucative(int[] arr, int n){
        HashSet<Integer> set = new HashSet<>();
        int longest = 0;
        int cnt =0;

        for(int num: arr){
            set.add(num);
        }

        for(int num: set){
            if(!set.contains(num - 1)){
                int current_num = num;
                cnt = 1;



                while (set.contains(current_num + 1)) {
                    current_num += 1;
                    cnt += 1;
                }

                longest = Math.max(longest, cnt);

            }
        }
        return longest;
    }
}
