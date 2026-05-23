package AdvancedTopices.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class StreamDemoFlatMap {


    public static void main(String[] args)
    {
        List<String>  teamA = Arrays.asList("mazen" , "khaled" , "mostafa") ;
        List<String>  teamB = Arrays.asList("ahmed" , "mohamed" , "che") ;
        List<String>  teamC = Arrays.asList("aly" , "joe" , "chos") ;

        List<List<String>> collectionOfTeams = new ArrayList<>() ;
        collectionOfTeams.add(teamA);
        collectionOfTeams.add(teamB);
        collectionOfTeams.add(teamC) ;

        // without flatmap

        for (List<String> team : collectionOfTeams) // looops for the lists it self
        {
            for (String name : team ) // loops for the elements
            {
//                System.out.println(name);
            }
        }


        // using the flatmap

        collectionOfTeams.stream()
                .flatMap(name->name.stream())
                .map(name -> name.toUpperCase())
                .forEach(System.out::println);
    }

}
