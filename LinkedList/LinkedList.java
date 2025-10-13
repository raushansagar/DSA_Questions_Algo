package LinkedList;



// Implementaions Of LinkedList

public class LinkedList {
    class Node{
        Node next;
        int data;

        public Node(int data){
            this.next = null;
            this.data = data;
        }
    }

    public static Node Head;
    public static Node Tail;
    public static int size;

    // add first
    public void addFirst(int data){
        Node newNode = new Node(data);

        if(Head == null){
            Head = Tail = newNode;
            size++;
            return;
        }

        newNode.next = Head;
        Head = newNode;
        size++;
    }

    // remove at first
    public void removeFirst(){

        if(Head == null){
            System.out.println("LinkedList Already Empty");
            return;
        }

        Head = Head.next;
    }

    // add last 
    public void addLast(int data){
        Node newNode = new Node(data);
        
        if(Head == null){
            Head = Tail = newNode;
            size++;
            return;
        }

        Tail.next = newNode;
        Tail = newNode;
        size++;
    }

    // remvoe at last 
    public void removeLast(){
        if(Head == null){
            System.out.println("LinkedList Already Empty");
            return;
        }

        Node temp = Head;
        while(temp.next.next != null){
            temp = temp.next;
        }

        temp.next = null;
        size--;
    }

    // add at index
    public void addAtIndex(int idx, int data){
        Node newNode = new Node(data);
        Node temp = Head;

        if(size-1 < idx || Head == null){
            System.out.println("Given idx is greater than LinkedList size");
            return;
        }

        while(idx--> 1 && temp != null){
            temp = temp.next;
        }
        
        Node next = temp.next;
        temp.next = newNode;
        temp = newNode;
        
        if(next != null){
            temp.next = next;
            temp = next;
        }
        size++;
    }

    // print linked list
    public void print(){
        Node temp = Head;

        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addLast(5);
        ll.addLast(6);

        ll.print();
    }
}
