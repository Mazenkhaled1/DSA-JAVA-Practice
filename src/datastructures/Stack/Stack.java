package datastructures.Stack;

public class Stack {

    private  Node top ;
    private  int height ;

    public Stack(int value)
    {
        Node newNode = new Node(  value) ;
        top = newNode ;
        height = 1 ;
    }
    public Node getTop() {
        return top;
    }

    public int getHeight() {
        return height;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void push(int value)
    {
        Node newNode = new Node(value) ;
        if(height == 0 )
        {
            top = newNode ;
        }else {
            newNode.next = top  ;
            top = newNode ;
        }
        height ++ ;

    }

    public Node pop()
    {
        if(height == 0 ) return null ;
        Node removed = top ;
        top = top.next ;
        removed.next = null ;
        height -- ;
        return removed ;
    }
}
