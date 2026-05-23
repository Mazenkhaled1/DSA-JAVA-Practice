package datastructures.queue;

public class Queue {

    private Node first ;
    private Node last ;
    private int length ;


    public Queue(int value)
    {
        Node newNode  = new Node(value) ;
        first = newNode ;
        last = newNode ;
        length  = 1 ;
    }

    public void printQueue()
    {
        Node temp = first ;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next ;
        }
    }

    public  void  getFirst()
    {
        System.out.println("First:" + first.value);

    }
    public  void  getLast()
    {
        System.out.println("Last:" + last.value);

    }

    public  void  getLength()
    {
        System.out.println("length:" + length);

    }

    public void enQueue(int value )
    {
        Node newNode = new Node(value) ;
        if(length == 0 )
        {
            first = newNode ;
            last = newNode ;
        }else
        {
            last.next = newNode ;
            last = newNode ;
        }
        length ++ ;
    }


    public  Node deQueue()
    {
        if(length == 0) return  null ;
        Node removed = first ;
        if(length == 1 )
        {
            first = null ;
            last = null ;
        }
        first = first.next ;
        removed.next = null ;
        length -- ;
        return  removed ;

    }

}
