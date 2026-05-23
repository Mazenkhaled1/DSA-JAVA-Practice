package AdvancedTopices.Streams;


import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Employee
{
     int empid ;
     int salary ;
    String empName ;

    public Employee(int id , String name , int salary)
    {
        this.empid  = id ;
        this.empName = name ;
        this.salary = salary ;
    }

}
public class StreamsDemoMap {

    public static void main(String[] args) {
        // example one

//        List<String> vehicles = Arrays.asList("bus" , "Car" , "mootrycycle" , "train") ;
//        List<String> result = new ArrayList<>() ;
//        result = vehicles.stream()
//                .filter(res -> res.length()> 3 )
//                .map( res -> res.toUpperCase())
//                .collect(Collectors.toList()) ;
//        System.out.println(result);

        // example 2

//        List<String> vehicles = Arrays.asList("bus" , "Car" , "mootrycycle" , "train") ;
//        vehicles.stream()
//                .map(fun -> fun.length())
//                .forEach(System.out::println);


        // example 3

//        List<Integer> numbers = Arrays.asList(10,2,4,5,6);
//        List<Integer> result = new ArrayList<>() ;

        // befor using streams
//        for (int num : numbers)
//        {
//            result.add(num*3) ;
//        }
//        System.out.println(result);
//
//
//
//        // after using stream
//        result = numbers.stream()
//                .map(num -> num *3 )
//                .collect(Collectors.toList()) ;
//        System.out.println(result);

        // example 4


//        List<Employee> emp = new ArrayList<>() ;
//        emp.add(new Employee(1 , "mazen" , 10000));
//        emp.add(new Employee(2 , "mostafa" , 20000));
//        emp.add(new Employee(3 , "youssef" , 30000));
//        emp.add(new Employee(3 , "youssef" , 30000));
//        emp.add(new Employee(3 , "youssef" , 40000));
//        emp.add(new Employee(3 , "youssef" , 50000));
//
//
//        List<Integer> result = emp.stream()
//                .filter(e -> e.salary > 20000 )
//                        .map(e -> e.salary)
//                                .collect(Collectors.toList()) ;
//        System.out.println(result);

//        List<Object> items = Arrays.asList(10, 20, "mazen", 30, "ahmed", 40);
//        List<Integer> result = items.stream()
//                .filter(num -> num instanceof Integer)     // اختار الأعداد بس
//                .map(num -> (Integer) num)                // حول Object لـ Integer
//                .filter(num -> num > 15)                 // اختار اللي أكبر من 15
//                .map(num -> num * 2)                     // اضرب × 2
//                .collect(Collectors.toList());
//
//        System.out.println(result);

        List<Object> items = Arrays.asList(10, "mazen", true, 25, "ahmed", false, 30);
        List<String> result = items.stream()
                .filter(item -> item instanceof String)
                .map(item -> (String) item) // convert ftrom object t string => Stream(String) instead of Stream(Object)
                .map(item -> {
                        // item.toUpperCase()
                    String str = (String) item ;
                    return str.substring(0,1).toUpperCase() +str.substring(1).toLowerCase() ;
    })
                .collect(Collectors.toList());
        System.out.println(result);
    }


}
