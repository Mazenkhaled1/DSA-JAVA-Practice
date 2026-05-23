package datastructures.LinkedListDoubly;

public class Main {
    public static void main(String[] args) {
        LinkedListDoubly linkedListDoubly = new LinkedListDoubly(4) ;
        linkedListDoubly.append(5);
        linkedListDoubly.append(6);
        linkedListDoubly.append(7);
        linkedListDoubly.insert(2 , 10);

//        System.out.println(linkedListDoubly.get(1) . value + "\n") ;
        linkedListDoubly.PrintList();
    }
}
