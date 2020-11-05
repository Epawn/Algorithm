package utils;

public class SortUtils {
    public static void selectionSort(int[] arr){
        if(SortTestHelper.arrayIsEmpty(arr)){
            System.out.println("数组为空");
        }else{
            int count = 0;

            while(count<arr.length){
                int minIndex = count;
                for(int i=count; i<arr.length; i++) {
                    if(arr[i]<arr[minIndex]){
                        minIndex = i;
                    }
                }
                /*int temp = arr[count];
                arr[count] = arr[minIndex];
                arr[minIndex] = temp;*/
                //交换值，等同于上面这个式子
                if(count!=minIndex) {
                    arr[count] = arr[count] + arr[minIndex];
                    arr[minIndex] = arr[count] - arr[minIndex];
                    arr[count] = arr[count] - arr[minIndex];
                }

                count++;
            }
        }
    }
}
