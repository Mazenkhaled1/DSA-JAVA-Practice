package datastructures.hashTable;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashTable myHashTable = new HashTable() ;
        myHashTable.set("nails" , 100);
        myHashTable.set("nails" , 200);
        myHashTable.printTable();
    }
}




