package AdvancedTopices.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamDemo {
    public static void main(String[] args){


        // example 1
        // distinct () / limit () / count ()
        List<String> list = Arrays.asList("mazen" , "mazen" , "khaled" ,"khaled" ,"mostafa" ,"youssef") ;

        // distict
//        list.stream()
//                .distinct().forEach(System.out::println);


        // limit
//        list.stream()
//                .distinct()
//                .limit(2)
//                .forEach(System.out::println);


        //count ()
//        var count = list.stream()
//                .distinct()
//                .limit(2)
//                .count();
//        System.out.println(count);

        // example 2
        List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//
//        var evenNumberList = numberList.stream()
//                .filter(n -> n %2 == 0 )
//                .count() ;
//        System.out.println(evenNumberList );

//        Optional<Integer> min = numberList.stream().min((o1, o2) -> o1.compareTo(o2));
//        System.out.println(min.get());
//
//        Optional<Integer> max = numberList.stream().max((o1, o2) -> o1.compareTo(o2));
//        System.out.println(max.get());



        // example 3
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        var result = numbers.stream().reduce(0 ,(value,cobinedvalue) ->
        {
        return cobinedvalue+value ;
    }) ;
        System.out.println(result);
    }
}
