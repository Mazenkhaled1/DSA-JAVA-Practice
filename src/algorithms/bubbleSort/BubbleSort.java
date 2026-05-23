package algorithms.bubbleSort;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] array )
    {
        for(int i = array.length-1; i > 0 ; i--)
        {
            for(int j = 0; j < i; j++)
            {
                if(array[j] > array[j+1])
                {
                    int temp = array[j] ;
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] array)
    {
        for(int i = 0 ; i < array.length; i++){
            int minIndex = i ;
            for(int j = i+1 ; j < array.length; j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            if(i != minIndex){
                int temp = array[i] ;
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }

    }
    public static void main(String[] args) {
//        int [] array = {2,4,6,5,1} ;
//        bubbleSort(array);
//        System.out.println(Arrays.toString(array));

        int [][]arr = {

                // col 0
                {1,2,3} , // row = 0
                // col 1
                {4,5,6} , // row = 1
                // col 2
                {7,8,9}}; // row = 2
//        System.out.println(arr[0].length);
//        for (int i = 0 ; i < arr.length; i++){
//            for ( int j = 0 ; j < arr[i].length ; j++){
//                System.out.println(arr[i][j]);
//            }
//        }
        for(int [] r : arr) // rows
        {
            for(int c :r ) // col
            {
                System.out.println(c + " ");
            }
        }
    }
}
