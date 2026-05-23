package datastructures.LinkedListSingly;

import java.util.HashSet;

public class LinkedListSingly {
    private Node head ;
    private Node tail ;
    private int length;

    public LinkedListSingly(int value)
    {
        Node newNode = new Node(value) ;
        head = newNode ;
        tail = newNode ;
        length = 1 ;
    }

    public void PrintList()
    {
        Node temp = head ;
        while (temp != null)
        {
            System.out.println(temp.value);
            temp = temp.next ;
        }
    }

    public void getHead()
    {
        System.out.println("head:" + head.value);
    }
    public void getTail()
    {
        System.out.println("tail:" + tail.value);
    }

    public void getLength()
    {
        System.out.println("length:" + length);
    }

    public void append(int value)
    {
        Node newNode = new Node(value) ;
        if( length == 0 )
        {
            head = newNode;
            tail = newNode ;
        }else {
            tail.next = newNode  ;
            tail = newNode  ;
        }
        length++ ;
    }

    public Node removeLast()
    {
        if(length == 0 ) return null ;
        Node temp = head ;
        Node pre = head  ;
        while (temp.next != null)
        {
            pre = temp ;
            temp = temp.next ;

        }
        tail = pre ;
        tail.next = null ;
        length -- ;
        if(length == 0 )
        {
            head = null ;
            tail = null ;
        }
        return temp ;
    }

    public void prepend(int value)
    {
        Node newNode = new Node(value) ;
        if( length == 0 )
        {
            head = newNode ;
            tail = newNode ;
        }else
        {
            newNode.next = head ;
            head = newNode ;
        }
        length ++ ;
    }

    public Node removeFirst()
    {
        if(length == 0 ) return  null ;
        Node temp = head ;
        head = head.next ;
        temp.next = null ;
        length--  ;
        if(length == 0 )
        {
            tail = null ;
        }
        return  temp  ;
    }

    public Node get(int index)

    {
        if(index < 0 || index >= length) return null ;
        Node temp = head ;
        for ( int i = 0  ; i < index ; i++ )
        {
            temp = temp.next;
        }
        return temp ;
    }

    public boolean set(int index , int value)
    {
        Node temp = get(index) ;
        if(temp != null)
        {
            temp.value = value ;
            return true ;
        }
        return  false ;

    }

    public boolean insert (int index , int value )
    {
        if(index < 0 || index > length ) return  false  ;
        if(index == 0 )
        {
            prepend(value) ;
            return true ;
        }
        if(index == length)
        {
            append(value);
            return true ;
        }
        Node newNode = new Node(value)  ;
        Node temp = get(index -1) ;
        newNode.next = temp.next  ;
        temp.next = newNode ;
        length ++ ;
        return true ;
    }

    public Node remove(int index)
    {
        if (index < 0 || index >= length) return  null ;
        if(index ==  0) return  removeFirst() ;
        if(index == length - 1 ) return removeLast() ;
        Node prev = get(index -1 ) ;
        Node temp = prev.next ;
        prev.next = temp.next ;
        temp.next = null ;
        length -- ;
        return temp ;
    }

    public  void reverse ()
    {
        Node temp = head ;
        head = tail ;
        tail = temp ;
        Node after = temp.next ;
        Node befor = null ;
        for (int i = 0 ; i < length ; i ++ )
        {
            after = temp.next;
            temp.next = befor ;
            befor = temp ;
            temp = after ;
        }
    }


     // leetcode examples:



    /*
        876. Middle of the Linked List :
            Given the head of a singly linked list, return the middle node of the linked list.
            If there are two middle nodes, return the second middle node.
     */

    public Node findTheMiddleNode()
    {
        Node fast = head  ;
        Node slow = head ; 
        while (fast != null && fast.next != null)
        {
            slow = slow.next ; 
            fast = fast.next.next ;
        }
        return  slow ;
    }



    /*
         141. Linked List Cycle :
            Given head, the head of a linked list, determine if the linked list has a cycle in it.
            There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
            Return true if there is a cycle in the linked list. Otherwise, return false.
     */

    public  boolean hasLoop()
    {
        Node fast = head ;
        Node slow = head ;
        while(fast != null && fast.next != null)
        {
            slow = slow.next ;
            fast = fast.next.next;
            {
                return  true ;
            }
        }
        return false ;
    }






















    // Find The kth Node From the End

    public Node findKthFromEnd(int k)
    {
        if(k <= 0 ) return  null ;
        Node fast = head ;
        Node slow = head ;
        for (int i = 0 ; i < k ; i ++ )
        {
            if(fast == null) return  null ;
            fast = fast.next ;
        }
        while(fast != null )
        {
            slow = slow.next;
            fast = fast.next;

        }
        return  slow ;
    }


    // 4- remove duplicates

    public void removeDuplicates()
    {
        HashSet<Integer> seen = new HashSet<>();
        Node  current = head ;
        Node prev = null ;
        while (current !=  null )
        {
            if(seen.contains(current.value))
            {
                prev.next = current.next ;
            }else
            {
                seen.add(current.value) ;
                prev = current ;

            }
            current = current.next;
        }
    }






    // partitin node

    public Node partition( int x)
    {
        Node leftList = new Node(0)  ;
        Node rightlist = new Node(0)   ;

        Node current = head ;
        Node left = leftList ;
        Node right = rightlist ;
        while (current != null)
        {
            if(current.value <x)
            {
                left.next = current ;
                left = left.next ;
            } else{
                right.next = current ;
                right = right.next ;

            }
            current = current.next ;
        }
        right.next = null ;
        left.next = rightlist.next ;



        return leftList.next ;

    }


    public void reverseBetween(int startIndex , int endIndex)
    {

        Node dummyNode = new Node(0 ) ;
        dummyNode.next  = head ;
        Node previous = dummyNode ;
        for (int i = 0 ; i < startIndex ; i++)
        {
            previous = previous.next ;
        }
        Node current = previous.next ;
        for (int i = 0 ; i < endIndex - startIndex ; i ++)
        {
            Node nodeToMove = current.next ;
            current.next = nodeToMove.next ;
            nodeToMove.next = previous.next ;
            previous.next = nodeToMove ;
        }
        head = dummyNode.next ;
    }



    public void swapPairs()
    {
        Node dummyNode = new Node(0) ;
        dummyNode.next = head ;
        Node previous = dummyNode ;

        while (previous.next != null && previous.next.next != null)
        {
            Node first = previous.next ;
            Node seocnd = first.next ;

            first.next = seocnd.next ;
            seocnd.next = first ;
            previous.next= seocnd;
            previous = first ;

        }
        head = dummyNode.next ;
    }
    /*
             p         head s            pf         s          pf -> null so the condition will return false
        [d-> 0          2            1          4          3  ]  -> [ 2 1 4 2 ]

     */
}

