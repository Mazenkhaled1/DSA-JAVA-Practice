import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

//            Scanner in = new Scanner(System.in) ;
        String [] arr = {"mazen" , "khaled "} ;
        for (String i:arr){
            System.out.println(i);
        }
    }
}

/*

 1 iteration
 a = 4 b = 7

 a-> 4 * 3 =  12
 b -> 7 * 2 = 14

 2 iteration
 a -> 12 * 3 = 36
 b -> 14 * 2 = 28

 */


// problem solving # 1
// bear and big
//        int a = 1 ;
//        int b = 1 ;
//        int counter = 0  ;
//        while (a <= b ){
//        a = a * 3 ;
//        b = b* 2 ;
//        counter ++ ;
//        }
//        System.out.println(counter);



// problem solving 2
// team
//Scanner in = new Scanner(System.in);
//
//int n = in.nextInt(); number of problems
//int count = 0;
//
//        for (int i = 0; i < n; i++) {
//int a = in.nextInt();
//int b = in.nextInt();
//int c = in.nextInt();
//
//            if (a + b + c >= 2) {
//count++;
//        }
//        }
//
//        System.out.println(count);


// problem 3
// beautiful matrix
//int[][] arr = new int[5][5];              // col ->     1 2 3 4 5   da shakl el nested loop
//        for ( int i = 1 ; i <= 5 ; i++)   // row 1 ->   0 0 0 0 0
//        {                                 // row 2 ->   0 0 0 0 0
//        for ( int j = 1 ; j <=5 ; j++)    // row 3 ->   0 0 0 0 0
//        {                                 // row 4 ->   0 0 0 0 0
//int num = in.nextInt() ;                  // row 5 ->   0 0 0 0 0
//                if(num == 1){
//        System.out.println(Math.abs(i - 3 ) + Math.abs(j -3 ) );
//        return ;
//        }
//        }
//        }


// problem 4
// gravity flip
//    int size = in.nextInt() ;
//    int[] arr = new int[size] ;
//    for (int i = 0 ; i < size ; i ++)
//    {
//        arr[i] = in.nextInt();
//    }
//        Arrays.sort(arr);
//        for (int i = 0 ; i < size ; i ++)
//        {
//            System.out.print(arr[i] +  " " );
//        }


// problem solving 5
// strings
//        String fName = in.next(); // Mazen -> mazen
//        String sName = in.next(); // mazen -> mazen
//        fName = fName.toLowerCase();
//        sName = sName.toLowerCase();
//        for( int i = 0 ; i < fName.length() ; i ++ )
//        {
//            char c1 = fName.charAt(i); // m a z e n char converted the string into characters
//            char c2 = sName.charAt(i); // m a z e n
//            if(c1 < c2)
//            {
//                System.out.println(-1);
//                return;
//            } else if (c1 > c2) {
//                System.out.println(1);
//                return ;
//            }
//
//        }
//        System.out.println(0);






    // word
//        String word = in.next() ;  // MazEN -> M a z E N
//        int upper = 0, lower = 0;
//        for(char  c : word.toCharArray())
//        {
//        if(Character.isUpperCase(c)){
//              upper ++ ;
//        } else{
//              lower ++ ;
//        }
//        }
//        if(upper > lower){
//        System.out.println(word.toUpperCase()) ;
//        } else {
//        System.out.println(word.toLowerCase());
//        }



//          Scanner in = new Scanner(System.in);
//          String input = in.next() ;
//          int count = 0 ;
//        for (int i = 0 ; i<input.length() ; i ++ )
//        {
//              char c = input.charAt(i) ;
//              boolean isNew = true ;
//            for (int j = (i + 1)  ; j < input.length() ; j ++ ) { // mmazen   i -> m j -> m  i -> a j -> z e n
//        if (input.charAt(j) == c) {
//isNew = false;
//        break;
//        }
//        }
//        if(isNew)
//count ++ ;
//        }
//
//        if(count % 2 == 0 ){
//        System.out.println("CHAT WITH HER!");
//        }else {
//                System.out.println("IGNORE HIM!");
//        }


// word Capitalize example
//
//Scanner in = new Scanner(System.in) ;
//        System.out.println("enter the string ");
//String word = in.next()  ;
//        if(Character.isUpperCase(word.charAt(0)))
//        System.out.println(word);
//        if(! Character.isUpperCase(word.charAt(0)))
//        System.out.println(Character.toUpperCase(word.charAt(0)) + word.substring(1));
// substring byakhod men el index bta3 el string lhad el akher