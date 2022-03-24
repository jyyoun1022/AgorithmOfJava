package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 배열에서작은수뺴기 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,2,1};



        int[]temp = new int[arr.length-1];
        for(int i=0; i<arr.length-1; i++){
            temp[i]=arr[i];
        }
        System.out.println(Arrays.toString(temp));


    }
}
