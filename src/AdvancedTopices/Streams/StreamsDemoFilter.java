package AdvancedTopices.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



class Product
{
    int id ;
    String name ;
    double price;

    public Product(int id , String name , double price)
    {
        this.id = id ;
        this.name = name ;
        this.price = price  ;

    }
}

public class StreamsDemoFilter {

    public static void main(String[] args) {
//        Collection<String> names = new ArrayList<>(List.of("mazen"  ,"khaled" ,"mostafa")) ;
//        for (var m: names )
//        {
//            System.out.println(m);
//        }
//        names.stream()
//                .filter(m -> m.length() > 5 )
//                .map(m -> m.toUpperCase())
//                .limit(1)
//                .forEach(System.out::println) ;



        // example one
//        List<Integer> numberList = Arrays.asList(10,20,40,30,50,66,54, 11 , 13) ;
//        List<Integer> evenNumberList = new ArrayList<>();

        // befor streams
//        for (int num : numberList)
//        {
//            if( num %2 == 0)
//            {
//                evenNumberList.add(num) ;
//            }
//        }
//        System.out.println(evenNumberList);
//

        // after streams
//        evenNumberList = numberList.stream()
//                .filter(integer -> integer %2 == 0 )
//                .collect(Collectors.toList()) ;
//        System.out.println(evenNumberList);




        // example 2

//        List<String> names = Arrays.asList("mazenkhaled", "youssef" , "oza" , "hassan" , "moaaz") ;
//        List<String> LongNames = new  ArrayList<> () ;
//        names.stream()
//                .filter(name -> name.length() > 5 && name.length() < 8 )
//                .forEach(System.out::println);



        // example 3

//        List<String> names = Arrays.asList("sky" , null , "mazen" , null , "ahmed") ;
//        List<String> result = new ArrayList<>() ;


//        // brefor streams
//        for (String name : names)
//        {
//            if( name != null)
//            {
//                result.add(name);
//            }
//
//        }
//        System.out.println(result);


        // after streams

//        names.stream()
//                .filter(String -> String != null)
//                .forEach(System.out::println);



        // example 4
//        List<Product> productList  = new ArrayList<>() ;
//
//        productList.add(new Product(1 , "mazen" , 200));
//        productList.add(new Product(2 , "ahmed" , 300));
//        productList.add(new Product(3 , "mostafa" , 400));
//        productList.add(new Product(4 , "youssef" , 500));
//
//
//        productList.stream()
//                .filter( mazen -> mazen.price > 300)
//                .forEach(mazen -> System.out.println(mazen.price));
    }

}
