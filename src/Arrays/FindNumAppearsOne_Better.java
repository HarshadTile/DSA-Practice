package Arrays;

public class FindNumAppearsOne_Better {

    public static int findNum(int[] arr){
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        for(int num:arr){
            maxi = Math.max(maxi,num);
        }

        int[] hash = new int[maxi+1];

        for (int i = 0; i < n ; i++) {
            hash[arr[i]]++;
        }

        for (int i = 0; i < n; i++) {
            if(hash[arr[i]]==1){
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
