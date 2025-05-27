package Arrays;

public class LongestConsucative_Brute {
    public static void main(String[] args) {
        int[] arr = {102,4,100,1,101,3,2,1,1,104,103};

        int longest = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int current_num = arr[i];
            int cnt  = 1;

            while(linearSearch(current_num+1,arr)==true)
            {
                current_num +=1;
                cnt+=1;

            }
            longest = Math.max(longest,cnt);


        }

        System.out.println(longest);
    }
    public static boolean linearSearch(int key,int[] arr){

        for (int num : arr){
            if(key==num) return true;
        }
        return false;
    }

}
