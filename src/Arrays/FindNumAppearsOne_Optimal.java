package Arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindNumAppearsOne_Optimal {

    public static int findNum(int[] arr){

        Map<Integer,Integer> map = new LinkedHashMap<>();

        for(int num:arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){

            if(entry.getValue()==1){
                return entry.getKey();
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
