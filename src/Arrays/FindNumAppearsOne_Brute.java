package Arrays;

public class FindNumAppearsOne_Brute {

    public static int findNum(int[] arr){
        int n = arr.length;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            cnt=0;
            for (int j = 0; j < n; j++) {
                if(arr[i]==arr[j]){
                    cnt++;
                }
            }
            if(cnt==1){
                return i;
            }

        }
        return -1;

    }


    public static void main(String[] args) {

        int[] arr = {1,1,2,3,3,4,4};
        int res = findNum(arr);

        System.out.println(res);

    }

}
