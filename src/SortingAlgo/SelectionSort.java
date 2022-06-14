package SortingAlgo;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr)
    {
        for(int i=0;i<arr.length;i++) {
            int last = arr.length-i-1;
            int maxIndex = maxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }

    }
    static int maxIndex(int[] arr,int start,int end)
    {
        int max = start;
        for(int i=start;i<=end;i++)
        {
            if(arr[max]<arr[i])
                max = i;
        }
        return max;
    }
    static void swap(int[] arr,int maxIndex,int lastIndex)
    {
        int temp ;
        temp = arr[maxIndex];
        arr[maxIndex]=arr[lastIndex];
        arr[lastIndex] = temp;

    }
}
