package utils;

import java.util.Random;

public class SortTestHelper {
    public static int[] generateRandomArray(int length, int rangeL, int rangeR){
        int[] arr = new int[length];
        Random r = new Random();
        for (int i=0; i<length; i++) {
            //arr[i] = Math.abs(r.nextInt())%(rangeR-rangeL+1)+rangeL;
            //arr[i] = r.nextInt(rangeR-rangeL+1)+rangeL;
            arr[i] = (int)(Math.random()*(rangeR-rangeL+1)) + rangeL;
        }
        return arr;
    }

    public static boolean arrayIsEmpty(int[] arr){
        return arr==null || arr.length==0;
    }
}
