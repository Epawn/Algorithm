package entry;

import utils.SortTestHelper;
import utils.SortUtils;

public class Entry {
    public static void main(String[] args) {
        /*int a =5;
        int b = 6;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.printf("a=%d,b=%d",a,b);*/
        int[] randomArr = SortTestHelper.generateRandomArray(5,0,5);
        for (int i : randomArr) {
            System.out.printf("%d\t",i);
        }
        System.out.println("");
        SortUtils.selectionSort(randomArr);
        for (int i : randomArr) {
            System.out.printf("%d\t",i);
        }
    }
}
