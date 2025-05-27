package Arrays;

import java.util.Arrays;

public class LongestConsucative_Better {
    public static void main(String[] args) {
        int[] arr = {102,4,100,1,101,3,2,1,1,104,103};

        int cnt = 0;
        int lastsmaller = Integer.MIN_VALUE;
        int n = arr.length;
        int longest = 0;
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if(arr[i]-1 == lastsmaller){
                cnt++;
                lastsmaller = arr[i];
            }
            else if (lastsmaller != arr[i]){
                cnt = 1;
                lastsmaller = arr[i];
            }
            longest = Math.max(longest,cnt);


        }
        System.out.println(longest);

    }
}
