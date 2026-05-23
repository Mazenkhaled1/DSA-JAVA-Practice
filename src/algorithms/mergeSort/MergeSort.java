package algorithms.mergeSort;

import java.util.Arrays;

public class MergeSort {




    public static int[] merge(int[] arr1 , int[] arr2 )
    {


        // [ 1  3  7  5 ]           [ 2  4  5  6 ]
        int [] combin = new int [arr1.length + arr2.length];
        int index = 0;
        int i = 0 ;
        int j = 0;
        while( i < arr1.length && j < arr2.length)
        {
            if(arr1[i] < arr2[j])
            {
                combin[index] = arr1[i] ;
                index ++ ;
                i ++ ;
            }else
            {
                combin[index] = arr2[j] ;
                index ++ ;
                j ++ ;
            }
        }
        while (i < arr1.length)
        {
                combin[index] = arr1[i] ;
                index ++ ;
                i ++ ;
        }
        while (j < arr2.length)
        {
                combin[index] = arr2[j] ;
                index ++ ;
                j ++ ;
        }
        return combin;

    }

    public static int [] mergeSort(int[] array)
    {
        if(array.length == 1 ) return array ;

        int midIndex = array.length/2;
        int [] left = mergeSort(Arrays.copyOfRange(array , 0 , midIndex));
        int [] right = mergeSort(Arrays.copyOfRange(array , midIndex , array.length));
        return merge(left, right);
    }


    public static void main(String[] args) {

//        int[] arr1 = { 1  ,3 ,7 ,5} ;
//        int[] arr2 = {2  ,4 , 5  ,6} ;
//        System.out.println(Arrays.toString(merge(arr1 , arr2))); // well done
        int [] originalArray = {3, 4 , 1 , 2} ;
        int [] sortedArray = mergeSort(originalArray);
        System.out.println("\n original array :" +  Arrays.toString(originalArray));
        System.out.println("\n sortedArray :" +  Arrays.toString(sortedArray));
    }
}
