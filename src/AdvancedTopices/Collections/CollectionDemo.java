package AdvancedTopices.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public  static void show(){

        Collection<String>  collection = new ArrayList<>() ;
        collection.add("s");
        collection.add("s");
        collection.add("b");
        for (var item : collection)
        {
            System.out.println(item);
        }

    }
}
