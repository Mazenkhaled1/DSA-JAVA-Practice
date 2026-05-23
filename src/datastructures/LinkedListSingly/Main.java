package datastructures.LinkedListSingly;

import datastructures.LinkedListSingly.LinkedListSingly;

public class Main {
    public static void main(String[] args) {

        LinkedListSingly myLinkedList = new LinkedListSingly(4);
        myLinkedList.append(5);
        myLinkedList.append(7);
        myLinkedList.append(6);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.set(2,20) ;
        myLinkedList.insert(1,15);
        myLinkedList.reverse();
        myLinkedList.PrintList();



//        System.out.println(myLinkedList.get(2).value + "\n");
//        // 5
//        System.out.println(myLinkedList.removeLast().value);
//        // 4
//        System.out.println(myLinkedList.removeLast().value);
//        // null
//        System.out.println(myLinkedList.removeLast());

//        myLinkedList.prepend(3);
//        myLinkedList.reverse();
//        myLinkedList.removeDuplicates(); // remove 6
//        System.out.println(myLinkedList.findTheMiddleNode().value + "\n"); // 7
//        myLinkedList.PrintList() ;


    }
}
