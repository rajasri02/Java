package SortingAlgo;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1,2,3,1};
        bubble(array);
        System.out.println(Arrays.toString(array));
    }
    static void bubble(int[] array)
    {
        boolean swapped = false;
        for(int i =0;i<array.length;i++)
        {
            for(int j =1;j<array.length-i;j++)
            {
                if(array[j]<array[j-1])
                {
                    int temp;
                    temp = array[j];
                    array[j] =array[j-1];
                    array[j-1] = temp;
                    swapped = true;
                }
            }
            if(swapped!=true)
                break;
        }
    }
}
